package _2017_01_20;

public class RunTimeExceptionEx {
	public static void main(String[] args) {
		// ����� �߻��ϴ� ���� ��Ȳ Ex)
		try {
			// RunTimeException ...
			// try {  }catch{   } �������� ... ����뿡�� ó���� ...
			int [] Array = new int[3];
			Array[0] = 0;
			Array[1] = 10;
			Array[2] = 20;
			
			// ���Ƿ� �������� : Array�� ������ ������� �Ѵ�.
			for (int i = 0; i < Array.length; i++) {
				System.out.println("Array["  + i + "] = " + Array[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		} finally {
			System.out.println("finally ���� !!!");
		}

	}

}
