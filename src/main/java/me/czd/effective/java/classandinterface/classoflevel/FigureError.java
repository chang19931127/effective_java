package me.czd.effective.java.classandinterface.classoflevel;

/**
 * 这就是一个标签类，看看怎么个标签法把
 * tagged class
 * 找一下他的特点,也就是缺点把
 * 乱七八糟都在这个类中，内存也相对应提高
 * 域不能做成final的，传入的参数不对就会报错
 * 破坏可读性
 * @author Administrator
 *
 */
public class FigureError {
	enum Shape{
		RECTANGLE,CIRCLE
	}
	//tag field
	final Shape shape;
	// scope for RECTANGLE
	double length;
	double width;	
	//scope for CIRCLE
	double radius;
	//Constructor for cicle
	public FigureError(double radius) {
		shape = Shape.CIRCLE;
		this.radius = radius;
	}
	//Constructor for rectangle
	public FigureError(double length,double width){
		shape = Shape.RECTANGLE;
		this.length = length;
		this.width = width;
	}
	
	//这里计算会不会损失精度，嘿嘿
	public double area(){
		//可以用枚举，转换成int的类型，string
		switch (shape) {
		case RECTANGLE : return length * width;
		case CIRCLE : return Math.PI * (radius * radius);
		default:
			throw new AssertionError();
		}
	}
	
}
