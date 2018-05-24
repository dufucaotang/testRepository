package bufTest;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ByteBufTest {  
   
	public static void main(String[] args) {  
      
       main2();
          
          
    }
	

	private static void main2() {
		ByteBuf buf = Unpooled.buffer(100);
		buf.writeInt(1);
		buf.writeInt(4);
		buf.writeInt(400);
		System.out.println("获取readerIndex:"+buf.readerIndex());  
		System.out.println("获取writerIndex:"+buf.writerIndex());  
		System.out.println(buf.readInt());
		System.out.println("获取readerIndex:"+buf.readerIndex());  
		System.out.println("获取writerIndex:"+buf.writerIndex()); 
		System.out.println(buf.readInt());
		System.out.println("获取readerIndex:"+buf.readerIndex());  
		System.out.println("获取writerIndex:"+buf.writerIndex()); 
	}


	private static void main1() {
		 //实例初始化  
        ByteBuf buffer =   Unpooled.buffer(100);  
        String value ="学习ByteBuf";  
        buffer.writeBytes(value.getBytes());  
        System.out.println("获取readerIndex:"+buffer.readerIndex());  
        System.out.println("获取writerIndex:"+buffer.writerIndex());  
        byte[] vArray = new byte[buffer.writerIndex()];  
        buffer.readBytes(vArray);  
        System.out.println("获取readerIndex:"+buffer.readerIndex());  
        System.out.println("获取writerIndex:"+buffer.writerIndex());  
        System.out.println(new String(vArray));  
	}  
  
}  
