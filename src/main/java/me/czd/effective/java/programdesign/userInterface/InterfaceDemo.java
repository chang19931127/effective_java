package me.czd.effective.java.programdesign.userInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * 尽可能的面向接口编程
 * @author Administrator
 *
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		//实现可以随便改变，但是其他结果却不需要大动！
		List<String> list = new ArrayList<>();
		list.add("");
		list.add("");
		list.add("");
		list.add("");
	}
}
