package _2016_12_30;
public class P91_Array {
	public static void main(String args[]) {
		// a++ : 이후에 a를 증가시킨 값으로 쓰겠다.  ++a : 지금 a를 증가시킨 값으로 쓰겠다.
			int a = 0;
			System.out.println(a++ + a++);		// 0 + 1 = 1
			System.out.println(a + --a + ++a); 	// 2 + 1 + 2 = 5
			System.out.println(--a + a++);		// 1 + 1 = 2
			System.out.println(a); 				// 2
	}
}


//		// Ex1
//		String str = args[0];
//		int num = Integer.parseInt(str); // 문자열 정수변환
//		if (num > 10) {
//			System.out.println("true Ex1");
//		}
//		System.out.println("play Ex1");
//		
//		// Ex2
//		if(num > 10) {
//			System.out.println("true Ex2");
//		} else {
//			System.out.println("false Ex2");
//		}

		/******************************************************
			
		int su1 = 10;
		int su2 = 20;
		boolean result1 = su1 < su2;
		System.out.println(result1);		// true
		boolean result2 = su1 > su2; 
		System.out.println(result2);		// false
		boolean result3 = result1 | result2;
		System.out.println(result3);		// true
		boolean result4 = su1 < su2 || (su1 = 5) > su2;
		System.out.println(result4);		// true
		System.out.println("su1 = " + su1); // 10
		boolean result5 = su1 > su2 && su1 < (su2 = 5 + 5);
		System.out.println(result5); 		// false
		System.out.println("su2 = " + su2); // 20
		******************************************************/
		
		/******************************************************
		// a++ : 이후에 a를 증가시킨 값으로 쓰겠다.  ++a : 지금 a를 증가시킨 값으로 쓰겠다.
		
		int a = 0;
		System.out.println(a++ + a++);		// 0 + 1 = 1
		System.out.println(a + --a + ++a); 	// 2 + 1 + 2 = 5
		System.out.println(--a + a++);		// 1 + 1 = 2
		System.out.println(a); 				// 2
		******************************************************/
		
		/*****************************************************/

