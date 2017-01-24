package _2017_01_24_Thread;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	public void run() { // ThreadStateEx 에서 먼저 여기로 온다. 
		while (true) {
			Thread.State state = targetThread.getState(); // targetThread 의 상태는 new. 방금 만들어진 상태
			System.out.println("타겟 스레드 상태  : " + state);
			if(state == Thread.State.NEW) {	// 최초의 상태라면
				targetThread.start(); // TargetThread 로 가자! -> TargetThread()
			}
			if(state == Thread.State.TERMINATED) { // 완료 전까지 계속 출력 끝나면 여기에 걸리고 break;
				break;
			}
			try {
				// 0.5초간 일시 정지
				Thread.sleep(500); // 1.5초간 기다리는 TargetThread 이기 때문에  완료한게 아니니까 다시위로 올라가서 상태 체크 New 는 아니니까 while문만 반복 TargetThread이 끝나면 
				// if(state == Thread.State.TERMINATED) 여기로 걸린다.
			} catch (Exception e) { }
		}
	}
}
