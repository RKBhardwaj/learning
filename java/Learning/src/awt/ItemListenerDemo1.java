package awt;

import java.awt.*;
import java.awt.event.*;

public class ItemListenerDemo1 implements ItemListener {
	Checkbox iT_checkBox1, iT_checkBox2;
	Label iT_label;

	ItemListenerDemo1() {
		Frame iT_f = new Frame("studytonight ==>CheckBox Demo");
		iT_label = new Label();
		iT_label.setAlignment(Label.CENTER);
		iT_label.setSize(400, 100);
		iT_f.add(iT_label);
		
		iT_checkBox1 = new Checkbox("Core Java");
		iT_checkBox1.setBounds(100, 100, 100, 40);
		iT_f.add(iT_checkBox1);
		iT_checkBox1.addItemListener(this);
		
		iT_checkBox2 = new Checkbox("jsp");
		iT_checkBox2.setBounds(100, 150, 100, 40);
		iT_f.add(iT_checkBox2);
		iT_checkBox2.addItemListener(this);
		
		iT_f.setSize(400, 400);
		iT_f.setLayout(null);
		iT_f.setVisible(true);
	}

	public void itemStateChanged(ItemEvent iT) {
		if (iT.getSource() == iT_checkBox1)
			iT_label.setText("Core Java Checkbox: " + (iT.getStateChange() == 1 ? "checked" : "unchecked"));
		if (iT.getSource() == iT_checkBox2)
			iT_label.setText("jsp Checkbox: " + (iT.getStateChange() == 1 ? "checked" : "unchecked"));
	}

	public static void main(String args[]) {
		new ItemListenerDemo1();
	}
}
