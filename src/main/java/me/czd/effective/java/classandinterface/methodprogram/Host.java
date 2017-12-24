package me.czd.effective.java.classandinterface.methodprogram;

import java.util.Arrays;
import java.util.Comparator;


/**
 * 来一个单例，的，然后这个策略可以被无限次调用的
 * 还是Comparator这个接口为例
 * @author Administrator
 *
 */
public class Host {
	//内部内成员
	private static class StrLenCmp implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			return o1.length() - o2.length();
		}
	}
	//这样方便调用
	public static final Comparator<String> STRING_LENGTH_COMPARTOR = new StrLenCmp();
	
	//另外一种就是直接new一个策略，也可以通过lambda来搞定
	public static void main(String[] args) {
		String[] stringArrays = {"123","av","1234","qwert"};
		Arrays.sort(stringArrays,Host.STRING_LENGTH_COMPARTOR);
		System.out.println(Arrays.toString(stringArrays));
		Arrays.sort(stringArrays,(a,b) -> {
			 return b.length() - a.length();
		});
		System.out.println(Arrays.toString(stringArrays));
	}
}
