package _2017_01_24_Thread;

public class MainThreadEx {
	public static void main(String[] args) {
		Calculator calculator = new Calculator(); // �������� ��� �� ��ü�� ����
		
		User1 user1 = new User1(); // User1 ��ü ����
		user1.setCalculator(calculator); // user1 �� ����	User1 - setCalculator Method
		user1.start(); // User1 - run Method
		
		User2 user2 = new User2(); // User2 ��ü ����
		user2.setCalculator(calculator); // user2 �� ����	User2 - setCalculator Method
		user2.start(); // User2 - run Method

	}
}
