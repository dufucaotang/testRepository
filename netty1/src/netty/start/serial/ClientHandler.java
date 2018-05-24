package netty.start.serial;

import bhz.netty.serial.Resp;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

public class ClientHandler  extends ChannelInboundHandlerAdapter {

	
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    	try {
//    		ByteBuf buffer = (ByteBuf)msg;
//    		byte[] data = new byte[buffer.readableBytes()];
//    		buffer.readBytes(data);
//    		String str = new String(data, "utf-8");
//    		System.err.println("客户端接收到：" + str);
    		
    		Resp resp = (Resp)msg;
    		System.err.println("CLIENT: " + resp.getId() + "," + resp.getName() + resp.getResponseMessage());
		} finally {
			ReferenceCountUtil.release(msg);
		}
    }
    
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
        ctx.close();
    }
    
}
