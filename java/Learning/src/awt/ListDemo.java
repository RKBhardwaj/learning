package awt;

import java.awt.Frame;
import java.awt.List;

public class ListDemo {
	ListDemo() {
		Frame list_f = new Frame();
		List obj = new List(6);
		obj.setBounds(80, 80, 100, 100);
		obj.add("Red");
		obj.add("Blue");
		obj.add("Black");
		obj.add("Pink");
		obj.add("White");
		obj.add("Green");
		list_f.add(obj);
		list_f.setSize(400, 400);
		list_f.setLayout(null);
		list_f.setVisible(true);
	}

	public static void main(String args[]) {
		new ListDemo();
	}
}
