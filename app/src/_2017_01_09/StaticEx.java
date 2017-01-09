package _2017_01_09;

/*
 * final :
	- class : 상속이 안됨
	- method : 재사용이 안됨
	- variable : 상수화 -> 보통 final static int ABC = 10;	// 상수에서 static 이랑 같이 쓴다. 
 
 * static :
 	- 객체 생성 없이 사용가능(정적메모리에 생성)

 	
 * abstract :
 	- class : 추상 클래스
 	- method : 추상 메소드
 */
	
final class Test {
	public final void methodA() {
	}
}

class Test2 {
	public void methodB() {
		System.out.println("오호");
	}
}

public class StaticEx {
//	public static int a = 10;
//	public static void a() {
//	}
	public final static int A = 10;
	//final static int B = 10;
	static final  int B = 10; // static final 두개의 위치는 상관없음
	public static void methodA() {
		System.out.println("methodA");	// System 클래스는 static 이다. out 은 static 변수
	}
	public void methodB() {
		System.out.println("오호2");
	}
	
	public static void main(String args[]){
		//StaticEx se = new StaticEx();    // 새로운 객체를 생성하지 않아도 사용가능 static
//		System.out.println(a); 
//		a(); // 메소드도 동일
	
		System.out.println(StaticEx.A); // 다른 클래스에 있을 때는 클래스. 으로 클래스의 이름을 명시
		System.out.println(B);
		methodA();	// this 나 super 는 static 영역에서는 쓸 수 없다.
		new StaticEx().methodB(); // 다이렉트로 동적영역할당
		new Test2().methodB();
	}
}
