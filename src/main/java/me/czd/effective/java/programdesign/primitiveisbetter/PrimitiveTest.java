package me.czd.effective.java.programdesign.primitiveisbetter;

/**
 * 来看下包装类和原生类对程序的影响
 * 
 * 主要就是box 以及 他们本身的特性！
 * @author Administrator
 *
 */
public class PrimitiveTest {
	public static void main(String[] args) {
		System.out.println(compare(new Integer(1), new Integer(1)));
		System.out.println("执行效率 :" +timetest());
	}
	
	private static int compare(Integer first,Integer second){
//		转换下结果就不同了
//		int f = first;
//		int s = second;
		return first<second ? -1 : (first == second) ? 0 : 1;
	}
	
	private static long timetest(){
		long start = System.currentTimeMillis();
		//这里Long换成long 时间提高了8倍
		Long sum = 0L;
		for(long i = 0;i < Integer.MAX_VALUE;i++){
			sum += i;
		}
		return System.currentTimeMillis() - start;
	}
	
}
