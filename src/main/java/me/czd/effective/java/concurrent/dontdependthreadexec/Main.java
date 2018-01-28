package me.czd.effective.java.concurrent.dontdependthreadexec;

import java.util.concurrent.CountDownLatch;

public class Main {
	public static void main(String[] args) {
		//来1000个线程玩起来
		//可以发现性能差不多阿，是什么原因，难道是jvm优化了么
		//应该是synchronized的性能被优化的很棒了！
		SlowCountDownLatch slowCountDownLatch = new SlowCountDownLatch(1000);
		CountDownLatch countDownLatch = new CountDownLatch(1000);
		long startTime = System.currentTimeMillis();
		for(int i = 0;i< 1000;i++){
			new Thread(() -> {
				slowCountDownLatch.countDown();
			}).start();;
		}
		slowCountDownLatch.await();
		System.out.println(System.currentTimeMillis() - startTime);
	}
}
