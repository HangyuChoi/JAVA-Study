package _2017_01_18;

public class StringReplaceEx {
	// ���� �ٲٱ� 
	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "java");
		String newChar = oldStr.replace('��', '��');
		String newStr2 = oldStr.replaceAll("�ڹ�", "JAVA");
		
		// replace �� replaceAll �� �����ε� �Ǿ��־ ���� ����� �����Ѵ�.
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println(newChar);
		System.out.println(newStr2);
	}

}
