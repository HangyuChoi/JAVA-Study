package _2017_01_26;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOEx6 {
	public static void main(String[] args) throws IOException{ // ������ ���� ���� ����ó�� (FileNotFoundException)
		FileReader reader = new FileReader(new File("D:/Test.txt"));
/*		
		// �迭�� ����Ͽ� ������ ���� �о� ����Ͻÿ�.
		char ch[] = new char[100];	// �迭 ����Ͽ� 100 ���� ���� Ȯ��
		reader.read(ch, 0, 100);	// 100 �� ������ �о��
		
		reader.close();	// ��� �� ����
		
		System.out.println(new String(ch));	// println() ���
		// �׸� ������ ������ �迭�� �ʱ�� 100���� ���� �� �� �����̴�.
*/
		/* ȿ����  */
		while(reader.ready()) {	// ready() : �о� �� ���ڰ� �ִ� ���� true ��ȯ
			char ch = (char) reader.read();
			System.out.print(ch);
			//System.out.print( ( char ) reader.read() );
		}
		// �о� �� ���ڰ� ���� ���� print ���ֱ� ������ �׸� �ȳ��´�.
		reader.close();
	}
}
