package _2017_01_05;

public class ConstructorEx1 {

	// 기본 생성자를 정의 해야 할 경우
	ConstructorEx1() {
		
	}
	
	// 오버로드
	ConstructorEx1(int a) {
		
	}
	
	// 오버로드
	ConstructorEx1(int a, String s) {
		
	}
	
	public static void main(String[] args) {
		new ConstructorEx1();
		new ConstructorEx1(10);
		new ConstructorEx1(10, "A");
	}
}
