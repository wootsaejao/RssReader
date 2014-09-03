package jaxb;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.JFrame;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main {
	
	public static void main (String [] args) throws MalformedURLException {
		
		String rssUrl;
//		rssUrl = "http://newsrss.bbc.co.uk/rss/newsonline_world_edition/front_page/rss.xml";
//		rssUrl = "http://se.cpe.ku.ac.th/219451/data/bbc-elements-podcast.xml";
		rssUrl = "http://se.cpe.ku.ac.th/219451/data/bbc-elements.xml";
		Rss rss = unmarshal(rssUrl);
		List<Item> items = rss.getItems();
		
		// Generate string format
		String s = "\n\n";
		s = "\n--------------------------------\n        | " +
				rss.getTitle() + 
				" |\n--------------------------------\n\n";
		for (Item item : items) {
			s = s + " ##   " + item.getTitle() + "   ##" +
					"\n\n" +
					item.getDescription() +
					"\n\n- Read more - \n" +
					item.getLink() +
					"\n\n" +
					item.getPubDate() + 
					"\n\n---------------------------------\n\n";
		}
		
		// GUI window
		Gui gui = new Gui("Pion RSS Reader - 0.1a");
		gui.init(s);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(400, 600);
		gui.setVisible(true);
		
	}
	
	public static Rss unmarshal(String rssUrl) throws MalformedURLException {
		try {
			JAXBContext jc = JAXBContext.newInstance(Rss.class);
			Unmarshaller u = jc.createUnmarshaller();
//		    Object o = u.unmarshal( new File( "cnn.xml" ) );
			URL url = new URL(rssUrl);
			Object o = u.unmarshal( url );
			Rss rss = (Rss) o;
			return rss;
			
			
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

	
}
