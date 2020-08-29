package awt;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuDemo1 {
	MenuDemo1() {
		Frame menu_f = new Frame("studytonight ==> Menu and MenuItem Demo");
		MenuBar menu_bar = new MenuBar();
		Menu menu11 = new Menu("Menu");
		Menu sub_menu1 = new Menu("Sub Menu =>");
		MenuItem a1 = new MenuItem("Red");
		MenuItem a2 = new MenuItem("Light Red");
		MenuItem a3 = new MenuItem("Drak Red");
		MenuItem b1 = new MenuItem("Green");
		MenuItem b2 = new MenuItem("Light Green");
		MenuItem b3 = new MenuItem("Dark Green");
		menu11.add(a1);
		sub_menu1.add(a2);
		sub_menu1.add(a3);
		menu11.add(b1);
		sub_menu1.add(b2);
		sub_menu1.add(b3);
		menu11.add(sub_menu1);
		menu_bar.add(menu11);
		menu_f.setMenuBar(menu_bar);
		menu_f.setSize(400, 400);
		menu_f.setLayout(null);
		menu_f.setVisible(true);
	}

	public static void main(String args[]) {
		new MenuDemo1();
	}
}
