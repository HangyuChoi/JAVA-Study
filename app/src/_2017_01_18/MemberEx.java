package _2017_01_18;

public class MemberEx {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1 과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1 과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1 과 obj3는 동등하지 않습니다.");
		}
		
		String a = "1";
		System.out.println(Integer.parseInt(a) == 1);
		System.out.println(a.equals(1));
	}
		// 만약 Member Class에 equals() 메소드가 없다면 둘다 동등하지 않다고 나온다. 다 다른 객체니까
}
