package _2017_01_20;

public class ExceptionTest {
	String str = ""; 
	public void foo(int i) {
		try {
			if(i == 1) {
				throw new Exception();
			}
			str += " 1 ";	// 1. ���ڿ� ���� str = 1
		} catch (Exception e) {
			str += " 2 ";	// 4. ���ڿ� ���� str = 1342
			return;
		} finally {
			str += " 3 "; 	// 2. ���ڿ� ���� str = 13
		}					// 5. ���ڿ� ���� str = 13423
		str += " 4 ";	// 3. ���ڿ� ���� str = 134
	}
	
	public static void main(String[] args) {
	ExceptionTest ee = new ExceptionTest();
	ee.foo(0);
	ee.foo(1);
	System.out.println(ee.str);	// 13423
	}
}
