package _2017_01_24_Thread;

public class TargetThread extends Thread{
	public void run() { // StatePrintThread ���� ���� �ͼ� �۾��� ���� ���Ƶ��Ƶ���
		for(long i = 0; i < 1000000000; i++) { }
		
		try {
			// 1.5�ʰ� �Ͻ� ����
			Thread.sleep(1500);
		} catch (Exception e) { }
		for(long i = 0; i < 1000000000; i++) { }
	}
}
