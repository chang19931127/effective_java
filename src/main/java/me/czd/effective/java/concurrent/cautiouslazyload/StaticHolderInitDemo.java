package me.czd.effective.java.concurrent.cautiouslazyload;

/**
 * 静态使用,这种方法很棒哦俗称
 * initialize on demand holder class idiom
 * 保证了类在使用的时候才会被初始化！很棒哦
 * 利用类的Cinit来进行static加载
 * 利用外部类，使用，回调内部类，然后初始化
 * @author Administrator
 *
 */
public class StaticHolderInitDemo {
	
	//一般情况这个类不会被别人调用
	private static class Holder{
		static final Demo DEMO = computeDemo();
	}
	
	private static Demo computeDemo(){
		System.out.println("加载");
		return new Demo();
	}
	
	public static Demo getDemo(){
		return Holder.DEMO;
	}
}
