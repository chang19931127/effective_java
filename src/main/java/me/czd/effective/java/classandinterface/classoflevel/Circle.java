package me.czd.effective.java.classandinterface.classoflevel;

/**
 * 圆实现
 * 
 * @author Administrator
 *
 */
public class Circle extends Figure {
	// final域
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * (radius * radius);
	}

}
