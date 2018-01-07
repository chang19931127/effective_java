package me.czd.effective.java.enumandanno.annobetternaming;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 我们这里来操作一波注解
 * 注解作用域
 * 注解作用目标
 * 
 * 这只是一个标记，还需要注解的处理程序
 * @author Administrator
 *
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface Test {
}
