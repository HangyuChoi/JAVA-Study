package _2017_01_09;

/*
	�߻� (abstract)
	- ��ü�� ��ȣ���� class �� ǥ���ϱ�����.
	
	Ư¡
	- class�� ��� �� �߻� class�� �ǹ�(ex : abstract class).
	- �Ϲ� �޼ҵ�� �߻� �޼ҵ� ��� ���� ��.
	- ��ü�� ���� �� �� ����.
	- ��Ӱ��迡�� ������ ��.
	- ���� �͸� Ŭ����(���� anonymous class)�� ��ü���� �� ���� ����.
	- �߻� �޼���� ������(Override)�Ͽ� �����. ( �ݵ�� ���������� )
	- ��� �� extends keyword�� �����.
	
	ǥ��)
		abstract class A {	// abstract class������ abstract method�� �� �� ������, �Ϲ� class������ abstract �� �� �� ����!
			int a;
			ex)	 abstract void setA(); // {} ���� ; �� �׳� �����ϰ�! ������ �����ϱ� ������ ������ ���Ŭ�������� ������ ����������
				 void setB();
		}
	
	���)
		class B extends A {
			super class�� �߻� �޼��� ������
		}
 */


abstract class Abs {
	int a = 10;
	
	public void setA() {
		System.out.println("�Ϲ����� �޼��� ����...");
	}
	
	public abstract int getA();
}

public class AbstrackEx extends Abs{
	// ex)
	public int getA() {
		System.out.println("�߻� �޼��� ������...");
		return 100;
	}
	public static void main(String[] args) {
		// Abs a = new Abs(); 
		AbstrackEx abstractEx = new AbstrackEx();
		abstractEx.setA();
		abstractEx.getA();
		Abs abs = abstractEx;
		abs.setA();
		abs.getA();
	}
}
