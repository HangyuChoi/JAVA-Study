package _2017_01_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOEx4_1 {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr); // 버퍼의 역활을 하는 객체
		
		String str = "";
		System.out.print("입력  : ");
		try {
			str = br.readLine();
			System.out.println("출력 : " + str);
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
