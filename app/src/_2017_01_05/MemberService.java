package _2017_01_05;

public class MemberService {
	public 	Member member;
	public MemberService() {
		// ȸ������
		//member = new Member("ȫ�浿","root","0000");	// �����ڸ� �̿��� Member Class ����ϱ�
	}
	public boolean login(String id, String pw) {
		boolean result = false;
	
		if(id.equals(member.getId()) && pw.equals(member.getPw())) {
			System.out.println(member.getName() + "��");
			result = true;
		}
		return result;
	}
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	
	public void register(String id, String name, String pw) {
		member = new Member(id, name, pw);
	}
}
