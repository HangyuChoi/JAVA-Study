package _2017_01_03;
import java.util.Scanner;

public class ArrayEx1 {
	/*
	 * 배열 Array 
	 	- 같은 자료형의 데이터를 여러 개 저장하기 위한 메모리 공간을 말함.
	 	- 생성된 메모리 공간에 index를 이용하여 각 기억장소를 구분함.
	 	- 배열크기는 length를 사용하여 구함.
	 	
	   표현)
	 	- int[] arr = new int[n]; // n개 만큼 0으로 초기화.  이후에 반드시 데이터를 넣어줘야한다. ex) arr[0] = 1; arr[1] = 2; arr[2] = 3;
	 	- int[] arr = {1, 2, 3};  // 배열을 초기화함과 동시에 값을 넣는다.
	 	  // int 변수 3개를 만들어 놓은 것과 동일 하기 때문에 배열 내의 데이터는 바뀔 수있다.
	 	
	 	- int[] arr = new int[]{1, 2, 3}; // 잘 안쓰임. 위에 두개 합친거 결과 동일
	 	
	 	// 선언된 타입과 맞는 데이터만 넣을 수 있다.
	 	 * 초기에 선언된 배열의 크기는 바뀔 수 없다.
	 	문자열은 객체타입
	 	String a;	// a = null
		a = "A";	// a(stack) = "A"(heap)
	 */
	
	/*Scanner scan;
	public static void main(String args[]){
		new ArrayEx1().scan.next();*/
	// 런타임 인셉션 ( 널 포인터 인셉션 ) 'scan을 쓸꺼야' 근데 그게 null 이라서객체타입에서는 널 포인터 인셉션 됨
	
	public static void main(String args[]){
	/* 1차원 배열------------------------*/
		int arr[] = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		// int arr[] = {1,2,3};    = 1, 2, 3
		// int arr[] = new int[]{1,2,3}; // = 1, 2, 3
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2] + "\n");  // = 1, 2, 3
		
		arr[1] = 20;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2] + "\n");  // = 1, 20, 3
		
		String[] str = new String[3];
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2] + "\n");
		
		int arr2[] = {10, 20 ,30};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2] + "\n");  // = 10, 20, 30
		
		arr2[2] = 100;
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2] + "\n");  // = 10, 20, 100
	}
}





















