package awt;

import java.awt.*;
import java.awt.event.*;

public class ToolkitDemo1 {
	public static void main(String[] args) {
		Frame toolkit_f = new Frame("studytonight ==> Toolkit Demo");
		Button toolkit_b = new Button("beep");
		toolkit_b.setBounds(50, 100, 60, 30);
		toolkit_f.add(toolkit_b);
		toolkit_f.setSize(300, 300);
		toolkit_f.setLayout(null);
		toolkit_f.setVisible(true);
		toolkit_b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				Toolkit.getDefaultToolkit().beep();
			}
		});
	}
}
