package _2017_01_16;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;

public class CardLayoutEx2 extends Frame implements ActionListener, WindowListener, MouseListener {
	JButton btn1, btn2, btn3;
	Panel p1, p2, c1, c2, c3;
	Label[] la;
	CardLayout cards;
	public CardLayoutEx2() {
		
		setLayout(new GridLayout(2,1));	// 첫 페이지를 2,1 로 만든다.
		//ex 
		/*
		 	p1
		        ㅡㅡㅡ
		    p2
		 */
		btn1 = new JButton("Yello");
		btn2 = new JButton("Blue");
		btn3 = new JButton("Red");
		la = new Label[12];
		
		for(int i = 0; i < la.length; i++) {
			la[i] = new Label(" ");
		}
		
		p1 = new Panel(new GridLayout(3,5)); // 3줄 , 한 줄에 5칸 
		//ex 
		/*
		   p1_( 5칸 )
		   p1_( 5칸 )
		   p1_( 5칸 )
		        ㅡㅡㅡ
			p2	    
		*/
		p1.add(la[0]);	// 공백
		p1.add(la[1]);	// 공백
		p1.add(la[2]);	// 공백
		p1.add(la[3]);	// 공백
		p1.add(la[4]);	// 공백
		
		p1.add(la[5]);	// 공백
		p1.add(btn1);	// btn1 = Yello
		p1.add(btn2);	// btn2 = Blue
		p1.add(btn3);	// btn3 = Red
		p1.add(la[6]);	// 공백
		
		p1.add(la[7]);	// 공백
		p1.add(la[8]);	// 공백
		p1.add(la[9]);	// 공백
		p1.add(la[10]);	// 공백
		p1.add(la[11]);	// 공백
		
		p2 = new Panel();
		cards = new CardLayout();	// CardLayout
		p2.setLayout(cards);
		//ex 
		/*
			p1_( 5칸 )
			p1_( 5칸 )
			p1_( 5칸 )
			    ㅡㅡㅡ
		    p2_(c1, c2, c3) 겹치게	    
		*/
		
		c1 = new Panel();
		c1.setBackground(Color.YELLOW);
		c2 = new Panel();
		c2.setBackground(Color.BLUE);
		c3 = new Panel();
		c3.setBackground(Color.RED);
		
		
		add(p1); // p1 을 맨 위에 정의한 GridLayout에 첫번째에 배치 
		//ex 
		/*
			p1
		        ㅡㅡㅡ
		 	
		*/
		p2.add(c1,"c1"); // p2에  CardLayout 으로 정의한 c1 배치
		p2.add(c2,"c2"); // p2에  CardLayout 으로 정의한 c2 배치
		p2.add(c3,"c3"); // p2에  CardLayout 으로 정의한 c3 배치
		add(p2); // p2 을 맨 위에 정의한 GridLayout에 두번째에 배치  
		//ex 
		/*
			p1
		        ㅡㅡㅡ
		 	p2
		*/		
		
		// 각 Button을 ActionListener_Method 에 연결
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		// 각 Panel에 MouseListener_Method 에 연결
		c1.addMouseListener(this);
		c2.addMouseListener(this);
		c3.addMouseListener(this);
		
		setSize(500, 500);
		setVisible(true);
		addWindowListener(this); // CardLayoutEx2 Class를  WindowListener_Methods 에 연결
	}
	
	
	
	// WindowListener_Methods
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}

	// ActionListener_Method
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			cards.show(p2, "c1");
		} else if(e.getSource() == btn2) {
			cards.show(p2, "c2");
		} else if(e.getSource() == btn3) {
			cards.show(p2, "c3");
		}
	}
	
	// MouseListener_Methods
	public void mouseClicked(MouseEvent e) {
		cards.next(p2);
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	
	
	public static void main(String[] args) {
		new CardLayoutEx2();
	}
}
