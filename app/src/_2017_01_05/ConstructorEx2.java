package _2017_01_05;

public class ConstructorEx2 {
	ConstructorEx2() {
		this(50, "ȫ�浿"); // ���
		System.out.println("Constructor!!");
	}
	ConstructorEx2(int a) {
		System.out.println("Constructor!!" + a);
	}
	ConstructorEx2(int a, String s) {
		System.out.println("Constructor!!" + s);
	}
	
	public static void main(String args[]) {
		new ConstructorEx2();
	}
}
