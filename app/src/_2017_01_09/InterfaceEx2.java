package _2017_01_09;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;

public class InterfaceEx2 extends WindowAdapter {//implements WindowListener {
	   // WindowAdapter 는 abstract class 그 때문에 extends 로 상속 받아버린다. WindowAdapter에서 오버라이드는 이미 되어있다.
	public InterfaceEx2() {
		Frame frame = new Frame("Interface Test");
		frame.setTitle("메모장");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.addWindowListener(this);	// 닫기를 눌렀다는걸 감지한다.
	}
	
	
//		public void windowActivated(WindowEvent e) {}
//	 	public void windowClosed(WindowEvent e) {}
	   public void windowClosing(WindowEvent e) {
		   System.exit(0);
	   } 
//	   public void windowDeactivated(WindowEvent e) {} 
//	   public void windowDeiconified(WindowEvent e) {}
//	   public void windowIconified(WindowEvent e) {}
//	   public void windowOpened(WindowEvent e) {}
	
	
	public static void main(String args[]) {
		      new InterfaceEx2();
	}
}
