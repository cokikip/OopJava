package ckk.com;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingDemo {

	private JFrame mainFrame;
	private JLabel headerLabel,statusLabel,controlLabel;
	JPanel controlPanel;
	
	public SwingDemo() {
		prepareGUI();
	}
	public static void main(String[] args) {
		SwingDemo swingdemo= new SwingDemo();
		swingdemo.showEventDemo();
		
	}

	private void showEventDemo() {
		headerLabel.setText("COntrolin action Button");
		
		JButton okButton =new JButton("Ok");
		JButton submitButton =new JButton("Submit");
		JButton cancelButton =new JButton("Cancel");
		
		okButton.setActionCommand("Ok");
		submitButton.setActionCommand("Submit");
		cancelButton.setActionCommand("Cancel");
		
		okButton.addActionListener(new ButtonClickListener());
		submitButton.addActionListener(new ButtonClickListener());
		cancelButton.addActionListener(new ButtonClickListener());
		
		controlPanel.add(okButton);
		controlPanel.add(cancelButton);
		controlPanel.add(submitButton);
		
		mainFrame.setVisible(true);
		
	}
	private void prepareGUI() {
		mainFrame = new JFrame("Java SWING Example");
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3,1));
		
		headerLabel = new JLabel("",JLabel.CENTER);
		statusLabel = new JLabel("",JLabel.CENTER);
		
		statusLabel.setSize(350,100);
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}});
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}
	private class ButtonClickListener implements ActionListener{
		

		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if(command.equals("Ok")) {
				statusLabel.setText("Ok Button clicked.");				
			} else if(command.equals("Submit")){
				statusLabel.setText("Submit Button clicked");
			}
			else {
				statusLabel.setText("Cancel Button clicked");
			}
			
		}
	}
	
	

}
