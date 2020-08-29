package awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;

public class RadioButtonDemo {
	RadioButtonDemo() {
		Frame frm = new Frame("Frame window");
		CheckboxGroup obj = new CheckboxGroup();
		Checkbox ckBox1 = new Checkbox("Yes", obj, true);
		ckBox1.setBounds(100, 100, 50, 50);
		Checkbox ckBox2 = new Checkbox("No", obj, false);
		ckBox2.setBounds(100, 150, 50, 50);
		frm.add(ckBox1);
		frm.add(ckBox2);
		frm.setSize(400, 400);
		frm.setLayout(null);
		frm.setVisible(true);
	}

	public static void main(String args[]) {
		new RadioButtonDemo();
	}
}
