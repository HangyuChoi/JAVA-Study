package _2017_01_25;

public class UsingThisEx {
	public static void main(String... args) { // �ٶ�׽� ���� Ÿ���� �ް������� �ٹ������� ����� ��	
		UsingThis usingThis = new UsingThis(); // inner class �� �ݵ�� ���� ���ΰ� �ִ� Ŭ������ �ν��Ͻ��� �����ؾ߸� ���� �� �� �ִ�.
		UsingThis.Inner inner = usingThis.new Inner(); // inner class �� �ν��Ͻ��� ���ؼ� �Ʒ� ����
		inner.method(); // ����
	}
}
