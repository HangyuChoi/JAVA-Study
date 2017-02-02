package win_2017_02_01;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ChatServer {
   private Vector handlers;   
   private List<User> userArray;
  
   public ChatServer(int port){
      try{
    	 
         ServerSocket server = new ServerSocket (port);
        
         handlers = new Vector();
         userArray = new ArrayList<User>();
         System.out.println("ChatServer is ready.");
         while(true){
            Socket client = server.accept();
            ChatHandler c = new ChatHandler(this, client);  
               c.start();
         }
      } catch(Exception e){
         e.printStackTrace();
      }
   }
   
   public Object getHandler(int index){     
      return handlers.elementAt(index);
   }
   public void register(ChatHandler c){
      handlers.addElement(c);
   }
   
   public void getNames(String name) { // 대화명 뽑기
	   User a = new User(name);
	   userArray.add(a); 
   }
   
   public User checkNames(String name) { // 대화명 중복 체크
	  User bbb = null;
	   for (int i = 0; i < userArray.size(); i++) {
		   if(name.equals(userArray.get(i).getName())) {
			   bbb = userArray.get(i);
		   }
	   } return bbb;
   }
   
   public void outName(String name) { // 나감 체크
	   for(int i = 0; i < userArray.size(); i++) {
		   if(userArray.get(i).getName() == name) {
			   userArray.remove(i);
		   }
	   }
   }
   public void unregister(Object o){
      handlers.removeElement(o);
   }
   public void broadcast(String message){
      synchronized(handlers){
         int n = handlers.size();
         int count = 0;
         String b = "";
  	   for(int i =0; i < userArray.size(); i++ ) {
  		   b += ("|"+userArray.get(i).getName());
  	   }
            for(int i=0;i<n;i++) {
            ChatHandler c = (ChatHandler)handlers.elementAt(i);
            try{    
               c.println(message+b);
               c.saveFile(message);
            } catch (Exception ex){
               ex.printStackTrace();
            }
         }
      }
   }

public static void main(String[] args) {
      new ChatServer(9830);
   }
}