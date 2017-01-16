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
		button = new JButton("��â");
		//dialog = new Dialog(this);
		//dialog.setSize(100, 100);
		
		dialog = new MyDialog(this);
		dialog.setLayout(new FlowLayout());
		dialog.add(new JLabel("�α��μ���"));
		dialog.pack();	// JLabel �� ũ��� dialog â ����
		 
		// Swing ������ �ݱ⸦ ������ �Ҹ�Ǵ°� �ƴϰ� �׳� �Ⱥ��̰� �ϴ� ���� �⺻ ����̴�.
		setLayout(new FlowLayout());
		add(button);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// â�� �Ⱥ��̰� �� ���� �ְ�, �ƿ� ��ü�� �Ҹ� ��ų ���ִµ�,
				// ���� ���� â�� �׳� �Ⱥ����ٰ� ���̰� �ϴ� ���� ����.
				dialog.setVisible(true);
				
				// dialog.setVisible(false); // â�� �Ⱥ��̰�
				// dialog.dispose(); // �ڿ��� �Ҹ�,�ݳ�,���� �ϰڴ�.
			}		
		});
	}
	public static void main(String[] args) {
		new DialogEx();
	}
}


class MyDialog extends JDialog {	// JDialog �� ��� ( ���� �Ⱥ��� )
	public MyDialog(JFrame frame) {
		super(frame);	// JDialog �� �����ڷμ� frame �� �ִ�.
	}
}