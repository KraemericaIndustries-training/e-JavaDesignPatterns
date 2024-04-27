package jdpSolid;

import org.apache.commons.lang3.StringEscapeUtils;

//Decorator. Implements component interface
@SuppressWarnings("deprecation")
public class HtmlEncodedMessage implements Message {

	private Message msg;
	
	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public String getContent() {
		return StringEscapeUtils.escapeHtml4(msg.getContent());
	}	
}