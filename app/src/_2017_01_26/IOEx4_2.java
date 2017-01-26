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
				System.out.print("입력  : ");
				str = br.readLine();
				System.out.println("출력 :"+str);
		      } catch (IOException e){
		    	  e.printStackTrace();
		      }
			 if(str.equals("end")) {
				 System.out.println("프로그램 종료");
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
