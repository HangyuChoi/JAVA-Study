package win_2017_02_01;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

import _2017_01_26.IOEx_MenuAction;

public class ChatHandler extends Thread {
   private Socket s;
   private BufferedReader i;
   private PrintWriter o;
   private ChatServer server;
   public List<User> userArray;
   public ChatHandler(ChatServer server, Socket s) throws IOException{
	 
      
	  this.s = s;
      this.server = server; 
      
      InputStream ins = s.getInputStream();
      OutputStream os = s.getOutputStream();
      i = new BufferedReader(new InputStreamReader(ins));
      o = new PrintWriter(new OutputStreamWriter(os), true);
   }
   
   public void run(){
      String name = "";
      try{
         name = i.readLine();
         User a = server.checkNames(name); // 중복 확인
         if(a != null) {
        	 //System.out.println("대화명이 중복이야 ");
        	 o.println("|중복");
        	 return;
         }
         server.register(this);
         server.getNames(name);	// 이름 뽑기 
         broadcast(name+"님이 방문하셨습니다.");
         while(true){
            String msg = i.readLine();
            broadcast (name + "-" +msg);
         }
      } catch(IOException ex){
         ex.printStackTrace();
      }
      server.unregister(this);
      server.outName(name);
      broadcast(name+"님이 나가셨습니다.");
      try{
         i.close();
         o.close();
         s.close();
      } catch (IOException ex){
         ex.printStackTrace();
      }
   }
   protected void println(String message){
      o.println(message);
   }
   protected void saveFile(String message) throws IOException {
	   String add = ""; String s = "";
	    FileReader reader = new FileReader(new File("D:/채팅어플.txt"));
	    while(reader.ready()) {	// ready() : 읽어 올 문자가 있는 동안 true 반환
			char ch =(char)reader.read();
			s = String.valueOf(ch);
			add = add + s;
		}
		reader.close();
		add = add + "\n";
	   	FileWriter fw = new FileWriter(new File("D:/채팅어플.txt"));
		fw.write(add+message);
		fw.close();
   }
   protected void broadcast(String message){
      server.broadcast(message);
   }

}
