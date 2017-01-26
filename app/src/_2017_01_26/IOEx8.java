package _2017_01_26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOEx8 {

	public static void main(String[] args) throws IOException{
		PrintWriter fw = 
				new PrintWriter(new BufferedWriter (
				new FileWriter( new File("D://Test.txt"))), true); // 오토플러쉬 flush();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력 : ");
		String str = "";
		while(!str.equals("end")) {
			str = in.readLine();
			fw.println(str);
		}
		in.close();
		fw.close();

	}

}
