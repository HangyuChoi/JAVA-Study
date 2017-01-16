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
	//	img = Toolkit.getDefaultToolkit().getImage("duke2.jpg"); // 같은 패키지 내에 이미지를 불러온다.
		JFrame frame = new JFrame();
		JButton button = new JButton("그리기");
		frame.add(this, "Center");	// frame 에다가 Canvas를 올리고, 그걸 Center에 놓겠다.
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
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 자원 소멸
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)가 없으면 setVisible(false)가 기본이다.
	}
	
	// 어떤 그림을 그릴 것인가. 색상은 뭐고 .. 모든 요소들이 Graphics 에서 정의 되어있다.
	public void paint(Graphics g) {	// paint method 는 프로그램이 실행되었을 때 무조건 한번은 자동으로 호출 된다.
		
		//(x, y, width, height)	 	x, y : 시작지점 지정 
		//g.drawRect(x, y, 100, 100);	// x 를 10만큼 가고, y 를 10만큼간 다음 가로세로 100 의 사각형을 그린다.
		g.setColor(Color.BLUE);
		//g.fillRect(x, y, 100, 100);	// 꽉찬 사각형
		g.drawString("홍길동", x, y); // 문자열 그림
		g.drawLine(x, y, x + 35, y);	// 선 
		g.drawImage(img, x + 30, y + 30, this);
	}
//	public void update(Graphics g) {
//		paint(g);
//	}
	
	// 객체.repaint 로 호출 repaint를 호출하기전에  repaint 와 paint 사이에 호출 되는 것이 update
	// repaint -> update -> paint
	// update 는 그림을 클리어 해주는 기능이다.
	
	public static void main(String args[]) {
		new CanvasEx();
	}
}
