package _2017_01_03;
public class Chapter5_Exercise08 {
	// 배열의 전체 항목의 합과 평균값을 구해보세요 ( 중첩 for문 사용 )
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		/* 작성 시작 */
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;
		/* 작성 끝 */
		
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}
}

