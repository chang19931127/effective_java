/**
 * 复合优于继承
 * 继承和符合的最简单的区别就是继承是 A is B的关系，复合是 A has B 的关系
 * 可以这么说继承打破了封装，导致子类依赖于其超类中特定功能的实现细节，导致子类必须跟着父类更新而演变
 * 
 * 那么复合呢，复合写好了就是所谓的装饰者模式，嘿嘿
 * 
 * 那么继承和复合应该如何选择呢，就一句话，A是不是B如果是就继承！
 * 想一下，继承和复合是如何对待对象的方法的，一个是转发，一个是复写么？
 * 
 * 例如jdk中
 * Stack 不是 Vector 因此Stack不应该扩展Vector
 * Properties不是HashTable ，因此Properties不应该扩展HashTable
 * 换句话说，如果上面的类如果使用了父类的方法，那不就会暴露出问题么，有兴趣可以操作一把
 * 
 * 一个缺点，包装类不适合用在回调框架中：
 * 在回调框架中，对象把自身的引用传递给其他的对象，用于后续的调用。
 * 因为被包装起来的对象并不知道他外面的包装对象，所以它传递一个指向自身的引用this
 * 回调时避开了外面的包装对象。这就是SELF问题
 * @author Administrator
 *
 */
package me.czd.effective.java.classandinterface.compositionbetterextends;