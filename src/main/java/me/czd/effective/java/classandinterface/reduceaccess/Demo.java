package me.czd.effective.java.classandinterface.reduceaccess;

/**
 * 测试类
 * 我们这里回去调用Person 这个类来进行测试
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) {
		Person parent = new Person(45, "父亲", null);
		//生命了一个person
		Person person = new Person(18, "小孩", parent);
		//首先这个person可以操作 age
		person.age = 38;
		System.out.println(person);
		//并且final 修饰的 引用可变，也可以修改
		parent.age = 18;
		System.out.println(person);
		//但是他们就没办发去修改name值。并且Person中去修改name 对我们这个main都是不可知的
		
	}
}
/**
 * 封装类，这里只能有一个public类
 * 虽说编译后生成两个类，但是源文件是一个
 * @author Administrator
 *
 */
class Person{
	public int age;
	private String name;
	public final Person person;
	
	public Person(int age, String name, Person person) {
		super();
		this.age = age;
		this.name = name;
		this.person = person;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", person=" + person + "]";
	}	
}