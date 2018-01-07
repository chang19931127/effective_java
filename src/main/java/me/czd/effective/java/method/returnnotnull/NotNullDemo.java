package me.czd.effective.java.method.returnnotnull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 尽可能的不要返回null，取用empty来代替
 * 
 * 这样子不会产生nullException啦，哈哈
 * @author Administrator
 *
 */
public class NotNullDemo {
	class Cheese{}
	private final List<Cheese> cheesesInStock = new ArrayList<>();
	//这里思考，为什么数组会发生变化
	private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];
	{
		//注释掉呢?
		cheesesInStock.add(new Cheese());
		cheesesInStock.add(new Cheese());
		cheesesInStock.add(new Cheese());
	}
	// return an array containing all of the chesses in the shop
	public Cheese[] getChesses(){
		return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
	}
	
	public List<Cheese> getCheeseList(){
		if(cheesesInStock.isEmpty()){
			return Collections.emptyList();
		}else{
			return new ArrayList<>(cheesesInStock);
		}
	}
	
	public static void main(String[] args) {
		NotNullDemo notNullDemo = new NotNullDemo();
		//看下背后都做了什么，ArrayList
		System.out.println(Arrays.toString(notNullDemo.getChesses()));
		System.out.println(Arrays.toString(EMPTY_CHEESE_ARRAY));
	}
}
