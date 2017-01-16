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



public class AwtEventEx extends Frame implements WindowListener, ItemListener{
	private Panel panel1, panel2, panel3;
	private Label[] label;
	private Label label1, label2, label3, label4;
	private Checkbox checkbox1, checkbox2, checkbox3, checkbox4, checkbox5, checkbox6;
	private CheckboxGroup checkboxGroup;
	private TextArea textArea;
	private Choice choice;
	
	public AwtEventEx() {
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
		

	@Override	// 체크박스 액션
	public void itemStateChanged(ItemEvent e) {

		Object obj = e.getSource();
		
		if(obj == choice) {
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
		Checkbox temp = checkboxGroup.getSelectedCheckbox();	// 체크박스 그룹 중에 선택된 걸 가져와라.
		
		choice.select(temp.getLabel());
		
		System.out.println(temp);
		
		if(temp.getLabel() == "아침"){
			textArea.setText(label2.getText() + "\n1. 사과 : " + checkbox4.getState() 
											+ "\n2. 딸기 : " + checkbox5.getState()
											+ "\n3. 배    : " + checkbox6.getState());
			choice.select(temp.getLabel());
			
		} else if (temp.getLabel() == "점심") {
			textArea.setText(label3.getText() + "\n1. 사과 : " + checkbox4.getState() 
			+ "\n2. 딸기 : " + checkbox5.getState()
			+ "\n3. 배    : " + checkbox6.getState());
			choice.select(temp.getLabel());
		} else if (temp.getLabel() == "저녁") {
			textArea.setText(label4.getText() + "\n1. 사과 : " + checkbox4.getState() 
			+ "\n2. 딸기 : " + checkbox5.getState()
			+ "\n3. 배    : " + checkbox6.getState());
			choice.select(temp.getLabel());
		} else {
			textArea.setText(label1.getText());
		}
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
		
		new AwtEventEx();

	}
}
