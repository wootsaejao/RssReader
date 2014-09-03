package jaxb;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Container;
import java.awt.GridLayout;
//import java.awt.FlowLayout;

public class Gui extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1_000_000L;
	
	private Container contentPane;
	private JTextArea detail;
	
	public Gui(String title) {
		super(title);
	}

	public void init(String contents) {

		contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(1, 1));
//		contentPane.setLayout(new FlowLayout());

	    detail = new JTextArea(contents, 40, 40);
	    detail.setLineWrap(true);
	    detail.setWrapStyleWord(true);
	    contentPane.add(detail);
	    detail.paste();
	    add(new JScrollPane (detail));
	    
	}
	
}
