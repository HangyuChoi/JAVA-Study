package _2017_01_18;

public class MemberEx {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 �� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1 �� obj2�� �������� �ʽ��ϴ�.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1 �� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1 �� obj3�� �������� �ʽ��ϴ�.");
		}
		
		String a = "1";
		System.out.println(Integer.parseInt(a) == 1);
		System.out.println(a.equals(1));
	}
		// ���� Member Class�� equals() �޼ҵ尡 ���ٸ� �Ѵ� �������� �ʴٰ� ���´�. �� �ٸ� ��ü�ϱ�
}
