package me.czd.effective.java.concurrent.avoidexcesssync;

import java.util.Collection;
import java.util.Set;

/**
 * 记得么？复合优于继承
 * 我们这个就是复合类！
 * @author Administrator
 *
 * @param <E>
 */
public abstract class ForwardSet<E> {
	protected Set<E> set;

	public ForwardSet(Set<E> set) {
		super();
		this.set = set;
	};
	
	public abstract boolean add(E element);
	public abstract boolean addAll(Collection<? extends E> collection);
}
