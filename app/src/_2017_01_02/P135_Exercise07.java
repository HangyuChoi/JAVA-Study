package _2017_01_02;
import java.util.Scanner;
public class P135_Exercise07 {
	public static void main(String args[]) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택> ");
			int input = sc.nextInt();
			
			switch(input) {
			case 1 :
				System.out.print("예금액> ");
				balance += sc.nextInt();
				break;
			case 2 :
				System.out.print("출금액> ");
				balance -= sc.nextInt();
				break;
			case 3 :
				System.out.println("잔고> " + balance + "\n");
				break;
			case 4 :
				run = false;
				break;
			} 			
		}
		System.out.println("프로그램 종료");
	}
}



// 변수에서 대입과 참조를 혼동하지 말자!



/* 강사님꺼 */
/*switch(input) {
case 1 :
	System.out.print("예금액> ");
	balance += sc.nextInt(); // ※ balance 도 변수니까 굳이 변수에 입력 값을 넣지 않고 바로 balance에 넣어도 된다. **
	break;
case 2 :
	System.out.print("출금액> ");
	balance -= sc.nextInt();
	break;
case 3 :
	System.out.println("잔고> " + balance + "\n");
	break;
case 4 :
	run = false;
	break;
} */		



/* 내꺼 */
/*switch(input){
case 1 :
	System.out.print("예금액> ");
	int a = sc.nextInt();
	balance += a;
	break;
case 2 :
	System.out.print("출금액> ");
	int b = sc.nextInt();
	balance -= b;
	break;
case 3 :
	System.out.println("잔고> " + balance + "\n");
	break;
case 4 :
	run = false;
	break;
} */