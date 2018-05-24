
package day0821.heartBeat;

import java.util.HashMap;

import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ServerHeartBeatHandler extends ChannelInboundHandlerAdapter {
    
	/** key:ip value:auth */
	private static HashMap<String, String> AUTH_IP_MAP = new HashMap<String, String>();
	private static final String SUCCESS_KEY = "auth_success_key";
	
	static {
		AUTH_IP_MAP.put("192.168.102.1", "1234");
	}
	
	private boolean auth(ChannelHandlerContext ctx, Object msg){
			System.out.println("进入服务端的auth方法且接收到String msg : "+msg);
			String [] ret = ((String) msg).split(",");
			String auth = AUTH_IP_MAP.get(ret[0]);
			System.out.println("进入服务端的auth= "+auth);
			if(auth != null && auth.equals(ret[1])){
				ctx.writeAndFlush(SUCCESS_KEY);
				return true;
			} else {
				ctx.writeAndFlush("auth failure !").addListener(ChannelFutureListener.CLOSE);
				return false;
			}
	}
	
	@Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		if(msg instanceof String){
			auth(ctx, msg);
		} else if (msg instanceof RequestInfo) {
			
			RequestInfo info = (RequestInfo) msg;
			System.out.println("--------------------------------------------");
			System.out.println("当前主机ip为: " + info.getIp());
			System.out.println("当前主机cpu情况: ");
			HashMap<String, Object> cpu = info.getCpuPercMap();
			System.out.println("test: " + cpu.get("cpu_test"));
			System.out.println("总使用率: " + cpu.get("combined"));
			System.out.println("用户使用率: " + cpu.get("user"));
			System.out.println("系统使用率: " + cpu.get("sys"));
			System.out.println("等待率: " + cpu.get("wait"));
			System.out.println("空闲率: " + cpu.get("idle"));
			
			System.out.println("当前主机memory情况: ");
			HashMap<String, Object> memory = info.getMemoryMap();
			System.out.println("test: " + memory.get("mem_test"));
			System.out.println("内存总量: " + memory.get("total"));
			System.out.println("当前内存使用量: " + memory.get("used"));
			System.out.println("当前内存剩余量: " + memory.get("free"));
			System.out.println("--------------------------------------------");
			
			ctx.writeAndFlush("info received!");
		} else {
			ctx.writeAndFlush("connect failure!").addListener(ChannelFutureListener.CLOSE);
		}
    }
	@Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {
    	System.err.println("--------数据读异常----------");
    	cause.printStackTrace();
        ctx.close();
    }

}
