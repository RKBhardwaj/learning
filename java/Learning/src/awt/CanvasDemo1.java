package awt;

import java.awt.*;

public class CanvasDemo1 {
	public CanvasDemo1() {
		Frame canvas_f = new Frame("studytonight ==> Canvas");
		canvas_f.add(new CanvasDemo());
		canvas_f.setLayout(null);
		canvas_f.setSize(500, 500);
		canvas_f.setVisible(true);
	}

	public static void main(String args[]) {
		new CanvasDemo1();
	}
}

@SuppressWarnings("serial")
class CanvasDemo extends Canvas {
	public CanvasDemo() {
		setBackground(Color.WHITE);
		setSize(300, 200);
	}

	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(80, 80, 150, 75);
	}
}
