package _2017_01_04;

import java.util.Scanner;

// ( �޼ҵ� ���)
public class MethodEx2_GuGuDan2 {
	
	static boolean result = true;
	
	void b () {
		//������ ����ǥ��
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * "+ i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		//������ ����ǥ��
		/*for (int i = 2; i < 10; i++) {
			for (int j = 1; j <10; j++) {
				System.out.println(i + " * "+ j + " = " + (i * j));
			}
			System.out.println();
		}*/
	}
	public void a (int dan) {
		if (dan == 0) {
			result = false;
			return;		// break ó�� ���
		} else if (dan == 1) {
			MethodEx2_GuGuDan2 me = new MethodEx2_GuGuDan2();
			me.b();
		} else {
			System.out.println(dan +" ��");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * "+ i + " = " + (dan * i));
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		MethodEx2_GuGuDan2 me = new MethodEx2_GuGuDan2();
		
		while(result) {
			System.out.println("0 : ���� / 1 : ��ü���� ( 2 ~ 9 )");
			System.out.print("�� �� �ҷ�? : ");
			int input = sc.nextInt();
			System.out.println();
			me.a(input);
		}
		System.out.println("���α׷� ����!");
	}
}


