/**
 * 利用有限制通配符来提升API的灵活性
 * 参数化类型是不可变的，List<Type1>和List<Type2>并没有Type1和Type2的那种关系
 * 因此有的时候我们想改变以下，就需要PECS原则来扩展我们的泛型
 * PECS producer-extends，consumer-super。
 * 换句话说，就是产生E,消费
 * 如果某个输入参数既是生产者，又是消费者，那么通配符类型就没有什么好处了
 * 这样我们的类型可以传入更多的参数
 * 
 * 那么针对?和E又该如何使用呢
 * 一般情况下，如果类型参数只在方法声明中出现一次，就可以使用通配符来取代它
 * ?是通配符，一定要先拿到类型，才可以使用
 * @author Administrator
 *
 */
package me.czd.effective.java.generic.flexiblegeneric;