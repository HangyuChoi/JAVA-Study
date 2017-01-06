package _2017_01_06;

// ����
class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String bark = "���¢��";
	public void bark() {
		System.out.println(bark);
	}
}

// ���� - ������
class Monkey extends Animal {
	public Monkey(String name, int age) {
		super(name, age);
	}
	String mbark = "��ŰŰ!!";
	public void bark() {
		System.out.println(bark +" : " + mbark);
	}
}

// ���� - �����
class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}
	String cbark = "�߿�~";
	public void bark() {
		System.out.println(bark +" : " + cbark);
	}
}

// ���� - ��
class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}
	String dbark = "�۸�-";
	public void bark() {
		System.out.println(bark +" : " + dbark);
	}
}

// ����
class Food {
	String name;
	String content;
	public Food (String name, String content) {
		this.name = name;
		this.content = content;
	}
	String eat = "�Ծ��.";
	public void eat() {
		System.out.println(eat);
	}
}

// ���� - ����
class Fish extends Food {
	public Fish (String name, String content) {
		super(name, content);
	}
	public void eat() {
		System.out.println(name +"�� " + eat);
	}
}

//���� - �ٳ���
class Banana extends Food {
	public Banana (String name, String content) {
		super(name, content);
	}
	public void eat() {
		System.out.println(name +"�� " + eat);
	}
}

//���� - �����
class Dogfeed extends Food {
	public Dogfeed (String name, String content) {
		super(name, content);
	}
	public void eat() {
		System.out.println(name +"�� " + eat);
	}
}

public class Animal_Constructor {
	public static void main(String args[]) {
		
//		String array[][] = {
//				{"�ٳ���", "������ ����"},
//				{"����","����� ����"},
//				{"���","������ ����"}
//		};
		Monkey monkey = new Monkey("������", 10);
		Cat cat = new Cat("�����", 3);
		Dog dog = new Dog("������", 7);
		Banana banana = new Banana("�ٳ���", "������ ����");
		Fish fish = new Fish("����","����� ����");
		Dogfeed dogfeed = new Dogfeed("���","������ ����");
		
		System.out.println(monkey.name +", ���� : " + monkey.age + "��");
		monkey.bark();
		System.out.println("�Դ°� : " + banana.name +", ���� : " + banana.content);
		banana.eat();
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		System.out.println(cat.name +", ���� : " + cat.age + "��");
		cat.bark();
		System.out.println("�Դ°� : " + fish.name +", ���� : " + fish.content);
		fish.eat();
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		System.out.println(dog.name +", ���� : " + dog.age + "��");
		dog.bark();
		System.out.println("�Դ°� : " + dogfeed.name +", ���� : " + dogfeed.content);
		dogfeed.eat();
	}
}
