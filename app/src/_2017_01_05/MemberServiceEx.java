package _2017_01_05;

import java.util.Scanner;

public class MemberServiceEx {

	public static void main(String args[]) {
		boolean select = true;
		
		MemberService memberService = new MemberService();
		Scanner sc = new Scanner(System.in);
		while(select) {
			System.out.print("1 : ȸ������ , 2 : �α��� ");
			int num = sc.nextInt();
			
			switch(num) {
				case 1 :
					System.out.print("�Ƶ� : ");
					String register_id = sc.next();
					System.out.print("�̸� : ");
					String register_name = sc.next();
					System.out.print("��й�ȣ : ");
					String register_pw = sc.next();
					memberService.register(register_id, register_name, register_pw);
					break;
				case 2 :
					System.out.print("�Ƶ� : ");
					String login_id = sc.next();
					System.out.print("��й�ȣ : ");
					String login_pw = sc.next();
					boolean result = memberService.login(login_id, login_pw);
					if(result) {
						System.out.println("�α��� �Ǿ����ϴ�.");
						memberService.logout("root");
					} else {
						System.out.println("id �Ǵ� pw�� �ùٸ��� �ʽ��ϴ�.");
					}
					break;
				default :
					break;
			}
		}		
	}
}
