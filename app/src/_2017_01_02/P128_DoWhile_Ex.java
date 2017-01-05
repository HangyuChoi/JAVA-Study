package _2017_01_02;
public class P128_DoWhile_Ex {
	public static void main(String args[]) {
		int i = 2;
		do {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			i++;
			System.out.println();
		} while ( i < 9);
	}
}




/******************************************/

// do-while 문 기본
/*//반복문 (do ~ while 문)
		 표현)
			do {
				실행구문;
			} while (조건식);
		 
		
		int count = 0;
		do {
			count++;
			System.out.println("실행구문 " + count);
		} while ( count < 10);*/

/******************************************/

// 구구단 세로 출력
/*int i = 2;
do {
	for(int j = 1; j < 10; j++) {
		System.out.println(i + " * " + j + " = " + (i*j));
	}
	i++;
	System.out.println();
} while ( i < 9);*/

/******************************************/

// 구구단 가로 출력
/*int i = 1;
for(int k = 2; k <10; k++){
	System.out.print(k + "단\t\t");
}
System.out.println();
do {
	for(int j = 2; j < 10; j++) {
		System.out.print(j + " * " + i + " = " + (j*i) + "\t");
	}
	i++;
	System.out.println();
} while ( i < 9);*/

/******************************************/