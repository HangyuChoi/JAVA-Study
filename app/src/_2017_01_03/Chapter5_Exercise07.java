package _2017_01_03;
public class Chapter5_Exercise07 {
		//	�迭�� �׸񿡼� �ִ밪 ���ϱ� ( for �� ��� )
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		/* �ۼ� ���� */
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		/* �ۼ� �� */
		
		System.out.println("max : " + max);
	}
}

