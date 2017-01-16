package _2017_01_16;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class KeyEventEx extends JFrame implements KeyListener, ActionListener{
	public TextArea ta;
	public TextField txt;
	public JButton b;
	
	public KeyEventEx() {
		setLocation(346, 121);	// 스크린 좌표값을 이용하여 그 위치에 띄우기
		b = new JButton("Swing Button");
		txt = new TextField();
		txt.addKeyListener(this);
		ta = new TextArea();
		
		
		add("Center", ta);
		add("North", txt);
		add("South", b);
		
		b.addActionListener(this);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 창 끄기
		
		
	}
	
	// 입력된 키의 종류 판별
	@Override
	public void keyPressed(KeyEvent e) {
		// getKeyChar() : 문자열을 가져온다.
		ta.append(e.getKeyChar() + " 가 눌림\n");
		
		// SPACE를 입력 했을 때, 콘솔창에 출력 ( SPACE 판별  )
		if(e.getKeyChar() == KeyEvent.VK_SPACE) {
			System.out.println("스페이스바가 입력되었습니다.");
		}
	}
	
	// 키가 눌렸을 때 발생
	@Override
	public void keyReleased(KeyEvent e) {
		ta.append(e.getKeyChar() + " 를 놓았음\n");
	}
	
	// 키가 놓였을 때 발생
	@Override
	public void keyTyped(KeyEvent e) {
		ta.append(e.getKeyChar() + " 가 눌림\n");
	}
	
	// 버튼을 클릭했을 때 입력 글 모두 지워지도록 코드를 작성하시오.
	@Override
	public void actionPerformed(ActionEvent e) {
		// font 차이로 인해  textField는 공백을 하나 줘야 지워진다.
		txt.setText(" ");
		
		ta.setText("");
	}
	
	public static void main(String[] args) {
		new KeyEventEx();
	}
}
