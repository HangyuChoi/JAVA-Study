package _2017_01_02;
public class P131_DowhileBreak_Ex {
	public static void main(String args[]) {
		// do-while_Break �� Ư���� �����ȿ��� break�� ���� ���������� ���
		int i = 0;
		boolean result = true;	// boolean Ÿ���� true OR false
		do {
			i++;
			if( result) {
			System.out.println("���౸�� : " + i);
				if( i == 5) {
					result = false;
				}
				if(! result) {
					System.out.println("���� ���� �����մϴ�.");
					break;	// break; �� if ���� �ƴϰ� if���� �����ϰ� �ִ� �ݺ����� ����������.
				}
			}else{
					System.out.println("i : " + i);
				}
		}while( i < 10);
	}
}


