package awt;

import java.awt.*;
import java.awt.event.*;

public class DialogDemo1 {
	private static Dialog dialog_d;

	DialogDemo1() {
		Frame dialog_f = new Frame();
		dialog_d = new Dialog(dialog_f, "studytonight ==> Dialog Demo", true);
		dialog_d.setLayout(new FlowLayout());
		Button dialog_b = new Button("OK");
		dialog_b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DialogDemo1.dialog_d.setVisible(false);
			}
		});
		dialog_d.add(new Label("Welcome to studytonight. Click on button to continue."));
		dialog_d.add(dialog_b);
		dialog_d.setSize(300, 300);
		dialog_d.setVisible(true);
	}

	public static void main(String args[]) {
		new DialogDemo1();
	}
}
