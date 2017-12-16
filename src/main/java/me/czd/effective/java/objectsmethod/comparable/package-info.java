/**
 * 说道Comparable接口，
 * 就要说compareTo()方法，这个接口支持，泛型
 * 虽说这个接口的compareTo()方法不是Object的方法
 * 但是他也有很多规则，因为关于集合类的操作，跟他有着莫名奇妙的关系
 * 首先Arrays类，Collections类，TreeMap类，TreeSet类等等，内部都需要compareTo()方法
 * 
 * 同样compareTo方法也有一些规则
 * 		第一个对象小于(等于)(大于)第二个对象，那么第二个对象一定大于(等于)(小于)第一个对象
 * 		第一个对象大于第二个对象，第二个对象大于第三个对象，那么第一个对象一定大于第三个对象
 * 		比较时被认为相等的所有对象，他们跟别的对象比较时一定产生相同的结果
 * 
 * 也就是所谓的，自反性，对称性，传递性
 * 
 * 当然说到Comparable那么必不可少的就是Comparator 一个函数式接口，
 * 他的compare()方法，可以传给工具类，来影响某些情况
 * 
 * 还有compareTo()方法的比较结果，负数(小于) 0(等于) 正数(大于)
 * @author Administrator
 *
 */
package me.czd.effective.java.objectsmethod.comparable;