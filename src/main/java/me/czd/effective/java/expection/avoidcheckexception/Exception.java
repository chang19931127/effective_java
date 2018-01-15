package me.czd.effective.java.expection.avoidcheckexception;

/**
 * 规定输入奇数
 * @author Administrator
 *
 */
public class Exception {
	public static void main(String[] args) {
		//换成偶数实施
		printOdd(1);
	}
	private static int printOdd(int i){
		if((i & i<<1) == i){
			throw new IllegalArgumentException() ;
		}
		return i;
	}
}
