package me.czd.effective.java.programdesign.interfacebetterreflect;

import java.util.Set;

/**
 * 这里就是一个游戏，通过如参来判断类型
 * 
 * 注意了，使用反射去获取实例，但是一定要用接口来调用，这种可以称为最佳实践
 * 
 * 无论代理类，获取RPC调用对象，Service也是接口来调用，反射根据存根来实现
 * @author Administrator
 *
 */
public class ReflectDemo {
	//去输入，java.util.HashSet,java.util.TreeSet很好玩
	public static void main(String[] args) {
		//首先反射拿到Class	
		Class<?> class1 = null;
		try {
			class1 = Class.forName(args[0]);
		} catch (ClassNotFoundException e) {
			System.err.println("class not found.");
			System.exit(1);
		}
		
		//实例化类
		Set<String> set = null;
		try {
			set = (Set<String>) class1.newInstance();
		} catch (InstantiationException e) {
			System.err.println("class not accessible.");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.err.println("class not instantiable.");
			System.exit(1);
		}
	}
}
