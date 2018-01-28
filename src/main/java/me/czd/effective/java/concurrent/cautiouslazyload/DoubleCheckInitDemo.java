package me.czd.effective.java.concurrent.cautiouslazyload;

/**
 * 在熟悉不过的DCL，主要volatile哦
 * 这个效率高,不同的判断过滤部分数据
 * @author Administrator
 *
 */
public class DoubleCheckInitDemo {
	private volatile Demo demo;
	
	private Demo computeDemo(){
		System.out.println("加载");
		return new Demo();
	}
	public Demo getDemo(){
		//总是去copy对象，然后去掉用，不怎么对原有对象操作
		Demo result = demo;
		if(result == null){
			synchronized (this) {
				result = demo;
				if(result == null){
					demo = result = computeDemo();
				}
			}
		}
		return result;
	}
}
