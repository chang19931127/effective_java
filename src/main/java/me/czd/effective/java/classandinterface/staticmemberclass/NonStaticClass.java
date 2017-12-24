package me.czd.effective.java.classandinterface.staticmemberclass;


/**
 * 非静态成员类
 * 非静态成员类和静态成员类的唯一区别就是成员类是否被static
 * 那么static修饰后，就证明是实例成员，那么外围类必须实例后才能使用。
 * 所以就存在实例之间的绑定，一般可以当作adapter来使用
 * 
 * 非静态的特点就是它可以调用实例和类的内容
 * 非静态成员类没有办法脱离他的外围类而单独存在
 * @author Administrator
 *
 */
public class NonStaticClass {
	public static void main(String[] args) {
		new Drink().drink();
		
		Drink drink = new Drink();
		//你没有可能new一个Eat出来，只能通过外部类的方法来操作
		Drink.Eat eat = drink.getEat();
		eat.eat();
	}
}
class Drink{
	private String name = "小王";
	public class Eat{
		public void eat(){
			hello();
			System.out.println(name + "能吃");
		}
//		public void hello(){
//			System.out.println("doit");
//		}
	}
	public void hello(){
		System.out.println("hello");
	}
	public void drink(){
		System.out.println(name + "能喝");
		new Eat().eat();
	}
	public Eat getEat(){
		return new Eat();
	}
}