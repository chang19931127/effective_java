package me.czd.effective.java.enumandanno.signinterface;

/**
 * 标记注解实现类
 * @author Administrator
 *
 */
public class RemarkDemo implements Remark{

	@Override
	public String toString() {
		return "RemarkDemo [toString()=" + super.toString() + "]";
	}
}
