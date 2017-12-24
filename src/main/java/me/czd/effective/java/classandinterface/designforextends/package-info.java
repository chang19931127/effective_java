/**
 * 要么为继承而设计，并提供文档说明，要么就禁止继承
 * 
 * 针对某些需求，继承还是很有用的，但是不能滥用
 * 当我们想要去使用类继承的时候，最好在父类中的方法中提供很好的文档，可以让用户正确继承
 * 
 * 那么如何来保证继承安全
 * 我们要确保那些可以被覆盖的方法，并且这些方法被覆盖了并不会造成大影响
 * 例如AbstractCollection中的remove()方法
 * protected 就是专门为继承而设计的方法，通过这个钩子函数可以轻松的构造模板模式
 * 例如AbstractList中的removeRange()方法
 * 
 * 如何避免由于子类错误覆盖方法导致的问题
 * 很有可能
 * 构造函数中不要调用可以被覆盖的方法，clone()方法，以及readObject序列化的时候
 * 一个函数中调用另外一个函数
 * 还要明白一件事，java单继承，如果继承了父类，那么他就没办法再继承其他类了
 * @author Administrator
 *
 */
package me.czd.effective.java.classandinterface.designforextends;