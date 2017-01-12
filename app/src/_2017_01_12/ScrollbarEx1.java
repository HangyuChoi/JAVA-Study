package _2017_01_12;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarEx1 extends WindowAdapter {
	
	public Panel p1, p2;
	public Frame f;
	public Scrollbar sb_r, sb_g, sb_b;
	//public Label la1, la2, la3, la4, la5, la6, la7, la8, la9, la10;
	public Label la1;
	public Label[] la;
	public TextField tf;
	public TextArea ta;
	public GridLayout grid1, grid2;
	public BorderLayout border;

	public ScrollbarEx1() {
		la = new Label[9];
		p1 = new Panel();
		p2 = new Panel();
		f = new Frame();
		f.setTitle("재미있는 스크롤바");
		sb_r = new Scrollbar(0, 0, 50, 0, 255);
		sb_g = new Scrollbar(0, 0, 50, 0, 255);
		sb_b = new Scrollbar(0, 0, 50, 0, 255);
		
		for(int i = 0; i < la.length; i++) {
			la[i] = new Label("");
		}
		la1 = new Label("현재 색상");
//		la2 = new Label("");
//		la3 = new Label("");
//		la4 = new Label("");
//		la5 = new Label("");
//		la6 = new Label("");
//		la7 = new Label("");
//		la8 = new Label("");
//		la9 = new Label("");
//		la10 = new Label("");
		tf = new TextField("", 10);
		ta = new TextArea("", 10, 10);
		grid1 = new GridLayout(1, 2);
		grid2 = new GridLayout(10, 1);
		border = new BorderLayout();

		p1.setLayout(border);
		p1.add("West", la[0]);
		p1.add("Center", ta);
		p1.add("East", la[1]);
		p1.add("North", la[2]);
		p1.add("South", la[3]);
		
		p2.setLayout(grid2);
		p2.add(la[4]);
		p2.add(sb_r);
		p2.add(la[5]);
		p2.add(sb_g);
		p2.add(la[6]);
		p2.add(sb_b);
		p2.add(la[7]);
		p2.add(la1); // 현재 색상 표시
		p2.add(la[8]);
		
		f.setLayout(grid1);
		f.add(p2);
		f.add(p1);
		f.setSize(300, 300);
		f.setVisible(true);
		f.addWindowListener(this);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		new ScrollbarEx1();
	}
}
