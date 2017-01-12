package _2017_01_12;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class EventEx1 extends Frame {
	private Button button1, button2;

	public EventEx1() {
		button1 = new Button("버튼1");
		button2 = new Button("버튼2");
		setLayout(new FlowLayout());
		setSize(500, 300);
		setVisible(true);
		
		add(button1);
		add(button2);


		button1.addActionListener(new ActionListener() {	// ActionListener를 사용하는 특정 컴포넌트에 적용
			public void actionPerformed(ActionEvent e) {
				System.out.println("이벤트 발생1");
				
			}	
		});
		
		button2.addActionListener(new ActionListener() {	// ActionListener를 사용하는 특정 컴포넌트에 적용
			public void actionPerformed(ActionEvent e) {
				System.out.println("이벤트 발생2");
				
			}	
		});
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String args[]) {
		new EventEx1();
	}
}
