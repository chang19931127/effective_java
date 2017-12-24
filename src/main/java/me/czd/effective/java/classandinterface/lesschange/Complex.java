package me.czd.effective.java.classandinterface.lesschange;

/**
 * 一个不可变类，复数，具有实部和虚部
 * final类
 * final域
 * final方法
 * 进行的操作，返回的也是new的对象 
 * 还有这种加减乘除的方法编写，就属于函数式编写，可以一直写 add().add()
 * 当然我们还可以提供常见的版本，让他重用
 * 多考虑，多思考，多想，就会慢慢让自己学会设计
 * @author Administrator
 *
 */
public final class Complex {
	private final double re;	//实部
	private final double im;	//虚部	
	//可重用
	public static final Complex ZERO = new Complex(0, 0);	
	public static final Complex ONE = new Complex(1, 0);
	public static final Complex  I = new Complex(0, 1);
	//提供静态工厂方法，代替构造方法
	public static Complex valueOf(double re,double im){
		return new Complex(re, im);
	}
	//构造方法私有
	private Complex(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}
	
	//提供访问的方法
	public double realPart(){
		return re;
	}	
	public double imaginaryPart(){
		return im;
	}
	//加
	public Complex add(Complex c){
		return new Complex(re + c.re, im + c.im);
	}
	//减
	public Complex subtract(Complex c){
		return new Complex(re - c.re, im - c.im);
	}
	//乘
	public Complex multiply(Complex c){
		return new Complex(re * c.re, im * c.im);
	}
	//除
	public Complex divide(Complex c){
		double tmp = c.re * c.re + c.im + c.im;
		return new Complex(re * c.re + im * c.im / tmp
				, im * c.im - re * c.im / tmp);
	}

	@Override
	public int hashCode() {
		int result = 17 + hashDouble(re);
		result = 31 * result + hashDouble(im);
		return result;
	}

	private int hashDouble(double val){
		long longBits = Double.doubleToLongBits(re);
		return (int)(longBits ^ (longBits >>> 32));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == this) 
			return true;
		if(!(obj instanceof Complex)) 
			return false;
		Complex complex = (Complex) obj;
		return Double.compare(re,complex.re) == 0 
				&& Double.compare(im, complex.im) == 0;
	}

	@Override
	public String toString() {
		return "(" + re + " + "+ im + ")";
	}
	
}
