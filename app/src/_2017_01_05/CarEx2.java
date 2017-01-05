package _2017_01_05;

class Car2 {
	int wheel;
	int speed;
	String name;

	public Car2() { // 최초의 기본 정보
		name = "라프";
		speed = 200; // 클래스 안에 정의 된 변수는 멤버 변수라고 한다. 멤버 멤버 멤버 ( 전역변수 )
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
		this.speed = speed; // this. 이 붙을 수 있는 건 객체
	}

	public int getSpeed() {
		return this.speed;
	}

	public void display() {
		System.out.println("차이름 : " + name + ", 최대속도 : " + speed + ", 바퀴수 : " + wheel);
	}

	public void display(String name, int speed, int wheel) {
		System.out.println("차이름 : " + this.name + ", 최대속도 : " + this.speed + ", 바퀴수 : " + wheel);
	}
}

public class CarEx2 {
	public static void main(String args[]) {
		Car2 myCar1 = new Car2();
		Car2 myCar2 = new Car2("그랜져", 4);
		Car2 myCar3 = new Car2("올뉴소울", 100, 4);
		myCar1.display();
		myCar2.display();
		myCar3.display(myCar3.name, 200, 3); 	// myCar3.name : 올뉴소울 ,
												// speel 는 this.speed이기 때문에 여기서
												// 값을 써도 변하지 않음 100
												// wheel 은 지역변수 wheel이기 때문에 여기서
												// 쓰는 값이 출력 3
		myCar1.setSpeed(myCar1.speed + 100);
		myCar1.display();
	}
}
