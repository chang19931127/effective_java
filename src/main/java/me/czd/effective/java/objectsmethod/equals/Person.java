package me.czd.effective.java.objectsmethod.equals;

import java.util.HashMap;
import java.util.Map;

/**
 * 一个较为合格的 equals方法
 * @author Administrator
 *
 */
public class Person {
	private String name;
	private int age;
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(!(obj instanceof Person)) return false;
		Person person = (Person) obj;
		return person.name == this.name && person.age == this.age;
	}
		
	/**
	 * 当然，这里不写equals方法会出问题的
	 */
	
	public static void main(String[] args) {
		System.out.println(new Person("开心",12).equals(null));
		Map<Person, String> map = new HashMap<>();
		map.put(new Person("开心",12), "开心啊");
		//由于hashMap的原因，所以这里是null！！！因此我们需要读HashMap的源码，很熟
		System.out.println(map.get(new Person("开心",12)));
	}
}
