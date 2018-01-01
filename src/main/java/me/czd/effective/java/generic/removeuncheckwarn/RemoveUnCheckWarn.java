package me.czd.effective.java.generic.removeuncheckwarn;

import java.util.HashSet;
import java.util.Set;

/**
 * 使用泛型的时候
 * 虽说警告可以被@SuppressWarnings("unchecked") 注解搞定
 * 其实使用javac 进行编译代码的时候，警告，错误都会发出来的，所以请慎重对待
 * 
 * 这里提到的就是   ArrayList.toArray(T[] a) 方法就通过这个注解来忽略警告
 * @author Administrator
 *
 */
public class RemoveUnCheckWarn {
	public static void main(String[] args) {
		//这里就有警告
		
		@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
		Set<String> sets = new HashSet();
	}
	
}
