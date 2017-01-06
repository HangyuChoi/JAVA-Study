package _2017_01_05;

import java.util.Scanner;

public class MemberServiceEx {

	public static void main(String args[]) {
		boolean select = true;
		
		MemberService memberService = new MemberService();
		Scanner sc = new Scanner(System.in);
		while(select) {
			System.out.print("1 : 회원가입 , 2 : 로그인 ");
			int num = sc.nextInt();
			
			switch(num) {
				case 1 :
					System.out.print("아디 : ");
					String register_id = sc.next();
					System.out.print("이름 : ");
					String register_name = sc.next();
					System.out.print("비밀번호 : ");
					String register_pw = sc.next();
					memberService.register(register_id, register_name, register_pw);
					break;
				case 2 :
					System.out.print("아디 : ");
					String login_id = sc.next();
					System.out.print("비밀번호 : ");
					String login_pw = sc.next();
					boolean result = memberService.login(login_id, login_pw);
					if(result) {
						System.out.println("로그인 되었습니다.");
						memberService.logout("root");
					} else {
						System.out.println("id 또는 pw가 올바르지 않습니다.");
					}
					break;
				default :
					break;
			}
		}		
	}
}
