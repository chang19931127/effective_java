package me.czd.effective.java.method.safecopy;

import java.util.Date;

/**
 * 我们这个类的作用是记录一段不可变的时间周期
 * 
 * 保护性copy，尽可能的使用构造函数，或者静态方法，因为clone方法还是有点问题
 * @author Administrator
 *
 */
public class Period {
	//虽说这里是final 但是引用Date 是可以改变的
	private final Date start;
	private final Date end;
	public Period(Date start, Date end) {
		super();
		if(start.compareTo(end) > 0){
			throw new IllegalArgumentException(start +" after " + end);
		}
//		this.start = start;
//		this.end = end;
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());
	}
	
	public Date start(){
//		return start;
		return new Date(start.getTime());
	}
	
	public Date end(){
//		return end;
		return new Date(end.getTime());
	}
	
	//other
}
