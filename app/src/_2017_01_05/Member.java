package _2017_01_05;


public class Member {
	private String name;
	private String id;
	private String pw;
	
	public Member(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	// ������ ���� -> bin ���� = getter and setter			��� �޴��� - Source
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
