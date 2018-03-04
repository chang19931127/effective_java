/**
 * 保护性的编写readObject方法
 * 
 * 有没有想过ObjectInputStream.readObject()这个方法
 * 
 * 这个方法无缘无故就帮你创建了一个对象出来。那么这个对象的域符合你的要求么！哈哈
 * 所以当你需要序列化的时候，尽可能保护性的编写readObject方法，把这个方法当作构造器来做把
 * 
 * 
 * 总而言之，每当你编写readObject()方法的时候，都要这样想：你正在编写一个共有的构造器，无论
 * 给他传什么样的字节流，他都必须产生一个有效的实现。不要假设这个字节流一定代表着一个真正被序列化
 * 过的实例。那么我们如果编写好的readObject()方法呢
 * 
 * 对于对象引用域必须保持为私有的类，要保护性的copy这些域中的每个对象。不可变类的可变组件就属于这个类别。
 * 对于任何约束条件，如果检查失败，则抛出一个InvalidObjectException异常。这些检查动作应该跟在所有的保护性copy之后
 * 如果整个对象图在被反序列化之后必须进行验证，就应该使用ObjectInputValidation接口
 * 无论是直接方式，还是间接方式，都不要调用类中任何可被覆盖的方法
 * @author Administrator
 *
 */
package me.czd.effective.java.serializable.readobjectmethod;