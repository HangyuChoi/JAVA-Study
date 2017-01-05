package _2017_01_02;
public class P125_While_Ex {
	public static void main(String args[]) {
		int i = 0;
		int sum = 0;
		System.out.print("홀수 :");
		while (i < 100) {
			i++;
			if(i%2 == 1){
				sum += i;
				//sum = sum+i;
				System.out.print(" " + i);
			}
		}
		System.out.println("\n홀수합계 : " + sum);
	}
}




// while 입문
/*int i = 0;
while (i < 10) {
	System.out.println("실행문 i : " +i);
	i++;
}*/

/******************************************/

// 반복제한
/*Scanner sc = new Scanner(System.in);
System.out.print("반복제한 : ");
int input = sc.nextInt();
int count = 0;
while (count < input) {
	count++;
	System.out.println("count : " + count);
}*/

/******************************************/

// 1~100까지의 홀수의 합 구하기
/*int i = 0;
int sum = 0;
System.out.print("홀수 :");
while (i < 100) {
	i++;
	if(i%2 == 1){
		sum += i;
		//sum = sum+i;
		System.out.print(" " + i);
	}
}
System.out.println("\n홀수합계 : " + sum);*/

/******************************************/