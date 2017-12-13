/**
 * equals
 * 大致不需要复写equals的情况
 * 		类的每个实例本质上都是唯一的。							Thread
 * 		不关心类是否提供了“逻辑相等”的测试功能						Random
 * 		超类已经覆盖了equals，从超类继承过来的行为对子类也是合适的。		AbstractSet
 * 		类是私有的或是包级私有的，可以确定它的equals方法永远不会被调用。
 * 
 * 
 * equals方法的规范
 * 		自反性	非null	x.equals(x) = true
 * 		对称性	非null	x.equals(y) = true 	y.equals(x)必须为true
 * 		传递性	非null	x.equals(y) = true	y.equals(z) = true	x.equals(z)必须位true
 * 		一致性	只要x和y没有修改，那么x.equals(y)返回一致
 * 		非空性	x.equals(null) = false
 * 
 * 实现equals方法的诀窍
 * 		使用==操作符检查“参数是否为这个对象的引用”
 * 		使用instanceof操作符检查“参数是否为正确的类型”
 * 		把参数转换成正确的类型
 * 		对于该类中的每个“关键”域，检查参数中的域是否与该对象中对应的域相匹配
 * 
 * 还有覆盖equals()方法总是要覆盖hashCode()方法
 * 			
 * @author Administrator
 *
 */
package me.czd.effective.java.objectsmethod.equals;