package me.czd.effective.java.enumandanno.enuminsteadconstant;

/**
 * 来一个很强的行星枚举类
 * 行星的质量半径
 * 
 * 数据与常量之间的关联
 * 
 * @author Administrator
 *
 */
public enum Planet {
	
	//实例在最前方,数值就不写了
	MERCURY(3.302e+23,2.439e6),
	VENUS(4.869e+24,6.052e6),
	EARTH(5.975e+24,6.378e6),
	MARS(6.419e+23,3.983e6),
	JUPITER(1.899e+27,7.149e7),
	SATURN(5.685e+26,6.027e7),
	URANUS(8.683e+25,2.556e7),
	NEPTUNE(1.024e+26,2.477e7);
	
	private final double mass;			//In kilograms
	private final double radius;		//In meters
	private final double surfaceGravity;//In m/ s^2
	
	private static final double G = 6.67300E-11;

	//枚举的构造方法，默认私有，必须私有,因为实例不可创建
	private Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
		this.surfaceGravity = mass / (radius*radius);
	}
	
	public double mass(){
		return mass;
	}
	
	private double radius(){
		return radius;
	}
	
	private double sufaceGravity(){
		return surfaceGravity;
	}
	
	public double sufaceWeight(double mass){
		return mass = surfaceGravity;
	}
	
	public static void main(String[] args) {
		//枚举的重要方法,可以拿到枚举的所有实例
		for (Planet planet : Planet.values()) {
			System.out.println(planet.sufaceWeight(12d));
			System.out.println(planet.ordinal());
		}
	}
}
