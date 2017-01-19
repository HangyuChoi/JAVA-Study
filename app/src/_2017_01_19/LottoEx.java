package _2017_01_19;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LottoEx extends Frame implements WindowListener, ActionListener{
	JPanel p1, p2, p3;
	JLabel[] la, la_in;
	JTextField tf_in1, tf_in2, tf_in3, tf_in4, tf_in5, tf_in6, 
	tf_out1, tf_out2, tf_out3, tf_out4, tf_out5, tf_out6, tf_text;
	JTextField[] tf_in, tf_out;
	JTextArea ta;
	Dialog d_j, d2, d3;
	JButton btn1;
	JLabel la2, la3, la_1, la_2;
	public LottoEx() {
		setLayout(new FlowLayout());
		
		d_j = new MyDialog(this); d_j.setLayout(new FlowLayout()); d_j.add(new JLabel("1등 당첨 되셨습니다."));
		d_j.setLocation(105, 190); d_j.pack();
		
		d2 = new MyDialog(this); d2.setLayout(new FlowLayout()); d2.add(new JLabel("당첨이 안되셨습니다."));
		d2.setLocation(105, 190); d2.pack();
		
		d3 = new MyDialog(this); d3.setLayout(new FlowLayout()); d3.add(new JLabel("중복 된 번호가 있습니다."));
		d3.setLocation(105, 190); d3.pack();
		la = new JLabel[10];
		for(int i = 0; i < la.length; i++) {
			la[i] = new JLabel("      ");
		}
		
		la_in = new JLabel[6];
		for(int i = 0; i < la_in.length; i++) {
			la_in[i] = new JLabel();
		}
		
		la2 = new JLabel("번호 입력");
		la3 = new JLabel("당첨 번호");
		la_1 = new JLabel("      →");
		la_2 = new JLabel("      →");
		
		tf_in = new JTextField[6];
		for(int i = 0; i < tf_in.length; i++) {
			tf_in[i] = new JTextField();
		}
		tf_out = new JTextField[6];
		for(int i = 0; i < tf_out.length; i++) {
			tf_out[i] = new JTextField();
			tf_out[i].setFocusable(false);
		}
		//tf_in1 = new JTextField(2);tf_in2 = new JTextField();tf_in3 = new JTextField();tf_in4 = new JTextField();
		//tf_in5 = new JTextField();tf_in6 = new JTextField();
		tf_out1 = new JTextField();tf_out2 = new JTextField();
		tf_out3 = new JTextField();tf_out4 = new JTextField();tf_out5 = new JTextField();tf_out6 = new JTextField();
		ta = new JTextArea();
		
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(3, 8,5,5));
		
		p1.add(la2);p1.add(la_1);p1.add(tf_in[0]);p1.add(tf_in[1]);p1.add(tf_in[2]);p1.add(tf_in[3]);p1.add(tf_in[4]);p1.add(tf_in[5]);
		p1.add(la[0]);p1.add(la[2]);p1.add(la[4]);p1.add(la[5]);p1.add(la[6]);p1.add(la[7]);p1.add(la[8]);p1.add(la[9]);
		p1.add(la3);p1.add(la_2);p1.add(tf_out[0]);p1.add(tf_out[1]);p1.add(tf_out[2]);p1.add(tf_out[3]);p1.add(tf_out[4]);p1.add(tf_out[5]);
		
		tf_text = new JTextField(10);
		tf_text.setFocusable(false);
		p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(tf_text);
		
		btn1 = new JButton("당첨 여부 확인하기");
		btn1.addActionListener(this);
		p3 = new JPanel();
		p3.setLayout(new BorderLayout());
		p3.add(btn1);
		
		add(p1);
		add(p2);
		add(p3);
		addWindowListener(this);
		setSize(500,170);
		setVisible(true);
	}
	
	//public void 
	
	public static void main(String args[]) {

		new LottoEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int count = 0;
		String a[] = new String[6];
		for(int i = 0; i < a.length; i++) {
			a[i] = tf_in[i].getText();
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < i ; j++) {
				if(a[i].equals(a[j])) {
					d3.setVisible(true);
					return;
				}
			}
		}
		Random r = new Random();
		String b[] = new String[6];
		
		int c[] = new int[6];
		for(int i = 0; i < a.length; i++) {
			c[i] = (int) (Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(c[i] == c[j]) {
					c[i] = r.nextInt(45) +1;
					j= -1;
				}
			}
			b[i] = String.valueOf(c[i]);
			tf_out[i].setText(b[i]);
		}
		
		for(int i = 0; i < 6; i++) {
			a[i] = tf_in[i].getText();
			b[i] = tf_out[i].getText();
		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(a[i].equals(b[j])) {
					count++;
				}
			}
		}
		
		if(count == 6) {
			d_j.setVisible(true);
		} else {
			d2.setVisible(true);
			String counts = String.valueOf(count);
			tf_text.setText(counts +"개 당첨 되셨어요.");
		}
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
class MyDialog extends JDialog {	// JDialog 를 상속 ( 눈에 안보임 ) 닫기 기능 정의 되어있다.
	public MyDialog(Frame frame) {
		super(frame);	// JDialog 의 생성자로서 frame 이 있다.
	}
}
