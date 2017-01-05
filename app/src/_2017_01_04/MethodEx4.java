package _2017_01_04;

import java.util.Scanner;

// 입력한 두수 범위에서 짝수 와 홀수 각각의 합을 구하시오 ( 메소드를 각각 표현 )
public class MethodEx4 {
	
	// 짝수
	int a(int num1, int num2){
		int sum = 0;
		System.out.println();
		System.out.print("짝수 : ");
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				System.out.print(i +" ");
				sum += i;	
			}
		}
		System.out.println();
		return sum;
	}
	
	// 홀수 void 사용
	void b(int a, int b){
		int sum = 0;
		System.out.print("홀수 : ");
		for(int i = a; i <= b; i++) {
			if(i % 2 != 0) {
				System.out.print(i +" ");
				sum += i;
			}
		}
		System.out.println();
		System.out.print("홀수 합계 : " + sum);
	}
	
	public static void main(String args[]) {
		MethodEx4 me = new MethodEx4();
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수 입력 : ");
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
		System.out.print("짝수 합계 : " + result +"\n\n");
		me.b(one, two);
		
	}
}
