package _2017_01_12;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class EventEx extends Frame implements ActionListener{
	private Button button1, button2;

	public EventEx() {
		button1 = new Button("버튼1");
		button2 = new Button("버튼2");
		setLayout(new FlowLayout());
		setSize(500, 300);
		setVisible(true);
		
		add(button1);
		add(button2);

		//하나의 메서드를 모든 컴포넌트가 동일하게 사용하겠다. this
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String args[]) {
		new EventEx();
	}

	@Override	// button 과 button2 가 사용하는 메서드
	public void actionPerformed(ActionEvent e) {

// 이벤트가 일어날 때 익명호출을 하고싶은데, 다른값으로 표현하고싶을 때 어떠한 컴포넌트에서 이벤트가 발생했는지 확인할 수 있다.
// ActionEvent가 오브젝트로 날라오니까. 버튼 을 형변환해서 쓸 수 있다.
		Object obj = e.getSource();
		Button b = (Button) obj;
		String label = b.getLabel();
		String str = new String("버튼");
		
		// 다이렉트로도 쓸 수 있다.
		// Button obj = (Button)e.getSource();
		
		// .equals() 를 써도 된다.
		if(b == button1) {	// 객체비교에서 쓸 수 있다.
			System.out.println("버튼 1");
		} else if(b.equals(button2)){
			System.out.println("버튼 2");
		}
		
		// 여거 버튼 컴포넌트의 이벤트를 처리할 수 있게 된다.
		// System.out.println("이벤트 발생!");

	}	
}
