package me.czd.effective.java.generic.prioritygeneric;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 我们来一套，泛型规范栈.就是泛型和数组配合的时候难免会有波折
 * 
 * 另外一种方法，就是Object[]
 * 然后在返回的时候去转型，这种警告的范围比较小
 * @author Administrator
 *
 * @param <E>
 */
public class Stack<E> {
	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	@SuppressWarnings("unchecked")
	public Stack(){
		//这里就需要了泛型的问题，如何解决
//		elements = new E[DEFAULT_INITIAL_CAPACITY];
		//第一种
		elements = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
	public void push(E e){
		ensureCapicity();
		elements[size++] = e;
	}
	
	public E pop(){
		if(isEmpty()) throw new EmptyStackException();
		E result = elements[--size];
		elements[size] = null;
		return result;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	private void ensureCapicity(){
		if(elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size +1);
	}
}
