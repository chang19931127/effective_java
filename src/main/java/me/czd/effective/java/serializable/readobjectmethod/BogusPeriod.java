package me.czd.effective.java.serializable.readobjectmethod;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * 通过一个反序列化搞出来
 * 
 * @author Administrator
 *
 */
public class BogusPeriod {
	// java类的二进制流,就会破坏问题
	private static final byte[] serializedForm = new byte[] { };
	private static Object deserialize(byte[] sf) throws Exception{
		InputStream iStream = new ByteArrayInputStream(sf);
		//回去通过ObjectInputStream 解析字节流，然后反序列化！
		ObjectInputStream objectInputStream = new ObjectInputStream(iStream);
		return objectInputStream.readObject();
	}
	
	public static void main(String[] args) throws Exception {
		Period period = (Period) deserialize(serializedForm);
		System.out.println(period);
	}
}
