package me.czd.effective.java.method.checkparamvalid;

import java.math.BigInteger;

/**
 * 来一些方法把
 * 
 * 有必要的化，对于暴露到外头的方法，尽可能的参数做校验，写出文档！
 * 
 * 对于内部调用的方法，可以考虑使用assert 断言来进行操作
 * @author Administrator
 *
 */
public class ParameterDemo {
	
	/**
	 * Return a BigInteger Whose ....
	 * @param mBigInteger
	 * @return
	 * @throws ArithmeticException if m is less than or equal to 0
	 */
	public BigInteger mod (BigInteger mBigInteger){
		if(mBigInteger.signum() <= 0){
			throw new ArithmeticException("Modulus <= 0 : " + mBigInteger);
		}
		// do the computation
		return null;
	}
	
	//断言的操作可以参考sun的教程
	//如果断言没有成功，本质上也不会有成本开销
	private static void sort(long a[],int offset,int length){
		assert a!= null;
		assert offset >= 0 && offset <= a.length;
		assert length >= 0 && length <= a.length - offset;
		//do the computation
	}
}
