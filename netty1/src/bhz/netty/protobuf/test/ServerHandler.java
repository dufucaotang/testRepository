package bhz.netty.protobuf.test;

import bhz.netty.protobuf.RequestModule;
import bhz.netty.protobuf.ResponseModule;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

public class ServerHandler extends ChannelInboundHandlerAdapter {

    /**
     * 当我们的通道里有数据进行读取的时候 触发的监听方法
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx /*NETTY服务上下文*/, Object msg /*实际的传输数据*/) throws Exception {
    	
    	RequestModule.Request request = (RequestModule.Request)msg;
    	
    	System.err.println("服务器: " + request.getName());
    	
    	ctx.writeAndFlush(response(request.getId()));
    	
    }
    
    private ResponseModule.Response response(String id) {
    	ResponseModule.Response.Builder  builder = ResponseModule.Response.newBuilder();
		builder
		.setId("响应"+ id)
		.setCode(Integer.parseInt(id))
		.setName("响应信息" +  id)
		.addTags("tagA")
		.addTags("tagB");
		return builder.build();
	}

	@Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
       System.err.println("--------数据读取完毕----------");
    }
    
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
    	System.err.println("--------数据读异常----------");
        ctx.close();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
