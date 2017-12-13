package me.czd.effective.java.objectsmethod.hashcode;

import java.util.HashMap;
import java.util.Map;


/**
 * 一个较为合格的 equals方法
 * 一个较为合格的hashCode方法
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

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + name.hashCode();
		result = 31 * result + age;
		return result;
	}
		
	
	public static void main(String[] args) {
		Map<Person, String> map = new HashMap<>();
		map.put(new Person("开心",12), "开心啊");
		//复写了hashCode()因此使用HashMap没问题了
		System.out.println(map.get(new Person("开心",12)));
	}
}
