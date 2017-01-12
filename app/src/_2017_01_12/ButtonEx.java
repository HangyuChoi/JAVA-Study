package _2017_01_12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 이벤트를 정하고, 이벤트를 implements 해주고 메소드 넣는다.

public class ButtonEx extends Frame implements WindowListener {
	public ButtonEx() {
		// 객체생성 
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Button b = new Button("버튼");	
		Checkbox ch1 = new Checkbox("체크박스", true);
		CheckboxGroup ch = new CheckboxGroup();
		Checkbox ra = new Checkbox("라디오버튼",true, ch);
		Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 200, 100, 0, 255);
		
		Choice cho = new Choice();
			cho.add("학년선택");
			cho.add("1학년");
			cho.add("2학년");
			cho.add("3학년");
			cho.add("4학년");
			
			
		p1.setLayout(new BorderLayout());	// 디폴트 값이 FlowLayout이라 은닉해도 됨
		p2.setLayout(new BorderLayout());
		
		p1.add(cho, "Center");	// p1 내에서 중앙 배치 
		p1.add(new Label(""), "East");
		p1.add(new Label(""), "West");
		p1.add(new Label(""), "North");
		p1.add(new Label(""), "South");	// 여기까지 
							
		//Label la = new Label("");
		p2.add(ra, "South");
		this.setLayout(new BorderLayout());
		
		//p2.setLayout(new BorderLayout());
		
		add(b, BorderLayout.NORTH);
		//add(ch1, "West"); 왼쪽
		add(ch1, "East");
		//add(ra, BorderLayout.SOUTH);
		add(p1,"Center");
		//p1.setBackground(Color.BLUE);
		//ra.setBackground(Color.RED);
		add(p2,"South");
		
		p2.setBackground(Color.YELLOW);
		
		setSize(500, 500);
		setVisible(true);
		
		addWindowListener(this);
		
		
//		addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
	}


	public static void main(String[] args) {
		new ButtonEx();
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
