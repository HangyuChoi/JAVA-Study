package _2017_01_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOEx4_1 {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr); // ������ ��Ȱ�� �ϴ� ��ü
		
		String str = "";
		System.out.print("�Է�  : ");
		try {
			str = br.readLine();
			System.out.println("��� : " + str);
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
