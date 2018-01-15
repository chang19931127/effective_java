package me.czd.effective.java.programdesign.cautiousstringpere;


/**
 * 来测试下性能
 * @author Administrator
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		stringTest();
		stringBuilderTest();
	}

	private static void stringTest() {
		long start = System.currentTimeMillis();
		String result = "";
		for(int i = 0; i< 100_000   ;i++){
			result += i;
		}
		long end = System.currentTimeMillis() - start;
		System.out.println("String test = " + end);
	}
	private static void stringBuilderTest() {
		long start = System.currentTimeMillis();
		StringBuilder result = new StringBuilder();
		for(int i = 0; i< 1000_000   ;i++){
			result.append(i);
		}
		long end = System.currentTimeMillis() - start;
		System.out.println("StringBuilder test = " + end);
	}
}
