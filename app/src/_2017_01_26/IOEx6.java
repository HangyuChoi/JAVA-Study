package _2017_01_26;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOEx6 {
	public static void main(String[] args) throws IOException{ // 파일이 없을 때의 예외처리 (FileNotFoundException)
		FileReader reader = new FileReader(new File("D:/Test.txt"));
/*		
		// 배열을 사용하여 파일의 문자 읽어 출력하시오.
		char ch[] = new char[100];	// 배열 사용하여 100 문자 공간 확보
		reader.read(ch, 0, 100);	// 100 자 까지만 읽어옴
		
		reader.close();	// 사용 후 닫음
		
		System.out.println(new String(ch));	// println() 출력
		// 네모가 나오는 이유는 배열의 초기로 100개의 공간 중 빈 공간이다.
*/
		/* 효과적  */
		while(reader.ready()) {	// ready() : 읽어 올 문자가 있는 동안 true 반환
			char ch = (char) reader.read();
			System.out.print(ch);
			//System.out.print( ( char ) reader.read() );
		}
		// 읽어 올 문자가 있을 때만 print 해주기 떄문에 네모가 안나온다.
		reader.close();
	}
}
