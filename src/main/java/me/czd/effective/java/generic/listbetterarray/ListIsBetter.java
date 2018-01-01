package me.czd.effective.java.generic.listbetterarray;

import java.util.ArrayList;
import java.util.List;

/**
 * 当追求安全的时候可以优先可虑列表
 * 
 * 来几个操作观察一下
 * @author Administrator
 *
 */
public class ListIsBetter<E> {
	public static void main(String[] args) {
		//数组是协变的，存在父子关系，泛型就不会由于擦出的原因
		try {
			Object[] objects = new Long[1];
			//这里会产生错误
			objects[0] = "i dont fit in";
		} catch (Exception e) {
			throw new RuntimeException("数组装入错误");
		}
		//但是使用列表报出编译错误
//		List<Object> list = new ArrayList<Long>();
//		list.add("i dont fit in");
	}
	
	/*
	 * 前提条件 list 是一个同步列表类似Collections.synchronizedList
	 */
	static Object reduce1(List list,Function1 f,Object initVal){
		//不要在同步区域中调用外来的方法
//		synchronized (list) {		
			//由于我们这里每次都是一个新对象，所以不涉及并发，也就是多例保证
			Object[] snapshot = list.toArray();
			Object result = initVal;
			for (Object object : snapshot) {
				//外来的方法
				result = f.apply(result, object);
			}
//		}
		return result;
	}
	
	//如果我们使用泛型呢，这么去解决也没有警告，很棒
	static <E> E reduce1(List<E> list,Function2<E> f,E initVal){
		//不要在同步区域中调用外来的方法
		List<E> snapshot;
		synchronized (list) {
			snapshot = new ArrayList<>(list);
		}
		E result = initVal;
		for (E object : snapshot) {
			result = f.apply(result, object);
		}
		return result;
	}
	
	
}
interface Function1{
	Object apply(Object obj1,Object obj2);
}
interface Function2<T>{
	T apply(T obj1,T obj2);
}