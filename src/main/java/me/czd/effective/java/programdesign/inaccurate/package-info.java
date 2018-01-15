/**
 * 如果需要精确的答案，请避免使用float和double
 * 说到浮点数，就应该联想到IEEE标准
 * 
 * 如果需要精确的化，就去使用BigDecimal类型代替double
 * 但是BigDecimal性能不高，操作也不方便
 * 还有一种方式，使用int或者lang来代替double，因为你可以做数据扩展
 * 例如0.9元就是9角
 * 
 * @author Administrator
 *
 */
package me.czd.effective.java.programdesign.inaccurate;