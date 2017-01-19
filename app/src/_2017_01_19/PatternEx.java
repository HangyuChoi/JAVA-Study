package _2017_01_19;

import java.util.regex.Pattern;

public class PatternEx {
	public static void main(String args[]) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
				//영문 혹은 숫자 @영문 혹은 숫자 .영문 혹은 숫자( 영문 혹은 숫자가 들어올 수도 있고 안들어 올 수도 있다. )
		//data = "angel@naver.co.kr"; // 일치
		//data = "angel@naver.com"; // 일치
		data = "angel@navercom"; // 불 일치
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

	}

}
