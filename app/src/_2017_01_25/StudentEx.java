package _2017_01_25;

import java.util.Arrays;
import java.util.Vector;

public class StudentEx {
	public StudentEx() {
		Student a = new Student("ȫ�浿",90,96); // ȫ�浿
		Student b = new Student("�ſ��",95,93); // �ſ��
		
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
		System.out.println("[�л� �̸�]");
		System.out.println(names);
		System.out.println("[���� ����]");
		System.out.println(eng_scores);
		System.out.println("[���� ����]");
		System.out.println(math_scores);
	}
	public static void main(String... args) {
		new StudentEx();
	}
}