package me.czd.effective.java.classandinterface.interfaceonlydefine;

/**
 * 这样子通过类来定义常量，就不会导致常量不可控
 * @author Administrator
 *
 */
public final class PhysicalConstants {
	private PhysicalConstants(){}
	
	//知道e是什么意思么   就是10的多少次方，哈哈
	public static final double AVOGADROS_NMBER = 6.03324199e23;
	public static final double BOLTZMANN_CONSTANT = 1.3806503e-23;
	public static final double ELECTRON_MASS = 9.10938188e-31;
	
}
