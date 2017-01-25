package _2017_01_25;

public class UsingThis {
	public int outterField = 10; // final 이 없어도 전역으로 사용 가능
	// 내부 클래스
	class Inner {
		int innerField = 20;
		void method() {
			outterField = 20; // 메서드 에서는 사용가능한데, 내부 익명 클래스에서는 쓸 수 없는 표현
			// 람다식
			MyFunctionalInterface fi = () -> {
				// outterField 의 정의는 UsingThis 클래스에 있는데, 원래 final 이 있어야 쓸 수 있는데,
				// 이제는 final이 생략되어있다.
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField + "\n");
				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField + "\n");
			};
			fi.method();
		}
	}
}
