package me.czd.effective.java.objectcreate.removeexpireobject;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 我们自己实现一个栈，那么对象的引用由栈来决定，所以可能会内存泄漏
 * @author Administrator
 *
 */
public class Stack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPCITY = 16;
	
	public Stack(){
		elements = new Object[DEFAULT_INITIAL_CAPCITY];
	}
	
	public void push(Object e){
		ensureCapacity();
		elements[size++] = e;
	}
	
	public Object pop(){
		if(size == 0) throw new EmptyStackException();
		//这里虽说业务上pop了，但是代码还维护这引用，需要置空
//		elements[size] = null;
		return elements[--size];
	}
	
	private void ensureCapacity(){
		if(elements.length == size){
			elements = Arrays.copyOf(elements, size * size +1);
		}
	}
}
