package _2017_01_26;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx5 {
	// �Է��� ���ڸ� ���Ϸ� ����
	public static void main(String[] args) throws IOException{ // ������ ���� ���� ����ó��
		File file = new File("D:/Test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		System.out.print("�Է� : ");
		int data = 0;
		while(data != -1) {
			data = System.in.read();
			// write�� �ۼ�. 
			fos.write(data);
		}
		fos.close(); // Window OS�� Ư�� �� ������ ���� ���� �� �����ϰ� �ȴ�.
	}
}
