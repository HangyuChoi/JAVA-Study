package _2017_01_02;
import java.util.Scanner;

public class P116_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���α׷��� �����Ͻðڽ��ϱ�? (Y or N)");
		System.out.print("�Է��ϼ��� : ");
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



		// swutch �� 1.6���� ������ ���� ������(����Ÿ�Ը�����) 1.7�������� ��ü�� �� �� �ְ� �ƴ�.(���ڿ�)
		/*Scanner sc = new Scanner(System.in);
		System.out.println("����� ������ �����Դϱ�? (����, ����, ����)");
		System.out.print("�Է��ϼ��� : ");
		String i = sc.next();
		switch(i) {
		case "����":
			System.out.println("������� ������ 1000�����Դϴ�.");
			break; // ����
		case "����":
			System.out.println("������� ������ 700�����Դϴ�.");
			break; // ����
		case "����":
			System.out.println("������� ������ 500�����Դϴ�.");
			break; // ����
		default :
			System.out.println("����� ������ 300�����Դϴ�.");
			break;
		}*/
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���α׷��� �����Ͻðڽ��ϱ�? (Y or N)");
//		System.out.print("�Է��ϼ��� : ");
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
