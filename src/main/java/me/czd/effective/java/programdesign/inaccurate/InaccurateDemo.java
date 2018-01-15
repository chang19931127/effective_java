package me.czd.effective.java.programdesign.inaccurate;

import java.math.BigDecimal;

/**
 * 直接来一组计算，一看就懂
 * 1+2+3+4 = 10
 * @author Administrator
 *
 */
public class InaccurateDemo {
	public static void main(String[] args) {
		//使用double的问题
		System.out.println("使用double");
		doubletest();
		
		//换成BigDecimal
		System.out.println("使用BigDecimal");
		bigDecimalTest();
		
		//扩大符号
		System.out.println("使用扩大符号");
		extendsTest();
	}

	private static void extendsTest() {
		double funds = 1.00 * 100;
		int itemsBought = 0;
		for (double price = .10 * 100; funds >= price; price += .10 * 100) {
			funds -= price;
			itemsBought++;
		}
		System.out.println(itemsBought + "已购买商品");
		System.out.println("change : $" + funds);
	}

	private static void bigDecimalTest() {
		BigDecimal ten_cent = new BigDecimal(".10");
		int itemsBought = 0;
		BigDecimal funds = new BigDecimal("1.00");
		for(BigDecimal price = ten_cent;funds.compareTo(price) >= 0;price = price.add(ten_cent)){
			itemsBought++;
			funds = funds.subtract(price);
		}
		System.out.println(itemsBought + "已购买商品");
		System.out.println("change : $" + funds);
	}

	private static void doubletest() {
		double funds = 1.00;
		int itemsBought = 0;
		for (double price = .10; funds >= price; price += .10) {
			funds -= price;
			itemsBought++;
		}
		System.out.println(itemsBought + "已购买商品");
		System.out.println("change : $" + funds);
	}
}
