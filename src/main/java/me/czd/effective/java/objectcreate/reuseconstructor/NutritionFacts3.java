package me.czd.effective.java.objectcreate.reuseconstructor;

/**
 * 营养成分
 * 
 * set添加器-也可认为是set注入模式
 * 
 * 客户端需要不停的set set 
 * 因为每次添加一个属性，就需要一段代码，这样子的话，就不是线程安全的了！！！！
 * 如何解决线程不安全，每一次set 都是void方法返回，那么我们就链式调用了！
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("unused")
public class NutritionFacts3 {
	private int servingSize;	//(ml)				required
	private int servings;		//(per container)	required
	private int calories;		//					optional
	private int fat;			//(g)				optional
	private int sodium;			//(mg)				optional
	private int carbohydrate;	//(g)				optional
	
	
	
	public NutritionFacts3(Builder builder) {
		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
		
	}



	public static class Builder{
		private int servingSize;	
		private int servings;		
		private int calories;		
		private int fat;			
		private int sodium;			
		private int carbohydrate;
		public Builder(int servingSize, int servings) {
			super();
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int value){
			calories = value;
			return this;
		}
		
		public Builder fat(int value){
			calories = value;
			return this;
		}
		
		public Builder sodium(int value){
			calories = value;
			return this;
		}
		
		public Builder carbohydrate(int value){
			calories = value;
			return this;
		}
		
		public NutritionFacts3 build(){
			return new NutritionFacts3(this);
		}
	}
	
		
}
