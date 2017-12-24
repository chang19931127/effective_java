/**
 * 使可变性最小化！
 * 就意味着创造一个不可变类
 * String，基本类型的包装类，BigInteger，BigDecimal
 * 那么不可变类的好处是？不容易出错，更加安全，理由充分把，哈哈
 * 
 * 五条规则
 * 1，不要提供任何会修改对象状态的方法
 * 2，保证类不会被扩展
 * 3，使所有的域都是final的
 * 4，使所有的域都是私有的
 * 5，确保对于任何可变组件的互斥访问。
 * @author Administrator
 *
 */
package me.czd.effective.java.classandinterface.lesschange;