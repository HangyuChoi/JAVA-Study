package _2017_01_09;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;

public class InterfaceEx2 extends WindowAdapter {//implements WindowListener {
	   // WindowAdapter �� abstract class �� ������ extends �� ��� �޾ƹ�����. WindowAdapter���� �������̵�� �̹� �Ǿ��ִ�.
	public InterfaceEx2() {
		Frame frame = new Frame("Interface Test");
		frame.setTitle("�޸���");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.addWindowListener(this);	// �ݱ⸦ �����ٴ°� �����Ѵ�.
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
