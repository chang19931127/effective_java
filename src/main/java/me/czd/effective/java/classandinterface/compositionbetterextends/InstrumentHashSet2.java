package me.czd.effective.java.classandinterface.compositionbetterextends;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 我们来写一个InstrumentHashSet 他要实现的功能就是，统计set中曾经添加的元素个数
 * 我们分别使用复合和继承来实现，并测试，这里就是继承
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class InstrumentHashSet2<E>  {

	//这里虽说是final 但是 set的内容可以改变
	private final Set<E> set;
	private int addCount = 0;

	public InstrumentHashSet2(Set<E> set) {
		super();
		this.set = set;
	}

	public int getAddCount() {
		return addCount;
	}

	//继承的两个方法
	public boolean add(E e) {
		addCount++;
		return set.add(e);
	}

	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size(); 
		return set.addAll(c);
	}
	
	//测试下
	public static void main(String[] args) {
		//为社么变6了，哈哈
		InstrumentHashSet2<String> set = new InstrumentHashSet2<>(new HashSet<>());
		set.addAll(Arrays.asList("snap","xiaohui","laoliu"));		
		System.out.println(set.getAddCount());
	}
	
}
