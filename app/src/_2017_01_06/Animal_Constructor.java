package _2017_01_06;

// 동물
class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String bark = "울부짖다";
	public void bark() {
		System.out.println(bark);
	}
}

// 동물 - 원숭이
class Monkey extends Animal {
	public Monkey(String name, int age) {
		super(name, age);
	}
	String mbark = "우키키!!";
	public void bark() {
		System.out.println(bark +" : " + mbark);
	}
}

// 동물 - 고양이
class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}
	String cbark = "야옹~";
	public void bark() {
		System.out.println(bark +" : " + cbark);
	}
}

// 동물 - 개
class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}
	String dbark = "멍멍-";
	public void bark() {
		System.out.println(bark +" : " + dbark);
	}
}

// 음식
class Food {
	String name;
	String content;
	public Food (String name, String content) {
		this.name = name;
		this.content = content;
	}
	String eat = "먹어요.";
	public void eat() {
		System.out.println(eat);
	}
}

// 음식 - 생선
class Fish extends Food {
	public Fish (String name, String content) {
		super(name, content);
	}
	public void eat() {
		System.out.println(name +"를 " + eat);
	}
}

//음식 - 바나나
class Banana extends Food {
	public Banana (String name, String content) {
		super(name, content);
	}
	public void eat() {
		System.out.println(name +"를 " + eat);
	}
}

//음식 - 개사료
class Dogfeed extends Food {
	public Dogfeed (String name, String content) {
		super(name, content);
	}
	public void eat() {
		System.out.println(name +"를 " + eat);
	}
}

public class Animal_Constructor {
	public static void main(String args[]) {
		
//		String array[][] = {
//				{"바나나", "원숭이 먹이"},
//				{"생선","고양이 먹이"},
//				{"사료","강아지 먹이"}
//		};
		Monkey monkey = new Monkey("원숭이", 10);
		Cat cat = new Cat("고양이", 3);
		Dog dog = new Dog("강아지", 7);
		Banana banana = new Banana("바나나", "원숭이 먹이");
		Fish fish = new Fish("생선","고양이 먹이");
		Dogfeed dogfeed = new Dogfeed("사료","강아지 먹이");
		
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
