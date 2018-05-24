package bufTest;

import java.util.UUID;

public class ByteTest {

	public static void main(String[] args) {
		 String sessionId = UUID.randomUUID().toString()+"0";
		 byte[] b = sessionId.getBytes();
		 System.out.println(b.length);
		 System.err.println(sessionId.length());
	}

}
