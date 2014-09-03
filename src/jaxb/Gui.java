package jaxb;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1_000_000L;
	
	private Container contentPane;
	private JTextArea detail;
	private JTextField linkField;
	
	public Gui(String title) {
		super(title);
	}

	public void init(String contents) {
		
		linkField = new JTextField("Enter RSS Location.");
		add(linkField);
		contentPane = this.getContentPane();
//		contentPane.setLayout(new GridLayout(1, 1));
		contentPane.setLayout(new FlowLayout());

	    detail = new JTextArea(contents, 30, 30);
	    detail.setLineWrap(true);
	    detail.setWrapStyleWord(true);
	    contentPane.add(detail);
	    detail.paste();
	    add(new JScrollPane (detail));
	    
	    thehandler handler = new thehandler();
	    linkField.addActionListener(handler);
	}
	
	private class thehandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			String string = "";
			
			if(event.getSource()==linkField) {
				string = String.format("field 1: %s", event.getActionCommand());
			}
		}
		
	}
}
