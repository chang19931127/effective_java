package me.czd.effective.java.programdesign.cautiousstring;

import java.util.HashMap;
import java.util.Map;

/**
 * 这里用string作为key不太好
 * 因为字符串必须是唯一的，如果两个客户端使用的是相同的string，那么就GG
 * 因此不要使用String来进行功能性设计
 * 
 * 这也就是分布式id 没有使用String类型把
 * @author Administrator
 *
 */
public class ThreadLocalTest {
	private static Map<String, Object> map = new HashMap<>();
	private ThreadLocalTest(){
		
	}
	public static void set(String key,Object object){
		map.put(key, object);
	}
	public static Object get(String key){
		return map.get(key);
	}
	
	//这样如果使用相同的String，并不能保证线程安全，
}
