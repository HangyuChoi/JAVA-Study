package _2017_01_24_Thread;

// 동기화 처리 예제
public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
			// 여기에만 써도 됨
	public /*synchronized*/ void setMemory(int memory) {
		// 공유 객체인 Calculator의 참조(잠금 대상)
		synchronized(this) { // 이걸 쓰면 먼저 시작된 Thread가 끝날 때 까지 기다렸다가 두번째 Thread가 실행 된디. 메모리 공유 안함
		// 여기에 써서 가로로 묶어도 됨	
		this.memory = memory;  // memory 가 멤버 필드에 저장 된다.
		// 두 Thread 간의 setMemory 호출 시 먼저 접근한 Thread의 setMemory가 세팅 된다.
		// User2 Thread가 빠르면 memory = 50 / User1 Thread가 빠르면 memory = 100;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { }
		// Thread 이름 출력 과 사용하는 메모리 출력
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		} 
	}
}
