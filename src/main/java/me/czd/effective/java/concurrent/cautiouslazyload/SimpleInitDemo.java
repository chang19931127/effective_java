package me.czd.effective.java.concurrent.cautiouslazyload;

/**
 * 最简单的方式
 * 实例属性
 * 正常初始化的实例域的典型声明
 * @author Administrator
 *
 */
public class SimpleInitDemo {
	//有没有必要，记住这里是实例哦
	private final Demo demo = computeDemo();
	
	private Demo computeDemo(){
		System.out.println("加载");
		return new Demo();
	}
}
