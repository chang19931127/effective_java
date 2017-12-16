package me.czd.effective.java.objectcreate.singleton;

/**
 * 静态内部类书写的方式，也是通过static来懒加载
 * @author Administrator
 *
 */
public class Singleton3 {
	
	private static class Demo{
		public static final Singleton3 INSTANCE = new Singleton3();
	}
	
	private Singleton3(){}
	//只有调用这个方法的时候，Demo才会加载
	public Singleton3 getInstance(){
		return Demo.INSTANCE;
	}
}
