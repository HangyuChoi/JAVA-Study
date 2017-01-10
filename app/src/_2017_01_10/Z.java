package _2017_01_10;

class X {
	protected int i = 10;
	protected String msg = "I am an X.";
	
	public void print() {
		System.out.println(msg);
	}
	
	public void play() {
		System.out.println("Play.." + msg);
	}
}

class Y extends X {
	protected int i = 20;
	protected String msg = "I am an Y.";
	
	public void print() {
		System.out.println(msg);
	}
}

public class Z extends Y {
	protected int i = 30;
	protected String msg = "I am a Z.";
	
	public void print() {
		System.out.println(msg);
	}
	
	public void play() {
		System.out.println("Play.." + msg);
	}
	
	public void doZ() {
		System.out.println("do something in Z.");
	}
	
	public void test(int i) {
		Z z = new Z();	//
		Y y = z;		//  자동 형 변환
		X x = z;
		//문제
						// 동일한 print(); 는 마지막으로 재정의 된 가장 하위 클래스의 print();로 통일된다.
		z.print();		// I am an Z.   세 개의 클래스 모두 print() 메서드가 있고 Z -> Y -> X 가 상속관계이기 때문에 가장 아래 Z의 print() 실행
		y.print();		// I am an Z.	세 개의 클래스 모두 print() 메서드가 있고 Z -> Y -> X 가 상속관계이기 때문에 가장 아래 Z의 print() 실행
		x.print();		// I am an Z.	세 개의 클래스 모두 print() 메서드가 있고 Z -> Y -> X 가 상속관계이기 때문에 가장 아래 Z의 print() 실행
		super.print();	// I am an Y.   Z 클래스의 부모 클래스 Y의 메서드 print() 실행
		play();			// Play...I am a Z.   현재 클래스 ( Z ) 의 play() 실행
		super.play();	// Play...I am a X.   play()가 있는 부모 클래스 중 Z 의 상위 클래스인 X 의 play() 실행
		
		//y.doZ();		// 호출하고자하는 Y 클래스보다 하위에 있는 Z 클래스의 doZ는 실행할 수 없다.
		//super.super.print();	// super는 두번 연속으로 못쓴다.
		
		// super 는 현재 위치에서 부모로 올라가며 가장 가까운 값을 갖게된다. 부모에 없으면 부모의 부모로 
		System.out.println("\ni = " + i);				// i = 15			매개변수 i
		System.out.println("this.i = " + this.i);		// this.i = 30		현재 클래스 ( Z )의 정의된 i		
		System.out.println("super.i = " + super.i);	// super.i = 20;    현재 클래스 ( Z )의 부모 클래스 ( Y ) i  슈퍼로 쓰는거는 그냥 걜 쓰는거다
		System.out.println("y.i = " + y.i);				// y.i = 20		오버쉐도우 = y에 있는 부모의 x가 은닉된다.
		System.out.println("x.i = " + x.i);				// x.i = 10
		System.out.println("((Y)this).i = " + ((Y)this).i);	// ((Y)this).i = 20
		System.out.println("((X)this).i = " + ((X)this).i);	// ((X)this).i = 10
		
		//super.super.i = 10;	// super는 두번 연속으로 못쓴다.
		
	}
	
	public static void main(String[] args) {
		Z z = new Z();
		z.test(15);		// test 메서드에 매개변수 i <- 15 
	}

}
