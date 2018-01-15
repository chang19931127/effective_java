package me.czd.effective.java.programdesign.foreachisbetter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 来看下for-each对我们带来的安全性
 * for-each最好的方式就是用来遍历，然后对遍历后的数据进行操作！！！
 * 
 * @author Administrator
 *
 */
public class ForEachDemo {
	//牌色
	enum Suit{
		CLUB,DIAMOND,HERT,SPADE
	}
	//牌数
	enum Rank{
		ACE,DEUCE,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEUE,KING
	}
	//牌
    static class Card{
		private Suit suit;
		private Rank rank;
		public Card(Suit suit, Rank rank) {
			super();
			this.suit = suit;
			this.rank = rank;
		}
		@Override
		public String toString() {
			return "花色"+suit.toString()+"大小"+rank.toString() ;
		}
		
		
	}
	public static void main(String[] args) {
		Collection<Suit> suits = Arrays.asList(Suit.values());
		Collection<Rank> ranks = Arrays.asList(Rank.values());
		
		List<Card> deck1 = new ArrayList<>();
		List<Card> deck2 = new ArrayList<>();
		try {
			for(Iterator<Suit> i1 = suits.iterator();i1.hasNext();){
				for(Iterator<Rank> i2 = ranks.iterator();i2.hasNext();){
					deck1.add(new Card(i1.next(), i2.next()));
				}
			}
		//猜猜结果是不是有bug 
			System.out.println("deck的张数"+deck1.size());
		} catch (Exception e) {
			//我们使用for-each呢?哈哈
			for (Suit suit : suits) {
				for (Rank rank : ranks) {
					deck2.add(new Card(suit, rank));
				}
			}
			System.out.println("deck2的张数"+deck2.size());
		}
	}
}
