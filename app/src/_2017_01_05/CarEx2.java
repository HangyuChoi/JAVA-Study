package _2017_01_05;

class Car2 {
	int wheel;
	int speed;
	String name;

	public Car2() { // ������ �⺻ ����
		name = "����";
		speed = 200; // Ŭ���� �ȿ� ���� �� ������ ��� ������� �Ѵ�. ��� ��� ��� ( �������� )
		wheel = 4;
	}

	public Car2(String name, int wheel) {
		this.name = name;
		this.wheel = wheel;
	}

	public Car2(String name, int speed, int wheel) {
		this.name = name;
		this.speed = speed;
		this.wheel = wheel;
	}

	public void setSpeed(int speed) {
		this.speed = speed; // this. �� ���� �� �ִ� �� ��ü
	}

	public int getSpeed() {
		return this.speed;
	}

	public void display() {
		System.out.println("���̸� : " + name + ", �ִ�ӵ� : " + speed + ", ������ : " + wheel);
	}

	public void display(String name, int speed, int wheel) {
		System.out.println("���̸� : " + this.name + ", �ִ�ӵ� : " + this.speed + ", ������ : " + wheel);
	}
}

public class CarEx2 {
	public static void main(String args[]) {
		Car2 myCar1 = new Car2();
		Car2 myCar2 = new Car2("�׷���", 4);
		Car2 myCar3 = new Car2("�ô��ҿ�", 100, 4);
		myCar1.display();
		myCar2.display();
		myCar3.display(myCar3.name, 200, 3); 	// myCar3.name : �ô��ҿ� ,
												// speel �� this.speed�̱� ������ ���⼭
												// ���� �ᵵ ������ ���� 100
												// wheel �� �������� wheel�̱� ������ ���⼭
												// ���� ���� ��� 3
		myCar1.setSpeed(myCar1.speed + 100);
		myCar1.display();
	}
}
