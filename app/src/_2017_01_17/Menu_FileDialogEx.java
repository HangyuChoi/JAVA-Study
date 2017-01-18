package _2017_01_17;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FileDialog;
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



public class Menu_FileDialogEx extends Frame implements ActionListener, WindowListener{
	public MenuBar mb;
	public Menu m;
	private MenuItem[] mi;	// private : 보안성이 필요한 걸 담을 때
	public JPanel p1;
	public Dialog dialog, dialog2, dialog3;
	public TextArea ta;
	
	public Menu_FileDialogEx() {
		mb = new MenuBar();
		m = new Menu("메뉴");
		mi = new MenuItem[5];
		p1 = new JPanel(new BorderLayout());
		ta = new TextArea();
		ta.setEditable(false);
		dialog = new NewView(this);
		dialog.setLocation(300, 300);
		dialog.setLayout(new FlowLayout());
		dialog.add(new JLabel("새창"));
		dialog.pack();	// JLabel 의 크기로 dialog 창 고정
		
		dialog2 = new NewView(this);
		dialog2.setLocation(300, 300);
		dialog2.setLayout(new FlowLayout());
		dialog2.add(new JLabel("저장"));
		dialog2.pack();	// JLabel 의 크기로 dialog 창 고정
		
		dialog3 = new NewView(this);
		dialog3.setLocation(300, 300);
		dialog3.setLayout(new FlowLayout());
		dialog3.add(new JLabel("다른 이름으로 저장"));
		dialog3.pack();	// JLabel 의 크기로 dialog 창 고정

		
		// mi[] 정의 
		for (int i = 0; i < mi.length; i++) {
			mi[i] = new MenuItem("New Window");	// 새창 선택 시 열기버튼 활성화 ( Dialog 로 )
			
			switch(i){
			case 0 :
				mi[i] = new MenuItem("Open");	// 열기 선택시 CanvasEx 호출 
				break;
			case 1 :
				mi[i] = new MenuItem("New Window");	// 새창 선택 시 열기버튼 활성화 ( Dialog 로 )
				break;
			case 2 :
				mi[i] = new MenuItem("Save"); // 저장
				break;
			case 3 :
				mi[i] = new MenuItem("Save As");// 다른이름으로 저장
				break;
			default :
				mi[i] = new MenuItem("Exit");	// 종료
				break;
			}
		}
		
		// m 정의
		for(int i = 0; i < mi.length; i++) {
			m.add(mi[i]);
			mi[i].addActionListener(this);	// 이벤트 등록
			
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
		new Menu_FileDialogEx();
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
			FileDialogSave();
		} else if (mi[3] == e.getSource()) {
			dialog3.setVisible(true);
		} else if (mi[4] == e.getSource()) {
			System.out.println("메뉴를 통한 프로그램 종료");
			System.exit(0);
		} 
		
	}
	public void FileDialogSave() {
		FileDialog filed = new FileDialog(Menu_FileDialogEx.this, "파일 저장", FileDialog.SAVE);
		filed.setVisible(true);
		
		ta.append(filed.getDirectory() + filed.getFile());
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

