package _2017_01_05;

public class AnimalEx {
	public static void main(String args[]) {
		Dog d = new Dog();
		System.out.println(d.name + "의 나이는 " + d.age + "살");
		d.bark();
	}
}

class Animal {	// 동물 클래스
	String name;
	int age;
	public Animal() {
		this.name = "동물";
		this.age = 0;
	}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void bark() {
		System.out.println("울부짖다");
	}
}


class Dog {  // 강아지
	protected String name;
	protected int age;
	
	public Dog() {
		this.name = "솜이";
		this.age = 3;
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void bark() {
		System.out.println("멍멍");
	}
}