package _2017_01_12;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtEx2 extends Frame{
   public AwtEx2(){
	  
      Panel p1 = new Panel();	// 가운데를 기준으로 세로로 이등분 (왼쪽)
      Panel p2 = new Panel();	// 가운데를 기준으로 세로로 이등분 (오른쪽)
      //      Panel p3 = new Panel();
      Scrollbar sb1 = new Scrollbar(0,0,50,0,255);	//0 ,0 초기스크롤위치, 50 은 스크롤바 두께, 0 초기값, 
      Scrollbar sb2 = new Scrollbar(0,0,50,0,255);
      Scrollbar sb3 = new Scrollbar(0,0,50,0,255);
      TextArea ta = new TextArea(" ");	// 오른쪽 텍스트
      Label la1 = new Label(" ");
      Label la2 = new Label(" ");
      Label la3 = new Label(" ");
      Label la4 = new Label("현재 색상");
      Label la5 = new Label(" ");
      Label la6 = new Label(" ");
      Label la7 = new Label(" ");
      Label la8 = new Label(" ");
      Label la9 = new Label(" ");
      Label la10 = new Label(" ");
      TextField tf =  new TextField();	// 왼쪽 하단 텍스트창 
      this.setLayout(new GridLayout(1,2));
      p1.setLayout(new GridLayout(10,1));	// 왼쪽에 그리드뷰 10개의 리스트로 만든다.
      p2.setLayout(new BorderLayout());	// 오른쪽에 보더레이아웃 만든다.
      //p3.setLayout(new BorderLayout());
      p1.add(la5);
      p1.add(sb1);
      p1.add(la1);
      p1.add(sb2);
      p1.add(la2);
      p1.add(sb3);
      p1.add(la3);
      p1.add(la4);
      p1.add(tf);
      p1.add(la6);
      p2.add(ta);
      
      add(p1);
      add(p2);
      
      // 동서남북의 여백
      p2.add(la7,BorderLayout.NORTH);
      p2.add(la8,BorderLayout.SOUTH);
      p2.add(la9,BorderLayout.EAST);
      p2.add(la10,BorderLayout.WEST);
//      add(p3);
      
      
      
      
      
      setSize(300,300);
      setTitle("재미있는 스크롤바");
      setVisible(true);
      addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){
            System.exit(0);
         }
      });
         
   }
   public static void main(String args[]){
      new AwtEx2();
   }
}
