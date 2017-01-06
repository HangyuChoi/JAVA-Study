package _2017_01_05;

public class MemberService {
	public 	Member member;
	public MemberService() {
		// 회원가입
		//member = new Member("홍길동","root","0000");	// 생성자를 이용한 Member Class 사용하기
	}
	public boolean login(String id, String pw) {
		boolean result = false;
	
		if(id.equals(member.getId()) && pw.equals(member.getPw())) {
			System.out.println(member.getName() + "님");
			result = true;
		}
		return result;
	}
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	public void register(String id, String name, String pw) {
		member = new Member(id, name, pw);
	}
}
