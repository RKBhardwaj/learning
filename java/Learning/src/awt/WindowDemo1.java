package awt;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class WindowDemo1 extends Frame implements WindowListener {
	WindowDemo1() {
		addWindowListener(this);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new WindowDemo1();
	}

	public void windowActivated(WindowEvent arg0) {
		System.out.println("studytonight ==> activated");
	}

	public void windowClosed(WindowEvent arg0) {
		System.out.println("studytonight ==> closed");
	}

	public void windowClosing(WindowEvent arg0) {
		System.out.println("studytonight ==> closing");
		dispose();
	}

	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("studytonight ==> deactivated");
	}

	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("studytonight ==>deiconified");
	}

	public void windowIconified(WindowEvent arg0) {
		System.out.println("studytonight ==>iconified");
	}

	public void windowOpened(WindowEvent arg0) {
		System.out.println("studytonight ==> opened");
	}
}
