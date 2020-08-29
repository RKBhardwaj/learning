package awt;

import java.awt.Frame;
import java.awt.Label;

public class LabelDemo1 {
	public static void main(String args[]) {
		Frame l_Frame = new Frame("studytonight ==> Label Demo");
		Label lab1, lab2;
		lab1 = new Label("Welcome to studytonight.com");
		lab1.setBounds(50, 50, 200, 30);
		lab2 = new Label("This Tutorial is of Java");
		lab2.setBounds(50, 100, 200, 30);
		l_Frame.add(lab1);
		l_Frame.add(lab2);
		l_Frame.setSize(500, 500);
		l_Frame.setLayout(null);
		l_Frame.setVisible(true);
	}
}
