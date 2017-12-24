package me.czd.effective.java.classandinterface.staticmemberclass;

/**
 * 匿名类就是构造一次的，存在于代码中，而不是成员中，一半属于类实例
 * 就是一个匿名类，属于实例
 * @author Administrator
 *
 */
public class AnonymousClass {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("thread");
			}
		}).start();;
	}
}
