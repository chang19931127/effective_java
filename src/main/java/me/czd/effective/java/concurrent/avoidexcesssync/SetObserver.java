package me.czd.effective.java.concurrent.avoidexcesssync;

/**
 * 回调接口
 * 也可以称为观察者
 * @author Administrator
 *
 */
public interface SetObserver<E> {
	void added(ObservableSet<E> set,E element);
}
