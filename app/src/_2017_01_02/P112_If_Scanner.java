package _2017_01_02;
import java.util.Scanner;

public class P112_If_Scanner {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력하세요 : ");
		String id = sc.next();
		System.out.print("PW를 입력하세요 : ");
		String pw = sc.next();
		/* == : 대상의 주소값을 비교 (수치비교), equals : 대상의 내용자체를 비교 */
		if (id.equals("root")) {
			if (pw.equals("0000")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("암호 틀림(실패)");
			}
		} else {
			System.out.println("아이디 틀림(실패)");
		}
	}
}
		/********************************************************/

		// Scanner sc = new Scanner(System.in);
		// for 문
		// int i;
		// for(i=0; i<3; i++){
		// System.out.print("점수입력 : ");
		// int score = sc.nextInt();
		//
		// if (score >= 0 && score < 61) {
		// System.out.println("입력한 점수 : " + score + " 당신은 C 등급입니다.");
		// } else if (score <= 81) {
		// System.out.println("입력한 점수 : " + score + " 당신은 B 등급입니다.");
		// } else if (score <= 100) {
		// System.out.println("입력한 점수 : " + score + " 당신은 A 등급입니다.");
		// } else {
		// System.out.println("0~100의 범위를 초과하였습니다. 당신이 입력한 점수 : " + score);
		// }
		// }

		// while 문
		// while(true){
		// System.out.print("점수입력 : ");
		// int score = sc.nextInt();
		//
		// if (score >= 0 && score < 61) {
		// System.out.println("입력한 점수 : " + score + " 당신은 C 등급입니다.");
		// } else if (score <= 81) {
		// System.out.println("입력한 점수 : " + score + " 당신은 B 등급입니다.");
		// } else if (score <= 100) {
		// System.out.println("입력한 점수 : " + score + " 당신은 A 등급입니다.");
		// } else{
		// System.out.println("0~100의 범위를 초과하였습니다. 당신이 입력한 점수 : " + score);
		// return;
		// }
		// }

		/********************************************************/

		// int score = 30;
		// int score = 70;
		// if(score > 50 && score < 81) {
		// System.out.println("실행구문1");
		// } else if(score < 91) {
		// System.out.println("실행구문2");
		// }

		/********************************************************/
		// > Run > Run Configurations > Arguments
		// int 형
		/*
		 * int su1 = Integer.parseInt(args[0]); int su2 =
		 * Integer.parseInt(args[1]); if(su1 == 10) { if(su2 == 20) {
		 * System.out.println("로그인 성공"); } else {
		 * System.out.println("암호 틀림(실패)"); } } else {
		 * System.out.println("아이디 틀림(실패)"); }
		 */

		// 입력받아 if문 제어하기 Scanner 는 1.6 버전부터 사용가
//		Scanner sc = new Scanner(System.in); // Ctrl + Shift + O
//		System.out.print("ID를 입력하세요 : ");
//		String id = sc.next();
//		System.out.print("PW를 입력하세요 : ");
//		String pw = sc.next();
//		/* == : 대상의 주소값을 비교 (수치비교), equals : 대상의 내용자체를 비교 */
//		if (id.equals("root")) {
//			if (pw.equals("0000")) {
//				System.out.println("★★★★★★★★★");
//				System.out.println("★ 로그인 성공 ★");
//				System.out.println("★★★★★★★★★");
//			} else {
//				System.out.println("암호 틀림(실패)");
//			}
//		} else {
//			System.out.println("아이디 틀림(실패)");
//		}
//	}
//}
