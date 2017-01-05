package _2017_01_04;

/*     3     */

public class ClassEx_Creater {
	/* 멤버 필드 */
	int 나이;
	String name;
	/*			 */
	
	
	//생성자1
	public ClassEx_Creater() {	
		
		나이 = 15;
		name = "김개똥";
	}
	
	//생성자2
	public ClassEx_Creater(int age) {	
		
		나이 = age;
		name = "김개똥";
	}
	
	// 생성자3
	public ClassEx_Creater(int age, String name2) {	
					
		나이 = age;
		name = name2;
	}
	
	//생성자4
	public ClassEx_Creater(int age, String name2, int a) {	
		
		나이 = age;
		name = name2;
	}	

	
	/* 메소드 */
	public static void main(String args[]) {
		ClassEx_Creater object3 = new ClassEx_Creater(10, "홍길동");	// 생성자 3
		ClassEx_Creater object1 = new ClassEx_Creater();	// 생성자 1
		ClassEx_Creater object2 = new ClassEx_Creater(20);	// 생성자 2
		
		Object obj = object3;
		
		
		System.out.println("초기나이3 : " + object3.나이);
		System.out.println("초기나이1 : " + object1.나이);
		System.out.println("초기나이2 : " + object2.나이);
		System.out.println();
		System.out.println("초기이름1 : " + object1.name);
		System.out.println("초기이름2 : " + object2.name);
		System.out.println("초기이름3 : " + object3.name);
									
		object2.나이 = 100;
		
		System.out.println("변경된 나이 : " + object3.나이);
		System.out.println("초기이름 : " + object3.name);
									
		
		object2.name = "도깨비";
		
		System.out.println("변경된 이름 : " + object3.name);
	}
	/*		  */
}



















/*     2     */
//
//public class ClassEx_Creater {
//	/* 멤버 필드 */
//	int 나이;
//	String name;
//	/*			 */
//	
//	// 생성자
//	public ClassEx_Creater(int age, String name2) {	// 생성자의 역할 : 주로 객체 (멤버필드) 의 요소를 초기화 하는 용도로 사용한다.
//							// int age 는 매개 변수
//		나이 = age;
//		name = name2;
//	}	
//	// 생성자를 안쓰면 기본(디폴트) 생성자라고 해서 알아서 생성된다.
//	
//	/* 메소드 */
//	public static void main(String args[]) {
//		ClassEx_Creater object = new ClassEx_Creater(10, "홍길동");
//		System.out.println("초기나이 : " + object.나이);
//									  // 생성자의 이름과 동일  10, "홍길동"은  인자(아규먼트) 라고 한다. 여러개 가능
//		
//		object.나이 = 100;
//		
//		System.out.println("변경된 나이 : " + object.나이);
//		System.out.println("초기이름 : " + object.name);
//									 // object 안에 나이 와 name 이라는 속성의 데이터를 출력하겠다.
//		
//		object.name = "도깨비";
//		
//		System.out.println("변경된 이름 : " + object.name);
//	}
//	/*		  */
//}

/*
 	
  	* 클래스
  	- 객체를 정의해 놓은 것 -> 객체를 생성하기 위한 템플릿(template)
  	- 객체의 구성 및 생성에 쓰임
  	
  	* 객체
  	- 속성(특성)과 기능으로 구성
 	- 실생활에 존재하는 것들을 모두 표현함.
 	
 	* 객체지향이란 : 사물이나 개념을 "속성과 기능을 가진 객체" 로 모델링하고, 
 					이들간의 관계를 정의 함( Self-contained Comonent 스스로 존재하는 자 )
 	
 	* 자바에서의 객체지향 3단계
 		1) 객체 모델링 - 프로그래밍 하고자 하는 객체의 속성과 필요한 기능을 정리한다.
 		
 		2) 클래스 정의 - 객체를 실제로 사용하기 위해서, 클래스라는 형태로 객체를 표현한다.
 		
 		3) 객체 생성과 사용 - 정의 된 클래스를 이용해서, 메모리상에 객체(Object)를 생성하고, 사용한다.
  
  
	* 생성자(constructor)
	- 객체 지향 프로그래밍(OOP : objective-oriented programming) 에서 쓰이는 객체 초기화 함수.
	- 객체으 생성 시에만 호출되어 메모리 생성과 동시에 객체의 데이터를 초기화하는 역할을 함.
	
	- 특징
		1) 생성자의 이름은 클래스의 이름과 동일하게 사용.
		2) 오버로딩 (overloading) 가능함.
		3) 반환형을 사용하지 않음.
		4) 기본 생성자의 개념이 존재함.
		5) 멤버 변수 초기화 역할을 가짐.
		
		표현)
		- 클래스 :
		[접근제어자] class 클래스명 {
			변수, 생성자, 메소드를 정의함.
		}
		- 객체 :
		[참조형] 참조 변수명 = new [클래스명] ():
		ex)
			A a = new A ();
 
 */














/*     1     */

//public class ClassEx_Creater {
//	/* 멤버 필드 */
//	int 나이;
//	String name;
//	/*			 */
//	
//	// 생성자
//	public ClassEx_Creater() {	// 생성자의 역할 : 주로 객체 (멤버필드) 의 요소를 초기화 하는 용도로 사용한다.
//		나이 = 10;
//		name = "홍길동";
//	}	
//	// 생성자를 안쓰면 기본(디폴트) 생성자라고 해서 알아서 생성된다.
//	
//	/* 메소드 */
//	public static void main(String args[]) {
//		ClassEx_Creater object = new ClassEx_Creater();
//
//		System.out.println("나이 : " + object.나이);
//		System.out.println("이름 : " + object.name);
//
//	}
//	/*		  */
//}