package _2017_01_05;

public class AnimalEx {
	public static void main(String args[]) {
		Dog d = new Dog();
		System.out.println(d.name + "�� ���̴� " + d.age + "��");
		d.bark();
	}
}

class Animal {	// ���� Ŭ����
	String name;
	int age;
	public Animal() {
		this.name = "����";
		this.age = 0;
	}
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void bark() {
		System.out.println("���¢��");
	}
}


class Dog {  // ������
	protected String name;
	protected int age;
	
	public Dog() {
		this.name = "����";
		this.age = 3;
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void bark() {
		System.out.println("�۸�");
	}
}