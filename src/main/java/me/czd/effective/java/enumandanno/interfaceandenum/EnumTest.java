package me.czd.effective.java.enumandanno.interfaceandenum;

import java.util.Arrays;
import java.util.Collection;

/**
 * 上来来一套简单的扩展把
 * 
 * 我们需要了解的API 
 * Class 的相关API
 * 集合的相关API
 * 枚举操作的相关API
 * 
 * @author Administrator
 *
 */
public class EnumTest {
	public interface Operation {
		double apply(double x, double y);
	}

	//一个基础操作的枚举类
	public enum BasicOperation implements Operation {
		PLUS("+") {
			@Override
			public double apply(double x, double y) {
				return x + y;
			}
		},
		MINUS("-") {
			@Override
			public double apply(double x, double y) {
				return x - y;
			}
		},
		MULI("*") {
			@Override
			public double apply(double x, double y) {
				return x * y;
			}
		},
		DIVIDE("/") {
			@Override
			public double apply(double x, double y) {
				return x / y;
			}
		};

		private final String symbol;

		private BasicOperation(String symbol) {
			this.symbol = symbol;
		}

		@Override
		public String toString() {
			return symbol;
		}
	}
	//扩展的枚举类
	public enum ExtendedOperation implements Operation {
		EXP("^") {
			@Override
			public double apply(double x, double y) {
				return Math.pow(x, y);
			}
		},
		DIVIDE("%") {
			@Override
			public double apply(double x, double y) {
				return x % y;
			}
		};

		private final String symbol;

		private ExtendedOperation(String symbol) {
			this.symbol = symbol;
		}

		@Override
		public String toString() {
			return symbol;
		}
	}
	
	//利用扩展的枚举类操作的方法
	private static<T extends Enum<T> & Operation> void test(Class<T> opSet,double x,double y){
		//一个for循环，并且配合getEnumConstants方法
		for (Operation operation : opSet.getEnumConstants()) {
			System.out.printf("%f %s %f = %f%n", x,operation,y,operation.apply(x, y));
		}
	}
	
	//或者这种方式来搞定
	private static void test(Collection<? extends Operation> opSet,double x,double y){
		for (Operation operation : opSet) {
			System.out.printf("%f %s %f = %f%n", x,operation,y,operation.apply(x, y));
		}
	}
	
	public static void main(String[] args) {
		test(ExtendedOperation.class, 1, 2);
		System.out.println("我们可以传入随意的枚举扩展类型，因为他们都扩展了接口！");
		test(Arrays.asList(BasicOperation.values()), 2, 1);
	}
}
