package _2017_01_25;

public class UsingLocalVariable {
	void method(int arg) { // arg�� final Ư���� ����
		int localVar = 40; // localVar�� final Ư���� ���� 7�� ���� ������ final �� ����� �Ѵ�. final int
		// localVaar = 30; ��� �Ұ�
		
		// ���ٽ�
		MyFunctionalInterface fi = () -> {
			// ���ú��� ���
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar + "\n");
		};
		fi.method();
	}
}
