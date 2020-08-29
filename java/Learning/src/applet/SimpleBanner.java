package Applet;

import java.applet.*;
import java.awt.*;

/*
 <applet code="SimpleBanner" width=300 height=50></applet>
 */

@SuppressWarnings("serial")
public class SimpleBanner extends Applet implements Runnable {
	String msg = " A Simple Moving Banner.";
	Thread t = null;
	int state;
	volatile boolean stopFlag;

	public void init() {
		setBackground(Color.cyan);
		setForeground(Color.red);
	}

	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}

	@Override
	public void run() {
		for (;;) {
			try {
				repaint();
				Thread.sleep(250);
				if (stopFlag)
					break;
			} catch (InterruptedException e) {
			}
		}
	}

	public void stop() {
		stopFlag = true;
		t = null;
	}

	public void paint(Graphics g) {
		char ch;
		ch = msg.charAt(0);
		msg = msg.substring(1, msg.length());
		msg += ch;
		g.drawString(msg, 50, 30);
	}

}
