package _2017_01_12;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exercise1 extends Frame{
	public Panel p1, p2, p3;
	public Label l1;
	public Checkbox cb1, cb2, cb3, rd1, rd2, rd3;
	public CheckboxGroup cg1, cg2;
	public TextArea ta;
	
	public Exercise1() {
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		l1 = new Label();
		ta = new TextArea();
		cb1 = new Checkbox("사과", false, cg1);
		cb2 = new Checkbox("딸기", false, cg1);
		cb3 = new Checkbox("배", false, cg1);
		cg2 = new CheckboxGroup();
		rd1 = new Checkbox("아침", false, cg2);
		rd2 = new Checkbox("점심", false, cg2);
		rd3 = new Checkbox("저녁", false, cg2);
		
		this.setLayout(new BorderLayout());
		
		Choice cho = new Choice();
		cho.add("아침");
		cho.add("점심");
		cho.add("저녁");
		p1.setLayout(new BorderLayout());

		p1.add(rd1);
		p1.add(rd2);
		p1.add(rd3);
		p1.add(l1);
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);

		p2.setLayout(new BorderLayout());
		ta.setText(" <<자바 수강생 식생활>>");
		p2.add(ta);
		p3.setLayout(new BorderLayout());
		p3.add(cho, "South");	// p1 내에서 중앙 배치 
		//p3.add(new Label(""), "East");
		//p3.add(new Label(""), "West");
		//p3.add(new Label(""), "North");
		//p3.add(new Label(""), "Center");	// 여기까지
		
		add(p1);
		add(p2, BorderLayout.NORTH);
		add(p3);
		//add(p2);
		
		setSize(500, 500);
		setVisible(true);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new Exercise1();

	}

}
