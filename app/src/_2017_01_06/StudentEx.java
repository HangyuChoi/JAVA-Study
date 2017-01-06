package _2017_01_06;

class People {
	public String name;
	public int age;
	public String b;
	
	public People(String name, int age, String b) {	// Class Reset
		this.name = name;
		this.age = age;
		this.b = b;
	}
}
class Student extends People {
	public Student(String name, int age, String b) {
		super(name, age, b);
	}
}
class H extends People {
	public H(String name, int age) {
		super(name, age,"");
	}
}
public class StudentEx {
	public static void main(String args[]) {
		Student student = new Student("홍길동", 10, "도사");
		System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 칭호 : " + student.b);
		H h = new H("임꺽정", 20);
		System.out.println("이름 : " + h.name + ", 나이 : " + h.age + ", 칭호 : " + h.b);
	}
}