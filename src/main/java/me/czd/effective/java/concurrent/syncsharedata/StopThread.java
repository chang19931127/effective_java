package me.czd.effective.java.concurrent.syncsharedata;

import java.util.concurrent.TimeUnit;


/**
 * 看看什么时候需要同步
 * volatile仅针对原子操作有效，i++就不是原子操作
 * 针对i++有相应的原子类AtomicXXX
 * 
 * 还有一点十分重要，jvm会优化我们的代码，导致代码在并发情况下会出现问题！
 * @author Administrator
 *
 */
public class StopThread {
	//一般我们会加一个volatile 来作为辅助
	//当然我们也可以对这个字段的设置，使用同步方法来进行操作。
	private static boolean stopRequested;
	public static void main(String[] args) throws InterruptedException {
		Thread backgroudThread = new Thread(() -> {
			while(!stopRequested){
				int i = 0;
				System.out.println(i++);
			}
		});
		backgroudThread.start();
		TimeUnit.SECONDS.sleep(2);
		//这里就会存在这个值，什么时候被线程看到，存在县城共享！
		stopRequested = true;
	}
}
