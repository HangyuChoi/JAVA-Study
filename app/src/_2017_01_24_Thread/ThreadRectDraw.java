package _2017_01_24_Thread;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class ThreadRectDraw extends Frame implements Runnable{
	int x = 0; int y = 0; boolean xOrient, yOrient;
	public ThreadRectDraw(String str) {
		super(str);
		setSize(300, 300);
		setVisible(true);
		addWindowListener(new WindowAdapter () {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics gr) {
		int r = 0;
		int g = 0;
		int b = 0;
		Random ran = new Random();
		Dimension d = this.getSize();
		//Color c = new Color(r,g,b); // 색 직접 지정
		if(xOrient) {
			x--;
			if(x < 0) {
				x = 0;
				xOrient = false;
			}
		} else {
			x++;
			if (x >= d.width - 20) {
				x = d.width - 20;
				xOrient = true;
			}
		}
		
		if(yOrient) {
			y--;
			if(y < 0) {
				y = 0;
				yOrient = false;
			}
		} else {
			y++;
			if(y >= d.height - 20) {
				y = d.height - 20;
				yOrient = true;
			}
		}
		//r = 0;
		//g = 0;
		//b = 255;
		r = ran.nextInt(255);
		g = ran.nextInt(255);
		b = ran.nextInt(255);
		gr.setColor(new Color(r, g, b));
		gr.drawRect(x, y, 20, 20);
	}
	
	public void update(Graphics g) {
		paint(g);
	}
	/* 막대 만들기는 
		x 축의 왼쪽 막대 거리 - 오른쪽 막대 거리
		y 축의 위쪽 막대 거리 - 아래쪽 막대 거리   */
	@Override
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadRectDraw thread = new ThreadRectDraw("쓰레드 그림 연습");
		Thread t1 = new Thread(thread);
		t1.start();

	}
	
}
