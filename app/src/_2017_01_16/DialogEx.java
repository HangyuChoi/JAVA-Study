package _2017_01_16;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DialogEx extends JFrame{
	public JButton button;
	public Dialog dialog;
	
	public DialogEx() {
		button = new JButton("새창");
		//dialog = new Dialog(this);
		//dialog.setSize(100, 100);
		
		dialog = new MyDialog(this);
		dialog.setLayout(new FlowLayout());
		dialog.add(new JLabel("로그인성공"));
		dialog.pack();	// JLabel 의 크기로 dialog 창 고정
		 
		// Swing 에서는 닫기를 눌러도 소멸되는게 아니고 그냥 안보이게 하는 것이 기본 기능이다.
		setLayout(new FlowLayout());
		add(button);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 창을 안보이게 할 수도 있고, 아예 객체를 소멸 시킬 수있는데,
				// 자주 쓰는 창은 그냥 안보였다가 보이게 하는 것이 좋다.
				dialog.setVisible(true);
				
				// dialog.setVisible(false); // 창을 안보이게
				// dialog.dispose(); // 자원을 소멸,반납,해지 하겠다.
			}		
		});
	}
	public static void main(String[] args) {
		new DialogEx();
	}
}


class MyDialog extends JDialog {	// JDialog 를 상속 ( 눈에 안보임 )
	public MyDialog(JFrame frame) {
		super(frame);	// JDialog 의 생성자로서 frame 이 있다.
	}
}