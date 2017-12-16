/**
 * 始终要覆盖toString()方法
 * 首先你要知道toString()方法的目的
 * 				就是返回一个摘要信息，让人们一眼就能看懂这个对象！也就是自描述
 * 因为很多地方都用到了toString()方法。
 * 
 * 一个比较好的方案，如果你的对象制订了toString()方法的标准，那么提供一个相匹配的
 * 静态工厂或者构造器，以便程序员可以很容易地在对象和他的表示法之间来回转换！！！
 * 例如BigInteger，BigDecimal和绝大多数包装类
 * @author Administrator
 *
 */
package me.czd.effective.java.objectsmethod.tostring;