package _2017_01_13;

import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseListenerEx2 extends Frame implements MouseListener {

   public MouseListenerEx2() {
      addMouseListener(this);
      setSize(500, 500);
      setVisible(true);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
   }

   @Override
   public void mouseClicked(MouseEvent arg0) {
      System.out.println("Å¬¸¯");
   }

   @Override
   public void mouseEntered(MouseEvent e) {
      System.out.println("µé¾î¿È");

   }

   @Override
   public void mouseExited(MouseEvent e) {
      System.out.println("³ª°¨");

   }

   @Override
   public void mousePressed(MouseEvent e) {
      Point p = e.getPoint();
      int x = (Integer)getX();
      int y = (Integer)getY();
      System.out.println("´©¸§ :" +p.x +"," +p.y);

   }

   @Override
   public void mouseReleased(MouseEvent e) {
      System.out.println("¶À");
   }

   public static void main(String[] args) {
      new MouseListenerEx2();
   }

}