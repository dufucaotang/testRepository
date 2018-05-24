package bhz.netty.protobuf;

import java.util.Arrays;

import com.google.protobuf.InvalidProtocolBufferException;

import bhz.netty.protobuf.UserModule.User;
import bhz.netty.protobuf.UserModule.User.Builder;

public class UserSerial {

	//1. 自己编写了user.proto 数据传输格式 执行protoc.exe程序 生成对应的java代码
	
	//2. 我们接下来对一个对象进行序列化和反序列化操作
	
	/**
	 * 序列化方法
	 * @return
	 */
	public static byte[] SerialObject2Bytes(){
		
		int a = 5;
		int b = 432343242;
		
		double c = 0.1;		//
		
		
		Builder userBuilder = UserModule.User.newBuilder();
		//设置内容
		userBuilder
		.setUserId("1001")
		.setAge(30)
		.setUserName("张三")
		.addFavorite("足球")
		.addFavorite("篮球");
		//构造对象
		User user = userBuilder.build();
		byte[] userBytes = user.toByteArray();
		System.err.println(Arrays.toString(userBytes));
		
		return userBytes;
		
	}
	
	/**
	 * 反序列化方法
	 * @param bytes
	 * @return
	 */
	public static User SerialBytes2Object(byte[] bytes){
		try {
			return UserModule.User.parseFrom(bytes);
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		
		byte[] userBytes = SerialObject2Bytes();
		
		User user = SerialBytes2Object(userBytes);
		System.err.println(user.getFavorite(0));
		System.err.println(user.getUserName());
		
	}
}
