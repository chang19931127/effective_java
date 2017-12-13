/**
 * 覆盖equals方法的时候一定要覆盖hashCode
 * 主要是他俩有着莫大的关系在Object中
 * 然后导致很多类中都遵守了这种关系，依赖这两种方法来进行操作
 * 
 * hashCode方法的规范
 * 		在程序执行期间，只要对象的equals方法的比较操作所用到的信息没有修改，那么对这同一个对象调用
 * 多次，hashCode方法都始终如一的返回同一个整数。
 * 		如果两个对象根据equals(Object)方法比较相等的，那么调用这两个对象中任意一个对象的
 * hashCode方法都必须产生同样的整数结果
 * 		如果两个对象equals(Object)比较不想等，那么hashCode不一定相等
 * 
 * 	就是hashCode相等，equals方法不一定相等，equals方法相等，hashCode一定相等
 * 	hashCode的规则就不说了，争取每个域都用上
 * 
 * hashCode 都会对31这个数字感兴趣，为什么？
 * 			31是一个奇数，质数
 * 			并且31可以很好被计算机这么转化
 * 			31 * i == i << 5 -i;
 * 
 * @author Administrator
 *
 */
package me.czd.effective.java.objectsmethod.hashcode;