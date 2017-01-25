package _2017_01_25;

public class Student {
	String name;
	int eScore;
	int mScore;
	public Student(String name, int eScore, int mScore) {
		this.name = name;
		this.eScore = eScore;
		this.mScore = mScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int geteScore() {
		return eScore;
	}
	public void seteScore(int eScore) {
		this.eScore = eScore;
	}
	public int getmScore() {
		return mScore;
	}
	public void setmScore(int mScore) {
		this.mScore = mScore;
	}
}
