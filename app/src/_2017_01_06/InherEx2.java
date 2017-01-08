package _2017_01_06;


// B에 대한 superclass 
class C {
	public C() {
		// 여기는 상속구조가 없기에 super(); 가 없다.
		System.out.println("Constructor C");
	}
	int num = 10;
	String msg = "msg...";
	public void method() {
		System.out.println("Method " + num);
	}
	public void method_C() {
		System.out.println("Method_C " + msg);
	}
}

// C에 대한 subclass B
// A에 대한 superclass 
class B extends C {
	public B() {
		//super();
		System.out.println("Constructor B");
	}
	int num = 50;
	
	public void method() {
		super.method_C();
		this.method_C();
		System.out.println("method " + num);
	}
	public void method_B() {
		System.out.println("Method_B " + msg);
	}
}

// B에 대한 superclass A
class A extends B {
	public A() {
		// 여기에는 super(); 가 숨겨져 있다. 은닉
		//super().super();  두번 연속해서 쓸 수 없다. super 랑 this 안됨
		System.out.println("Constructor A");
	}
	public void method() {	// A,B,C 모두 method() 가 있다. 오버라이드를 통해 C B A 순으로 재정의 된다.
		//System.out.println("method " + super.super.num);
	}
	public void method_A() {
		System.out.println("Method_A " + msg);
	}
}

public class InherEx2 {
	public static void main(String args[]) {
		A a = new A();	// A 클래스 객체 생성
		B b = a;		// 자동 형 변환, 자식 -> 부모
		C c = b;		// 자동 형 변환, 자식 -> 부모
		a.method();		// 재정의 된 A 의 method(); 실행   한번 재정의가 일어나면 원래의 기능으로 돌아갈 수없다.
						// 따라서 b.method(); 나 c.method(); 를 해도 A의 method(); 가 실행
						// 하지만 super. 으로 접근하면 쓸 수 있다. ( 객체로써 )
		a.method_A();
		a.method_B();	// 상속받은 B의 메소드에 접근할 수 있다.
		a.method_C();	// 상속받은 C의 메소드에 접근할 수 있다.
		System.out.println(a.num);	// num의 경우 호출한 a 와 가까운 걸 쓴다. 멀리있는 c의 num은 은닉된다.
	}
}
