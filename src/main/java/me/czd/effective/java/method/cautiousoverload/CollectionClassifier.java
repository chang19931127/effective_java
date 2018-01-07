package me.czd.effective.java.method.cautiousoverload;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 一个工具类，想法很好，区分集合的类型！
 * 但是由于重载的原因，导致使用者模糊
 * 
 * 类作为如参是静态，类如果作为调用者是动态
 * 
 * @author Administrator
 *
 */
public class CollectionClassifier {
	public static String classify(Set<?> set){
		return "Set";
	}
	public static String classify(List<?> list){
		return "List";
	}
	public static String classify(Collection<?> collection){
		return "Collection";
	}
	
	public static void main(String[] args) {
		Collection<?>[] collections = {
				new HashSet<String>(),
				new ArrayList<BigInteger>(),
				new HashMap<String,String>().values()
		};
		
		for (Collection<?> collection : collections) {
			//这里来猜一下结果把！这就是静态性
			System.out.println(classify(collection));
		}
		
		
		
		//再来看一组jdk内部的重载导致的混乱，如果使用者不注意，就会进坑
		Set<Integer> set = new TreeSet<>();
		List<Integer> list = new ArrayList<>();
		for(int i = -3 ; i < 3 ; i++){
			//自动装箱，调用的add(Integer)方法
			set.add(i);
			list.add(i);
		}
		for(int i = 0 ; i < 3 ; i++){
			//这里就是remove(Object)和remove(int) 因为两个集合不同，一个有序，一个无序
			set.remove(i);
			list.remove(i);
		}
		System.out.println(set + "---" + list);
	}
}
