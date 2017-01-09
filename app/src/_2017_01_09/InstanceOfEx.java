package _2017_01_09;

interface Interface {}
	
class Parent implements Interface {
		int a = 10;
	}
	
class Child extends Parent {
		
	}

public class InstanceOfEx {
	public static void main(String args[]) {
		Child child = new Child();
		if(child instanceof Interface) {	// instanceof : 타입 비교
			System.out.println("child is instance of Interface.");
		}
		if(child instanceof Object) {
			System.out.println("child is instance of Object.");
		}
		if(child instanceof Parent) {
			System.out.println("child is instance of Parent.");
		}
		if(child instanceof Child) {
			System.out.println("child is instance of Child.");
		}
		System.out.println();
		
		// 잘못 사용한 예
		if(child instanceof Object) {	// 이렇게하면 오브젝트에서 다 걸려서 아래 if문이 실행이 안된다.
			System.out.println("child is instance of Object.");
		} else if(child instanceof Interface) {
			System.out.println("child is instance of Object.");
		} else if(child instanceof Parent) {
			System.out.println("child is instance of Parent.");
		} else if(child instanceof Child) {
			System.out.println("child is instance of Child.");
		}
	}
}
