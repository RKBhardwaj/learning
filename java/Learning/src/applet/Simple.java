package Applet;

import java.applet.*;
import java.awt.*;

/*
 <applet code="sample" height=100 width=1000>
 </applet>
 */

@SuppressWarnings("serial")
public class Simple extends Applet {
	String msg;
	
	public void init() {
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg = "Inside init() --";
	}
	
	public void start() {
		msg += " Inside start() --";
	}
	
	public void paint(Graphics g) {
		msg += " Inside paint() --";
		g.drawString(msg, 10, 30);
	}
	
}
