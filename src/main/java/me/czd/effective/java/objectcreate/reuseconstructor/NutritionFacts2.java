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
public class NutritionFacts2 {
	private int servingSize;	//(ml)				required
	private int servings;		//(per container)	required
	private int calories;		//					optional
	private int fat;			//(g)				optional
	private int sodium;			//(mg)				optional
	private int carbohydrate;	//(g)				optional
	
	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}
	public void setServings(int servings) {
		this.servings = servings;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public void setSodium(int sodium) {
		this.sodium = sodium;
	}
	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	
		
}
