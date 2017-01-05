package _2017_01_03;
public class ArrayEx5_ArrayCopy {
	public static void main(String args[]) {
		// 배열복사
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		
		System.out.println();
		
		// 배열 복사2	
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
			//		 소스(근원지) 에 0번째 공간에서부터 목적지에 0번째 공간을 시작으로 oldStrArray의 길이만큼 옮기겠다.
		//System.arraycopy(oldStrArray, 1, newStrArray, 0, 2);
		//System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}



