package _2017_01_18;

public class StringIndexOfEx {
	// Ư�� ���ڿ��� index�� �����´�.
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if(subject.indexOf("�ڹ�") != -1) {	// -1 �� �������� �� �ٸ�, �ƴѰſ� ��� ( Ư�� ���� �ƴ� �� )
			System.out.println("�ڹٿ� ���õ� å�̱���");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
	}
}
