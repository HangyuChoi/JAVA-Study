package _2017_01_04;

import java.util.Scanner;

// �Է��� �μ� �������� ¦�� �� Ȧ�� ������ ���� ���Ͻÿ� ( �޼ҵ带 ���� ǥ�� )
public class MethodEx4 {
	
	// ¦��
	int a(int num1, int num2){
		int sum = 0;
		System.out.println();
		System.out.print("¦�� : ");
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.print(i +" ");
				sum += i;	
			}
		}
		System.out.println();
		return sum;
	}
	
	// Ȧ�� void ���
	void b(int a, int b){
		int sum = 0;
		System.out.print("Ȧ�� : ");
		for(int i = a; i <= b; i++) {
			if(i % 2 != 0) {
				System.out.print(i +" ");
				sum += i;
			}
		}
		System.out.println();
		System.out.print("Ȧ�� �հ� : " + sum);
	}
	
	public static void main(String args[]) {
		MethodEx4 me = new MethodEx4();
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �Է� : ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		int one,two;
		
		if (input1 > input2){
			one = input2;
			two = input1;
		} else {
			one = input1;
			two = input2;
		}
		
		int result = me.a(one, two);
		System.out.print("¦�� �հ� : " + result +"\n\n");
		me.b(one, two);
		
	}
}
