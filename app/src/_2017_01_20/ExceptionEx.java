package _2017_01_20;

import java.io.IOException;
import java.io.InputStream;

public class ExceptionEx {

	public static void main(String[] args) //throws Exception // ����ӽſ��� ����ó���� ����
	{
		InputStream is = System.in;
		try{
			// ���ܰ� �߻��� �� �ִ� ����
			System.out.println("���� �߻� ����, ���౸�� 1");
			char ch = (char)is.read();	//���౸�� 2
			System.out.println("���� �߻� ����, ���౸�� 3");
		}catch (IOException e) {
			e.printStackTrace(); //���� �۾��� ���ܸ� �ڼ��� ǥ��
			System.out.println("Exception : " + e.getMessage()); // � ���������� ǥ��
			System.out.println("Exception : " + e.toString());
		}
		
//		char ch = (char)is.read();
	}
}
