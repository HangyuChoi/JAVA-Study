package _2017_01_12;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxEx extends Frame {

	Panel p1, p2, p3;
	Label[] la = new Label[10];
	CheckboxGroup cg;
	Checkbox ch1, ch2, ch3, ch4, ch5, ch6;
	TextArea ta;
	Choice cho;
	
	public CheckboxEx() {
		p1 = new Panel();	 // 상단
		p2 = new Panel();	 // 중단
		p3 = new Panel();	 // 하단
		
		for(int i = 0; i < la.length; i++) {	// 여백 10개를 배열로
			la[i] = new Label("");
		}
		
		cg = new CheckboxGroup();	// 라디오 버튼을 쓰기 위해 CheckboxGroup에 넣기
		ch1 = new Checkbox("아침", cg, true);	// 오버로드
		ch2 = new Checkbox("점심", cg, true);
		ch3 = new Checkbox("저녁", cg, true);
		
		// 일반 Checkbox 사용
		ch4 = new Checkbox("사과");
		ch5 = new Checkbox("딸기");
		ch6 = new Checkbox("배");
		
		// 중단 텍스트상자 생성
		ta = new TextArea("    <<자바 수강생 식생활>>", 20, 20, TextArea.SCROLLBARS_NONE);
		
		// 하단 선택상자 생성
		cho = new Choice();
		// 선택상자 안에 들어갈 내용 생성
		cho.add("아침");
		cho.add("점심");
		cho.add("저녁");
		
		// 상단 Setting
		p1.setLayout(new GridLayout(2, 4));	// 총 두 줄, 한 줄에 네 칸
		p1.add(la[8]);	// 빈칸
		p1.add(ch1);	// 아침
		p1.add(ch2);	// 점심
		p1.add(ch3);	// 저녁
		p1.add(la[9]);	// 빈칸
		p1.add(ch4);	// 사과
		p1.add(ch5);	// 딸기
		p1.add(ch6);	// 배
		
		// 중단 Setting
		p2.setLayout(new BorderLayout());
		p2.add(ta, BorderLayout.CENTER);	// 텍스트 상자를 가운데 위치시키고
		p2.add(la[0], BorderLayout.NORTH);	// 동서남북으로 여백을 준다.
		p2.add(la[1], BorderLayout.SOUTH);
		p2.add(la[2], BorderLayout.WEST);
		p2.add(la[3], BorderLayout.EAST);
		
		// 하단 Setting
		p3.setLayout(new BorderLayout());
		p3.add(cho, BorderLayout.CENTER);	// 선택상자 가운데 위치시키고
		p3.add(la[4], BorderLayout.NORTH);	// 동서남북으로 여백을 준다.
		p3.add(la[5], BorderLayout.SOUTH);
		p3.add(la[6], BorderLayout.WEST);
		p3.add(la[7], BorderLayout.EAST);
		
		for(int i = 0; i < 4; i++) {	// 중단 여백 확인 (검정)
			la[i].setBackground(Color.BLACK);
		}
		
		for(int i = 4; i < 8; i++) {	// 중단 여백 확인 (검정)
			la[i].setBackground(Color.PINK);
		}
		
		la[8].setText("CheckboxEx");
		la[8].setForeground(Color.WHITE);
		la[8].setBackground(Color.black);	// 여백 확인 (파랑)
		la[9].setText("by. 최한규");
		la[9].setForeground(Color.BLUE);
		la[9].setBackground(Color.YELLOW);	// 여백 확인 (노랑)
		
		
		add("North", p1);	// 상단 Setting 한건 전체적으로 상단에 배치
		add("Center", p2);	// 중단 Setting 한건 전체적으로 중단에 배치
		add("South", p3);	// 하단 Setting 한건 전체적으로 하단에 배치
		
		setSize(500, 500);	// 전체 사이즈는 가로,세로 500, 500
		setVisible(true);	// 화면에 보이겠다.
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {	// 닫기 누르면 닫히게 이벤트 추가
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new CheckboxEx();
	}
}
