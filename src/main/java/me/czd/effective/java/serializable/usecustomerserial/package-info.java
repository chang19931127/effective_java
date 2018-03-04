/**
 * 考虑使用自定义的序列化形式
 * 
 * 明白java中关于序列化的几个概念
 * 
 * 实现序列化，Serializable
 * 并且指定一个serial version UID 通过这个uid来进行序列化和反序列化版本匹配
 * 预被transient修饰，就不会序列化，反序列化的时候，给域默认值，0,null,false
 * 上述都是默认情况
 * 如果想自定义，就去提供readObject()这个方法尽可能的去调用defalutReadObject
 * 				  writeObject()调用defalutWriteObject
 * 其实defaultXX()方法来自ObjectXXputStream这个类
 * 
 * 所以为了更好的使用，尽可能的去自定义序列化，来达到自己序列化的目的，毕竟默认的有很多缺点
 * 
 * 总而言之，当你决定要将一个类做成可序列化的时候，请仔细考虑应该采用什么样的学历恶化形式
 * 只有当默认的序列化形成能够合理地描述对象的逻辑状态时，才能使用默认的序列化形式，否则就要
 * 设计一个自定义的序列化形式，通过它合理地描述对象的状态。你应该分配足够多的时间来设计类的
 * 序列化形式，就好像分配足够多的时间来设计它的导出方法一样。正如你无法在将来的版本中去掉
 * 导出方法一样，你也不可能去掉序列化形式中的域，他们必须被永久的保留下去，以确保序列化兼容
 * 选择错误的序列化形式对于一个类的复杂性和性能都会有永久的负面影响
 * @author Administrator
 *
 */
package me.czd.effective.java.serializable.usecustomerserial;