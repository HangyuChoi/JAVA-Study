package _2017_01_02;
import java.util.Scanner;

public class P112_If_Scanner {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("ID�� �Է��ϼ��� : ");
		String id = sc.next();
		System.out.print("PW�� �Է��ϼ��� : ");
		String pw = sc.next();
		/* == : ����� �ּҰ��� �� (��ġ��), equals : ����� ������ü�� �� */
		if (id.equals("root")) {
			if (pw.equals("0000")) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��ȣ Ʋ��(����)");
			}
		} else {
			System.out.println("���̵� Ʋ��(����)");
		}
	}
}
		/********************************************************/

		// Scanner sc = new Scanner(System.in);
		// for ��
		// int i;
		// for(i=0; i<3; i++){
		// System.out.print("�����Է� : ");
		// int score = sc.nextInt();
		//
		// if (score >= 0 && score < 61) {
		// System.out.println("�Է��� ���� : " + score + " ����� C ����Դϴ�.");
		// } else if (score <= 81) {
		// System.out.println("�Է��� ���� : " + score + " ����� B ����Դϴ�.");
		// } else if (score <= 100) {
		// System.out.println("�Է��� ���� : " + score + " ����� A ����Դϴ�.");
		// } else {
		// System.out.println("0~100�� ������ �ʰ��Ͽ����ϴ�. ����� �Է��� ���� : " + score);
		// }
		// }

		// while ��
		// while(true){
		// System.out.print("�����Է� : ");
		// int score = sc.nextInt();
		//
		// if (score >= 0 && score < 61) {
		// System.out.println("�Է��� ���� : " + score + " ����� C ����Դϴ�.");
		// } else if (score <= 81) {
		// System.out.println("�Է��� ���� : " + score + " ����� B ����Դϴ�.");
		// } else if (score <= 100) {
		// System.out.println("�Է��� ���� : " + score + " ����� A ����Դϴ�.");
		// } else{
		// System.out.println("0~100�� ������ �ʰ��Ͽ����ϴ�. ����� �Է��� ���� : " + score);
		// return;
		// }
		// }

		/********************************************************/

		// int score = 30;
		// int score = 70;
		// if(score > 50 && score < 81) {
		// System.out.println("���౸��1");
		// } else if(score < 91) {
		// System.out.println("���౸��2");
		// }

		/********************************************************/
		// > Run > Run Configurations > Arguments
		// int ��
		/*
		 * int su1 = Integer.parseInt(args[0]); int su2 =
		 * Integer.parseInt(args[1]); if(su1 == 10) { if(su2 == 20) {
		 * System.out.println("�α��� ����"); } else {
		 * System.out.println("��ȣ Ʋ��(����)"); } } else {
		 * System.out.println("���̵� Ʋ��(����)"); }
		 */

		// �Է¹޾� if�� �����ϱ� Scanner �� 1.6 �������� ��밡
//		Scanner sc = new Scanner(System.in); // Ctrl + Shift + O
//		System.out.print("ID�� �Է��ϼ��� : ");
//		String id = sc.next();
//		System.out.print("PW�� �Է��ϼ��� : ");
//		String pw = sc.next();
//		/* == : ����� �ּҰ��� �� (��ġ��), equals : ����� ������ü�� �� */
//		if (id.equals("root")) {
//			if (pw.equals("0000")) {
//				System.out.println("�ڡڡڡڡڡڡڡڡ�");
//				System.out.println("�� �α��� ���� ��");
//				System.out.println("�ڡڡڡڡڡڡڡڡ�");
//			} else {
//				System.out.println("��ȣ Ʋ��(����)");
//			}
//		} else {
//			System.out.println("���̵� Ʋ��(����)");
//		}
//	}
//}
