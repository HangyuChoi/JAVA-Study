package _2017_01_24_Thread;

public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50); // 이 때 Calculator - setMemory Method 실행
	}
}
