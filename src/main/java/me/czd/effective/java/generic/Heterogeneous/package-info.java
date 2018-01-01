/**
 * 优先考虑类型安全的异构容器
 * 看到这个标题会想到，什么是异构容器！反正我会去搜索以下
 * 异构：包含不同成分特性的XXX
 * 异构的目的，就是为了有多中特点
 * 
 * 泛型最长用于集合，Set，Map，以及单元素的容器，ThreadLocal，AtomicReference
 * 但是他们一般使用泛型，保证安全性，导致一个Set仅有一个类型，一个Map仅有一对key.value
 * 
 * 
 * 那么我们如何保证多类型，并且安全呢，这时候就要使用异构了
 * 如何来保证异构，利用Class<T>这个对象，记忆他的case方法
 * 给他一个漂亮的词把，类型令牌！
 * 
 * 最终也是告诉我们，使用泛型的时候，注意集合类，注意Class类，集合类让你更加安全，Class类会帮助你异构！
 * 
 * @author Administrator
 *
 */
package me.czd.effective.java.generic.Heterogeneous;