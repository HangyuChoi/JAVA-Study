package _2017_01_18;

public class StringEqualsEx {
	public static void main(String args[]) {
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		String strVar3 = "�Ź�ö";
		System.out.println("String strVar1 = new String("+"�Ź�ö"+");");
		System.out.println("String strVar2 = "+"�Ź�ö"+"");
		System.out.println("String strVar3 = "+"�Ź�ö"+"");
		System.out.println();
		System.out.println("strVar1 == strVar2");
		if(strVar1 == strVar2) {
			System.out.println("���� String ��ü�� ����");
		} else {		
			System.out.println("�ٸ� String ��ü�� ����");
		}
		System.out.println();
		System.out.println("strVar1.equals(strVar2)");
		if(strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ��� ����");
		} else {		
			System.out.println("�ٸ� ���ڿ��� ����");
		}
		System.out.println();
		System.out.println("strVar2.equals(strVar3)");
		if(strVar2.equals(strVar3)) {
			System.out.println("���� ���ڿ��� ����");
		} else {		
			System.out.println("�ٸ� ���ڿ��� ����");
		}
		System.out.println();
		System.out.println("strVar2 == strVar3");
		if(strVar2 == strVar3) {
			System.out.println("���� String ��ü�� ����");
		} else {		
			System.out.println("�ٸ� String ��ü�� ����");
		}

	}

}
