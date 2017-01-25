package _2017_01_25;

public class MyFunctionalInterfaceEx2 {
	public static void main(String[] args) {
		MyFunctionalInterface2 fi2;
		
		fi2 = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi2.method(2);

		fi2 = (x) -> {System.out.println(x*5); };
		fi2.method(2);
		
		fi2 = (x) -> System.out.println(x-8);
		fi2.method(10);
		
	}
}
