//package _2017_01_04;
//public class MethodEx1 {
//	public int intA(){
//		int num = 10;
//		System.out.println("intA �޼ҵ� ����");
//		return num;
//	}
//	
//	public void intB(){
//		System.out.println("intB �޼ҵ� ����");
//	}
//	
//	 public static void main(String args[]){ 
//		 MethodEx1 method = new MethodEx1();
//		 method.intA();
//		 method.intB();
//		  
//	 }
//}


//package _2017_01_04;
//public class MethodEx1 {
//	public int intSum(int su1, int su2){
//		int sum = su1 + su2;
//		return sum;
//	}
//	
//	public void intB(){
//		System.out.println("intB �޼ҵ� ����");
//	}
//	
//	 public static void main(String args[]){ 
//		 MethodEx1 method = new MethodEx1();
//		 int result = method.intSum(10, 20);	
//		 method.intB();
//		 System.out.println("��� : " + result); 
//	 }
//}




// MethodEx1 �� Ŭ����
// intSum �� �޼ҵ�
// int su1, int su2 �� �Ű�����
// �޼ҵ��, �Ű����� ����, �Ű����� Ÿ��  ����ڰ� �d�d�d �ž� �� !!














/************************************************************************/

//package _2017_01_04;
/* - [����������] [������] [��ȯ��] �޼ҵ� �� (���ڵ�) {
	���� ���� (����);
}

* ���� ������(Modifiers) : private, default(friendly), protected, public
* 
* ������ : static, final, abstract, native ...
* ��ȯ��(return type) :
*    - �ڹ� ������ �ڷ���(�⺻��, ������) ���� ����� �� �ִ�.
*    - void : ��ȯ���� ���� �޼ҵ� ���� �� ���.
* �޼ҵ�� : �ĺ��ڷ� ������ �̸� ����.
* ����(Arguments) : �Ű� ������� �ϸ� �޼ҵ� ȣ��� �����͸� �����ϱ� ���� �뵵�� �����.
* 
ǥ��- 1)
	public int intA () {
		����;
		return n;	// n -> int �⺻ �ڷ����� �´� ������ ��ȯ
	}
ǥ��- 2)
	public void intB(int a, ...) {
		����;
		// return ������ ������� ����.
	}

*/

//public class MethodEx1 {
//	void a() {
//		System.out.println("A");
//		if(1 < 2) {
//			return;		// break �� ���� �������� ���
//		}
//		System.out.println("B");
//		
//	}
//	
//	int b() {
//		System.out.println("A");
//		if(1 < 2) {
//			return 1;
//		}
//		System.out.println("B");
//		
//		return 0;
//	}
	
//	 public static void main(String args[]){
		 // ��ü : �Ӽ�(Ư��)�� ������� ����.
		 // ���� �޼ҵ带 ����Կ� �־� ��ü�� ������ ����������.
		  
//	 }
	// void main(String args[]){
		// void main(){ // �ּ����� �ʼ� ���
		/*int main(){
			int a = 10;
			return a;
		}*/
		
		/*int main(int su1) {
			int su2 = 10;
			int sum = su1 + su2;
			return sum;
		}*/
//}