/**
 * 使用EnumSet代替位域
 * 
 * 理解下什么是位域
 * 首先他是一个域，其实它可以进行位运算
 * 因此我们可能的使用EnumSet来代替位域
 * 
 * 就是说，一个方法可以接受很多参数的综合状态
 * 例如，常量类型。int，方法接受int可以是很多int常量的位运算
 * 那么我们如何使用枚举来搞定呢，那就是用EnumSet来通过传入Set参数，来搞定！
 * 
 * 
 * 大方向就是使用枚举代替常量
 * 
 * 总而言之，真是因为枚举类型要用到在Set中，所以没有理由用位域来表示它。
 * EnumSet类集位域的简洁和性能优势于一身，但是EnumSet有些缺点
 * 无法创建不可变的EnumSet，除非使用Collections.unmodifiableSet进行封装
 * 但是性能就会下降很多
 * 
 * @author Administrator
 *
 */
package me.czd.effective.java.enumandanno.enumset;