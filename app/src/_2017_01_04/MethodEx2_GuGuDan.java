package _2017_01_04;

import java.util.Scanner;

//응용문제 1)
		// 1. 구구단을 출력하시오. (메소드 사용)
		// ex) void guguDan(int dan)
public class MethodEx2_GuGuDan {
	static boolean result = true;
	
	void b () {
		//구구단 가로표현
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * "+ i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		//구구단 세로표현
		/*for (int i = 2; i < 10; i++) {
			for (int j = 1; j <10; j++) {
				System.out.println(i + " * "+ j + " = " + (i * j));
			}
			System.out.println();
		}*/
	}
	public void a () {
		Scanner sc = new Scanner(System.in);
		System.out.println("0 : 종료 / 1 : 전체보기 ( 2 ~ 9 )");
		System.out.print("몇 단 할래? : ");
		int dan = sc.nextInt();
		System.out.println();
		if (dan == 0) {
			result = false;
			return;		// break 처럼 사용
		} else if (dan == 1) {
			MethodEx2_GuGuDan me = new MethodEx2_GuGuDan();
			me.b();
		} else {
			System.out.println(dan +" 단");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * "+ i + " = " + (dan * i));
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		MethodEx2_GuGuDan me = new MethodEx2_GuGuDan();
		while(result) {
			me.a();
		}
		System.out.println("프로그램 종료!");
	}
}
