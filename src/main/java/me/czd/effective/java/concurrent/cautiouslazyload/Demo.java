package me.czd.effective.java.concurrent.cautiouslazyload;

/**
 * 就一个对象
 * 很简单
 * @author Administrator
 *
 */
public class Demo {
	//但是我们可以测试
	public static void main(String[] args) throws ClassNotFoundException {
		simpleInitDemo();
	}

	private static void simpleInitDemo() throws ClassNotFoundException {
		//		new	SimpleInitDemo();
		Class.forName("me.czd.effective.java.concurrent.cautiouslazyload.SimpleInitDemo");
	}
}
