package _2017_01_02;
public class P120_For {
	public static void main(String args[]) {
		int sum = 0;
		int j = 0;
		int a = 0;
		for(int i = 1; i <=100; i++){
			sum += i; // �� �հ�
			if(i % 2 == 0 ){
				j = j+1; // ¦�� ����
				System.out.println("¦�� : " + i);
				a += i; // ¦�� ��
			}
		}
		System.out.println("-------------");
		System.out.println("¦�� ���� : " + j);
		System.out.println("¦�� �հ� : " + a);
		System.out.println("�� �հ� : " + sum);
	}
}



//class �� �׻� ù���ڴ� �빮�ڷ� �̰��� ���ʴ�.
//int sum =0;
//for(int i = 0; i <=100; i++){
//	sum = sum + i;
//}
//System.out.println("�հ� : "+sum);	// 5050

/**********************************************************/	
	
	// For�� Ex_2
			/*public static void main(String args[]) {
				for(int i = 1; i <=10; i++){
					System.out.println(i);
				}
			}*/
	
/**********************************************************/
	
	// For�� Ex_3
			/*public static void main(String args[]) {
				int sum = 0;
				for(int i = 1; i <=100; i++){
					sum += i; 
				}
				System.out.println(sum);
			}*/
	
/**********************************************************/
	
	// For�� Ex_4
			/*public static void main(String args[]) {
				for(int i = 0; i < 3; i++){
					System.out.println("i : " + i); 
				}
			}*/
/**********************************************************/
	// For�� Ex_4
//			public static void main(String args[]) {
//				int sum = 0;
//				for(int i = 1; i <=100; i++){
//					sum += i;
//					System.out.println("Sum +" + i + " = " +sum); // + : ���� ������ (���ڷ� �ν�) ����  ����� 11�� �ȴ�. 
//				}
//				System.out.println("Sum : " + sum);
//			}
	
	// ���� : 1~100������ �� �� ���� ������ ¦���� ���Ͻÿ�. 
//	public static void main(String args[]) {
//		int sum = 0;
//		int j = 0;
//		int a = 0;
//		for(int i = 1; i <=100; i++){
//			sum += i; // �� �հ�
//			if(i % 2 == 0 ){
//				j = j+1; // ¦�� ����
//				System.out.println("¦�� : " + i);
//				a += i; // ¦�� ��
//			}
//		}
//		System.out.println("-------------");
//		System.out.println("¦�� ���� : " + j);
//		System.out.println("¦�� �հ� : " + a);
//		System.out.println("�� �հ� : " + sum);
//	}
//}
