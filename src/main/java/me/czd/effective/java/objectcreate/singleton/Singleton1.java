package me.czd.effective.java.objectcreate.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 通过 static 来单例 要明白 static 的语义 饿汉模式，类加载就提供
 * 序列化可以产生多个对象，也要解决
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class Singleton1 implements Serializable {
	// 公有域在性能上不再有优势
	private static final Singleton1 INSTANCE = new Singleton1();

	private Singleton1() {
		if (INSTANCE != null) {
			throw new RuntimeException();
		}
	}

	public static Singleton1 getInstance() {
		return INSTANCE;
	}

	//这个方法好好斟酌以下
	//序列化操作提供了一个很特别的钩子(hook) 类中具有一个私有的被实例化的方法readresolve(),
	//这个方法可以确保类的开发人员在序列化将会返回怎样的object上具有发言权
	private Object readResolve() throws ObjectStreamException {
		// instead of the object we're on,
		// return the class variable INSTANCE
		return INSTANCE;
	}

}
