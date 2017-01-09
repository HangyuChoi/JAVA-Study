package _2017_01_09;

/*
 * final :
	- class : ����� �ȵ�
	- method : ������ �ȵ�
	- variable : ���ȭ -> ���� final static int ABC = 10;	// ������� static �̶� ���� ����. 
 
 * static :
 	- ��ü ���� ���� ��밡��(�����޸𸮿� ����)

 	
 * abstract :
 	- class : �߻� Ŭ����
 	- method : �߻� �޼ҵ�
 */
	
final class Test {
	public final void methodA() {
	}
}

class Test2 {
	public void methodB() {
		System.out.println("��ȣ");
	}
}

public class StaticEx {
//	public static int a = 10;
//	public static void a() {
//	}
	public final static int A = 10;
	//final static int B = 10;
	static final  int B = 10; // static final �ΰ��� ��ġ�� �������
	public static void methodA() {
		System.out.println("methodA");	// System Ŭ������ static �̴�. out �� static ����
	}
	public void methodB() {
		System.out.println("��ȣ2");
	}
	
	public static void main(String args[]){
		//StaticEx se = new StaticEx();    // ���ο� ��ü�� �������� �ʾƵ� ��밡�� static
//		System.out.println(a); 
//		a(); // �޼ҵ嵵 ����
	
		System.out.println(StaticEx.A); // �ٸ� Ŭ������ ���� ���� Ŭ����. ���� Ŭ������ �̸��� ���
		System.out.println(B);
		methodA();	// this �� super �� static ���������� �� �� ����.
		new StaticEx().methodB(); // ���̷�Ʈ�� ���������Ҵ�
		new Test2().methodB();
	}
}
