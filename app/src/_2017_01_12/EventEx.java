package _2017_01_12;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class EventEx extends Frame implements ActionListener{
	private Button button1, button2;

	public EventEx() {
		button1 = new Button("��ư1");
		button2 = new Button("��ư2");
		setLayout(new FlowLayout());
		setSize(500, 300);
		setVisible(true);
		
		add(button1);
		add(button2);

		//�ϳ��� �޼��带 ��� ������Ʈ�� �����ϰ� ����ϰڴ�. this
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String args[]) {
		new EventEx();
	}

	@Override	// button �� button2 �� ����ϴ� �޼���
	public void actionPerformed(ActionEvent e) {

// �̺�Ʈ�� �Ͼ �� �͸�ȣ���� �ϰ������, �ٸ������� ǥ���ϰ���� �� ��� ������Ʈ���� �̺�Ʈ�� �߻��ߴ��� Ȯ���� �� �ִ�.
// ActionEvent�� ������Ʈ�� ������ϱ�. ��ư �� ����ȯ�ؼ� �� �� �ִ�.
		Object obj = e.getSource();
		Button b = (Button) obj;
		String label = b.getLabel();
		String str = new String("��ư");
		
		// ���̷�Ʈ�ε� �� �� �ִ�.
		// Button obj = (Button)e.getSource();
		
		// .equals() �� �ᵵ �ȴ�.
		if(b == button1) {	// ��ü�񱳿��� �� �� �ִ�.
			System.out.println("��ư 1");
		} else if(b.equals(button2)){
			System.out.println("��ư 2");
		}
		
		// ���� ��ư ������Ʈ�� �̺�Ʈ�� ó���� �� �ְ� �ȴ�.
		// System.out.println("�̺�Ʈ �߻�!");

	}	
}
