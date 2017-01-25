package _2017_01_25;

import java.util.Arrays;
import java.util.Vector;

public class StudentEx {
	public StudentEx() {
		Student a = new Student("홍길동",90,96); // 홍길동
		Student b = new Student("신용권",95,93); // 신용권
		
		Vector<Student> vInfo = new Vector<Student>();
		vInfo.add(a);
		vInfo.add(b);
		
		String names = "" , eng_scores = "" , math_scores = "";
		for(int i = 0; i < vInfo.size(); i++) {
			Student c = vInfo.get(i);
			names += c.getName() + " ";
			eng_scores += c.geteScore() + " ";
			math_scores += c.getmScore() + " ";
		}
		System.out.println("[학생 이름]");
		System.out.println(names);
		System.out.println("[영어 점수]");
		System.out.println(eng_scores);
		System.out.println("[수학 점수]");
		System.out.println(math_scores);
	}
	public static void main(String... args) {
		new StudentEx();
	}
}