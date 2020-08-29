package awt;

import java.awt.Checkbox;
import java.awt.Frame;

public class CheckboxDemo1 {
	CheckboxDemo1() {
		Frame checkB_f = new Frame("studytonight ==>Checkbox Example");
		Checkbox ckbox1 = new Checkbox("Yes", true);
		ckbox1.setBounds(100, 100, 60, 60);
		Checkbox ckbox2 = new Checkbox("No");
		ckbox2.setBounds(100, 150, 60, 60);
		checkB_f.add(ckbox1);
		checkB_f.add(ckbox2);
		checkB_f.setSize(400, 400);
		checkB_f.setLayout(null);
		checkB_f.setVisible(true);
	}

	public static void main(String args[]) {
		new CheckboxDemo1();
	}
}
