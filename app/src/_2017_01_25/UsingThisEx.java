package _2017_01_25;

public class UsingThisEx {
	public static void main(String... args) { // 바라그스 같은 타입의 메개변수를 다발적으로 사용할 때	
		UsingThis usingThis = new UsingThis(); // inner class 는 반드시 밖을 감싸고 있는 클래스의 인스턴스를 포함해야만 접근 할 수 있다.
		UsingThis.Inner inner = usingThis.new Inner(); // inner class 의 인스턴스를 통해서 아래 실행
		inner.method(); // 실행
	}
}
