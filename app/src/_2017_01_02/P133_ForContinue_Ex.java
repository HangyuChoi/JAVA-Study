package _2017_01_02;
public class P133_ForContinue_Ex {
	public static void main(String[] args) {
		int count = 0;
		for ( int i = 0; i < 10; i++ ){
			System.out.println("반복 실행문");
			count++;
				if( count > 4 ) {
					continue;	// 조건이 맞아 실행되면 if문을 빠져나가서 반복문의 처음으로 돌아감
								// 캘린더 제작 시 응용
				}
				System.out.println("반복 실행 제한");
		}
		// 1.5 (5.0) 향상된 for 문
		// 데이터 a b c d ef 
		for(String str : args ) {
			System.out.println(str);
		}	
	}
}


