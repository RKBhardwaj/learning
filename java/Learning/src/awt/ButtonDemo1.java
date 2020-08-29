package awt;

import java.awt.Button;
import java.awt.Frame;

public class ButtonDemo1 {
	public static void main(String[] args) {
		Frame f1 = new Frame("studytonight ==> Button Demo");
		Button b1 = new Button("Press Here");
		b1.setBounds(80, 200, 80, 50);
		f1.add(b1);
		f1.setSize(500, 500);
		f1.setLayout(null);
		f1.setVisible(true);
	}
}
