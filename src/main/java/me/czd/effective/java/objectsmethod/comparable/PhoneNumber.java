package me.czd.effective.java.objectsmethod.comparable;

/**
 * 来看下快捷方便有效的compareTo方法
 * 比较的也是域
 * @author Administrator
 *
 */
public class PhoneNumber implements Comparable<PhoneNumber>{

	private short areaCode;
	private short prefix;
	private short lineNumber;
	
	
	public PhoneNumber(short areaCode, short prefix, short lineNumber) {
		super();
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.lineNumber = lineNumber;
	}



	@Override
	public int compareTo(PhoneNumber o) {
		/*
		 * 为了规范你可能这么写
		 * 没有毛病，记住这种 if return 的语句结构，这种判断树结构挺好的
		 * 但是我们可以换一种方式，减少一半的判断
		 */
//		if(areaCode < o.areaCode)
//			return -1;
//		if(areaCode > o.areaCode)
//			return 1;
//		if(prefix < o.prefix)
//			return -1;
//		if(prefix > o.prefix)
//			return 1;
//		if(lineNumber < o.lineNumber)
//			return -1;
//		if(lineNumber > o.lineNumber)
//			return 1;
//		return 0;
		//程序精炼了很多把！！！
		int areaCodeDiff = areaCode - o.areaCode;
		if(areaCodeDiff != 0)
			return areaCodeDiff;
		int prefixDiff = prefix - o.prefix;
		if(prefixDiff != 0)
			return prefixDiff;
		return lineNumber - o.lineNumber;
	}

}
