package _2017_01_12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class JScrollbarEx2 extends JFrame implements AdjustmentListener{
	Scrollbar sb1, sb2;
	JScrollBar jsb1, jsb2;
	JTextArea ta;
	JPanel jp1;
	public JScrollbarEx2() {
		jp1 = new JPanel();
												// 시작시점, 두께, 최소값, 최대값
		sb1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		sb2 = new Scrollbar(Scrollbar.HORIZONTAL, 255, 10, 0, 265);
		jsb1 = new JScrollBar(Scrollbar.VERTICAL, 0, 10, 0, 265);
		jsb2 = new JScrollBar(Scrollbar.VERTICAL, 255, 10, 0, 265);
		
		ta = new JTextArea();
		//Color color = new Color(0, 0, 0);
		//ta.setBackground(color);

		jp1.setLayout(new BorderLayout());
		jp1.add(sb1, "North");
		jp1.add(sb2, "South");
		jp1.add(jsb1, "East");
		jp1.add(jsb2, "West");
		jp1.add(ta, "Center");
			
		add(jp1);

		setSize(500, 300);
		setVisible(true);
		
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		jsb1.addAdjustmentListener(this);
		jsb2.addAdjustmentListener(this);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	
	public static void main(String args[]) {
		new JScrollbarEx2();
	}


	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		Object obj = e.getSource();
		
		if(sb1 == obj) {
			// RGB 색상 배합
			ta.setBackground(new Color(0, 0, sb1.getValue()));	// 움직일때의 동적으로 색이 변하도록
			System.out.println(sb1.getValue());
		} else if(jsb1 == obj) {
			ta.setBackground(new Color(0, jsb1.getValue(), 0));
		} else if(sb2 == obj) {
			ta.setBackground(new Color(sb2.getValue(), 0, 0));
		} else if(jsb2 == obj) {
			ta.setBackground(new Color(0, 0, jsb2.getValue()));
		}
		
	}
}
