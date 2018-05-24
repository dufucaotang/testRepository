package day0823;

import java.util.UUID;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class LuckClient {
	public static void main(String args[]) throws InterruptedException {

        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {

						@Override
						protected void initChannel(SocketChannel channel) throws Exception {
							ChannelPipeline pipeline = channel.pipeline();

					        // 添加编解码器, 由于ByteToMessageDecoder的子类无法使用@Sharable注解,
					        // 这里必须给每个Handler都添加一个独立的Decoder.
					        pipeline.addLast(new LuckEncoder());
					        pipeline.addLast(new LuckDecoder());

					        // and then business logic.
					        pipeline.addLast(new SimpleChannelInboundHandler<LuckMessage>() {

								@Override
								protected void channelRead0(ChannelHandlerContext ctx, LuckMessage msg)
										throws Exception {
									 System.out.println("client收到：msg="+msg);
									
								}
					        	
					        });

						}
                    	
                    });

            // Start the connection attempt.
            Channel ch = b.connect("127.0.0.1", 8888).sync().channel();
            /*//方式1：只写出一条协议数据
            int version = 1;
            String sessionId = UUID.randomUUID().toString();
            String content = "I'm the luck protocol!";

            LuckHeader header = new LuckHeader(version, content.length(), sessionId);
            LuckMessage message = new LuckMessage(header, content);
            ch.writeAndFlush(message);*/
            String sessionId = UUID.randomUUID().toString();
            for (int i = 0; i < 100; i++) {
            	int version = 1;
                String content = "I'm the luck protocol!"+i;
                LuckHeader header = new LuckHeader(version, content.length(), sessionId);
                LuckMessage message = new LuckMessage(header, content);
                //Thread.sleep(100);
				ch.writeAndFlush(message);
			}
            
            
            ch.closeFuture().sync();

        } finally {
            group.shutdownGracefully();
        }
    }

}