package _2017_01_03;
public class ArrayEx2 {
	public static void main(String args[]) {
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores.length : " + scores.length);
		
		// 배열의 길이 만큼 반복  가변적인 배열에 사용해야한다.
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores["+ i +"] : " + scores[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];	// 83, 90, 87
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length;
		// 소숫점을 구하기 위해double 형으로 캐스팅.
		System.out.println("평균 : " + avg);
	}
}


/*
System.out.println("scores[0] : " + scores[0]);
System.out.println("scores[0] : " + scores[1]);
System.out.println("scores[0] : " + scores[2]);
*/