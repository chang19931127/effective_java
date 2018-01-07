/**
 * 必要时进行保护性拷贝！
 * 为什么要这样做！java的方法传参是什么类型？
 * 
 * 就是说，你自己创建了一个对象，但是被别人引用或者怎么滴把，
 * 回来之后，你却发现你创建的这个对象出问题了，某些数据变了，
 * 或者是某些内容有问题了，
 * 归根结底就是结构发生变化了！！！！！
 * 
 * 那么我们必须要避免这种情况，于是乎又引出一个问题？
 * 为什么String类被设计成不可变的。
 * 
 * 那么如何保证不可变，
 * 就是今天这一条
 * 必要时进行保护性copy！
 * 
 * 当然除了这种方式，我们还可以使用包装模式，客户端使用包装对象，导致没有
 * 办法直接方法被包装对象。
 * 
 * 简而言之，如果类具有从客户端得到或者返回到客户端的可变组件，类就必须保护性的拷贝
 * 这些组件，如果拷贝的成本受到限制，并且类信任它的客户端不会不恰当地修改组件，就可以
 * 在文档中致命客户端的职责是不得修改受到影响的组件，以此来代替保护性拷贝
 * @author Administrator
 *
 */
package me.czd.effective.java.method.safecopy;