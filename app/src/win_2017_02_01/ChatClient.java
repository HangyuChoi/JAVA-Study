package win_2017_02_01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ChatClient extends JFrame implements Runnable, ActionListener {
   private BufferedReader i;
   private PrintWriter o;
   private JTextArea output, list;
   private JTextField input, secretInput;
   private JLabel label;
   private Thread listener;
   private String host;
   private JScrollPane jsp;
   public List<User> userArray;
   private JDialog d;
   static String abc;
   public ChatClient(String server){
      super("채팅프로그램");
//      abc = "";
      d = new ChatDialog(this); d.setLayout(new FlowLayout()); d.add(new JLabel("닉네임 중복"));
      d.setLocation(800, 500); d.pack();
      userArray = new ArrayList<User>();
      host = server; 
      listener = new Thread(this);
      listener.start();
      output = new JTextArea();
      jsp = new JScrollPane(output);
      
      add(jsp,"Center");
      output.setEditable(false);
      
      Panel bottom = new Panel(new GridLayout(2,2,5,10));
      label = new JLabel("사용자 이름");
      bottom.add(label, "West");
      input = new JTextField();
      input.addActionListener(this);
      bottom.add(input, "Center");
      secretInput = new JTextField();
      secretInput.addActionListener(this);
      bottom.add(secretInput, "Nouth");
      add(bottom,"South");
      Panel east = new Panel(new BorderLayout());
      list = new JTextArea();
      list.setEditable(false);
      
      east.add(new JLabel("사용자 리스트"), "North");
      east.add(list, "Center");
      
      add(east,"East");
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(400,300);
      setVisible(true);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
       Object c = e.getSource();
       
       if(c==input) {
          if(input.getText().equals("")) {
        	  return;
          }
          o.println(input.getText());
          input.setText("");
          jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
          
       	} else if( c == d) {
       		System.exit(0);
       	}

   }

@Override
   public void run() {
      try{
         Socket s = new Socket(host,9830);
         InputStream ins = s.getInputStream();
         OutputStream os = s.getOutputStream();
         i = new BufferedReader(new InputStreamReader(ins));
         o = new PrintWriter(new OutputStreamWriter(os), true);
         
         while(true) {
         	String line = i.readLine();
         	StringTokenizer st = new StringTokenizer(line, "|");
         	String token = "";
         	User a = null;
         	list.setText("");
         	while(st.hasMoreTokens()) {
 				token = st.nextToken();
 				a = new User(token);
 				userArray.add(a);
 			} 	
 		   for(int i = 0; i < userArray.size(); i++) { // 3
 			   if(userArray.get(0).getName().equals("중복")){
 				  JOptionPane.showMessageDialog(this, "중복"); // 이거는 혁명인데? 해당 클라만 꺼진다.
 				  System.exit(0);
 				  //userArray.clear();
 				  //output.append("다시 접속해 주세요.");
 				  //return; 
 			   } else {
 				  label.setText("메세지 ");
 			   }
 			   if( i == 0) {
 				  output.append(userArray.get(i).getName() +"\n"); 
 				  } else {

 					  list.append(userArray.get(i).getName()+"\n");
 			   }
 		   }
 		   userArray.clear();
         }
      } catch(IOException ex){
         ex.printStackTrace();
      }
   }


   public static void main(String args[]){
      if(args.length>0){
         new ChatClient(args[0]);
      } else{
         new ChatClient("localhost");
      }
   }
}

class ChatDialog extends JDialog { 
	public ChatDialog(Frame frame) { super(frame); }  
}