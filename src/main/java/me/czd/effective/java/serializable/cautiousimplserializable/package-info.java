/**
 * 谨慎地实现Serializable接口
 * 
 * 
 * 实现Serializable接口，一旦这个类被发布，就大大降低了“改变这个类的实现”的灵活性
 * 实现Serializable接口，增加了出现Bug和安全漏洞的可能性
 * 实现Serializable接口，随着类发行新的版本，相关测试负担也增加了
 * 
 * 重要的一点，java自带的serializable序列化的性能并不高，哈哈
 * 
 * 因为实现了Serializable接口，就可以通过java的默认的api来进行序列化
 * 那么序列化带来了什么，就是上面的三个问题
 * 并且父类和子类的关系也存在问题。
 * 还记得Serializable接口的那几个阴式方法么，哈哈是不是很有意思
 * readObject() readObjectNoData() 挺多把，百度搜搜
 * 
 * 为继承而设计的类实现了Serializable接口
 * Throwable：所以异常可以被序列化
 * HttpServlet：所以回话状态可以被缓存
 * 
 * 还是一句话，一定要去思考，设计！技术为了应用而诞生，也是为了应用去使用技术
 * 
 * 
 * 简而言之，千万不要认为实现Serializable接口会很容易，除非一个类在用了一段时间之后
 * 就会被抛弃，否则，实现Serializable接口就是个很严肃的承诺，必须认真对待，如果一个类
 * 为了继承而设计的，则更加需要加倍小心。对于这样的类而言，在“允许子类实现Serializable接口”
 * 或“禁止子类实现Serializable接口”两者之间的一个折衷设计方案是，提供一个可访问的无参
 * 构造器，这种设计方案允许子类实现Serializable接口。
 * 子类实现Serializable接口，并可以序列化，那么父类一定要有无参构造器
 * @author Administrator
 *
 */
package me.czd.effective.java.serializable.cautiousimplserializable;