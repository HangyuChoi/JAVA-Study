package _2017_01_04;
// 1 ~ 100 ���� ���� ���ϴ� �Լ��� �����ϰ� ����� �޾� ����Ͻÿ�. ( return type ��� )
public class MethodEx3 {
	
	int a (int num1, int num2) {
		int sum = 0;
		for(int i = num1; i < num2; i++){
			sum += i;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		MethodEx3 me = new MethodEx3();
		int result = me.a(1,100);
		System.out.println("1~100 ���� �հ� : " + result);
	}
}
