package _2017_01_02;
import java.util.Scanner;

public class P116_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("프로그램을 종료하시겠습니까? (Y or N)");
		System.out.print("입력하세요 : ");
		String result = sc.next();
		switch(result) {
		case "Y":
		case "y":
			System.out.println("Yes!");
			break;
		case "N":
		case "n":
			System.out.println("No!");
			break;
		default :
			System.out.println("Wrong answer");
			break;
		}
	}
}



		// swutch 문 1.6버전 까지는 값이 제한적(정수타입만들어갔음) 1.7버전부터 객체가 들어갈 수 있게 됐다.(문자열)
		/*Scanner sc = new Scanner(System.in);
		System.out.println("당신의 직급은 무엇입니까? (사장, 부장, 과장)");
		System.out.print("입력하세요 : ");
		String i = sc.next();
		switch(i) {
		case "사장":
			System.out.println("사장님의 월급은 1000만원입니다.");
			break; // 선택
		case "부장":
			System.out.println("부장님의 월급은 700만원입니다.");
			break; // 선택
		case "과장":
			System.out.println("과장님의 월급은 500만원입니다.");
			break; // 선택
		default :
			System.out.println("당신의 월급은 300만원입니다.");
			break;
		}*/
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("프로그램을 종료하시겠습니까? (Y or N)");
//		System.out.print("입력하세요 : ");
//		String result = sc.next();
//		switch(result) {
//		case "Y":
//		case "y":
//			System.out.println("Yes!");
//			break;
//		case "N":
//		case "n":
//			System.out.println("No!");
//			break;
//		default :
//			System.out.println("Wrong answer");
//			break;
//		}
//	}
//}
