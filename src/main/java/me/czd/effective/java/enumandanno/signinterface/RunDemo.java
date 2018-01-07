package me.czd.effective.java.enumandanno.signinterface;

import java.lang.reflect.Method;

public class RunDemo {
	public static void main(String[] args) throws Exception {
		Class<RemarkDemo> testClass = RemarkDemo.class;
		for(Class<?> clazz: testClass.getInterfaces()){
			if(clazz == Remark.class){
				System.out.println("这个方法被标记");
				for (Method method : testClass.getMethods()) {
					if(method.getName().equals("toString")){
						System.out.println(method.invoke(testClass.newInstance()));
					}
				}
			}
		}
	}
}
