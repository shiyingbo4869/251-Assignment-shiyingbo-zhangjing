package nz.ac.massey.cs.shi;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutBook extends JFrame{
	public AboutBook(){
		super("About");
		this.setSize(200, 100);
		this.setLocation(200,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Author: Shi Yingbo  Zhang Jing");
		
		panel.add(label);
		this.add(panel);
	}
}