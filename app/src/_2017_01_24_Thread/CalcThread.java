package _2017_01_24_Thread;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	public void run() {
		for(int i = 0; i < 2000000000; i++) {
			// 20�� �� ��ȸ��
		}
		System.out.println(getName());
	}
}
