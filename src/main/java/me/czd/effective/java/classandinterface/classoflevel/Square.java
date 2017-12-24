package me.czd.effective.java.classandinterface.classoflevel;

/**
 * 正方形就更容易实现了
 * 简单把
 * @author Administrator
 *
 */
public class Square extends Rectangle {

	//这里直接操作了域，会有什么问题哈，如果父类构造方法发生了改变，是不是
	//就是说子类依赖了父类的构造方法
	public Square(double side) {
		super(side, side);
	}

}
