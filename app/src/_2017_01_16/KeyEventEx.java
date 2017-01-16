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
		setLocation(346, 121);	// ��ũ�� ��ǥ���� �̿��Ͽ� �� ��ġ�� ����
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// â ����
		
		
	}
	
	// �Էµ� Ű�� ���� �Ǻ�
	@Override
	public void keyPressed(KeyEvent e) {
		// getKeyChar() : ���ڿ��� �����´�.
		ta.append(e.getKeyChar() + " �� ����\n");
		
		// SPACE�� �Է� ���� ��, �ܼ�â�� ��� ( SPACE �Ǻ�  )
		if(e.getKeyChar() == KeyEvent.VK_SPACE) {
			System.out.println("�����̽��ٰ� �ԷµǾ����ϴ�.");
		}
	}
	
	// Ű�� ������ �� �߻�
	@Override
	public void keyReleased(KeyEvent e) {
		ta.append(e.getKeyChar() + " �� ������\n");
	}
	
	// Ű�� ������ �� �߻�
	@Override
	public void keyTyped(KeyEvent e) {
		ta.append(e.getKeyChar() + " �� ����\n");
	}
	
	// ��ư�� Ŭ������ �� �Է� �� ��� ���������� �ڵ带 �ۼ��Ͻÿ�.
	@Override
	public void actionPerformed(ActionEvent e) {
		// font ���̷� ����  textField�� ������ �ϳ� ��� ��������.
		txt.setText(" ");
		
		ta.setText("");
	}
	
	public static void main(String[] args) {
		new KeyEventEx();
	}
}
