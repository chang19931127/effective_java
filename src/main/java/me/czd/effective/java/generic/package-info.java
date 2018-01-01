/**
 * 泛型jdk1.5中加入的
 * 我们要学会使用泛型
 * 那么为什么使用泛型呢
 * 泛型可以帮助我们安全的操作集合，编译器可以帮助我们自动的转换
 * 并且告知你是否插入了错误的类型
 * 
 * 因此我们应该学会如何使用泛型！
 * 但还要记住一点，class中是没有泛型的，编译的时候会发生泛型擦除
 * 
 * 参数化类型			List<String>
 * 实际类型参数			String
 * 泛型				List<E>
 * 形式参数类型			E
 * 无限制通配符类型		List<?>
 * 原生态类型			List
 * 有限制类型参数		<E extends Number>
 * 递归类型限制			<T extends Comparable<T>>
 * 有限制通配符类型		List<? extends Number>
 * 泛型方法			static <E> List<E> asList(E[] a)
 * 类型令牌			String.class    泛型.class报错
 * @author Administrator
 *
 */
package me.czd.effective.java.generic;