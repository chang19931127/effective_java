package me.czd.effective.java.objectcreate.unnecessaryobject;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 避免创建不必要的对象，那么我们就尽可能的重用不变的对象。
 * 
 * @author Administrator
 *
 */
public class ReuseObject {
	public static void main(String[] args) {
		stringTest();
		autoBoxTest();
	}

	private static void autoBoxTest() {
		long startTime = System.currentTimeMillis();
		//别小看L和l 涉及到自动装箱
		Long sum = 0L;
		for(long i = 0;i < Integer.MAX_VALUE; i++){
			sum +=i;
		}
		System.out.println(System.currentTimeMillis() - startTime);
	}

	// test String
	private static void stringTest() {
		long startTime = System.currentTimeMillis();
		//String string ;
		for (int i = 0; i < 10000; i++) {
			//这里如何不打印，就被优化掉了    把new String("string") 换成"string"
			//new 在创建对象    = 的话会去重试
			String string = new String("stringette");
			System.out.println(string);
		}
		System.out.println(System.currentTimeMillis() - startTime);
		String string1 = "abc";
		String string2 = "abc";
		String string3 = new String("abc");
		String string4 = new String("abc");
		System.out.println(string1 == string2);
		System.out.println(string4 == string3);
	}
	
	// 方法通过 static 来定义一些常用的对象
	private static class Person{
		private Date birthDath;
		
		//优化
		private static final Date BOOM_START;
		private static final Date BOOM_END;
		static {
			Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
			gmtCal.set(1946, Calendar.JANUARY,1,0,0,0);
			BOOM_START = gmtCal.getTime();
			gmtCal.set(1965, Calendar.JANUARY,1,0,0,0);
			BOOM_END = gmtCal.getTime();
		}
		
		//糟糕的方式，每次都要new Calendar
		public boolean isBabyBoomer(){
//			Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
//			gmtCal.set(1946, Calendar.JANUARY,1,0,0,0);
//			Date boomStart = gmtCal.getTime();
//			gmtCal.set(1965, Calendar.JANUARY,1,0,0,0);
//			Date boomEnd = gmtCal.getTime();
			return birthDath.compareTo(BOOM_START) >= 0 && birthDath.compareTo(BOOM_END) < 0;
		}
		
	}
}
