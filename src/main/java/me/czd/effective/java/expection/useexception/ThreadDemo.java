package me.czd.effective.java.expection.useexception;

/**
 * 尽可能的将异常用在有异常的地方
 * 别误用异常,通过线程控制来终止线程
 * 
 * 中断怎么解决
 * @author Administrator
 *
 */
public class ThreadDemo {
	//代码正常使用
	public static void main(String[] args) {
		Thread loop = new Thread(() -> {
			while(true){
				System.out.println("线程执行");
				//这里可以注释，来观察结果
				sleep();
				if(Thread.interrupted()){
					System.out.println("线程终止");
					break;
				}
			}
		});
		loop.start();
		loop.interrupt();
	}
	
	private static void sleep(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			//很棒的处理方法，解决异常，这里注释，观察下结果，哈哈
			Thread.currentThread().interrupt();
			throw new RuntimeException();
		}
	}
}
