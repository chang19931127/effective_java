package me.czd.effective.java.generic.Heterogeneous;

import java.util.HashMap;
import java.util.Map;

/**
 * 异构容器，数据库行，泛型Column作为他的键
 * 因为一行有不同的列
 * 
 * 但是请注意Class对象不支持可变类型，就是带有泛型的类型，例如List<String>这种
 * @author Administrator
 *
 */
public class DatabaseRow {
	private Map<Class<?>, Object> datebaseRow = new HashMap<>();
	private Map<Key<?>, Object> databaseKey = new HashMap<>();
	/**
	 * 这两个方法，我们都使用的type token来传递我们使用的类型信息
	 * @param type
	 * @param instance
	 */
	public <T> void putDatabaseRow(Class<T> type , T instance){
//		if(type == null){
//			throw new NullPointerException("type is null");
//		}
		//进化版
		datebaseRow.put(type, type.cast(instance));
	}	
	public <T> T getDatabaseRow(Class<T> type){
		return type.cast(datebaseRow.get(type));
	}
	
	
	
	/**
	 * 进化封装一层
	 * @param args
	 */
	private static class Key<T>{
		final String identifier;
		final Class<T> type;
		public Key(String identifier, Class<T> type) {
			super();
			this.identifier = identifier;
			this.type = type;
		}
	}
	
	public <T> void putDatabaseRow(Key<T> key , T instance){
		databaseKey.put(key, instance);
	}	
	public <T> T getDatabaseRow(Key<T> key){
		return key.type.cast(databaseKey.get(key));
	}
	
	
	
	//看下运行结果，会更加明白异构
	public static void main(String[] args) {
		DatabaseRow databaseRow = new DatabaseRow();
		databaseRow.putDatabaseRow(String.class, "Java");
		databaseRow.putDatabaseRow(Integer.class, 100);
		databaseRow.putDatabaseRow(Class.class, DatabaseRow.class);
		
		String dataString = databaseRow.getDatabaseRow(String.class);
		int dataInt = databaseRow.getDatabaseRow(Integer.class);
		Class<?> dataClass = databaseRow.getDatabaseRow(Class.class);
				
		System.out.printf("%s %x %s%n", dataString,dataInt,dataClass.getName());
		
		DatabaseRow databaseKey = new DatabaseRow();
		Key<String> keyString = new Key<>("string", String.class);
		Key<Integer> keyInteger = new Key<>("integer", Integer.class);
		databaseKey.putDatabaseRow(keyInteger, 100);
		databaseKey.putDatabaseRow(keyString, "开心");
						
		System.out.println("string 封装 ="+ databaseKey.getDatabaseRow(keyString));
		System.out.println("int 封装 ="+databaseKey.getDatabaseRow(keyInteger));
		
	}
}
