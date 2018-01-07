/**
 * 返回零长度的数组或者集合，而不是null
 * 
 * 可以说对我们java程序员，最亲的就是NullPointException
 * 
 * 那么如果我们没有null对象，不就可以避免了?
 * 
 * 
 * 使用empty来代替null
 * 1.除非分析表明这个方法正是造成性能问题的真正源头，那么就去使用empty
 * 2.对于不不返回任何元素的调用，每次都返回一个empty是有可能的，因为empty是不可变的，可以被自由共享
 * 
 * @author Administrator
 *
 */
package me.czd.effective.java.method.returnnotnull;