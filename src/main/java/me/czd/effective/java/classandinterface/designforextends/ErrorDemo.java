package me.czd.effective.java.classandinterface.designforextends;

import java.util.Date;

/**
 * 错误的调用实现方法导致继承发生错误
 * @author Administrator
 *
 */
public class ErrorDemo {
	public static void main(String[] args) {
		Sub sub = new Sub();
		//打印了两次，因为动态方法指向右边，子类，哈哈，造成子类错误！
		sub.overrideMe();
	}
}
class Super{
	public Super(){
		overrideMe();
	}

	public void overrideMe() {
		
	}
}

class Sub extends Super{
	private final Date date;
	Sub(){
//		super();默认就有
		date = new Date();
	}
	@Override
	public void overrideMe() {
		System.out.println(date);
	}
	
}
