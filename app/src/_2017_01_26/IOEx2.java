package _2017_01_26;

import java.io.IOException;

public class IOEx2 {
// ���ڸ� ��, ��� �Ͻÿ� Ex2)
	public static void main(String[] args) {
		int b = 0 , count = 0;
		try {
			b = System.in.read();
			while (b != 1) {
				System.out.print((char) b);
				count++;
				b = System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n byte InputStream Tese... total byte : " + count);

	}

}
