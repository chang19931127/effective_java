package me.czd.effective.java.enumandanno.useoverride;

import java.util.HashSet;
import java.util.Set;

/**
 * 这里想当然 复写方法，没有使用override 导致结果出错
 * @author Administrator
 *
 */
public class Bigram {
	private final char first;
	private final char second;
	public Bigram(char first, char second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	//想当然了，但是Override会帮助我们发现错误，记得之前一条么，复写equals需要的规则
	public boolean equals(Bigram bigram){
		return bigram.first == first && bigram.second == second;
	}
	
	//这里我用idea生成了，最好回顾下，equals最佳实践哈哈
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bigram other = (Bigram) obj;
		if (first != other.first)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + first;
		result = prime * result + second;
		return result;
	}
	
	public static void main(String[] args) {
		Set<Bigram> sets = new HashSet<>();
		for(int i = 0 ; i < 10;i++){
			for(char ch = 'a' ; ch <= 'z' ; ch++){
				sets.add(new Bigram(ch, ch));
			}
		}
		System.out.println(sets.size());
	}
}
