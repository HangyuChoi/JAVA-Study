package _2017_01_10;

class X {
	protected int i = 10;
	protected String msg = "I am an X.";
	
	public void print() {
		System.out.println(msg);
	}
	
	public void play() {
		System.out.println("Play.." + msg);
	}
}

class Y extends X {
	protected int i = 20;
	protected String msg = "I am an Y.";
	
	public void print() {
		System.out.println(msg);
	}
}

public class Z extends Y {
	protected int i = 30;
	protected String msg = "I am a Z.";
	
	public void print() {
		System.out.println(msg);
	}
	
	public void play() {
		System.out.println("Play.." + msg);
	}
	
	public void doZ() {
		System.out.println("do something in Z.");
	}
	
	public void test(int i) {
		Z z = new Z();	//
		Y y = z;		//  �ڵ� �� ��ȯ
		X x = z;
		//����
						// ������ print(); �� ���������� ������ �� ���� ���� Ŭ������ print();�� ���ϵȴ�.
		z.print();		// I am an Z.   �� ���� Ŭ���� ��� print() �޼��尡 �ְ� Z -> Y -> X �� ��Ӱ����̱� ������ ���� �Ʒ� Z�� print() ����
		y.print();		// I am an Z.	�� ���� Ŭ���� ��� print() �޼��尡 �ְ� Z -> Y -> X �� ��Ӱ����̱� ������ ���� �Ʒ� Z�� print() ����
		x.print();		// I am an Z.	�� ���� Ŭ���� ��� print() �޼��尡 �ְ� Z -> Y -> X �� ��Ӱ����̱� ������ ���� �Ʒ� Z�� print() ����
		super.print();	// I am an Y.   Z Ŭ������ �θ� Ŭ���� Y�� �޼��� print() ����
		play();			// Play...I am a Z.   ���� Ŭ���� ( Z ) �� play() ����
		super.play();	// Play...I am a X.   play()�� �ִ� �θ� Ŭ���� �� Z �� ���� Ŭ������ X �� play() ����
		
		//y.doZ();		// ȣ���ϰ����ϴ� Y Ŭ�������� ������ �ִ� Z Ŭ������ doZ�� ������ �� ����.
		//super.super.print();	// super�� �ι� �������� ������.
		
		// super �� ���� ��ġ���� �θ�� �ö󰡸� ���� ����� ���� ���Եȴ�. �θ� ������ �θ��� �θ�� 
		System.out.println("\ni = " + i);				// i = 15			�Ű����� i
		System.out.println("this.i = " + this.i);		// this.i = 30		���� Ŭ���� ( Z )�� ���ǵ� i		
		System.out.println("super.i = " + super.i);	// super.i = 20;    ���� Ŭ���� ( Z )�� �θ� Ŭ���� ( Y ) i  ���۷� ���°Ŵ� �׳� �� ���°Ŵ�
		System.out.println("y.i = " + y.i);				// y.i = 20		���������� = y�� �ִ� �θ��� x�� ���еȴ�.
		System.out.println("x.i = " + x.i);				// x.i = 10
		System.out.println("((Y)this).i = " + ((Y)this).i);	// ((Y)this).i = 20
		System.out.println("((X)this).i = " + ((X)this).i);	// ((X)this).i = 10
		
		//super.super.i = 10;	// super�� �ι� �������� ������.
		
	}
	
	public static void main(String[] args) {
		Z z = new Z();
		z.test(15);		// test �޼��忡 �Ű����� i <- 15 
	}

}
