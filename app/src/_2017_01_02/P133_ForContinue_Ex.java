package _2017_01_02;
public class P133_ForContinue_Ex {
	public static void main(String[] args) {
		int count = 0;
		for ( int i = 0; i < 10; i++ ){
			System.out.println("�ݺ� ���๮");
			count++;
				if( count > 4 ) {
					continue;	// ������ �¾� ����Ǹ� if���� ���������� �ݺ����� ó������ ���ư�
								// Ķ���� ���� �� ����
				}
				System.out.println("�ݺ� ���� ����");
		}
		// 1.5 (5.0) ���� for ��
		// ������ a b c d ef 
		for(String str : args ) {
			System.out.println(str);
		}	
	}
}


