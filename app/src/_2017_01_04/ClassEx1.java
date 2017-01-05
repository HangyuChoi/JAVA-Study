package _2017_01_04;
/*
  	 
 * */
public class ClassEx1 {

	int age;
	String name;
	
	public static void main(String args[]) {
		ClassEx1 object = new ClassEx1(); // 자동초기화 : 객체가 생성 되어지는 시점에 타입이 초기화 된다. ( 인스턴스 화 )
		// 같은 표현
//		ClassEx1 object2;
//		object2 = new ClassEx1();
		
		System.out.println("나이 : " + object.age);
		System.out.println("이름 : " + object.name);

	}
}
