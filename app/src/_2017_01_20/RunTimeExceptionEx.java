package _2017_01_20;

public class RunTimeExceptionEx {
	public static void main(String[] args) {
		// 실행시 발생하는 예외 상황 Ex)
		try {
			// RunTimeException ...
			// try {  }catch{   } 생략가능 ... 디버깅에서 처리함 ...
			int [] Array = new int[3];
			Array[0] = 0;
			Array[1] = 10;
			Array[2] = 20;
			
			// 고의로 에러유발 : Array의 범위를 벗어나도록 한다.
			for (int i = 0; i < Array.length; i++) {
				System.out.println("Array["  + i + "] = " + Array[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		} finally {
			System.out.println("finally 실행 !!!");
		}

	}

}
