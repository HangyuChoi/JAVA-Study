package _2017_01_16;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MenuEx extends Frame implements ActionListener, WindowListener{
	public MenuBar mb;
	public Menu m;
	private MenuItem[] mi;	// private : ���ȼ��� �ʿ��� �� ���� ��
	public JPanel p1;
	public Dialog dialog, dialog2, dialog3;
	public TextArea ta;
	
	public MenuEx() {
		mb = new MenuBar();
		m = new Menu("�޴�");
		mi = new MenuItem[5];
		p1 = new JPanel(new BorderLayout());
		ta = new TextArea();
		
		dialog = new NewView(this);
		dialog.setLocation(300, 300);
		dialog.setLayout(new FlowLayout());
		dialog.add(new JLabel("��â"));
		dialog.pack();	// JLabel �� ũ��� dialog â ����
		
		dialog2 = new NewView(this);
		dialog2.setLocation(300, 300);
		dialog2.setLayout(new FlowLayout());
		dialog2.add(new JLabel("����"));
		dialog2.pack();	// JLabel �� ũ��� dialog â ����
		
		dialog3 = new NewView(this);
		dialog3.setLocation(300, 300);
		dialog3.setLayout(new FlowLayout());
		dialog3.add(new JLabel("�ٸ� �̸����� ����"));
		dialog3.pack();	// JLabel �� ũ��� dialog â ����

		
		// mi[] ���� 
		for (int i = 0; i < mi.length; i++) {
			mi[i] = new MenuItem("New Window");	// ��â ���� �� �����ư Ȱ��ȭ ( Dialog �� )
			
			switch(i){
			case 0 :
				mi[i] = new MenuItem("Open");	// ���� ���ý� CanvasEx ȣ�� 
				break;
			case 1 :
				mi[i] = new MenuItem("New Window");	// ��â ���� �� �����ư Ȱ��ȭ ( Dialog �� )
				break;
			case 2 :
				mi[i] = new MenuItem("Save"); // ����
				break;
			case 3 :
				mi[i] = new MenuItem("Save As");// �ٸ��̸����� ����
				break;
			default :
				mi[i] = new MenuItem("Exit");	// ����
				break;
			}
		}
		
		// m ����
		for(int i = 0; i < mi.length; i++) {
			m.add(mi[i]);
			mi[i].addActionListener(this);	// �̺�Ʈ ���
			
			if(i != 2 && i != (mi.length - 1)) {
				m.addSeparator();
			}
		}
		
		mi[1].setEnabled(false);
		mb.add(m);
		setMenuBar(mb);
		p1.add(ta);
		p1.setVisible(false);
		add(p1);
		setLocation(250, 250);
		setSize(500, 500);
		setVisible(true);
		addWindowListener(this);
	}


	public static void main(String[] args) {
		new MenuEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (mi[0] == e.getSource()) {
			dialog.setVisible(true);
			mi[1].setEnabled(true);
		} else if (mi[1] == e.getSource()) {
			//CanvasEx2 c = new CanvasEx2();
			p1.setVisible(true);
		} else if (mi[2] == e.getSource()) {
			dialog2.setVisible(true);
		} else if (mi[3] == e.getSource()) {
			dialog3.setVisible(true);
		} else if (mi[4] == e.getSource()) {
			System.out.println("�޴��� ���� ���α׷� ����");
			System.exit(0);
		} 
		
	}


	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}
}

class NewView extends JDialog {
	public NewView(Frame frame) {
		super(frame);
	}
}

