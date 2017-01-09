package _2017_01_06;

// 동물
abstract class Animal {
	String name;
	int age;
	
	public Animal() {	// 직접 정의할 Monkey 클래스를 위해 작성
		
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	abstract void bark();
}

// 동물 - 원숭이
class Monkey extends Animal {
	String name;
	int age;
	public Monkey() {	// 직접정의
		name = "원숭이";
		age = 10;
	}
	public void bark() {
		System.out.println("우키키!!");
	}
}

// 동물 - 고양이
class Cat extends Animal {		// 매개변수 받아서 정의, 상위 클래스 상속
	public Cat(String name, int age) {
		super(name, age);
	}
	public void bark() {
		System.out.println("야옹~");
	}
}

// 동물 - 개
class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}
	public void bark() {
		System.out.println("멍멍-");
	}
}

// 음식
abstract class Food {
	String name;
	String content;
	
	public Food() {	// 직접 정의할 Dogfeed 클래스를 위해 작성
		
	}
	
	public Food (String name, String content) {
		this.name = name;
		this.content = content;
	}
	public abstract void eat();
}

// 음식 - 생선
class Fish extends Food {
	public Fish (String name, String content) {
		super(name, content);
	}
	public void eat() {
		System.out.println(name +"를 먹어요.");
	}
}

//음식 - 바나나
class Banana extends Food {
	public Banana (String name, String content) {
		super(name, content);
	}
	public void eat() {
		System.out.println(name +"를 먹어요.");
	}
}

//음식 - 개사료
class Dogfeed extends Food {
	String name;
	String content;
	public Dogfeed () {
		name = "사료";
		content = "강아지먹이";
	}
	public void eat() {
		System.out.println(name +"를 먹어요.");
	}
}

public class Animal_Constructor {
	public static void main(String args[]) {
		
		Monkey monkey = new Monkey();
		Cat cat = new Cat("고양이", 3);
		Dog dog = new Dog("강아지", 7);
		Banana banana = new Banana("바나나", "원숭이 먹이");
		Fish fish = new Fish("생선","고양이 먹이");
		Dogfeed dogfeed = new Dogfeed();
		
		System.out.println(monkey.name +", 나이 : " + monkey.age + "살");
		monkey.bark();
		System.out.println("먹는거 : " + banana.name +", 설명 : " + banana.content);
		banana.eat();
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		System.out.println(cat.name +", 나이 : " + cat.age + "살");
		cat.bark();
		System.out.println("먹는거 : " + fish.name +", 설명 : " + fish.content);
		fish.eat();
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		System.out.println(dog.name +", 나이 : " + dog.age + "살");
		dog.bark();
		System.out.println("먹는거 : " + dogfeed.name +", 설명 : " + dogfeed.content);
		dogfeed.eat();
	}
}
