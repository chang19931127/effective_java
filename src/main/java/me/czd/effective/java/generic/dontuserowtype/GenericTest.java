package me.czd.effective.java.generic.dontuserowtype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 测试泛型
 * @author Administrator
 *
 */
public class GenericTest {
	public static void main(String[] args) {
		//为了兼容1.5之前的，所以老的也可以用，但是不建议！！
		
//		Collection collections = new ArrayList();
//		collections.add(new Stamp());
//		collections.add(new Coin());
//		for(Iterator iterator = collections.iterator();iterator.hasNext();){
//			//因为没有用到泛型，会导致转换错误
//			Stamp stamp = (Stamp) iterator.next();
//		}
		Collection<Stamp> collections = new ArrayList<>();
		collections.add(new Stamp());
//		collections.add(new Coin());
		for (Stamp stamp : collections) {
			System.out.println(stamp);
		}
		//使用泛型会提前暴露错误,并且自动转型
		List<String> strings = new ArrayList<>();
		unsafeAdd(strings, new Integer(12));
		//会报错
//		safeAdd(strings, new Integer(12));
		String string = strings.get(0);
	}
	
	//因此方法应该也用泛型来写
	private static void unsafeAdd(List list,Object object){
		list.add(object);
	}
	
	private static <E> void safeAdd(List<E> list , E e){
		list.add(e);
	}
	
	
}
class Stamp{
	
}
class Coin{
	
}
