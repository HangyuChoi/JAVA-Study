package _2017_01_02;
public class P124_For_Ex2 {
	public static void main(String args[]) {
		for(int k =2; k < 10; k++){
			System.out.print("   " + k + "�� \t\t");
		}
		System.out.println();
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print("   " + j + " * " + i + " = " + (j * i)+ " \t");
			}
			System.out.println();
		}
	}
}


/*   " �̰� ����ϰ� �������� \"  �� ǥ��    */

/*Scanner sc = new Scanner(System.in);

System.out.println("�� ������ �Է��ϼ��� ��");
System.out.print("�� ���� �����帱���? : ");
int dan = sc.nextInt();
System.out.println("");
System.out.println(dan + "�� �Դϴ�. \n");

for(int i = 1; i <= 9; i++) {
	System.out.println(dan + " * " + i + " = " + (dan * i));
}*/

// ������ ���� ���
/*for(int i = 2; i < 10; i++) {
	System.out.println(i + "��");
	for(int j = 1; j < 10; j++) {
		System.out.print("   " + i + " * " + j + " = " + (i * j)+ " \n");
	}
	System.out.println();
}*/

// ������ ���� ���
/*for(int k =2; k < 10; k++){
	System.out.print("   " + k + "�� \t\t");
}
System.out.println();
for(int i = 1; i < 10; i++) {
	for(int j = 2; j < 10; j++) {
		System.out.print("   " + j + " * " + i + " = " + (j * i)+ " \t");
	}
	System.out.println();
}*/