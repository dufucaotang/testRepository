package day0824.self.bean;

public final class NettyMessage {

	private Header header;
	
	private Object body;

	public final Header getHeader() {
		return header;
	}

	public final void setHeader(Header header) {
		this.header = header;
	}

	public final Object getBody() {
		return body;
	}

	public final void setBody(Object body) {
		this.body = body;
	}
	
	
}
