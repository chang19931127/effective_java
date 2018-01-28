package me.czd.effective.java.concurrent.cautiouslazyload;

/**
 * 利用延迟初始化，来破坏初始化，就要使用同步
 * @author Administrator
 *
 */
public class SimpleLazyInitDemo {
	//lazy initialization of instance field 同步访问哈，否则有问题
	private Demo demo;
	
	//一定要同步，性能最低的方式，哈哈
	public synchronized Demo getDemo(){
		if(demo == null){
			demo = computeDemo(); 
		}
		return demo;
	}
	
	private Demo computeDemo(){
		System.out.println("加载");
		return new Demo();
	}
}
