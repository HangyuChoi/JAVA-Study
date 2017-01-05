package _2017_01_03;
public class ArrayEx4 {
	public static void main(String args[]) {
		int[][] a = new int[3][2];
		
	    a[0][0] = 1;
		a[0][1] = 2;
	
		a[1][0] = 3;
		a[1][1] = 4;
		
		a[2][0] = 5;
		a[2][1] = 6;
		
//		for(int[] array1 : a) {
//			for(int array2 : array1) {
//				System.out.print(array2 + "\t");
//			}
//			System.out.println();
//		}	
	}
}
		

// 배열은 정보를 수집하기 위한 수단





//int sum = 0;
		//System.out.println("length = " + a.length);
		/*for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){	// [i][여길가르킨다.]
				sum += 1;
				System.out.print("a["+ i +"]["+ j +"] = " + sum + "\t");
			}
			System.out.println();
		}*/






























//다차원 배열(array) 행과 열
			/* 
			 	표현)
			 		- int[][] a = new int[n][n];
			 		  3x3의 경우
			 		  행이 앞, 열이 뒤
			 		- int[][] a = {
			 						{n(0,0), n(0,1), n(0,2)},  // 행의 0번째 인덱스
			 						{n(1,0), n(1,1), n(1,2)},  // 행의 1번째 인덱스
			 						{n(2,0), n(2,1), n(2,2)}   // 행의 2번째 인덱스
			 					  };
			 */

		/*
	    a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;*/
		
		/*
		System.out.println("a[0][0] = " + a[0][0]);
		System.out.println("a[0][1] = " + a[0][1]);
		System.out.println("a[0][2] = " + a[0][2]);
		
		System.out.println("a[1][0] = " + a[1][0]);
		System.out.println("a[1][1] = " + a[1][1]);
		System.out.println("a[1][2] = " + a[1][2]);
		
		System.out.println("a[2][0] = " + a[2][0]);
		System.out.println("a[2][1] = " + a[2][1]);
		System.out.println("a[2][2] = " + a[2][2]);*/
