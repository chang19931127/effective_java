package me.czd.effective.java.objectsmethod.tostring;

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
	
	
	
	@Override
	public String toString() {
		return "["+"name:"+name+",age:"+age+"]";
	}

	//一个很渣的写法
	public static Person valueOf(String string){
		//[name:常振东,age:18]
		string = string.substring(1, string.length()-1);
		String[] strings = string.split(",");
		String name = strings[0].substring(strings[0].indexOf(":")+1);
		int age = Integer.parseInt(strings[1].substring(strings[1].indexOf(":")+1));
		return new Person(name, age);
	}
	
	public static void main(String[] args) {
		System.out.println(new Person("常振东", 18));
		System.out.println(Person.valueOf("[name:常振东,age:18]"));
	}
}
