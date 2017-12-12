package me.czd.effective.java.objectcreate.privateconstructor;

/**
 * 工具类，并不向他人随便new
 * @author Administrator
 *
 */
public class UtilityClass {
	private UtilityClass(){
		throw new AssertionError();
	}
}
