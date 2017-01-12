package _2017_01_12;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxEx extends Frame {

	Panel p1, p2, p3;
	Label[] la = new Label[10];
	CheckboxGroup cg;
	Checkbox ch1, ch2, ch3, ch4, ch5, ch6;
	TextArea ta;
	Choice cho;
	
	public CheckboxEx() {
		p1 = new Panel();	 // ���
		p2 = new Panel();	 // �ߴ�
		p3 = new Panel();	 // �ϴ�
		
		for(int i = 0; i < la.length; i++) {	// ���� 10���� �迭��
			la[i] = new Label("");
		}
		
		cg = new CheckboxGroup();	// ���� ��ư�� ���� ���� CheckboxGroup�� �ֱ�
		ch1 = new Checkbox("��ħ", cg, true);	// �����ε�
		ch2 = new Checkbox("����", cg, true);
		ch3 = new Checkbox("����", cg, true);
		
		// �Ϲ� Checkbox ���
		ch4 = new Checkbox("���");
		ch5 = new Checkbox("����");
		ch6 = new Checkbox("��");
		
		// �ߴ� �ؽ�Ʈ���� ����
		ta = new TextArea("    <<�ڹ� ������ �Ļ�Ȱ>>", 20, 20, TextArea.SCROLLBARS_NONE);
		
		// �ϴ� ���û��� ����
		cho = new Choice();
		// ���û��� �ȿ� �� ���� ����
		cho.add("��ħ");
		cho.add("����");
		cho.add("����");
		
		// ��� Setting
		p1.setLayout(new GridLayout(2, 4));	// �� �� ��, �� �ٿ� �� ĭ
		p1.add(la[8]);	// ��ĭ
		p1.add(ch1);	// ��ħ
		p1.add(ch2);	// ����
		p1.add(ch3);	// ����
		p1.add(la[9]);	// ��ĭ
		p1.add(ch4);	// ���
		p1.add(ch5);	// ����
		p1.add(ch6);	// ��
		
		// �ߴ� Setting
		p2.setLayout(new BorderLayout());
		p2.add(ta, BorderLayout.CENTER);	// �ؽ�Ʈ ���ڸ� ��� ��ġ��Ű��
		p2.add(la[0], BorderLayout.NORTH);	// ������������ ������ �ش�.
		p2.add(la[1], BorderLayout.SOUTH);
		p2.add(la[2], BorderLayout.WEST);
		p2.add(la[3], BorderLayout.EAST);
		
		// �ϴ� Setting
		p3.setLayout(new BorderLayout());
		p3.add(cho, BorderLayout.CENTER);	// ���û��� ��� ��ġ��Ű��
		p3.add(la[4], BorderLayout.NORTH);	// ������������ ������ �ش�.
		p3.add(la[5], BorderLayout.SOUTH);
		p3.add(la[6], BorderLayout.WEST);
		p3.add(la[7], BorderLayout.EAST);
		
		for(int i = 0; i < 4; i++) {	// �ߴ� ���� Ȯ�� (����)
			la[i].setBackground(Color.BLACK);
		}
		
		for(int i = 4; i < 8; i++) {	// �ߴ� ���� Ȯ�� (����)
			la[i].setBackground(Color.PINK);
		}
		
		la[8].setText("CheckboxEx");
		la[8].setForeground(Color.WHITE);
		la[8].setBackground(Color.black);	// ���� Ȯ�� (�Ķ�)
		la[9].setText("by. ���ѱ�");
		la[9].setForeground(Color.BLUE);
		la[9].setBackground(Color.YELLOW);	// ���� Ȯ�� (���)
		
		
		add("North", p1);	// ��� Setting �Ѱ� ��ü������ ��ܿ� ��ġ
		add("Center", p2);	// �ߴ� Setting �Ѱ� ��ü������ �ߴܿ� ��ġ
		add("South", p3);	// �ϴ� Setting �Ѱ� ��ü������ �ϴܿ� ��ġ
		
		setSize(500, 500);	// ��ü ������� ����,���� 500, 500
		setVisible(true);	// ȭ�鿡 ���̰ڴ�.
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {	// �ݱ� ������ ������ �̺�Ʈ �߰�
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new CheckboxEx();
	}
}
