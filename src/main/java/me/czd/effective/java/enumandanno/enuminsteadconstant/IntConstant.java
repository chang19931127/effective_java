package me.czd.effective.java.enumandanno.enuminsteadconstant;

/**
 * 一些传统应用，如果想要使用常量都这么操作，我们现在写代码应该摒弃
 * 
 * 说下他的缺点
 * 1.这些int值对别人来说识别度不高，只能通过常量名
 * 2.对于这些int我们设计的时候还要考虑他的重复性
 * 3.程序健壮性不高.只要有改动就选哦重新编译，编译后关联代码并不一定可以使用
 * 4.并且针对这些常量比如我们想有一些操作，那是不能实现的
 * 
 * 因此应该自己鼓励自己去使用枚举来进行这些操作！！
 * @author Administrator
 *
 */
public class IntConstant {
	public static final int APPLI_FUJI = 0;
	public static final int APPLI_PIPPIN = 1;
	public static final int APPLI_CRANNY_SMITH = 2;
	
	public static final int ORANGE_NAVEL = 0;
	public static final int ORANGE_TEMPLE = 1;
	public static final int ORANGE_BLOOD = 2;
	
	//例如这里直接使用枚举替换
	//这样子，从各种程度上，都提高了很多
	public enum Apple{
		FUJI,PIPPIN,CRANY_SMITH
	}
	public enum Orange{
		NAVEL,TEMPLE,BLOOD
	}
}
