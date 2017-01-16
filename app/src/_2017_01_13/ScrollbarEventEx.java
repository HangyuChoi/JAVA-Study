package _2017_01_13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.accessibility.AccessibleStateSet;

public class ScrollbarEventEx extends WindowAdapter implements AdjustmentListener{
	
	public Panel p1, p2;
	public Frame f;
	public Scrollbar sb_r, sb_g, sb_b;
	public Label la1;
	public Label[] la;
	public TextField tf;
	public TextArea ta;
	public GridLayout grid1, grid2;
	public BorderLayout border;
	
	public ScrollbarEventEx() {
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
		p2.add(tf);
		
		f.setLayout(grid1);
		f.add(p2);
		f.add(p1);
		f.setSize(300, 300);
		f.setVisible(true);
		f.addWindowListener(this);
		
		sb_r.addAdjustmentListener(this);
		sb_g.addAdjustmentListener(this);
		sb_b.addAdjustmentListener(this);
		
	}

	
	@Override	// 닫기 액션
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	@Override	// 스크롤바 액션
	public void adjustmentValueChanged(AdjustmentEvent e) {
		int r = 255 - sb_r.getValue();
		int g = 255 - sb_g.getValue();
		int b = 255 - sb_b.getValue();
		
		Color color = new Color(r, g, b);
		ta.setBackground(color);
		
		tf.setText("R : " + r + " G : " + g + " B : " + b);
		
//		Object obj = e.getSource();
//		String s = String.valueOf(obj);
//		if(s == sb_r) {
//			ta.setBackground(new Color(sb_r.getValue(), 0, 0));
//			
//			String a = String.valueOf(sb_r.getValue());
//			tf.setText(a);
//			
//		} else if(s == sb_g) {
//			ta.setBackground(new Color(0, sb_g.getValue(), 0));
//			String a = String.valueOf(sb_g.getValue());
//			tf.setText(a);
//		} else if(s == sb_b) {
//			ta.setBackground(new Color(0, 0, sb_b.getValue()));
//			String a = String.valueOf(sb_b.getValue());
//			tf.setText(a);
//		}

	}
	
	// 메인
	public static void main(String[] args) {
		new ScrollbarEventEx();
	}



}
