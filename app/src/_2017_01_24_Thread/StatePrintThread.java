package _2017_01_24_Thread;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	public void run() { // ThreadStateEx ���� ���� ����� �´�. 
		while (true) {
			Thread.State state = targetThread.getState(); // targetThread �� ���´� new. ��� ������� ����
			System.out.println("Ÿ�� ������ ����  : " + state);
			if(state == Thread.State.NEW) {	// ������ ���¶��
				targetThread.start(); // TargetThread �� ����! -> TargetThread()
			}
			if(state == Thread.State.TERMINATED) { // �Ϸ� ������ ��� ��� ������ ���⿡ �ɸ��� break;
				break;
			}
			try {
				// 0.5�ʰ� �Ͻ� ����
				Thread.sleep(500); // 1.5�ʰ� ��ٸ��� TargetThread �̱� ������  �Ϸ��Ѱ� �ƴϴϱ� �ٽ����� �ö󰡼� ���� üũ New �� �ƴϴϱ� while���� �ݺ� TargetThread�� ������ 
				// if(state == Thread.State.TERMINATED) ����� �ɸ���.
			} catch (Exception e) { }
		}
	}
}
