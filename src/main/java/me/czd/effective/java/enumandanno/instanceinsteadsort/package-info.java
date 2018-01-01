/**
 * 实例域代替序数
 * 
 * 枚举天生就和一个单独的int值相关联，所有的枚举实例都有一个ordinal方法
 * 他返回枚举常量在类型中的数字位置！
 * 记住！数字位置！
 * 也就是说，如果编写的顺序变了，那么他们的ordinal方法获取的值就变了
 * 
 * 那么如果想真正的给枚举订个顺序，那么就用域来保存把
 * @author Administrator
 *
 */
package me.czd.effective.java.enumandanno.instanceinsteadsort;