package _2017_01_06;

// ����
abstract class Animal {
	String name;
	int age;
	
	public Animal() {	// ���� ������ Monkey Ŭ������ ���� �ۼ�
		
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	abstract void bark();
}

// ���� - ������
class Monkey extends Animal {
	String name;
	int age;
	public Monkey() {	// ��������
		name = "������";
		age = 10;
	}
	public void bark() {
		System.out.println("��ŰŰ!!");
	}
}

// ���� - �����
class Cat extends Animal {		// �Ű����� �޾Ƽ� ����, ���� Ŭ���� ���
	public Cat(String name, int age) {
		super(name, age);
	}
	public void bark() {
		System.out.println("�߿�~");
	}
}

// ���� - ��
class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}
	public void bark() {
		System.out.println("�۸�-");
	}
}

// ����
abstract class Food {
	String name;
	String content;
	
	public Food() {	// ���� ������ Dogfeed Ŭ������ ���� �ۼ�
		
	}
	
	public Food (String name, String content) {
		this.name = name;
		this.content = content;
	}
	public abstract void eat();
}

// ���� - ����
class Fish extends Food {
	public Fish (String name, String content) {
		super(name, content);
	}
	public void eat() {
		System.out.println(name +"�� �Ծ��.");
	}
}

//���� - �ٳ���
class Banana extends Food {
	public Banana (String name, String content) {
		super(name, content);
	}
	public void eat() {
		System.out.println(name +"�� �Ծ��.");
	}
}

//���� - �����
class Dogfeed extends Food {
	String name;
	String content;
	public Dogfeed () {
		name = "���";
		content = "����������";
	}
	public void eat() {
		System.out.println(name +"�� �Ծ��.");
	}
}

public class Animal_Constructor {
	public static void main(String args[]) {
		
		Monkey monkey = new Monkey();
		Cat cat = new Cat("�����", 3);
		Dog dog = new Dog("������", 7);
		Banana banana = new Banana("�ٳ���", "������ ����");
		Fish fish = new Fish("����","����� ����");
		Dogfeed dogfeed = new Dogfeed();
		
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
