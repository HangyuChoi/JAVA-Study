package _2017_01_03;
public class ArrayEx2 {
	public static void main(String args[]) {
		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores.length : " + scores.length);
		
		// �迭�� ���� ��ŭ �ݺ�  �������� �迭�� ����ؾ��Ѵ�.
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores["+ i +"] : " + scores[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];	// 83, 90, 87
		}
		System.out.println("���� : " + sum);
		double avg = (double) sum / scores.length;
		// �Ҽ����� ���ϱ� ����double ������ ĳ����.
		System.out.println("��� : " + avg);
	}
}


/*
System.out.println("scores[0] : " + scores[0]);
System.out.println("scores[0] : " + scores[1]);
System.out.println("scores[0] : " + scores[2]);
*/