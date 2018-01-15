/**
 * 抛出与抽象相对应的异常
 * 
 * 总而言之，如果不能阻止或者处理异常来自更底层的异常，一般的做法是使用异常转译
 * 除非底层方法碰巧可以保证它抛出的所有异常对高层也合适才可以将异常从底层传播到高层。
 * 异常链对高层和底层异常都提供了最佳的功能：它允许抛出适当的高层异常，同时又能捕获
 * 底层的原因进行失败分析
 * @author Administrator
 *
 */
package me.czd.effective.java.expection.abstractexception;