package me.czd.effective.java.classandinterface.compositionbetterextends;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * 我们来写一个InstrumentHashSet 他要实现的功能就是，统计set中曾经添加的元素个数
 * 我们分别使用复合和继承来实现，并测试，这里就是继承
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class InstrumentHashSet1<E> extends HashSet<E> {

	private int addCount = 0;

	public InstrumentHashSet1() {
		super();
	}

	public InstrumentHashSet1(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor);
	}

	public int getAddCount() {
		return addCount;
	}

	//继承的两个方法
	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size(); 
		return super.addAll(c);
	}
	
	//测试下
	public static void main(String[] args) {
		//为社么变6了，哈哈 好好想想哦，这就是动态绑定和静态绑定了
		InstrumentHashSet1<String> set = new InstrumentHashSet1<>();
		set.addAll(Arrays.asList("snap","xiaohui","laoliu"));		
		System.out.println(set.getAddCount());
	}
	
}
