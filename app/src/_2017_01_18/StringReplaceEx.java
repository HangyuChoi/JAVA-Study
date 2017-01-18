package _2017_01_18;

public class StringReplaceEx {
	// 문자 바꾸기 
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "java");
		String newChar = oldStr.replace('다', '까');
		String newStr2 = oldStr.replaceAll("자바", "JAVA");
		
		// replace 와 replaceAll 은 오버로드 되어있어서 같은 기능을 지원한다.
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println(newChar);
		System.out.println(newStr2);
	}

}
