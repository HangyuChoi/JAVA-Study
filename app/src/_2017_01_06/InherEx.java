package _2017_01_06;

/*
 * 상속(inheritance)
  - 상속이란 자식이 부모가 가지고 있는 재산이나 권력을 물려받는다는 의미.
  - 특정(자식) 클래스는 다른(부모) 클래스가 가지고 있는 모든 멤버변수나 멤버메소드를 사용할 수 있음.
  - 상속 관계에서 자식클래스의 객체를 생성 하였을 때 부모 클래스의 객체도 생성되어 짐.
  - 상속 관계 표현으로 extends keyword를 사용함.
  - 상속 관계 용어로 super, 상위, 부모 class 와 sub, 하위, 자식 class로 사용 함.
  - 상속의 개념에서 super와 this를 구분함.
  - 메서드를 재사용 할 수 있음. ( method override)
  - 단일 상속(자바에서는 다중 상속x)
  - extends 와 implements를 함계 사용할 수 있음.
  
  형식)
  class A extends B {
  	문장구현;
  }
 */

// 오버로드를 쓰는 이유는 
// ex) 자동차를 예로들어 자동차들을 클래스로 표현할 때, 그 차들이 같은 부품을 쓸수도있고, 다른 부품을 쓸 수도 있는데,
// 타이어를 예로들어 오버로드를 사용하여, 같은 부품을 그대로 상속받아 쓰거나, 다른부품은 기존 부품의 재사용을 통해 만들면 된다. 그래서 오버로드를 씀.

// 상속 사용
public class InherEx extends SuperClass {	// extends SuperClass 를 통해 SuperClass 의 있는걸 내꺼처럼 쓴다.
	//생성자
	int age = 1;
	int age2;
	public InherEx() {
		super(); // 이게 숨겨져 있다.  <- super 는 구문에서 최상단에 위치 해야한다.
		System.out.println("subClass " + this.age);	// 상속된 상태에서 this.객체요소는 가까운 내꺼부터 찾고 없으면 부모껄 사용
		System.out.println("subClass " + super.age);
	}
	
	public InherEx(int age) {
		System.out.println("subClass2");
	}
	
	public void methodA() {
		System.out.println("methodA");
	}
	
	public static void main(String[] args) {
		InherEx inder = new InherEx(); // 외부 SuperClass 상속
		//SuperClass sc = new SuperClass();
		System.out.println("age : " +inder.age);	// 은닉변수다. inder.age는 부모의 age를 가리고 내 age를 씀.
		System.out.println("name : " +inder.name);
		
		//4) 오버라이드 사용
		//sc.methodA();
		inder.methodA();
		
		
		// 형변환의 경우  기본타입의 형변환은 데이터 손실이 있을 수 있기 때문에 잘 안쓰지만, !! 객체타입에서는 데이터 손실이 없기 때문에 아주 많이 쓴다.
		// 형 변환	// 상속관계에 있을 때만 가능하다.
		SuperClass supercalss = inder;	// 자식 타입에서 큰 타입으로 자동으로 형 변환.
		//System.out.println(supercalss.age2); // 부모타입으로 변환 될 수는 있는데 age2는 부모에 없기 때문에 쓸 수없다.
		
		// 강제 형 변황 ( 명시적 형 변환 )
		InherEx inder2 = (InherEx) supercalss;	// 그래서 부모타입으로 변한 age2 를 쓰기 위해서는 다시 자식 타입으로 명시적 형 변환이 필요하다.
		System.out.println(inder2.age);	// 내꺼가 부모타입이네.. 그럼 다시 내 타입을 바꿔서 읽어야징징이
		
		// super() 사용
		// this() 사용
		// super.객체요소
		// this.객체요소
		
		/*
		 	1) 형 변환
		 	2) 캐스팅
		 	3) Object 형 변환
		 	4) 오버라이드 사용
		 	5) 은닉변수 사용
		 */
	}
}
class SuperClass {
	int age;
	String name;
	
	public void methodB() {
		System.out.println("methodA");
	}
	
	public SuperClass() {	// SuperClass 초기화
		System.out.println("superClass");
		age = 10;
		name = "홍길동";
	}
}	// 실행 순서 : SuperClass -> 생성자 -> main메소드


// 기존 거

/*public class IngerEx extends SuperClass {
	public static void main(String[] args) {
		SuperClass superclass = new SuperClass(); // 외부 SuperClass 연결
		System.out.println("age : " +superclass.age);
		System.out.println("name : " +superclass.name);
	}
}

class SuperClass {
	int age;
	String name;
	
	public SuperClass() {	// SuperClass 초기화
		age = 10;
		name = "홍길동";
	}
}*/