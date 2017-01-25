package _2017_01_25;

public class MyFunctionalInterfaceEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface3 fi3;
		
		fi3 = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi3.method(2,5));
		
		fi3 = (x, y) -> {return x + y; };
		System.out.println(fi3.method(2,5));
		
		fi3 = (x, y) -> sum(x, y);
		System.out.println(fi3.method(2,5));
		
	}
	
	public static int sum (int x, int y) {
		return (x + y);
	}
}
