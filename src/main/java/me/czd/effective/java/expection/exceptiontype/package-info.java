/**
 * 对于可恢复的情况使用受检查异常，对编程错误使用运行时异常，error尽可能的别动
 * 
 * java程序设计语言提供三种可抛出结构。
 * 受检查的异常(checked exception),运行时异常(run-time exception),错误(error)
 * 
 * 明白两件事情：
 * 1.error和runtime exception 程序都不会去检查
 * checked exception 程序会检查，必须throws 或者 try catch
 * 
 * 这样子对我们来说，程序中遇到了check异常我们回去try catch 并在catch中去解决错误
 * 最终的结果就是
 * 
 * 如果期望调用者能够适当恢复，对于这种情况就应该使用检查的异常。
 * 通过抛出受检查的异常，强迫调用者在一个catch子句中处理该异常，或者将它传播出去。
 * runtime 异常，程序不会发现，
 * 
 * 总而言之，对于可恢复的情况，使用受检查的异常；对于程序错误，则使用运行时异常。
 * 
 * @author Administrator
 *
 */
package me.czd.effective.java.expection.exceptiontype;