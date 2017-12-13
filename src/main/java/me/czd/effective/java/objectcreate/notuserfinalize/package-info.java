/**
 * 
 * 要去了解finalize方法是干嘛的，有什么用，以及他的特性
 * 
 * 因此我们不要使用这个方法来释放资源，而应该显示的使用一些方法来进行，必要的时候使用try catch finally
 * 
 * finalize方法有什么优势尼？
 * 		使用finalize方法可以充当防护网，如果用户没有调用显示终止方法，那么能起一点作用
 * 例如FileInputStream,Timer和Connection 都这么做了（付出的代价也高，对象释放变慢）
 * 		本地对等体是一个本地对象(native object)，普通对象通过本地方法(native method)委托给一个本地对象。
 * 因为本地对象不是一个普通对象。所以垃圾回收器不会知道它。当他的java对等体被回收的时候，他不会被回收。在本地对等体并
 * 不拥有关键资源的前提下。终结方法正是执行这项任务最合适的工具。如果本地对等体拥有必须被及时终止的资源。那么该类就应该具有
 * 一个显示的终止的方法。如前所述，终止方法应该完成所有必要的工作以便释放关键的资源。终止方法可以是本地方法，或者它也可以
 * 调用本地方法。。--------------一点需要之一的子类写finalize方法的时候尽可能保证super.finalize()方法执行
 * 						防止异常情况父类不执行
 * 
 * 还有finalizer方法可以让一个对象暂时逃离垃圾回收！！！！ jvm中里面的介绍
 * 		
 * 
 * @author Administrator
 *
 */
package me.czd.effective.java.objectcreate.notuserfinalize;