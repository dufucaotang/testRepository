package bhz.netty.protobuf.test;

import bhz.netty.protobuf.RequestModule;
import bhz.netty.protobuf.ResponseModule;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

public class ClientHandler  extends ChannelInboundHandlerAdapter {

	@Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.err.println("通道激活。。。。");
        for(int i = 0; i < 10 ; i++){
        	ctx.write(request(i));
        }
        ctx.flush();
    }
	
	private RequestModule.Request request(int i){
		RequestModule.Request.Builder  builder = RequestModule.Request.newBuilder();
		builder
		.setId(""+i)
		.setName("张" + i)
		.setSequence(i)
		.addFavorite("足球"+i)
		.addFavorite("篮球"+i);
		return builder.build();
	}
	
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    	try {
    		ResponseModule.Response response = (ResponseModule.Response)msg;
    		System.err.println("客户端: " + response.getName());
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
