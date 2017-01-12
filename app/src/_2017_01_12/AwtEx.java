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

// GridLayout 예제1
public class AwtEx extends Frame{
   public AwtEx(){
      Panel p1 = new Panel();
      Panel p2 = new Panel();
      //Panel p3 = new Panel();
      Scrollbar sb1 = new Scrollbar(0,0,50,0,255);
      Scrollbar sb2 = new Scrollbar(0,0,50,0,255);
      Scrollbar sb3 = new Scrollbar(0,0,50,0,255);
      TextArea ta = new TextArea(" ",35,40,1);
      Label la1 = new Label(" ");
      Label la2 = new Label(" ");
      Label la3 = new Label(" ");
      Label la4 = new Label("현재 색상");
      Label la5 = new Label(" ");
      Label la6 = new Label(" ");
      Label la7 = new Label(" ");
      Label la8 = new Label(" ");
      Label la9 = new Label("");
      TextField tf =  new TextField();
      
      p1.setLayout(new GridLayout(8,1));
      p2.setLayout(new BorderLayout());
      //p3.setLayout(new BorderLayout());
      
      p1.add(sb1);
      p1.add(la1);
      p1.add(sb2);
      p1.add(la2);
      p1.add(sb3);
      p1.add(la3);
      p1.add(la4);
      p1.add(tf);
      
      p2.add(ta);
      
//      p3.add(p1);
//      p3.add(p2,BorderLayout.EAST);
//      p3.add(la7,BorderLayout.NORTH);
//      p3.add(la8,BorderLayout.SOUTH);
//      
//      add(p3);
      
      
      
      
      
      setSize(500,500);
      setTitle("재미있는 스크롤바");
      setVisible(true);
      addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e){
            System.exit(0);
         }
      });
      
   }
   public static void main(String args[]){
      new AwtEx();
   }
}