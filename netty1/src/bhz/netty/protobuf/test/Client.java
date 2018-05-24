package bhz.netty.protobuf.test;

import bhz.netty.protobuf.RequestModule;
import bhz.netty.protobuf.ResponseModule;
import bhz.netty.protobuf.ResponseModule.Response;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

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
				
				sc.pipeline().addLast(new ProtobufVarint32FrameDecoder());
				sc.pipeline().addLast(new ProtobufVarint32LengthFieldPrepender());
				//编解码使用:
				sc.pipeline().addLast(new ProtobufDecoder(ResponseModule.Response.getDefaultInstance()));
				
				//  12345   == md5  加密   
				//  一个对象    ==  安装 ProtobufEncoder 进行编码
				
				// 解码的时候： ProtobufDecoder (request/response)
				
				sc.pipeline().addLast(new ProtobufEncoder());
				// 为通道进行初始化： 数据传输过来的时候会进行拦截和执行
				sc.pipeline().addLast(new ClientHandler());
			}
		 });
		
		ChannelFuture cf =  b.connect("127.0.0.1", 8765).syncUninterruptibly();

		
		
		//释放连接
		cf.channel().closeFuture().sync();
		work.shutdownGracefully();
	}
}
