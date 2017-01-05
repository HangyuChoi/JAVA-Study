package _2017_01_02;
public class P131_DowhileBreak_Ex {
	public static void main(String args[]) {
		// do-while_Break 문 특정된 루프안에서 break를 쓰고 빠져나가는 제어문
		int i = 0;
		boolean result = true;	// boolean 타입의 true OR false
		do {
			i++;
			if( result) {
			System.out.println("실행구문 : " + i);
				if( i == 5) {
					result = false;
				}
				if(! result) {
					System.out.println("실행 구문 종료합니다.");
					break;	// break; 는 if 문이 아니고 if문을 포함하고 있는 반복문을 빠져나간다.
				}
			}else{
					System.out.println("i : " + i);
				}
		}while( i < 10);
	}
}


