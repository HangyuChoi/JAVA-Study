package _2017_01_05;

class Car {
	int wheel;
	int speed;
	String name;
	
	public Car() {			// ������ �⺻ ����
		name = "����";		 
		speed = 200;		//	Ŭ���� �ȿ� ���� �� ������ ��� ������� �Ѵ�.  ��� ��� ��� ( �������� )
		wheel = 4;			
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;					// this. �� ���� �� �ִ� �� ��ü
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void display() {
		System.out.println("���̸� : " + name + 
					   ", �ִ�ӵ� : " + speed +
					   ", ������ : " + wheel);
	}
}

public class CarEx {
	public static void main(String args[]) {
		Car car = new Car();
		car.display();
		car.setSpeed(car.speed + 100);
		car.display();
	}
}	
