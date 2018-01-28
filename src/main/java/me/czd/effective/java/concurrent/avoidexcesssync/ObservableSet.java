package me.czd.effective.java.concurrent.avoidexcesssync;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 观察者模式，然后，通过回调函数，来进行操作
 * 通过我们的同步方法，然后去调用回调函数，但是回调函数的函数内容我们未知
 * 就会造成问题！本章划重点！
 * @author Administrator
 *
 * @param <E>
 */
public class ObservableSet<E> extends ForwardSet<E>  {

	private final List<SetObserver<E>> observers = new ArrayList<>();
	public ObservableSet(Set<E> set) {
		super(set);
	}
	
	public void addObserver(SetObserver<E> observer){
		synchronized (observers) {
			observers.add(observer);
		}
	}
	
	public boolean removeObserver(SetObserver<E> observer){
		synchronized (observers) {
			return observers.remove(observer);
		}
	}
	
	private void notifyElementAdded(E element){
		synchronized (observers) {
			for (SetObserver<E> setObserver : observers) {
				setObserver.added(this, element);
			}
		}
	}
	
	@Override
	public boolean add(E element) {
		boolean added = set.add(element);
		if(added) notifyElementAdded(element);
		return added;
	}

	@Override
	public boolean addAll(Collection<? extends E> collection) {
		boolean result = false;
		for (E e : collection) {
			result = add(e);
		}
		return result;
	}
	

}
