package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDemo1 {
	PanelDemo1() {
		Frame panel_f = new Frame("studytonight ==> Panel Demo");
		Panel panel11 = new Panel();
		panel11.setBounds(40, 80, 200, 200);
		panel11.setBackground(Color.red);

		Button box1 = new Button("On");
		box1.setBounds(50, 100, 80, 30);
		box1.setBackground(Color.gray);
		
		box1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel11.setBackground(Color.green);
			}
		});

		Button box2 = new Button("Off");
		box2.setBounds(100, 100, 80, 30);
		box2.setBackground(Color.gray);
		
		box2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel11.setBackground(Color.red);
			}
		});
		
		Button box3 = new Button("Close");
		box3.setBounds(150, 100, 80, 30);
		box3.setBackground(Color.gray);
		
		box3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		panel11.add(box1);
		panel11.add(box2);
		panel11.add(box3);
		panel_f.add(panel11);
		panel_f.setSize(400, 400);
		panel_f.setLayout(null);
		panel_f.setVisible(true);
	}

	public static void main(String args[]) {
		new PanelDemo1();
	}
}
