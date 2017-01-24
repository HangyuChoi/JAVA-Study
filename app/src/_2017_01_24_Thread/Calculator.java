package _2017_01_24_Thread;

// ����ȭ ó�� ����
public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
			// ���⿡�� �ᵵ ��
	public /*synchronized*/ void setMemory(int memory) {
		// ���� ��ü�� Calculator�� ����(��� ���)
		synchronized(this) { // �̰� ���� ���� ���۵� Thread�� ���� �� ���� ��ٷȴٰ� �ι�° Thread�� ���� �ȵ�. �޸� ���� ����
		// ���⿡ �Ἥ ���η� ��� ��	
		this.memory = memory;  // memory �� ��� �ʵ忡 ���� �ȴ�.
		// �� Thread ���� setMemory ȣ�� �� ���� ������ Thread�� setMemory�� ���� �ȴ�.
		// User2 Thread�� ������ memory = 50 / User1 Thread�� ������ memory = 100;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { }
		// Thread �̸� ��� �� ����ϴ� �޸� ���
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		} 
	}
}
