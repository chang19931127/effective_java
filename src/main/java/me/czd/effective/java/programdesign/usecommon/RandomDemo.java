package me.czd.effective.java.programdesign.usecommon;

import java.util.Random;

/**
 * 使用jdk的类库，选择不同，结果会不同
 * 
 * Random.nextInt()					伪随机数
 * Random.nextInt(int)两种概念就不同		int范围内的随机数
 * @author Administrator
 *
 */
public class RandomDemo {
	private static final Random RANDOM =new Random();
	public static void main(String[] args) {
		int n = 2 * (Integer.MAX_VALUE / 3);
		int low = 0;
		for(int i = 0; i < 100000; i++){
			if(Random(n) < n/2){
				low++;
			}
		}
		System.out.println(low);
	}
	
	private static int Random(int n){
		return Math.abs(RANDOM.nextInt()) % n;
	}
}
