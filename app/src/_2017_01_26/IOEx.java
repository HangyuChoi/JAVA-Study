package _2017_01_26;

public class IOEx {
	// 한 문자를 입, 출력 하시오. Ex1)
	public static void main(String[] args) {
		System.out.print("입력 : "); // 1자만 입, 출력
		char ch = 'a';
		try {
			ch = (char) System.in.read();
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
		System.out.println("출력 : " + ch);
	}

}
