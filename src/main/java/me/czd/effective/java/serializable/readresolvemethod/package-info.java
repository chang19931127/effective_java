/**
 * java序列化中有一个readResolve方法，writeReplace()方法
 * 这两个方法也是成对出新的，写替换，然后通过readResolve将替换的流反序列化！
 * 使用了writeReplace方法，writeObject()貌似就没用了，哈哈，所以一定要明白规约
 * 
 * readResolve特性允许你用readObject()创建的实例代替另一个实例
 * 
 * 对于实例控制，枚举类型优先于readResolve
 * 
 * 总而言之，你应该尽可能地使用枚举类型来实施实例控制的约束条件。如果做不到，同时又需要一个
 * 即可序列化优势实例受控的类，就必须提供一个readResolver方法，并确保该类的所有实例域
 * 都为基本类型，或者是transient的
 * 
 * 因此得出一个结论，如果想使用java带的serializable序列化，那么请注意序列化的对象
 * @author Administrator
 *
 */
package me.czd.effective.java.serializable.readresolvemethod;