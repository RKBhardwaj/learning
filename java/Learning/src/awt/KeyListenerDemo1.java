package awt;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class KeyListenerDemo1 extends Frame implements KeyListener {
	Label kL_l;
	TextArea kL_area;

	KeyListenerDemo1() {

		kL_l = new Label();
		kL_l.setBounds(20, 50, 500, 20);
		kL_area = new TextArea();
		kL_area.setBounds(20, 80, 300, 300);
		kL_area.addKeyListener(this);

		add(kL_l);
		add(kL_area);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public void keyPressed(KeyEvent e) {
		kL_l.setText("studytonight ==> Key Pressed");
	}

	public void keyReleased(KeyEvent e) {
		kL_l.setText("studytonight ==> Key Released");
	}

	public void keyTyped(KeyEvent e) {
		kL_l.setText("studytonight ==> Key Typed");
	}

	public static void main(String[] args) {
		new KeyListenerDemo1();
	}
}
