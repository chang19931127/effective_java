package me.czd.effective.java.programdesign.localvar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 来看一个最直接的局部变量范围最小化的优点
 * 
 * 尽可能的让局部变量的作用域就在代码块中。这样子多好
 * @author Administrator
 *
 */
public class LocalVarDemo {

	private static void doSomething(String string){
		System.out.println("doSomething");
	}
	
	private static void doSomethingElse(String string){
		System.out.println("doSomething");
	}
	
	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		
		Collection<String> c2 = new ArrayList<>(c1);
		
		Iterator<String> i1 = c1.iterator();
		while(i1.hasNext()){
			doSomething(i1.next());
		}
		
		//直接copy，这里忽略了while中的的修改
		Iterator<String> i2 = c2.iterator();
		while(i1.hasNext()){
			doSomethingElse(i1.next());
		}
		
		//那么我们开始为什么不让变量作用范围更小呢
		for (Iterator<String> i = c1.iterator(); i.hasNext();) {
			doSomething(i.next());
		}
		
		//或者干脆直接foreach
		for (String string : c2) {
			doSomething(string);
		}
	}
	
}
