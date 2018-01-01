package me.czd.effective.java.enumandanno.enummap;

import java.util.EnumMap;
import java.util.Map;

public enum Phase {
	SOLID,LIQUID,GAS;
	
	//这里就通过序数来进行索引！，不好扩展，支持不好，等等缺点
	public enum Transition{
		MELT,FREEZE,BOIL,CONDENSE,SUBLIME,DEPOSIT;
		
		private static final Transition[][] TRANSITIONS = {
				{null,MELT,SUBLIME},	
				{FREEZE,null,BOIL},
				{DEPOSIT,CONDENSE,null}
		};
		public static Transition from(Phase src,Phase dst){
			return TRANSITIONS[src.ordinal()][dst.ordinal()];
		}
	}
	
	//封装了一层，EnumMap，的key是enum,value是EnmuMap
	//这种方式比使用数组oridinal合理的多，主要还是因为数组容易暴露错误！，转型也麻烦等等！
	//也就是面向对象中推荐的使用集合，尽可能的避免数组，虽说数组性能高，但是为了安全！等等！。
	//其实EnumMap只是内部有很多操作封装了oridinal()方法，因为索引必然会去通过oridinal来搞定的
	public enum TransitionEnum{
		//直接将内容，整合到了枚举中！和上面的数字一样，6中
		MELT(SOLID,LIQUID),
		FREEZE(LIQUID,SOLID),
		BOIL(LIQUID,GAS),
		CONDENSE(GAS,LIQUID),
		SUBLIME(SOLID,GAS),
		DEPOSIT(GAS,SOLID);
		
		private final Phase src;
		private final Phase dst;
		
		private TransitionEnum(Phase src, Phase dst) {
			this.src = src;
			this.dst = dst;
		}
		
		private static final Map<Phase, Map<Phase, TransitionEnum>> MAP =
				new EnumMap<>(Phase.class);
		//Initialize the phse transition map
		static{
			for (Phase phase : Phase.values()) {
				MAP.put(phase, new EnumMap<>(Phase.class));
			}
			for (TransitionEnum transitionEnum : TransitionEnum.values()) {
				MAP.get(transitionEnum.src).put(transitionEnum.dst,transitionEnum);
			}
		}
		
		public static TransitionEnum from(Phase src,Phase dst){
			return MAP.get(src).get(dst);
		}
	}
}
