package _2017_01_20;

import java.io.IOException;
import java.io.InputStream;

public class ExceptionEx {

	public static void main(String[] args) //throws Exception // 가상머신에게 예외처리를 위임
	{
		InputStream is = System.in;
		try{
			// 예외가 발생할 수 있는 구문
			System.out.println("예외 발생 지역, 실행구문 1");
			char ch = (char)is.read();	//실행구문 2
			System.out.println("예외 발생 지역, 실행구문 3");
		}catch (IOException e) {
			e.printStackTrace(); //빨간 글씨로 예외를 자세히 표시
			System.out.println("Exception : " + e.getMessage()); // 어떤 예외인지만 표시
			System.out.println("Exception : " + e.toString());
		}
		
//		char ch = (char)is.read();
	}
}
