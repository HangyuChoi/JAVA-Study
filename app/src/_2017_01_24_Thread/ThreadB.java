package _2017_01_24_Thread;

public class ThreadB extends Thread{
	public void run(){
		for(int i=0; i<2; i++){
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
