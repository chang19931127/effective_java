package me.czd.effective.java.classandinterface.compositionbetterextends;

import java.util.Properties;

/**
 * 测试以下设计不好的Properties类哈哈
 * 因为Properties 的key 和value 都是 String 哈哈
 * @author Administrator
 *
 */
public class PropertiesTest {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("a", "a");
		System.out.println(properties.getProperty("a"));
		properties.put("a", "b");
		System.out.println(properties.getProperty("a"));
		//如果这么玩呢？
		properties.put("a", 123);
		System.out.println(properties.getProperty("a"));
		
	}
}
