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
		Student student = new Student("ȫ�浿", 10, "����");
		System.out.println("�̸� : " + student.name + ", ���� : " + student.age + ", Īȣ : " + student.b);
		H h = new H("�Ӳ���", 20);
		System.out.println("�̸� : " + h.name + ", ���� : " + h.age + ", Īȣ : " + h.b);
	}
}