package awt;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ActionListenerDemo1 implements ActionListener {

	JButton aL_button;
	JFrame aL_frame;
	JTextArea aL_textArea;

	public ActionListenerDemo1() {
		aL_button = new JButton("Click Me");
		aL_frame = new JFrame("studytonight ==>ActionListener Demo");
		aL_textArea = new JTextArea(50, 50);

		aL_button.addActionListener(this);
		aL_textArea.setLineWrap(true);
		aL_frame.setLayout(new BorderLayout());
		aL_frame.add(aL_textArea, BorderLayout.NORTH);
		aL_frame.add(aL_button, BorderLayout.SOUTH);
		aL_frame.pack();

		aL_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aL_frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		aL_textArea.setText(aL_textArea.getText().concat("Welocme to studytonight.com\n"));
	}

	public static void main(String args[]) {
		@SuppressWarnings("unused")
		ActionListenerDemo1 obj = new ActionListenerDemo1();
	}
}
