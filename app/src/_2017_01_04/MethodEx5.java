package _2017_01_04;

import java.util.Scanner;

// 배열을 사용해서 배열 내의 값을 구구단으로 표현 ( Arguments 사용 )
public class MethodEx5 {
	
	void a (int[] result) {
		// 구구단 가로
		for (int i = 0; i < result.length; i++){
			System.out.print(result[i] + "단\t\t");
		}
		System.out.println();
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[j] + " * " + i + " = " + ( result[j] * i ) + "\t");
			}
			System.out.println();
		}	
		// 구구단 세로
		/*for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] + " 단");
			for (int j = 1; j < 10; j++){
				System.out.println(result[i] + " * " + j + " = " + ( result[i] * j ));
			}
			System.out.println();
		}*/
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : "); 
		int input = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		System.out.println();
		int[] arr = {input, input2, input3};
		
		MethodEx5 me = new MethodEx5();
		me.a(arr);
	}
}
