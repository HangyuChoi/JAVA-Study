package _2017_01_09;

/*
	�������̽� (interface)
	- ��ü�� ���� �� �� ����.
	- class���� ��ӽ� implements keyword�� ���
	- ���� ����� ���� ��.
	- interface���� ����� �߻� �޼��常 ���� ��.
	- interface ���� ��� �ÿ��� extends�� �����.
	- �Ϲ����� �޼��带 ���� �� ����.
	- ��� �� interface�� �ִ� ��� �޼��带 �������Ͽ� ���.
	- interface�� ���ǵ� �޼��� �� �ϳ��� ���������� �ʴ´ٸ� abstract class�� ���� �� �� ����.
	
	ex) 
 	interface A {
 		void a();
 		void b();
 		void c();
 	}
 	
 	interface B extends A {
 		void a() {}
 		void b() {}
 		void c() {}
 	}
 	abstract class B implements A {
 		void a() {}
 		void b();
 		void c();
 	}
 	
	ǥ��)
	interface A {
		���� : [final][static] -> �����Ǿ� ����.
		ex) int A = 10;
		
		
		�޼��� : [public][abstract] -> �����Ǿ� ����.
		// �������̵� �� ������������ ���ǻ������� public( �ֻ��� ) ���� �Ʒ��� ������ ���� �� �Ÿ� �װ� �����ؼ� �� �� ���� �����ڸ� �� �� �ִ�.
		ex) void method();
 	}
 	
 	���1 )
 	abstract class B implements A {
 		�߻�޼��� ����...
 		�Ϲ����� �޼��� ����...
 	}
 	��2
 	class C implements A {
 		�������̽��� �����ϴ� �޼��� ������
 	}
	��3
	class D extends C implements A{}
	class D extends C implements A, B, C ... {}
 	=> ���� ��� ����...
 */

interface InterfaceA {
	int b = 100;
	String method(); // public abstract �� �������ִ�.
}
interface InterfaceB {
	int a = 10;
	void setA();
}

abstract class abstractC {
	void setB() {
		System.out.println("B");
	}
}

public class InterfaceEx extends abstractC implements InterfaceA, InterfaceB {
	public String method() {
		return "Override method";
	}
	public void setA() {
		System.out.println("setA method...");
	}
	
	public static void main(String args[]) {
		InterfaceEx inter = new InterfaceEx();
		inter.setB();
		System.out.println("number : " + (inter.b + inter.a));
		System.out.println(inter.method());
		inter.setA();
		
		// inter.a = 50; ���
		// inter.b = 50; ���
	}
}
