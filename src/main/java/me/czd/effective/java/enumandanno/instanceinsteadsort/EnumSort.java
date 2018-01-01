package me.czd.effective.java.enumandanno.instanceinsteadsort;

/**
 * 枚举关于序列的
 * 
 * 如果想要枚举和序列有关，那么就使用Ensemble这种类型把
 * 
 * 永远不要通过枚举的序数来导出和他有关联的数
 * 
 * @author Administrator
 *
 */
public class EnumSort {

	//注意下这个，11没有被使用
	enum Ensemble{
		SOLO(1),
		DUET(2),
		TRIO(3),
		QUARTET(4),
		QUINTET(5),
		SEXTET(6),
		SEPTET(7),
		OCTET(8),
		DOUBLE_QUARTET(8),
		NONET(9),
		DECTET(10),
		TRIPLE_QUARTET(12);
		final int numberOfMusicians;
		
		Ensemble(int size){
			this.numberOfMusicians = size;
		}
		
		public int numberOfMusicians(){
			return numberOfMusicians;
		}
	}
	
	//然后这两个结果就不一样了
	enum Ensem{
		SOLO,
		DUET,
		TRIO,
		QUARTET,
		QUINTET,
		SEXTET,
		SEPTET,
		OCTET,
		DOUBLE_QUARTET,
		NONET,
		DECTET,
		TRIPLE_QUARTET;
	}
	
	public static void main(String[] args) {
		//明白了把
		System.out.println(Ensemble.TRIPLE_QUARTET.numberOfMusicians);
		System.out.println(Ensem.TRIPLE_QUARTET.ordinal());
	}

}
