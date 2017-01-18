package _2017_01_18;

public class StringCharAtEx {

	public static void main(String args[]) {
		System.out.println("charAt");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);	// 7번째를 반환 시켜라. = 1
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("남자 입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("여자 입니다.");
			break;
		}
		System.out.println();
		System.out.println("substring");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		String ssn2 = "880815-1234567";
		
		String firstNum = ssn2.substring(0, 6); // 시작 과 끝 지정
		System.out.println(firstNum);
		
		String secondNum = ssn2.substring(7); // 7 번째 부터 반환
		System.out.println(secondNum);
	}
}
