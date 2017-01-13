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


	@Override	// 얼로테이션 : 유효성 검사   안써도 상관없지만 유효성을 검사하면 좋다
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		super.windowActivated(arg0);
	}


	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		super.windowClosed(arg0);
	}


	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		super.windowDeactivated(arg0);
	}


	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		super.windowDeiconified(arg0);
	}


	@Override
	public void windowGainedFocus(WindowEvent arg0) {
		// TODO Auto-generated method stub
		super.windowGainedFocus(arg0);
	}


	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		super.windowIconified(arg0);
	}


	@Override
	public void windowLostFocus(WindowEvent arg0) {
		// TODO Auto-generated method stub
		super.windowLostFocus(arg0);
	}


	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		super.windowOpened(arg0);
	}


	@Override
	public void windowStateChanged(WindowEvent arg0) {
		// TODO Auto-generated method stub
		super.windowStateChanged(arg0);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
