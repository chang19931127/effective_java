/**
 * 慎用可变参数
 * 可变参数可以说是语法糖把。
 * 可匹配不同长度的变量的方法，实质，还是一个数组对象(个人感觉)
 * 可变参数可以接受0个或者多个指定类型的参数。
 * 可变参数机制通过先创建一个数组，数组的大小为在调用位置所传递的参数数量，然后将参数值
 * 传到数组中，然后将数组传递给方法。
 * 
 * ArrayList.asList()就使用的是可变参数
 * 
 * 使用可变参数会有大量的数组分配和初始化，可能造成性能。
 * 简而言之，在定义参数数目不定的方法时，可变参数是一种很方便的方式，
 * 但是他不应该被滥用，如果使用不当，会产生混乱的结果
 * @author Administrator
 *
 */
package me.czd.effective.java.method.cautiousofvarargs;