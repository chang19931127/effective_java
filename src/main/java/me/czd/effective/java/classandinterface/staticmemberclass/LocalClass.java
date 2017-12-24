package me.czd.effective.java.classandinterface.staticmemberclass;

/**
 * 局部类，可以声明在任何的局部变量除，可以被多次调用，这就是和匿名类的唯一一别
 * @author Administrator
 *
 */
public class LocalClass {
	private Runnable runnable = new Runnable() {
		@Override
		public void run() {
			System.out.println("class");
		}
	};
	public static void main(String[] args) {
		new Thread(new LocalClass().runnable).start();
	}
}
