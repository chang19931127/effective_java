/**
 * 不要依赖与线程调度器
 * 
 * 当有多个线程可以运行时，由线程调度器决定那些线程将会运行，以及运行多长时间。
 * 那么就会有问题！
 * 
 * 线程循环等待避免，优先级避免，让全避免！
 * 
 * 
 * 简而言之，不要让应用程序的正确性依赖于线程调度器，否则，结果得到的应用程序将
 * 既不健壮，也不具有可移植性，作为推论，不要依赖Thread.yield或者线程优先级
 * 这些设施仅仅对调度器做些暗示。但实际不没有什么乱用
 * @author Administrator
 *
 */
package me.czd.effective.java.concurrent.dontdependthreadexec;