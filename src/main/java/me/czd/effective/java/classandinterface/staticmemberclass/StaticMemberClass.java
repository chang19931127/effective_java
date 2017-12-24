package me.czd.effective.java.classandinterface.staticmemberclass;


/**
 * 静态成员类，最简单的类，外围类的一个静态成员，与其他静态成员规则一样，如果他被声明为私有只有外部类才可以访问
 * 静态成员类，一半被用作外部类的辅助类
 * 综合说明，静态成员类。
 * 一它具有静态性
 * 二它具有成员性
 * 静态性是可以被直接访问，因为它属于外部类，而不是外部类实例
 * 成员性是它可以被当作成员一样去调用
 * 特点
 * 静态成员类可以脱离外围类实例单独存在
 * @author Administrator
 *
 */
public class StaticMemberClass {
	public static void main(String[] args) {
		System.out.println(Demo.Util.NAME);
		new Demo.Util().method();;
	}
}
class Demo{
	private static String name = "demo";
	public static class Util{
		public static final String NAME = "util";
		public void method(){
			System.out.println(name + "静态内部类的方法被调用");
		}
		
	}
	//可见并没有Demo实例被调用
	{
		System.out.println("Demo实例被调用");
	}
	public void method1(){
		new Util().method();
	}
}