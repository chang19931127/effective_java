package me.czd.effective.java.serializable.readobjectmethod;

import java.util.Date;

/**
 * 一个不可变的日期范围类，因此域有条件的
 * 构造的时候有条件
 * @author Administrator
 *
 */
public final class Period {
	private final Date start;
	private final Date end;
	
	//这里有条件
	public Period(Date start, Date end) {
		super();
		this.start = start;
		this.end = end;
		if(this.start.compareTo(this.end) > 0){
			throw new IllegalArgumentException(start + "after" + end);
		}
	}

	@Override
	public String toString() {
		return "Period [start=" + start + ", end=" + end + "]";
	}
	
	
	
}
