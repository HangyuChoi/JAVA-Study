package _2017_01_18;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) { // 객체라는 개념으로 뭐가 되든 비교하려고 Object를 쓴다.
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
