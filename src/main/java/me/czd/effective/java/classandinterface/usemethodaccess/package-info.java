/**
 * 在共有类中使用访问方法，而非公有域
 * 
 * 摒弃这样的设计
 * class Point{
 * 		public double x;
 * 		public double y;
 * }
 * 为什么呢，因为这样并不能控制x和y，并不能保护他们格式等等
 * @author Administrator
 *
 */
package me.czd.effective.java.classandinterface.usemethodaccess;