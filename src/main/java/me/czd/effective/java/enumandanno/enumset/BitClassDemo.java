package me.czd.effective.java.enumandanno.enumset;

import java.util.EnumSet;
import java.util.Set;

/**
 * 来一个位域的用法
 * 位域表示法允许利用位运算操作，有效的执行像union和intersection这样的集合操作
 * 
 * 其实目的就是，如何给一个方法传入类型相同的参数！并且我们这里要求的类型相同是常量
 * 这里我们熟悉下EnumSet的用法
 * EnumSet里面的参数都是枚举类型，并且由于泛型的原因，只能是同一个枚举
 * 
 * @author Administrator
 *
 */
public class BitClassDemo {
	public static final int STYLE_BOLD = 1 << 0;
	public static final int STYLE_ITALIC = 1 << 1;
	public static final int STYLE_UNDERLINE = 1 << 2;
	public static final int STYLE_STRIKETHROUCH = 1 << 3;
	
	public void applyStyles(int style){
		//就是位操作
	}
	
	
	/**
	 * 看看使用EnumSet如何来解决
	 */
	public enum Style{
		BOLD,ITALIC,UNDERLINE,STRIKETHROUCH;
	}
	
	public void applyStyles(Set<Style> styles){
		//进行操作
	}
	
	public static void main(String[] args) {
		new BitClassDemo().applyStyles(EnumSet.of(Style.BOLD,Style.ITALIC));
	}
}
