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

// �̺�Ʈ�� ���ϰ�, �̺�Ʈ�� implements ���ְ� �޼ҵ� �ִ´�.

public class ButtonEx extends Frame implements WindowListener {
	public ButtonEx() {
		// ��ü���� 
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Button b = new Button("��ư");	
		Checkbox ch1 = new Checkbox("üũ�ڽ�", true);
		CheckboxGroup ch = new CheckboxGroup();
		Checkbox ra = new Checkbox("������ư",true, ch);
		Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 200, 100, 0, 255);
		
		Choice cho = new Choice();
			cho.add("�г⼱��");
			cho.add("1�г�");
			cho.add("2�г�");
			cho.add("3�г�");
			cho.add("4�г�");
			
			
		p1.setLayout(new BorderLayout());	// ����Ʈ ���� FlowLayout�̶� �����ص� ��
		p2.setLayout(new BorderLayout());
		
		p1.add(cho, "Center");	// p1 ������ �߾� ��ġ 
		p1.add(new Label(""), "East");
		p1.add(new Label(""), "West");
		p1.add(new Label(""), "North");
		p1.add(new Label(""), "South");	// ������� 
							
		//Label la = new Label("");
		p2.add(ra, "South");
		this.setLayout(new BorderLayout());
		
		//p2.setLayout(new BorderLayout());
		
		add(b, BorderLayout.NORTH);
		//add(ch1, "West"); ����
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
