package me.czd.effective.java.classandinterface.classoflevel;

/**
 * 矩形类
 * @author Administrator
 *
 */
public class Rectangle extends Figure {
	private final double length;
	private final double width;
	
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

}
