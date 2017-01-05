package _2017_01_03;
public class Chapter5_Exercise07 {
		//	배열의 항목에서 최대값 구하기 ( for 문 사용 )
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		/* 작성 시작 */
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		/* 작성 끝 */
		
		System.out.println("max : " + max);
	}
}

