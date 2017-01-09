package _2017_01_06;


// B�� ���� superclass 
class C {
	public C() {
		// ����� ��ӱ����� ���⿡ super(); �� ����.
		System.out.println("Constructor C");
	}
	int num = 10;
	String msg = "msg...";
	public void method() {
		System.out.println("Method " + num);
	}
	public void method_C() {
		System.out.println("Method_C " + msg);
	}
}

// C�� ���� subclass B
// A�� ���� superclass 
class B extends C {
	public B() {
		//super();
		System.out.println("Constructor B");
	}
	int num = 50;
	
	public void method() {
		super.method_C();
		this.method_C();
		System.out.println("method " + num);
	}
	public void method_B() {
		System.out.println("Method_B " + msg);
	}
}

// B�� ���� superclass A
class A extends B {
	public A() {
		// ���⿡�� super(); �� ������ �ִ�. ����
		//super().super();  �ι� �����ؼ� �� �� ����. super �� this �ȵ�
		System.out.println("Constructor A");
	}
	public void method() {	// A,B,C ��� method() �� �ִ�. �������̵带 ���� C B A ������ ������ �ȴ�.
		//System.out.println("method " + super.super.num);
		super.method();
	}
	public void method_A() {
		System.out.println("Method_A " + msg);
	}
}

public class InherEx2 {
	public static void main(String args[]) {
		A a = new A();	// A Ŭ���� ��ü ����
		B b = a;		// �ڵ� �� ��ȯ, �ڽ� -> �θ�
		C c = b;		// �ڵ� �� ��ȯ, �ڽ� -> �θ�
		a.method();		// ������ �� A �� method(); ����   �ѹ� �����ǰ� �Ͼ�� ������ ������� ���ư� ������.
//						// ���� b.method(); �� c.method(); �� �ص� A�� method(); �� ����
//						// ������ super. ���� �����ϸ� �� �� �ִ�. ( ��ü�ν� )
//		a.method_A();
//		a.method_B();	// ��ӹ��� B�� �޼ҵ忡 ������ �� �ִ�.
//		a.method_C();	// ��ӹ��� B�� �޼ҵ忡 ������ �� �ִ�.
//		System.out.println(a.num);	// num�� ��� ȣ���� a �� ����� �� ����. �ָ��ִ� c�� num�� ���еȴ�.
		
	}
}
