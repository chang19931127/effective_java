package me.czd.effective.java.objectcreate.reuseconstructor;

/**
 * 营养成分
 * 
 * 复用构造器-也可认为是telescoping constructor模式
 * 
 * 当参数越来越多，便写越来越麻烦，修改也很麻烦，参数错误也很麻烦，所以，需要改进
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("unused")
public class NutritionFacts1 {
	private int servingSize;	//(ml)				required
	private int servings;		//(per container)	required
	private int calories;		//					optional
	private int fat;			//(g)				optional
	private int sodium;			//(mg)				optional
	private int carbohydrate;	//(g)				optional
	
	public NutritionFacts1(int servingSize, int servings) {
		this(servingSize,servings,0,0,0,0);
	}
	
	public NutritionFacts1(int servingSize, int servings, int calories) {
		this(servingSize,servings,calories,0,0,0);
	}
	
	public NutritionFacts1(int servingSize, int servings, int calories, int fat) {
		this(servingSize,servings,calories,fat,0,0);
	}
	
	public NutritionFacts1(int servingSize, int servings, int calories, int fat, int sodium) {
		this(servingSize,servings,calories,fat,sodium,0);
	}
	
	public NutritionFacts1(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
		super();
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}
	
	
}
