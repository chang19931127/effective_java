package me.czd.effective.java.enumandanno.enuminsteadconstant;

/**
 * 再来一个使用了抽象方法的枚举类
 * 这个算是一种枚举功能的实现
 * 一般情况下也可以复写toString方法
 * 枚举提供了valueOf()方法，很赞哦
 * @author Administrator
 *
 */
public enum Operation {
	
	PLUS("+"){
		@Override
		double apply(double x, double y) {
			return x + y;
		}
	},	
	MINUS("-"){
		@Override
		double apply(double x, double y) {
			return x - y;
		}
	},	
	MULT("*"){
		@Override
		double apply(double x, double y) {
			return x * y;
		}
	},	
	DIVIDE("/"){
		@Override
		double apply(double x, double y) {
			return x / y;
		}
	};
	
	private final String symbol;
	private Operation( String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return symbol;
	}
	
	abstract double apply(double x,double y);
	
	public static void main(String[] args) {
		double x = 2.0d;
		double y = 1.5d;
		for(Operation operation : Operation.values()){
			System.out.printf("%f %s %f = %f%n", x,operation,y,operation.apply(x, y));
		}
		//valueOf()方法
		System.out.println(Operation.valueOf("DIVIDE"));
	}
}
