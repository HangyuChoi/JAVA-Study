package _2017_01_09;

/*
	추상 (abstract)
	- 객체의 모호함을 class 로 표현하기위함.
	
	특징
	- class에 사용 시 추상 class의 의미(ex : abstract class).
	- 일반 메소드와 추상 메소드 사용 가능 함.
	- 객체를 생성 할 수 없음.
	- 상속관계에서 재정의 함.
	- 내부 익명 클래스(무명 anonymous class)로 객체생성 할 수는 있음.
	- 추상 메서드는 재정의(Override)하여 사용함. ( 반드시 강제적으로 )
	- 상속 시 extends keyword를 사용함.
	
	표현)
		abstract class A {	// abstract class에서는 abstract method를 쓸 수 있지만, 일반 class에서는 abstract 을 쓸 수 없다!
			int a;
			ex)	 abstract void setA(); // {} 없이 ; 로 그냥 간결하게! 몸통이 없으니까 무조건 나머지 상속클래스들이 몸통을 만들어줘야함
				 void setB();
		}
	
	사용)
		class B extends A {
			super class의 추상 메서드 재정의
		}
 */


abstract class Abs {
	int a = 10;
	
	public void setA() {
		System.out.println("일반적인 메서드 실행...");
	}
	
	public abstract int getA();
}

public class AbstrackEx extends Abs{
	// ex)
	public int getA() {
		System.out.println("추상 메서드 재정의...");
		return 100;
	}
	public static void main(String[] args) {
		// Abs a = new Abs(); 
		AbstrackEx abstractEx = new AbstrackEx();
		abstractEx.setA();
		abstractEx.getA();
		Abs abs = abstractEx;
		abs.setA();
		abs.getA();
	}
}
