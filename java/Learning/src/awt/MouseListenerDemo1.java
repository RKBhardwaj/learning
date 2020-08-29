package awt;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MouseListenerDemo1 extends Frame implements MouseListener {
	Label mL_l;

	MouseListenerDemo1() {
		addMouseListener(this);

		mL_l = new Label();
		mL_l.setBounds(10, 20, 500, 100);
		add(mL_l);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		mL_l.setText("studytonight ==> Mouse Clicked");
	}

	public void mouseEntered(MouseEvent e) {
		mL_l.setText("studytonight ==> Mouse Entered");
	}

	public void mouseExited(MouseEvent e) {
		mL_l.setText("studytonight ==> Mouse Exited");
	}

	public void mousePressed(MouseEvent e) {
		mL_l.setText("studytonight ==> Mouse Pressed");
	}

	public void mouseReleased(MouseEvent e) {
		mL_l.setText("studytonight ==> Mouse Released");
	}

	public static void main(String[] args) {
		new MouseListenerDemo1();
	}
}
