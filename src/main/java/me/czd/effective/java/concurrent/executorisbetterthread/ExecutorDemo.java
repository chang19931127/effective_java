package me.czd.effective.java.concurrent.executorisbetterthread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 使用对比
 * 明白含义，细节！高手对决就在细节
 * @author Administrator
 *
 */
public class ExecutorDemo {
	public static void main(String[] args) {
//		threadMethod();
		threadPoolMethod();
	}

	private static void threadPoolMethod() {
		//一定要知道参数含义，并且要知道，参数在什么时候起作用
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
		//可以尝试仍20个任务，哈哈
		threadPoolExecutor.execute(() -> {
			System.out.println("哈哈哈哈");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		//注掉试试，感受下什么叫池
		threadPoolExecutor.shutdown();
	}

	/**
	 * 线程执行完毕会cpu会抛弃，然后结束
	 */
	private static void threadMethod() {
		new Thread(() -> {
			System.out.println("哈哈哈哈");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();;
	}
}
