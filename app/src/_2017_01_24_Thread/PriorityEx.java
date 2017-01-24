package _2017_01_24_Thread;

public class PriorityEx {
	public static void main(String args[]) {
		for(int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY); // 10의 우선순위를 최대로 
			}
			thread.start();	// thread10 이 가장 먼저 출력
		}
	}
}
