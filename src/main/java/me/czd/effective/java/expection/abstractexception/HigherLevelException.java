package me.czd.effective.java.expection.abstractexception;

/**
 * 来一个高级异常
 * @author Administrator
 *
 */
public class HigherLevelException extends Exception {
	
	private static final long serialVersionUID = 1L;

	HigherLevelException(Throwable cause){
		super(cause);
	}
}
