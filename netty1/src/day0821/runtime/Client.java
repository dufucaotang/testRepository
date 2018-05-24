package day0821.runtime;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;

public class Client {

	public static void main(String[] args) throws Exception {
		//ONE:
		//1 线程工作组
		EventLoopGroup work = new NioEventLoopGroup();
		
		//TWO:
		//3 辅助类。用于帮助我们创建NETTY服务
		Bootstrap b = new Bootstrap();
		b.group(work)	//绑定工作线程组
		 .channel(NioSocketChannel.class)	//设置NIO的模式
		 // 初始化绑定服务通道
		 .handler(new ChannelInitializer<SocketChannel>() {
			@Override
			protected void initChannel(SocketChannel sc) throws Exception {
				// 为通道进行初始化： 数据传输过来的时候会进行拦截和执行
				sc.pipeline().addLast(new ReadTimeoutHandler(5));
				sc.pipeline().addLast(new ClientHandler());
			}
		 });
		
		ChannelFuture cf =  b.connect("127.0.0.1", 8765).syncUninterruptibly();
		
		cf.channel().writeAndFlush(Unpooled.copiedBuffer("hello netty!-1".getBytes()));
	
//		Thread.sleep(1000);
//		
//		cf.channel().write(Unpooled.copiedBuffer("hello netty!-2".getBytes()));
//		
//		Thread.sleep(1000);
//		cf.channel().write(Unpooled.copiedBuffer("hello netty!-3".getBytes()));
//		
//		Thread.sleep(1000);
//		cf.channel().write(Unpooled.copiedBuffer("hello netty!-4".getBytes()));
//		
//		Thread.sleep(1000);
//		cf.channel().writeAndFlush(Unpooled.copiedBuffer("hello netty!-5".getBytes()));
		
		
		/**释放连接管道，但不断开连接，除非server端给你了监听返回CLOSE或者ReadTimeout超时*/
		cf.channel().closeFuture().sync();
		work.shutdownGracefully();
	}
}
