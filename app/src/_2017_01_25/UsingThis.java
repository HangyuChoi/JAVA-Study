package _2017_01_25;

public class UsingThis {
	public int outterField = 10; // final �� ��� �������� ��� ����
	// ���� Ŭ����
	class Inner {
		int innerField = 20;
		void method() {
			outterField = 20; // �޼��� ������ ��밡���ѵ�, ���� �͸� Ŭ���������� �� �� ���� ǥ��
			// ���ٽ�
			MyFunctionalInterface fi = () -> {
				// outterField �� ���Ǵ� UsingThis Ŭ������ �ִµ�, ���� final �� �־�� �� �� �ִµ�,
				// ������ final�� �����Ǿ��ִ�.
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField + "\n");
				System.out.println("innerField : " + innerField);
				System.out.println("innerField : " + this.innerField + "\n");
			};
			fi.method();
		}
	}
}
