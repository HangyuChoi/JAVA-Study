package _2017_01_05;

class Car {
	int wheel;
	int speed;
	String name;
	
	public Car() {			// 최초의 기본 정보
		name = "라프";		 
		speed = 200;		//	클래스 안에 정의 된 변수는 멤버 변수라고 한다.  멤버 멤버 멤버 ( 전역변수 )
		wheel = 4;			
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;					// this. 이 붙을 수 있는 건 객체
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void display() {
		System.out.println("차이름 : " + name + 
					   ", 최대속도 : " + speed +
					   ", 바퀴수 : " + wheel);
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
