package _2017_01_18;

public class StringIndexOfEx {
	// 특정 문자열의 index를 가져온다.
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {	// -1 은 부정적인 값 다른, 아닌거와 비슷 ( 특정 값이 아닐 때 )
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}
