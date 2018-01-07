package me.czd.effective.java.enumandanno.annobetternaming;

/**
 * 应用注解的类
 * 记住，注解仅仅是一个标识，真正的还需要注解处理程序来搞定
 * 
 * 我们想要的目的就是 Test修饰的方法我们才测试
 * 值对static修饰的方法有效
 * 如果异常就报错
 * 
 * 其他的都忽略
 * @author Administrator
 *
 */
public class Sample {
	@Test
	public static void m1(){}
	public static void m2(){}
	@Test
	public static void m3(){
		throw new RuntimeException("Boom");
	}
	public static void m4(){}
	@Test
	public  void m5(){}
	public static void m6(){}
	@Test
	public static void m7(String string){
	}
	public static void m8(){}
}
