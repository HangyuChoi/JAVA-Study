package _2017_01_24_Thread;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
