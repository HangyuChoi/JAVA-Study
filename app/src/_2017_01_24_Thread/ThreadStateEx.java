package _2017_01_24_Thread;

public class ThreadStateEx {
	public static void main(String args[]) {
		// 작업을 수행하기 위한 statePrintThread 객체를 생성 그리고 이안에 Thread 생성    따라서 이건 스레드 안에 스레드 생성
		
		// 종속개념, 스레드 그룹이라는 개념으로 이해  종속의 개념에서 본다면: StatePrintThread가 없다면 TargetThread 도 없다.
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		// 먼저 new TargetThread()가 생성되었으니 일단 TargetThread 으로 간다.
		// 그리고나서 new StatePrintThread()가 생성되고 아래 statePrintThread.start() 실행 -> StatePrintThread 로 간다!
		statePrintThread.start();	
	}
}
