package me.czd.effective.java.generic.flexiblegeneric;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 给你看一些奇怪的东西！！！关于PECS和 ?以及E的
 * 
 * 其他的PECS可以去看集合框架
 * @author Administrator
 *
 */
public class GenericTest {
	
	//1
	public static void swap(List<?> list,int i,int j){
		//其实讲道理这里错误的原因是不能把null之外的任何值放到List<?>中
//		list.set(i, list.set(j, list.get(i)));
//		list.set(1, "a");
		//但是借助另外一个方法就完全没问题了,因为它把？确定了
		swapHelper(list,i,j);
	}
	private static <E> void swapHelper(List<E> list,int i,int j){
		list.set(i, list.set(j, list.get(i)));
	}
	
	//2
	public static <T extends Comparable<? super T>> T max(List<? extends T> list){
		//一定是？extends 
		Iterator<? extends T> iterator = list.iterator();
		T result = iterator.next();
		while(iterator.hasNext()){
			T t = iterator.next();
			if(t.compareTo(result) > 0){
				result = t;
			}
		}
		return result;
	}
	
	//3
	public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2){
		Set<E> sets = new HashSet<>();
		for (E e : s1) {
			sets.add(e);
		}
		for (E e : s2) {
			sets.add(e);
		}
		return sets;
	}
	
	//4来一个类看下PECS
	private static class Stack<E>{
		private E[] elements;
		private int size = 0;
		private static final int DEFAULT_INITIAL_CAPACITY = 16;
		
		@SuppressWarnings("unchecked")
		public Stack(){
			elements = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
		};
		public void push(E e){
			ensureCapicity();
			elements[size++] = e;
		};
		public E pop(){
			if(isEmpty()) throw new EmptyStackException();
			E result = elements[--size];
			elements[size] = null;
			return result;
		};
		private void ensureCapicity(){
			if(elements.length == size)
				elements = Arrays.copyOf(elements, 2 * size +1);
		}
		public boolean isEmpty(){
			return size == 0;
		}
		
		//PE
		public void pushAll(Iterable<? extends E> src ){
			for (E e : src) {
				push(e);
			}
		}
		//CS
		public void popAll(Collection<? super E> dst){
			while(!isEmpty()){
				dst.add(pop());
			}
		}
	}
	
	public static void main(String[] args) {
		Set<Integer> integers = new HashSet<>(Arrays.asList(1,2,3,4));
		Set<Double> doubles = new HashSet<>(Arrays.asList(1d,2d,3d,4d));
		//这里注意hashSet是无序的
		Set<Number> sets = union(integers, doubles);
		System.out.println(sets);
	}
}
