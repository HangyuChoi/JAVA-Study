package _2017_01_17;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FileDialogEx extends JFrame{
	JButton button;
	JTextArea ta;
	public FileDialogEx() {
		button = new JButton("파일");
		ta = new JTextArea();
		ta.setEditable(false); // ta 창에 입력 안되게
		setLayout(new BorderLayout());
		add(button,"South");
		add(ta, "Center");
		
		
		setSize(500,500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog filed = new FileDialog(FileDialogEx.this, "파일열기", FileDialog.LOAD);
				
				filed.setVisible(true);
				ta.append(filed.getDirectory() + filed.getFile()); // 경로
			}
		});
		
//		addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
	}
	
	public static void main(String args[]) {
		new FileDialogEx();

	}
}
