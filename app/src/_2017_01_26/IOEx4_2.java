package _2017_01_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx4_2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		while(true) {
			try{
				System.out.print("�Է�  : ");
				str = br.readLine();
				System.out.println("��� :"+str);
		      } catch (IOException e){
		    	  e.printStackTrace();
		      }
			 if(str.equals("end")) {
				 System.out.println("���α׷� ����");
				 break;
			 }
		}
		try {
			br.close();
		} catch (Exception e){
	         System.out.println("Exception : "+e.getMessage());
	      }
	}
}
