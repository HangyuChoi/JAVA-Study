package _2017_01_12;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class EventEx2 extends JFrame implements AdjustmentListener{
	Scrollbar sb1;
	JScrollBar jsb1;
	public EventEx2() {

		sb1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		jsb1 = new JScrollBar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		
		setLayout(new GridLayout(2, 1));
		add(sb1);
		add(jsb1);
		
		setSize(500, 300);
		setVisible(true);
		
		sb1.addAdjustmentListener(this);
		jsb1.addAdjustmentListener(this);

		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	
	public static void main(String args[]) {
		new EventEx2();
	}


	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		int i = 0;

		if(e.getSource() == sb1) {
			System.out.println("Scrollbar ´Ã¾î³­µå¾Æ!!");
		} else if(e.getSource() == jsb1){
			System.out.println("JScrollBar ´Ã¾î³­µå¾Æ!!");
		}
		
	}
}
