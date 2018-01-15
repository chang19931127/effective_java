package me.czd.effective.java.expection.exceptiontype;

/**
 * 测试
 * 来几个异常
 * 运行异常和error异常没办法解决！仅依靠程序
 * check一样，程序必须要让你去处理异常，或者抛出，调用者去解决
 * 所以我挺喜欢check 异常！
 * 
 * 两种方式把，一种默认异常不会发生，一种默认会发生，你尽可能的写呢处理的逻辑
 * @author Administrator
 *
 */
public class ExceptionDemo {
	public static void main(String[] args) {
//		runtimeException();
//		checkException();
	}

	private static void checkException() {
		Thread loop = new Thread(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("发生异常了，没关系，我们处理");
				System.err.println("当前异常"+e);
				System.out.println("没关系程序按照我们的想法去走！");
			}
		});
		loop.start();
		loop.interrupt();
	}

	private static void runtimeException() {
		System.out.println(1/0);
	}
}
