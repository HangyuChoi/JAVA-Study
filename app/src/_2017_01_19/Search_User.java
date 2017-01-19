package _2017_01_19;

public class Search_User implements Comparable<Search_User>{
	public String id;
	
	public Search_User(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) { // 객체라는 개념으로 뭐가 되든 비교하려고 Object를 쓴다.
		if(obj instanceof Search_User) {
			Search_User user = (Search_User) obj;
			if(id.equals(user.id)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Search_User o) {
		return id.compareTo(o.id);
	}
}
