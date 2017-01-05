//package _2017_01_04;
//public class MethodEx1 {
//	public int intA(){
//		int num = 10;
//		System.out.println("intA 메소드 실행");
//		return num;
//	}
//	
//	public void intB(){
//		System.out.println("intB 메소드 실행");
//	}
//	
//	 public static void main(String args[]){ 
//		 MethodEx1 method = new MethodEx1();
//		 method.intA();
//		 method.intB();
//		  
//	 }
//}


//package _2017_01_04;
//public class MethodEx1 {
//	public int intSum(int su1, int su2){
//		int sum = su1 + su2;
//		return sum;
//	}
//	
//	public void intB(){
//		System.out.println("intB 메소드 실행");
//	}
//	
//	 public static void main(String args[]){ 
//		 MethodEx1 method = new MethodEx1();
//		 int result = method.intSum(10, 20);	
//		 method.intB();
//		 System.out.println("결과 : " + result); 
//	 }
//}




// MethodEx1 는 클래스
// intSum 은 메소드
// int su1, int su2 는 매개변수
// 메소드명, 매개변수 갯수, 매개변수 타입  삼박자가 촥촥촥 돼야 됨 !!














/************************************************************************/

//package _2017_01_04;
/* - [접근제어자] [수정자] [반환형] 메소드 명 (인자들) {
	실행 구문 (구현);
}

* 접근 제어자(Modifiers) : private, default(friendly), protected, public
* 
* 수정자 : static, final, abstract, native ...
* 반환형(return type) :
*    - 자바 데이터 자료형(기본형, 참조형) 전부 사용할 수 있다.
*    - void : 반환형이 없는 메소드 정의 시 사용.
* 메소드명 : 식별자로 임의의 이름 정의.
* 인자(Arguments) : 매개 변수라고 하며 메소드 호출시 데이터를 전달하기 위한 용도로 사용함.
* 
표현- 1)
	public int intA () {
		구현;
		return n;	// n -> int 기본 자료형에 맞는 데이터 반환
	}
표현- 2)
	public void intB(int a, ...) {
		구현;
		// return 구문을 사용하지 않음.
	}

*/

//public class MethodEx1 {
//	void a() {
//		System.out.println("A");
//		if(1 < 2) {
//			return;		// break 와 같은 목적으로 사용
//		}
//		System.out.println("B");
//		
//	}
//	
//	int b() {
//		System.out.println("A");
//		if(1 < 2) {
//			return 1;
//		}
//		System.out.println("B");
//		
//		return 0;
//	}
	
//	 public static void main(String args[]){
		 // 객체 : 속성(특성)과 기능으로 구성.
		 // 따라서 메소드를 사용함에 있어 객체는 무조건 만들어줘야함.
		  
//	 }
	// void main(String args[]){
		// void main(){ // 최소한의 필수 요소
		/*int main(){
			int a = 10;
			return a;
		}*/
		
		/*int main(int su1) {
			int su2 = 10;
			int sum = su1 + su2;
			return sum;
		}*/
//}