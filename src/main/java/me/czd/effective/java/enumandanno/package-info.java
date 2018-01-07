/**
 * 枚举和注解
 * 新的类型，枚举类型
 * 新的接口，注解类型
 * 都是类
 * 
 * 枚举！！！
 * 枚举就是将我们常用的常量封装到一个实例中，但是这个枚举客户端没有办法去掉用他的构造器
 * 枚举单例，就很强大
 * 
 * 但是同样，应该知道什么怎么回事
 * 
 * 枚举类
 * toString()
 * values()
 * valueOf()
 * 这三个方法
 * 
 * 枚举实例
 * 一般的方法，枚举类中的方法
 * ordinal()方法，枚举实例都有一个int的序号
 * 
 * 可以深入了解枚举么！枚举还是类，我们使用的只是他的实例，
 * 默认帮我们做了很多事情，每个实例对应一个序号，否则会乱，这样我们就不需要手动来编写序号了
 * 
 * 
 * 枚举有很多自然特性，但是我们最好不要去使用，我们尽可能自己去定义
 * 实例域替代序数
 * EnumSet代替位域
 * EnumMap代替序数索引
 * 
 * 枚举一般的用处
 * 常量，switch，枚举添加新方法，覆盖枚举的方法，实现接口，使用接口组织枚举，关于枚举集合的使用
 * 
 * 注解！！！！
 * 注解也是一种类，一般注解都是用来做辅助的作用
 * 注解提供了额外的信息，因此，针对注解必须要有注解处理类，否则注解就没有什么额外的语义
 * 仅仅是一个标记的作用，但是通过注解处理类，就可以来增强某些语义
 * 例如编号1的队伍是优秀队伍，这里编号1就发挥着注解的作用
 * 
 * 说道注解就不能不说反射，说道反射，那就是运行时获得对象的信息，这个信息说实在了，就是相对应对地址上面的数据
 * 因此，JVM就来了！
 * 
 * @author Administrator
 *
 */
package me.czd.effective.java.enumandanno;