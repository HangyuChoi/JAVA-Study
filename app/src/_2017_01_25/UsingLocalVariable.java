package _2017_01_25;

public class UsingLocalVariable {
	void method(int arg) { // arg는 final 특성을 가짐
		int localVar = 40; // localVar는 final 특성을 가짐 7번 이전 버전은 final 을 써줘야 한다. final int
		// localVaar = 30; 사용 불가
		
		// 람다식
		MyFunctionalInterface fi = () -> {
			// 로컬변수 사용
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar + "\n");
		};
		fi.method();
	}
}
