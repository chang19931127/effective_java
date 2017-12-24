package me.czd.effective.java.classandinterface.usemethodaccess;

/**
 * 一个设计较好的类因该是属性私有化，提供get set方法
 * 
 * 但有的时候，我们还是想直接调用，那么该怎么办，这样子可以尝试下
 * 准确表示某一时间
 * 只能构造方法构造，并且，属性不能被修改
 * 但是这么做有一个坏处，就是说，你内部的属性，不能乱改，改了，其他地方就要修改，哈哈
 * @author Administrator
 *
 */
public final class Time {
	private static final int HOURS_PER_DAY = 24;
	private static final int MINUTES_PER_HOUR = 60;
	
	//final 引用的对象不能是可变的哈哈,
	public final int hour;
	public final int minute;
	public Time(int hour, int minute) {
		if(hour < 0 || hour >= HOURS_PER_DAY)
			throw new IllegalArgumentException("Hour: "+ hour);
		if(minute < 0 || minute >= MINUTES_PER_HOUR)
			throw new IllegalArgumentException("Minute: "+ minute);
		this.hour = hour;
		this.minute = minute;
	}				
}
