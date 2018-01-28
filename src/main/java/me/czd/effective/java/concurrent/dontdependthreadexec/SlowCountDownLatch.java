package me.czd.effective.java.concurrent.dontdependthreadexec;

/**
 * 这就是通过线程调度器来搞
 * 但是开销很夸张
 * @author Administrator
 *
 */
public class SlowCountDownLatch {
	private int count;

	public SlowCountDownLatch(int count) {
		super();
		this.count = count;
	}
	
	public void await(){
		while(true){
			synchronized (this) {
				if(count == 0){
					return ;
				}
			}
		}
	}
	
	public synchronized void countDown(){
		if(count != 0){
			count--;
		}
	}
}
