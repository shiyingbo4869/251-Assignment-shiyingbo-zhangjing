package Jtatext;
 
import javax.swing.*;
 
import java.awt.*;
 
public class LookHelp extends JFrame{
	
	public LookHelp(){
		super("Help");
		this.setSize(500, 300);
		this.setLocation(200,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(5,0));
		
		JLabel label1 = new JLabel("1、Menu bar menu items can be clicked to select functions.");
		JLabel label2 = new JLabel("2、\"Edit\" in the cut, copy, paste available shortcut key Ctrl + x, Ctrl + c, Ctrl + v。");
		JLabel label3 = new JLabel("3、Auto line wrap in format needs to be in the dot, otherwise it will keep going。");
		JLabel label4 = new JLabel("4、The format below the menu bar is used to adjust the text font.");
		JLabel label5 = new JLabel("5、The disadvantage of notepad is that it is impossible to change the style, size and shape of the font.");
		JLabel label6 = new JLabel("6.help about menrber name");
		c.add(label1);c.add(label2);c.add(label3);c.add(label4);c.add(label5);c.add(label6);
	}
}