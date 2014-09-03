package jaxb;

import java.util.*;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Rss {
	
	private Channel channel;
	
	public Channel getChannel() {
		return channel;
	}
	
	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public List<Item> getItems() {
		return channel.getItems();
	}

	public String getTitle() {
		return channel.getTitle();
	}
	
}













