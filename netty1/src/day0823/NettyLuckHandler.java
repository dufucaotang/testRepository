package day0823;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class NettyLuckHandler extends SimpleChannelInboundHandler<LuckMessage> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, LuckMessage msg) throws Exception {
		// 简单地打印出server接收到的消息
        System.out.println("server收到：msg="+msg.toString());
	}

}
