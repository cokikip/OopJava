package ckk.com;
import java.awt.*;
import java.applet.*;

public class Person extends Applet{
	public void init() {
	setBackground(Color.BLACK);
	setSize(1180,1000);
	}

	public void paint(Graphics g) {
		g.drawRect(100, 100, 26, 20);
		g.drawLine(100, 100, 15, 10);
		
		
	}
}
