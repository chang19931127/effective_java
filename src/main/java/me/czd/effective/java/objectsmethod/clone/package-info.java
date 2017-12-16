/**
 * 说到clone()方法，就不得不说Cloneable接口
 * 其实jdk中clone()方法和Cloneable接口设计的很不好
 * 
 * 
 * 
 * 首先clone()是protected级别的方法
 * 给出的建议就是没有好的方案去override clone方法，那么就不要去override
 * 
 * clone()其实就是另外一种创建对象的过程
 * 我们可以通过构造器，或者静态方法也来代替
 * public Yum(Yum yum)
 * public static Yum newInstance(Yum yum)
 * @author Administrator
 *
 */
package me.czd.effective.java.objectsmethod.clone;