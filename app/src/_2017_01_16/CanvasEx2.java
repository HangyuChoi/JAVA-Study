package _2017_01_16;

import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CanvasEx2 extends Canvas implements ActionListener{
	private int x, y;
	private Image img;
	private JButton btn1, btn2, btn3, btn4;
	private Panel p1;
	private Label[] la;
	public CanvasEx2() {
		x = 50; y = 50;
		JFrame frame = new JFrame();
		p1 = new Panel();
		la = new Label[6];
		for (int i = 0; i < la.length; i++) {
			la[i] = new Label(" ");
		}
		img = Toolkit.getDefaultToolkit().getImage("D:/hgwork/img/duke.jpg");
		
		btn1 = new JButton("▲");
		btn2 = new JButton("◀");
		btn3 = new JButton("▶");
		btn4 = new JButton("▼");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		frame.add(this);	// frame 에 img 를 뿌려주겠다. 가장 처음 판에
		
		p1.setLayout(new GridLayout(2,5));
		p1.add(la[0]);
		p1.add(la[1]);
		p1.add(btn1);
		p1.add(la[2]);
		p1.add(la[3]);
		
		p1.add(la[4]);
		p1.add(btn2);
		p1.add(btn4);
		p1.add(btn3);
		p1.add(la[5]);

		frame.add(p1,"South");
		frame.setSize(400, 400);
		frame.setVisible(true);
		//frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		
	}
	public void paint(Graphics g) {
		g.drawImage(img, x, y, this);
		
	}

	public static void main(String[] args) {
		new CanvasEx2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			y -= 10;
			repaint();
		} else if (e.getSource() == btn2) {
			x -= 10;
			repaint();
		} else if (e.getSource() == btn3) {
			x += 10;
			repaint();
		} else if (e.getSource() == btn4) {
			y += 10;
			repaint();
		}
	}
}
