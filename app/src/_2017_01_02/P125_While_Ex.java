package _2017_01_02;
public class P125_While_Ex {
	public static void main(String args[]) {
		int i = 0;
		int sum = 0;
		System.out.print("Ȧ�� :");
		while (i < 100) {
			i++;
			if(i%2 == 1){
				sum += i;
				//sum = sum+i;
				System.out.print(" " + i);
			}
		}
		System.out.println("\nȦ���հ� : " + sum);
	}
}




// while �Թ�
/*int i = 0;
while (i < 10) {
	System.out.println("���๮ i : " +i);
	i++;
}*/

/******************************************/

// �ݺ�����
/*Scanner sc = new Scanner(System.in);
System.out.print("�ݺ����� : ");
int input = sc.nextInt();
int count = 0;
while (count < input) {
	count++;
	System.out.println("count : " + count);
}*/

/******************************************/

// 1~100������ Ȧ���� �� ���ϱ�
/*int i = 0;
int sum = 0;
System.out.print("Ȧ�� :");
while (i < 100) {
	i++;
	if(i%2 == 1){
		sum += i;
		//sum = sum+i;
		System.out.print(" " + i);
	}
}
System.out.println("\nȦ���հ� : " + sum);*/

/******************************************/