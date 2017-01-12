package _2017_01_12;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutEx2 extends Frame {
	public GridLayoutEx2() {
		

	Button b1 = new Button("버튼");
	Checkbox ch1 = new Checkbox("체크박스", true);
	CheckboxGroup ch = new CheckboxGroup();
	Checkbox ra = new Checkbox("라디오버튼",true);
	Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 200, 100, 0, 255);
	
	this.setLayout(new GridLayout(2, 2, 10, 10));
	add(b1);
	add(ch1);
	add(ra);
	add(sb);
	
	setSize(500, 500);
	setVisible(true);
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
}
	public static void main(String[] args) {
		new GridLayoutEx2();

	}
}
