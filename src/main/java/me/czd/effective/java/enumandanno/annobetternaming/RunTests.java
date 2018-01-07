package me.czd.effective.java.enumandanno.annobetternaming;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


/**
 * 真正的处理程序 
 * 注解处理程序归位
 * 
 * 注解处理程序基本都是通过反射来进行操作的
 * 因此我们需要对反射的API很熟！，所以把，多练习熟能生巧
 * 
 * @author Administrator
 *
 */
public class RunTests {
	public static void main(String[] args) {
		int tests = 0; // 测试的个数
		int passed = 0; // 通过的个数

		Class<Sample> testClass = Sample.class;
		// Class.forName("me.czd.effective.java.enumandanno.annobetternaming.Sample");

		for (Method method : testClass.getDeclaredMethods()) {
			if (method.isAnnotationPresent(Test.class)) {
				tests++;
				if (Modifier.isStatic(method.getModifiers())) {
					try {
						System.out.println(method.getName());
						method.invoke(null);
						passed++;
					} catch (IllegalAccessException e) {
						System.out.println("INVALID @Test 必须是public : " + method);
					} catch (IllegalArgumentException e) {
						System.out.println("INVALID @Test 必须是无参的: " + method);
					} catch (InvocationTargetException e) {
						Throwable exc = e.getCause();
						System.out.println(method + " failed: " + exc);
					}
				}else{
					System.out.println("INVALID @Test 必须是static的: " + method);
				}
				System.out.printf("Passed: %d,Failed:%d%n", passed, tests - passed);
			}
		}
	}
}
