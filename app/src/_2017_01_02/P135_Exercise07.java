package _2017_01_02;
import java.util.Scanner;
public class P135_Exercise07 {
	public static void main(String args[]) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println(" 1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("����> ");
			int input = sc.nextInt();
			
			switch(input) {
			case 1 :
				System.out.print("���ݾ�> ");
				balance += sc.nextInt();
				break;
			case 2 :
				System.out.print("��ݾ�> ");
				balance -= sc.nextInt();
				break;
			case 3 :
				System.out.println("�ܰ�> " + balance + "\n");
				break;
			case 4 :
				run = false;
				break;
			} 			
		}
		System.out.println("���α׷� ����");
	}
}



// �������� ���԰� ������ ȥ������ ����!



/* ����Բ� */
/*switch(input) {
case 1 :
	System.out.print("���ݾ�> ");
	balance += sc.nextInt(); // �� balance �� �����ϱ� ���� ������ �Է� ���� ���� �ʰ� �ٷ� balance�� �־ �ȴ�. **
	break;
case 2 :
	System.out.print("��ݾ�> ");
	balance -= sc.nextInt();
	break;
case 3 :
	System.out.println("�ܰ�> " + balance + "\n");
	break;
case 4 :
	run = false;
	break;
} */		



/* ���� */
/*switch(input){
case 1 :
	System.out.print("���ݾ�> ");
	int a = sc.nextInt();
	balance += a;
	break;
case 2 :
	System.out.print("��ݾ�> ");
	int b = sc.nextInt();
	balance -= b;
	break;
case 3 :
	System.out.println("�ܰ�> " + balance + "\n");
	break;
case 4 :
	run = false;
	break;
} */