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
	  
      Panel p1 = new Panel();	// ����� �������� ���η� �̵�� (����)
      Panel p2 = new Panel();	// ����� �������� ���η� �̵�� (������)
      //      Panel p3 = new Panel();
      Scrollbar sb1 = new Scrollbar(0,0,50,0,255);	//0 ,0 �ʱ⽺ũ����ġ, 50 �� ��ũ�ѹ� �β�, 0 �ʱⰪ, 
      Scrollbar sb2 = new Scrollbar(0,0,50,0,255);
      Scrollbar sb3 = new Scrollbar(0,0,50,0,255);
      TextArea ta = new TextArea(" ");	// ������ �ؽ�Ʈ
      Label la1 = new Label(" ");
      Label la2 = new Label(" ");
      Label la3 = new Label(" ");
      Label la4 = new Label("���� ����");
      Label la5 = new Label(" ");
      Label la6 = new Label(" ");
      Label la7 = new Label(" ");
      Label la8 = new Label(" ");
      Label la9 = new Label(" ");
      Label la10 = new Label(" ");
      TextField tf =  new TextField();	// ���� �ϴ� �ؽ�Ʈâ 
      this.setLayout(new GridLayout(1,2));
      p1.setLayout(new GridLayout(10,1));	// ���ʿ� �׸���� 10���� ����Ʈ�� �����.
      p2.setLayout(new BorderLayout());	// �����ʿ� �������̾ƿ� �����.
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
      
      // ���������� ����
      p2.add(la7,BorderLayout.NORTH);
      p2.add(la8,BorderLayout.SOUTH);
      p2.add(la9,BorderLayout.EAST);
      p2.add(la10,BorderLayout.WEST);
//      add(p3);
      
      
      
      
      
      setSize(300,300);
      setTitle("����ִ� ��ũ�ѹ�");
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
