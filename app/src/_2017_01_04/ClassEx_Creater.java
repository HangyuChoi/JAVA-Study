package _2017_01_04;

/*     3     */

public class ClassEx_Creater {
	/* ��� �ʵ� */
	int ����;
	String name;
	/*			 */
	
	
	//������1
	public ClassEx_Creater() {	
		
		���� = 15;
		name = "�谳��";
	}
	
	//������2
	public ClassEx_Creater(int age) {	
		
		���� = age;
		name = "�谳��";
	}
	
	// ������3
	public ClassEx_Creater(int age, String name2) {	
					
		���� = age;
		name = name2;
	}
	
	//������4
	public ClassEx_Creater(int age, String name2, int a) {	
		
		���� = age;
		name = name2;
	}	

	
	/* �޼ҵ� */
	public static void main(String args[]) {
		ClassEx_Creater object3 = new ClassEx_Creater(10, "ȫ�浿");	// ������ 3
		ClassEx_Creater object1 = new ClassEx_Creater();	// ������ 1
		ClassEx_Creater object2 = new ClassEx_Creater(20);	// ������ 2
		
		Object obj = object3;
		
		
		System.out.println("�ʱ⳪��3 : " + object3.����);
		System.out.println("�ʱ⳪��1 : " + object1.����);
		System.out.println("�ʱ⳪��2 : " + object2.����);
		System.out.println();
		System.out.println("�ʱ��̸�1 : " + object1.name);
		System.out.println("�ʱ��̸�2 : " + object2.name);
		System.out.println("�ʱ��̸�3 : " + object3.name);
									
		object2.���� = 100;
		
		System.out.println("����� ���� : " + object3.����);
		System.out.println("�ʱ��̸� : " + object3.name);
									
		
		object2.name = "������";
		
		System.out.println("����� �̸� : " + object3.name);
	}
	/*		  */
}



















/*     2     */
//
//public class ClassEx_Creater {
//	/* ��� �ʵ� */
//	int ����;
//	String name;
//	/*			 */
//	
//	// ������
//	public ClassEx_Creater(int age, String name2) {	// �������� ���� : �ַ� ��ü (����ʵ�) �� ��Ҹ� �ʱ�ȭ �ϴ� �뵵�� ����Ѵ�.
//							// int age �� �Ű� ����
//		���� = age;
//		name = name2;
//	}	
//	// �����ڸ� �Ⱦ��� �⺻(����Ʈ) �����ڶ�� �ؼ� �˾Ƽ� �����ȴ�.
//	
//	/* �޼ҵ� */
//	public static void main(String args[]) {
//		ClassEx_Creater object = new ClassEx_Creater(10, "ȫ�浿");
//		System.out.println("�ʱ⳪�� : " + object.����);
//									  // �������� �̸��� ����  10, "ȫ�浿"��  ����(�ƱԸ�Ʈ) ��� �Ѵ�. ������ ����
//		
//		object.���� = 100;
//		
//		System.out.println("����� ���� : " + object.����);
//		System.out.println("�ʱ��̸� : " + object.name);
//									 // object �ȿ� ���� �� name �̶�� �Ӽ��� �����͸� ����ϰڴ�.
//		
//		object.name = "������";
//		
//		System.out.println("����� �̸� : " + object.name);
//	}
//	/*		  */
//}

/*
 	
  	* Ŭ����
  	- ��ü�� ������ ���� �� -> ��ü�� �����ϱ� ���� ���ø�(template)
  	- ��ü�� ���� �� ������ ����
  	
  	* ��ü
  	- �Ӽ�(Ư��)�� ������� ����
 	- �ǻ�Ȱ�� �����ϴ� �͵��� ��� ǥ����.
 	
 	* ��ü�����̶� : �繰�̳� ������ "�Ӽ��� ����� ���� ��ü" �� �𵨸��ϰ�, 
 					�̵鰣�� ���踦 ���� ��( Self-contained Comonent ������ �����ϴ� �� )
 	
 	* �ڹٿ����� ��ü���� 3�ܰ�
 		1) ��ü �𵨸� - ���α׷��� �ϰ��� �ϴ� ��ü�� �Ӽ��� �ʿ��� ����� �����Ѵ�.
 		
 		2) Ŭ���� ���� - ��ü�� ������ ����ϱ� ���ؼ�, Ŭ������� ���·� ��ü�� ǥ���Ѵ�.
 		
 		3) ��ü ������ ��� - ���� �� Ŭ������ �̿��ؼ�, �޸𸮻� ��ü(Object)�� �����ϰ�, ����Ѵ�.
  
  
	* ������(constructor)
	- ��ü ���� ���α׷���(OOP : objective-oriented programming) ���� ���̴� ��ü �ʱ�ȭ �Լ�.
	- ��ü�� ���� �ÿ��� ȣ��Ǿ� �޸� ������ ���ÿ� ��ü�� �����͸� �ʱ�ȭ�ϴ� ������ ��.
	
	- Ư¡
		1) �������� �̸��� Ŭ������ �̸��� �����ϰ� ���.
		2) �����ε� (overloading) ������.
		3) ��ȯ���� ������� ����.
		4) �⺻ �������� ������ ������.
		5) ��� ���� �ʱ�ȭ ������ ����.
		
		ǥ��)
		- Ŭ���� :
		[����������] class Ŭ������ {
			����, ������, �޼ҵ带 ������.
		}
		- ��ü :
		[������] ���� ������ = new [Ŭ������] ():
		ex)
			A a = new A ();
 
 */














/*     1     */

//public class ClassEx_Creater {
//	/* ��� �ʵ� */
//	int ����;
//	String name;
//	/*			 */
//	
//	// ������
//	public ClassEx_Creater() {	// �������� ���� : �ַ� ��ü (����ʵ�) �� ��Ҹ� �ʱ�ȭ �ϴ� �뵵�� ����Ѵ�.
//		���� = 10;
//		name = "ȫ�浿";
//	}	
//	// �����ڸ� �Ⱦ��� �⺻(����Ʈ) �����ڶ�� �ؼ� �˾Ƽ� �����ȴ�.
//	
//	/* �޼ҵ� */
//	public static void main(String args[]) {
//		ClassEx_Creater object = new ClassEx_Creater();
//
//		System.out.println("���� : " + object.����);
//		System.out.println("�̸� : " + object.name);
//
//	}
//	/*		  */
//}