package _2017_01_12;

import java.awt.FlowLayout;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class JscrollbarEx extends JFrame implements AdjustmentListener{
	Scrollbar jsb1;
	
	public JscrollbarEx() {

		jsb1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		
		add(jsb1);
		
		setSize(500, 300);
		setVisible(true);

		jsb1.addAdjustmentListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	
	public static void main(String args[]) {
		new JscrollbarEx();
	}


	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		System.out.println("이벤트발생");
	}
}
