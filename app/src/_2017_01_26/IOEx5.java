package _2017_01_26;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx5 {
	// 입력한 문자를 파일로 저장
	public static void main(String[] args) throws IOException{ // 파일이 없을 때의 예외처리
		File file = new File("D:/Test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		System.out.print("입력 : ");
		int data = 0;
		while(data != -1) {
			data = System.in.read();
			// write로 작성. 
			fos.write(data);
		}
		fos.close(); // Window OS의 특성 상 파일을 쓰고 닫을 때 저장하게 된다.
	}
}
