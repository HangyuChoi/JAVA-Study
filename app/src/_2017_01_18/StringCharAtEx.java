package _2017_01_18;

public class StringCharAtEx {

	public static void main(String args[]) {
		System.out.println("charAt");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);	// 7��°�� ��ȯ ���Ѷ�. = 1
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("���� �Դϴ�.");
			break;
		case '2' :
		case '4' :
			System.out.println("���� �Դϴ�.");
			break;
		}
		System.out.println();
		System.out.println("substring");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		String ssn2 = "880815-1234567";
		
		String firstNum = ssn2.substring(0, 6); // ���� �� �� ����
		System.out.println(firstNum);
		
		String secondNum = ssn2.substring(7); // 7 ��° ���� ��ȯ
		System.out.println(secondNum);
	}
}
