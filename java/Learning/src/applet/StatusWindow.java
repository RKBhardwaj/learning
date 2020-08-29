package Applet;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class StatusWindow extends Applet {
	public void init() {
		setBackground(Color.cyan);
	}
	
	public void paint(Graphics g) {
		g.drawString("This is the applet window", 20, 30);
		showStatus("This is status window");
	}
}
