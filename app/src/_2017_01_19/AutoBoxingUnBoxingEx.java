package _2017_01_19;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		// �ڵ� Boxing	
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		// ���Խ� �ڵ� UnBoxing	
		int value = obj;
		System.out.println("value : " + value);
		
		// ����� �ڵ� UnBoxing
		int result = obj + 100;
		System.out.println("result : " + result);
		
		int a = (int)(Math.random()*9)+1;
		System.out.println();
		
		
	}

}
