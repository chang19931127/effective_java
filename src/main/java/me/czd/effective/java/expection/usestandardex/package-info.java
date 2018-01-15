/**
 * 优先使用标准异常
 * 
 * 编写代码要尽可能的重用，异常也不例外
 * java平台类库提供了一组基本的未受检查的异常
 * 
 * 重用现有的异常有很多方面的好处
 * 1.大家公用，都明白
 * 2.可读性好
 * 3.异常类越少，证明内存印迹越小，装载这些类的时间开销越小
 * 
 * IllegalArgumentException 参数值不正确
 * IllegalStateException 接受对象的状态使调用非法
 * NullPointerException npe
 * IndexOutOfBoundsException index越界
 * ConcurrentModificationException 并发修改异常
 * UnSupportedOperationException 非法操作
 * 尽可能去应用
 * 
 * @author Administrator
 *
 */
package me.czd.effective.java.expection.usestandardex;