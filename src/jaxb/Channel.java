package jaxb;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "channel")
public class Channel {
	
	private String title;
	private String link;
	private String description;
	private String pubDate;
	
	List<Item> items;
	
	public String getTitle() {
		return title;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getLink() {
		return link;
	}
 
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getDescription() {
		return description;
	}
 
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getPubDate() {
		return pubDate;
	}
 
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	
	@XmlElement(name = "item")
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
