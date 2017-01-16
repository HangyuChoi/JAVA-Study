package _2017_01_16;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CanvasEx extends Canvas {
	private int x, y;
	private Image img;
	
	public CanvasEx() {
		x = 10; y = 10;
	    img = Toolkit.getDefaultToolkit().getImage("D:/hgwork/img/bank.jpg");
	//	img = Toolkit.getDefaultToolkit().getImage("duke2.jpg"); // ���� ��Ű�� ���� �̹����� �ҷ��´�.
		JFrame frame = new JFrame();
		JButton button = new JButton("�׸���");
		frame.add(this, "Center");	// frame ���ٰ� Canvas�� �ø���, �װ� Center�� ���ڴ�.
		frame.add(button, "South");
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				x += 5; y += 3;
				repaint();
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// �ڿ� �Ҹ�
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)�� ������ setVisible(false)�� �⺻�̴�.
	}
	
	// � �׸��� �׸� ���ΰ�. ������ ���� .. ��� ��ҵ��� Graphics ���� ���� �Ǿ��ִ�.
	public void paint(Graphics g) {	// paint method �� ���α׷��� ����Ǿ��� �� ������ �ѹ��� �ڵ����� ȣ�� �ȴ�.
		
		//(x, y, width, height)	 	x, y : �������� ���� 
		//g.drawRect(x, y, 100, 100);	// x �� 10��ŭ ����, y �� 10��ŭ�� ���� ���μ��� 100 �� �簢���� �׸���.
		g.setColor(Color.BLUE);
		//g.fillRect(x, y, 100, 100);	// ���� �簢��
		g.drawString("ȫ�浿", x, y); // ���ڿ� �׸�
		g.drawLine(x, y, x + 35, y);	// �� 
		g.drawImage(img, x + 30, y + 30, this);
	}
//	public void update(Graphics g) {
//		paint(g);
//	}
	
	// ��ü.repaint �� ȣ�� repaint�� ȣ���ϱ�����  repaint �� paint ���̿� ȣ�� �Ǵ� ���� update
	// repaint -> update -> paint
	// update �� �׸��� Ŭ���� ���ִ� ����̴�.
	
	public static void main(String args[]) {
		new CanvasEx();
	}
}
