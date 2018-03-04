package me.czd.effective.java.serializable.proxyinsteadinstant;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 序列化代理模式
 * 
 * 其实很多模式的出现，就是为了解决问题的！
 * @author Administrator
 *
 */
public class ProxySerializable {
	/**
	 * 我们想要序列化Period，也想保证他的不可变性
	 * 那么，我们就序列化Period的序列化代理类SerializableProxy，带有Period的所有域内容	-----writeReplace()
	 * 然后防止被攻击，使用readObject(ObjectInputStream stream)方法非法
	 * 然后，在序列化代理类中，去反序列化类		-----readResolve()
	 * 那么，对象序列化，反序列化完毕了，最终流，形成了Period
	 * 再来一个流程
	 * 
	 * Period -->Period的writeReplace -->Stream -->SerializableProxy的readResolve --> Period
	 * 
	 * 还是一句话，序列化反序列化，实际就是流的变化！性能就是看转化成流的效果！
	 * 这种解决方案，想一下，多思考，希望自己遇到问题，也可以通过思考去解决问题，不要总是去搜索，现有的解决方案，可能你就会突破，打败别人的方案！
	 * 
	 */
	
}


final class Period implements Serializable{
	
	private static final long serialVersionUID = 2727870165734878400L;
	private final Date start;
	private final Date end;
	public Period(Date start, Date end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	//有这个方法，是为了防止攻击者伪造这个方法，来
	private void readObject(ObjectInputStream stream) throws InvalidObjectException{
		throw new InvalidObjectException("proxy required");
	}
	
	private Object writeReplace(){
		return new SerializableProxy(this);
	}
	
	//外围代理类来了
	private static class SerializableProxy implements Serializable{
		
		private static final long serialVersionUID = -7745862960042021080L;
		private final Date start;
		private final Date end;
		public SerializableProxy(Period period) {
			super();
			this.start = period.start;
			this.end = period.end;
		}
		private Object readResolve(){
			return new Period(start, end);
		}
		
	}
}
