package _2017_01_03;
public class ArrayEx5_ArrayCopy {
	public static void main(String args[]) {
		// �迭����
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		
		System.out.println();
		
		// �迭 ����2	
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
			//		 �ҽ�(�ٿ���) �� 0��° ������������ �������� 0��° ������ �������� oldStrArray�� ���̸�ŭ �ű�ڴ�.
		//System.arraycopy(oldStrArray, 1, newStrArray, 0, 2);
		//System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}



