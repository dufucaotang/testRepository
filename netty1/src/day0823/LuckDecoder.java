package day0823;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class LuckDecoder extends ByteToMessageDecoder {
	private static int HEAD_LENGTH = 44;

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		System.err.println("-------------------开始解码------------------");
		if (in.readableBytes()<HEAD_LENGTH) {
			return;
		}
		// 获取协议的版本
        int version = in.readInt();
        // 获取消息长度
        int contentLength = in.readInt();
        // 获取SessionId  sessionId转成字节 长度是36
        byte[] sessionByte = new byte[36];
        in.readBytes(sessionByte);
        String sessionId = new String(sessionByte);

        // 组装协议头
        LuckHeader header = new LuckHeader(version, contentLength, sessionId);
        if (in.readableBytes()<contentLength) {
			in.setIndex(in.readerIndex()-HEAD_LENGTH, in.writerIndex());
			return;
		}
        // 读取消息内容
//        byte[] content = in.readBytes(in.readableBytes()).array();
//        LuckMessage message = new LuckMessage(header, new String(content));
        //int conLength = in.readableBytes();
        int conLength = contentLength;
        byte[] conBytes = new byte[conLength];
        in.readBytes(conBytes);
        String con = new String(conBytes);
        System.out.println("解码得到LuckMessage的content== ："+con);
        LuckMessage message = new LuckMessage(header, con);

        out.add(message);
    }

}
