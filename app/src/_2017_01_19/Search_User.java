package _2017_01_19;

public class Search_User implements Comparable<Search_User>{
	public String id;
	
	public Search_User(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) { // ��ü��� �������� ���� �ǵ� ���Ϸ��� Object�� ����.
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
