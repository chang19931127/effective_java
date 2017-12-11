package me.czd.effective.java.objectcreate.staticfactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 我们的研究对象
 * 
 * 可能构造方法会让人看不懂
 * 
 * 
 * 还有 static 方法看左边的类型，静态类型，非static方法看右边类型，动态类型 static
 * 代码块，调用一次，构造器代码块，每次都调用，并且在构造函数之前调用
 * 
 * @author Administrator
 *
 */
public class Person {
	// 性别 0:女 1:男
	private int i;
	private static final Person AOTUMAN = new Person();

	private static class Man extends Person {
		public String toString() {
			return "you can do it man!";
		}
	}

	public Person() {
		super();
	}

	public Person(int i) {
		super();
		this.i = i;
	}

	public String toString() {
		if (i == 0) {
			return "女人";
		}
		return "男人";
	}

	// 较能区分的静态工厂方法
	public static Person getSexPerson(int i) {
		if (i == 0) {
			return new Person(0);
		}
		return new Person(1);
	}

	// 返回同一个实例
	public static Person getAotuMan() {
		return AOTUMAN;
	}

	public static Person getMan() {
		return new Man();
	}

	public static <K, V> HashMap<K, V> newMap() {
		return new HashMap<>();
	}

	public static void main(String[] args) {
		// 知道那个的识别度高了把
		System.out.println(new Person(0));
		System.out.println(Person.getSexPerson(1));
		// 可以使用 == 代替 equals
		System.out.println(Person.getAotuMan() == Person.getAotuMan());
		// 可以得到子类,那么非static的方法就可以调用类继承的方法了
		System.out.println(Person.getMan());
		//可以简写泛型,貌似google工具包里面有类似的方案,自动推导方案
		Map<String, List<String>> map = Person.newMap();
		map.put("String", new ArrayList<>());
	}
}
