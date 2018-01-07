package me.czd.effective.java.method.cautiousofvarargs;

/**
 * 这里只说什么时候可以使用可变参数
 * 
 * 在重视性能的情况下，使用可变参数要小心。
 * 
 * 但是很需要使用它的灵活性可以这么参考
 * 假设确定某个方法很多的调用会有三个或者更少的参数，就声明五个重载
 * 美国个重载带有0个或三个普通参数，当参数数目超过三个，就声明可变参数
 * @author Administrator
 *
 */
public class VarargsDemo {
	public void foo(){}
	public void foo(int a1){}
	public void foo(int a1,int a2){}
	public void foo(int a1,int a2,int a3){}
	public void foo(int a1,int a2,int a3,int... rest){}
}
