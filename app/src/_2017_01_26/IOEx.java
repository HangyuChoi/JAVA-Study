package _2017_01_26;

public class IOEx {
	// �� ���ڸ� ��, ��� �Ͻÿ�. Ex1)
	public static void main(String[] args) {
		System.out.print("�Է� : "); // 1�ڸ� ��, ���
		char ch = 'a';
		try {
			ch = (char) System.in.read();
		} catch (Exception e) {
			System.out.println("Exception : " + e.getMessage());
		}
		System.out.println("��� : " + ch);
	}

}
