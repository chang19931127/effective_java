package me.czd.effective.java.expection.printexceptionmsg;

/**
 * 其实在正常使用中，我们都是打印出来相关的出错信息，这样子可以帮助我们快速定位
 * 
 * 但有的时候，我们可以直接在遗产中指明错误内容！
 * 但一般不这么用！
 * @author Administrator
 *
 */
public class ErrorCodeIndexOutOfBoundsException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//其实就一个super(String message) 打印异常信息
	public ErrorCodeIndexOutOfBoundsException(int lowerBound,int upperBound,int index){
		super("Lower bound:"+lowerBound + "Upper bound:" +upperBound +"index:"+index);
	}
}
