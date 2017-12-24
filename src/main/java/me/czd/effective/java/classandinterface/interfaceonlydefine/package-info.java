/**
 * 接口只用于定义类型
 * 当类实现接口时，接口就充当可以引用这个类的实例的类型，因此，类实现了接口，里氏代换原则
 * 就表明客户端可以对这个类的实例实施某些动作，为了任何其他目的的定义接口是不恰当的
 * 
 * 不良使用，常量接口
 * 试问，你的常量接口被类实现了，会有什么可能，实现类也有这些常量，这不就造成了污染
 * 例如java中的ObjectStreanConstants，就是反面教材
 * 
 * 最好还是通过工具来来造常量把 final修饰，然后还可以静态导入，嘿嘿
 * 
 * 简而言之，接口应该只被用来定义类型！！！！！！！！
 * @author Administrator
 *
 */
package me.czd.effective.java.classandinterface.interfaceonlydefine;