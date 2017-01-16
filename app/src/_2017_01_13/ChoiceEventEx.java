package _2017_01_13;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class ChoiceEventEx extends Frame implements WindowListener, ItemListener{
	private Panel panel1, panel2, panel3;
	private Label[] label;
	private Label label1, label2, label3, label4;
	private Checkbox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5, checkbox6;
	private CheckboxGroup checkboxGroup;
	private TextArea textArea;
	private Choice choice;
	
	public ChoiceEventEx() {
		panel1 = new Panel();
		panel2 = new Panel();
		panel3 = new Panel();

		label = new Label[10];
		label1 = new Label(" << 자바 수강생 식생활 >>");
		label2 = new Label(" << 아  침 >>");
		label3 = new Label(" << 점  심 >>");
		label4 = new Label(" << 저  녁 >>");
		textArea = new TextArea(label1.getText(), 20, 20, TextArea.SCROLLBARS_NONE);

		checkboxGroup = new CheckboxGroup();
		
		checkbox1 = new Checkbox("아침", checkboxGroup, true);
		checkbox2 = new Checkbox("점심", checkboxGroup, true);
		checkbox3 = new Checkbox("저녁", checkboxGroup, true);
		
		checkbox4 = new Checkbox("사과");
		checkbox5 = new Checkbox("딸기");
		checkbox6 = new Checkbox("배");
		
		
		for(int i = 0; i < label.length; i++) {
			label[i] = new Label("");
		}
		
		choice = new Choice();
		choice.add("아침");
		choice.add("점심");
		choice.add("저녁");
		
		
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
		panel3.add(choice, BorderLayout.CENTER);
		panel3.add(label[6], BorderLayout.NORTH);
		panel3.add(label[7], BorderLayout.SOUTH);
		panel3.add(label[8], BorderLayout.WEST);
		panel3.add(label[9], BorderLayout.EAST);
		
		checkbox1.addItemListener(this);
		checkbox2.addItemListener(this);
		checkbox3.addItemListener(this);
		checkbox4.addItemListener(this);
		checkbox5.addItemListener(this);
		checkbox6.addItemListener(this);
		choice.addItemListener(this);
		
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
		

	@Override	// Checkbox, Choice Action
	public void itemStateChanged(ItemEvent e) {
		
		Object obj = e.getSource();
		
		if(obj == choice) {	// Choice
			String str = choice.getSelectedItem();
			if(str.equals("아침")) {
				checkbox1.setState(true);
			}
			else if (str.equals("점심")){
				checkbox2.setState(true);
			}
			else if (str.equals("저녁")){
				checkbox3.setState(true);
			}
		}
		Checkbox temp = checkboxGroup.getSelectedCheckbox();	// Checkbox
		
		textArea.setText("   << " + temp.getLabel() + " >> \n\n");
		
		textArea.append(" 1. 사과 : " + checkbox4.getState() + "\n");
		textArea.append(" 2. 딸기 : " + checkbox5.getState() + "\n");
		textArea.append(" 3. 배   : " + checkbox6.getState() + "\n");
		
		choice.select(temp.getLabel());
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
	
	public static void main(String[] args) {
		
		new ChoiceEventEx();

	}
}
