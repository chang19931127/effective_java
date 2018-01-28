/**
 * 并发内容
 * 多线程涉及到并发!
 * 
 * 对数据概念的划分
 * 活性失败：
 * 一个线程所做的事情可以被另一个线程获知，未能同步共享可变数据。
 * 安全性失败：
 * 可共享数据被多个线程获知操作，造成影响！
 * 
 * 如果你在内部同步了类，就可以使用不同的方法来实现高并发性。
 * 例如，分拆锁(lock splitting)，分离锁(lock striping)，非阻塞(nonblocking)并发控制
 * @author Administrator
 *
 */
package me.czd.effective.java.concurrent;