package _2017_01_24_Thread;

public class ThreadStateEx {
	public static void main(String args[]) {
		// �۾��� �����ϱ� ���� statePrintThread ��ü�� ���� �׸��� �̾ȿ� Thread ����    ���� �̰� ������ �ȿ� ������ ����
		
		// ���Ӱ���, ������ �׷��̶�� �������� ����  ������ ���信�� ���ٸ�: StatePrintThread�� ���ٸ� TargetThread �� ����.
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		// ���� new TargetThread()�� �����Ǿ����� �ϴ� TargetThread ���� ����.
		// �׸����� new StatePrintThread()�� �����ǰ� �Ʒ� statePrintThread.start() ���� -> StatePrintThread �� ����!
		statePrintThread.start();	
	}
}
