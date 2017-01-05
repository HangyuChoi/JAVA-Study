package _2017_01_02;
public class P124_For_Ex2 {
	public static void main(String args[]) {
		for(int k =2; k < 10; k++){
			System.out.print("   " + k + "단 \t\t");
		}
		System.out.println();
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				System.out.print("   " + j + " * " + i + " = " + (j * i)+ " \t");
			}
			System.out.println();
		}
	}
}


/*   " 이걸 출력하고 싶을때는 \"  로 표현    */

/*Scanner sc = new Scanner(System.in);

System.out.println("※ 정수만 입력하세요 ※");
System.out.print("몇 단을 보여드릴까요? : ");
int dan = sc.nextInt();
System.out.println("");
System.out.println(dan + "단 입니다. \n");

for(int i = 1; i <= 9; i++) {
	System.out.println(dan + " * " + i + " = " + (dan * i));
}*/

// 구구단 세로 출력
/*for(int i = 2; i < 10; i++) {
	System.out.println(i + "단");
	for(int j = 1; j < 10; j++) {
		System.out.print("   " + i + " * " + j + " = " + (i * j)+ " \n");
	}
	System.out.println();
}*/

// 구구단 가로 출력
/*for(int k =2; k < 10; k++){
	System.out.print("   " + k + "단 \t\t");
}
System.out.println();
for(int i = 1; i < 10; i++) {
	for(int j = 2; j < 10; j++) {
		System.out.print("   " + j + " * " + i + " = " + (j * i)+ " \t");
	}
	System.out.println();
}*/