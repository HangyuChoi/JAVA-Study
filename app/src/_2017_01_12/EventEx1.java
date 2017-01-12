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
		button1 = new Button("��ư1");
		button2 = new Button("��ư2");
		setLayout(new FlowLayout());
		setSize(500, 300);
		setVisible(true);
		
		add(button1);
		add(button2);


		button1.addActionListener(new ActionListener() {	// ActionListener�� ����ϴ� Ư�� ������Ʈ�� ����
			public void actionPerformed(ActionEvent e) {
				System.out.println("�̺�Ʈ �߻�1");
				
			}	
		});
		
		button2.addActionListener(new ActionListener() {	// ActionListener�� ����ϴ� Ư�� ������Ʈ�� ����
			public void actionPerformed(ActionEvent e) {
				System.out.println("�̺�Ʈ �߻�2");
				
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
