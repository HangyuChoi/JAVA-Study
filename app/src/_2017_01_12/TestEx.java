package _2017_01_12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestEx extends Frame implements WindowListener {
	private Button button1, button2;
	private Panel panel1, panel2, panel3;
	private Label[] label;
	private Label label1;
	private Checkbox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5, checkbox6;
	private CheckboxGroup checkboxGroup;
	private GridLayout gridLayout;
	private TextArea textArea;
	private Choice cho;
	
	public TestEx() {
		panel1 = new Panel();
		panel2 = new Panel();
		panel3 = new Panel();
		//button1 = new Button();
		//button2 = new Button();
		label = new Label[10];
		textArea = new TextArea("<<자바>>", 20, 20, TextArea.SCROLLBARS_NONE);
		//label1 = new Label();
		
		checkbox1 = new Checkbox("선택1");
		checkbox2 = new Checkbox("선택2");
		checkbox3 = new Checkbox("선택3");
		
		checkboxGroup = new CheckboxGroup();
		checkbox4 = new Checkbox("선택1", checkboxGroup, true);
		checkbox5 = new Checkbox("선택2", checkboxGroup, true);
		checkbox6 = new Checkbox("선택3", checkboxGroup, true);
		
		
		for(int i = 0; i < label.length; i++) {
			label[i] = new Label("");
		}
		
		cho = new Choice();
		cho.add("선택1");
		cho.add("선택2");
		cho.add("선택3");
		
		
		panel1.setLayout(new GridLayout(2, 4));
		panel1.add(label[0]);
		panel1.add(checkbox1);
		panel1.add(checkbox2);
		panel1.add(checkbox3);

		
		panel1.add(label[1]);
		panel1.add(checkbox4);
		panel1.add(checkbox5);
		panel1.add(checkbox6);

		
		panel2.setLayout(new BorderLayout());
		panel2.add(textArea, BorderLayout.CENTER);
		panel2.add(label[2], BorderLayout.NORTH);
		panel2.add(label[3], BorderLayout.SOUTH);
		panel2.add(label[4], BorderLayout.WEST);
		panel2.add(label[5], BorderLayout.EAST);
		
		
		panel3.setLayout(new BorderLayout());
		panel3.add(cho, BorderLayout.CENTER);
		panel3.add(label[6], BorderLayout.NORTH);
		panel3.add(label[7], BorderLayout.SOUTH);
		panel3.add(label[8], BorderLayout.WEST);
		panel3.add(label[9], BorderLayout.EAST);
		
		
		add("North", panel1);
		add("Center", panel2);
		add("South", panel3);
		
		setSize(500, 300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new TestEx();

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
