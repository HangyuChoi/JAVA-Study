package _2017_01_09;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InterfaceEx3 extends Frame {

	private static final long serialVersionUID = 1L;

	public InterfaceEx3(){
		setTitle("Å×½ºÆ®");
		setSize(500, 500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e){
		    	System.exit(0);
		    } 
		});
	}
		   
	public static void main(String args[]){
		new InterfaceEx3();
	}
}
