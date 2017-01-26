package _2017_01_26;

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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IOEx_MenuAction extends Frame implements ActionListener, WindowListener{
	boolean Select;
	public MenuBar mb;
	public MenuItem[] mi;
	public Menu m;
	public JPanel p1;
	public TextArea ta;
	public String[] openTa;
	public Dialog dialogSave, dialogSaveAs, dialogExit;
	
	public IOEx_MenuAction() {
		Select = false; // true = Open File Save , false = New File Save
		mb = new MenuBar();
		m = new Menu("메뉴");
		mi = new MenuItem[5];
		ta = new TextArea();
		
		p1 = new JPanel(new BorderLayout());
		mi[0] = new MenuItem("New File");
		mi[1] = new MenuItem("Open File");
		mi[2] = new MenuItem("Save File");
		mi[3] = new MenuItem("Save As");
		mi[4] = new MenuItem("Exit");
		
		// m 정의
		for(int i = 0; i < mi.length; i++) {
			m.add(mi[i]);
			mi[i].addActionListener(this);	// 이벤트 등록
			
			if(i != 2 && i != (mi.length - 1)) {
				m.addSeparator();
			}
		}
		mb.add(m);
		setMenuBar(mb);
		p1.add(ta);
		p1.setVisible(false);
		add(p1);
		setLocation(250, 250);
		setSize(500, 500);
		setVisible(true);
		addWindowListener(this);
		
		dialogSave = new MenuDialogView(this);
		dialogSave.setLocation(300, 300);
		dialogSave.setLayout(new FlowLayout());
		dialogSave.add(new JLabel("저장 되었습니다."));
		dialogSave.pack();	// JLabel 의 크기로 dialog 창 고정
		
		dialogSaveAs = new MenuDialogView(this);
		dialogSaveAs.setLocation(300, 300);
		dialogSaveAs.setLayout(new FlowLayout());
		dialogSaveAs.add(new JLabel("다른이름으로 저장 되었습니다."));
		dialogSaveAs.pack();	// JLabel 의 크기로 dialog 창 고정
	}
	@Override
	public void actionPerformed(ActionEvent e)  {
		String openFilePath = "";
		
		if(mi[0] == e.getSource()) { 			// New File
			Select = false;
			ta.setText("");
			p1.setVisible(true);
		} else if(mi[1] == e.getSource()) {		// Open File
			try {
				FileDialog filed = new FileDialog(IOEx_MenuAction.this, "파일 열기", FileDialog.LOAD);
				filed.setVisible(true);
				FileReader reader = new FileReader(new File(filed.getDirectory() + filed.getFile()));
				openFilePath = filed.getDirectory() + filed.getFile();
				String s = ""; String add = "";
				while(reader.ready()) {	// ready() : 읽어 올 문자가 있는 동안 true 반환
					char ch =(char)reader.read();
					s = String.valueOf(ch);
					add = add + s;
				}
				ta.setText(add);
				reader.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}	
		} else if (mi[2] == e.getSource()) {	// Save File
			try {
				if (Select) {
					FileWriter fw = new FileWriter(new File(""+openFilePath));
					String str = "";
					str = ta.getText();
					fw.write(str);
					fw.close();
					dialogSave.setVisible(true);
					ta.setText("");
				} else {
					FileDialog filed = new FileDialog(IOEx_MenuAction.this, "새로 저장하기", FileDialog.SAVE);
					filed.setVisible(true);
					FileWriter fw = new FileWriter(new File(filed.getDirectory()+filed.getFile()));
					String str = "";
					str = ta.getText(); 
					fw.write(str);
					fw.close();
					dialogSave.setVisible(true);
					ta.setText("");
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if (mi[3] == e.getSource()) {	// Save As
			try {
				FileDialog filed2 = new FileDialog(IOEx_MenuAction.this, "다른이름 으로 저장하기", FileDialog.SAVE);
				filed2.setVisible(true);
				FileWriter fw = new FileWriter(new File(filed2.getDirectory()+filed2.getFile()));
				String str = "";
				str = ta.getText();
				fw.write(str);
				fw.close();
				dialogSaveAs.setVisible(true);
				ta.setText("");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else if (mi[4] == e.getSource()) {	// Exit
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
	
	public static void main(String[] args) {
		new IOEx_MenuAction();
	}
}

class MenuDialogView extends JDialog {
	public MenuDialogView(Frame frame) {
		super(frame);
	}
}
