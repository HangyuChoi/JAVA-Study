package _2017_01_24_Thread;

public class MainThreadEx {
	public static void main(String[] args) {
		Calculator calculator = new Calculator(); // 공통으로 사용 될 객체를 생성
		
		User1 user1 = new User1(); // User1 객체 생성
		user1.setCalculator(calculator); // user1 에 적용	User1 - setCalculator Method
		user1.start(); // User1 - run Method
		
		User2 user2 = new User2(); // User2 객체 생성
		user2.setCalculator(calculator); // user2 에 적용	User2 - setCalculator Method
		user2.start(); // User2 - run Method

	}
}
