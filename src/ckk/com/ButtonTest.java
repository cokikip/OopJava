package ckk.com;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel("Click one of this");
		JButton button=new JButton("Yes");
		JButton button1=new JButton("No");
		frame.add(label);
		
		frame.setLayout(new FlowLayout());
		
		frame.add(button);
		frame.add(button1);
		
		frame.setVisible(true);
	
		


	}

}
