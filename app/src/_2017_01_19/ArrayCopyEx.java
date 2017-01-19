package _2017_01_19;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		char[] arr1 = {'A', 'B', 'C', 'D'};

		// 방법 1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); // 길이 만큼 복사
		System.out.println(Arrays.toString(arr2)); // [A, B, C, D]
		
		System.out.println();
		
		// 방법 2										  
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 4); // arr1 의 [1] ~ [3]까지 
		System.out.println(Arrays.toString(arr3)); // [B, C, D]
	
		System.out.println();
		
		// 방법 3
		char[] arr4 = new char[arr1.length];	
		System.arraycopy(arr1, 0, arr4, 0, arr1.length); // arr1 의 0 번째부터 가져올꺼고, arr4의 0번째부터 넣을꺼야, arr1의 길이만큼 
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
	}
}
