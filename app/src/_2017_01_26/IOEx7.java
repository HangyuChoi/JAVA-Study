package _2017_01_26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEx7 {
	public static void main(String[] args) throws IOException{ // ������ ���� ���� ����ó�� (FileNotFoundException)
		FileWriter fw = new FileWriter(new File("D:/Test.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�Է� : ");
		String str = "";
		while (!str.equals("end")) {
			str = in.readLine();
			fw.write(str);
		}
		in.close();
		fw.close();
	}
}
