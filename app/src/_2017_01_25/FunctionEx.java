package _2017_01_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx {
	public static void getView() {
		Student s1 = new Student("ȫ�浿", 90, 96);
	    Student s2 = new Student("�ſ��", 95, 93);
	    List<Student> student = new ArrayList<Student>();
	    student.add(s1);
	    student.add(s2);
	     
	    String names = "", math_scores = "", eng_scores = "";
	    for (int i = 0; i < student.size(); i++) {
	       Student stu = student.get(i);
	       names += stu.getName() + " ";
	       math_scores += stu.getmScore() + " ";
	       eng_scores += stu.geteScore() + " ";
	    }
	    System.out.println("[�л� �̸�]");
	    System.out.println(names);
	    System.out.println("[���� ����]");
	    System.out.println(eng_scores);
	    System.out.println("[���� ����]");
	    System.out.println(math_scores);
	}
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93)
	);

	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for(Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		printString( t -> t.getName() );
		System.out.println("[���� ����]");
		printInt( t -> t.geteScore() );
		System.out.println("[���� ����]");
		printInt( t -> t.getmScore() );	
		System.out.println("===============================================");
		getView();
	}
}
