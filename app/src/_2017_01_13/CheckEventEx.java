package _2017_01_13;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class CheckEventEx extends Frame implements ItemListener{
	
	Checkbox cb, cb2;
	Label lb, lb2;
	
	public CheckEventEx() {

		cb = new Checkbox("체크박스", false);
		cb2 = new Checkbox("체크박스2", false);
		lb = new Label("                         "
				+ "                          "
				+ "           ");
		lb2 = new Label("                         "
				+ "                          "
				+ "           ");
		

		setLayout(new GridLayout(2,2));
		
		add(lb, "West");
		add(cb, "Center");
		add(lb2, "West");
		add(cb2, "Center");
				
		setSize(500, 300);
		setVisible(true);
		
		setTitle("CheckEventEx");
		cb.addItemListener(this);
		cb2.addItemListener(this);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		//Object obj = arg0.getStateChange();

		Object obj2 = e.getSource();
		
		Checkbox cbx = (Checkbox) obj2;
		
		if(cbx == cb) {
			if(cb.getState()) {
				System.out.println("첫째 눌렀쪙 > _ < !!!");
				System.out.println(cbx.getState());
				System.out.println();
			} else {
				System.out.println("첫째 땠쪙  ㅠ_ ㅠ !!!");
				System.out.println(cbx.getState());	
				System.out.println();
			} 
		}
		
		if(cbx == cb2) {
			if(cb2.getState()) {
				System.out.println("둘째 눌렀쪙 > _ < !!!");
				System.out.println(cbx.getState());
				System.out.println();
			} else {
			System.out.println("둘째 땠쪙  ㅠ_ ㅠ !!!");
			System.out.println(cbx.getState());	
			System.out.println();
			}
		}
	}
	
	public static void main(String args[]) {
		new CheckEventEx();
		
		
	}
}
