package me.czd.effective.java.generic.prioritygenericmethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 泛型方法出来吧
 * 就是因为泛型的推导能力，所以很强
 * jdk1.8中已经可以自动推到了，
 * @author Administrator
 *
 */
public class GenericMethod {
	public static void main(String[] args) {
		Set<String> guys = new HashSet<>(Arrays.asList("Tom","Dick","Harry"));
		Set<String> stooges = new HashSet<>(Arrays.asList("Larry","Moe","Curly"));
		Set<String> aflCio = union(guys,stooges);
		System.out.println(aflCio);
	}
	//这样基本不会有啥错误
	private static <E> Set<E> union(Set<E> s1,Set<E> s2){
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}
	
	//也是泛型，并且不会有错误
	public static <T extends Comparable<T>> T max(List<T> list){
		Iterator<T> iterator = list.iterator();
		T result = iterator.next();
		while(iterator.hasNext()){
			T t = iterator.next();
			if(t.compareTo(result) > 0) return t;
		}
		return result;
	}
}

interface UnaryFunction<T>{
	T apply(T arg);
}
