package _2017_01_13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseListenerEx extends Frame implements MouseListener{
	private Panel p1, p2, p3;
	private TextArea ta;
	public MouseListenerEx() {
		setLayout(new GridLayout(1, 3));
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		ta = new TextArea("���⸸ �׼��� �߻�");
		
		p2.setLayout(new BorderLayout());
		p1.setBackground(Color.BLUE);
		p2.add(ta, "Center");
		p3.setBackground(Color.RED);
		
		ta.addMouseListener(this);
		
		add(p1,"West");
		add(p2,"Center");
		add(p3,"Ease");

		
		setSize(500, 500);
		setVisible(true);
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ŭ��");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��");
	}
	
	
	
	public static void main(String args[]) {
		new MouseListenerEx();
	}
}
