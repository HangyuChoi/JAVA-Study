package _2017_01_18;

public class StringEqualsEx {
	public static void main(String args[]) {
		String strVar1 = new String("½Å¹ÎÃ¶");
		String strVar2 = "½Å¹ÎÃ¶";
		String strVar3 = "½Å¹ÎÃ¶";
		System.out.println("String strVar1 = new String("+"½Å¹ÎÃ¶"+");");
		System.out.println("String strVar2 = "+"½Å¹ÎÃ¶"+"");
		System.out.println("String strVar3 = "+"½Å¹ÎÃ¶"+"");
		System.out.println();
		System.out.println("strVar1 == strVar2");
		if(strVar1 == strVar2) {
			System.out.println("°°Àº String °´Ã¼¸¦ ÂüÁ¶");
		} else {		
			System.out.println("´Ù¸¥ String °´Ã¼¸¦ ÂüÁ¶");
		}
		System.out.println();
		System.out.println("strVar1.equals(strVar2)");
		if(strVar1.equals(strVar2)) {
			System.out.println("°°Àº ¹®ÀÚ¿­À» °¡Áü");
		} else {		
			System.out.println("´Ù¸¥ ¹®ÀÚ¿­À» °¡Áü");
		}
		System.out.println();
		System.out.println("strVar2.equals(strVar3)");
		if(strVar2.equals(strVar3)) {
			System.out.println("°°Àº ¹®ÀÚ¿­À» °¡Áü");
		} else {		
			System.out.println("´Ù¸¥ ¹®ÀÚ¿­À» °¡Áü");
		}
		System.out.println();
		System.out.println("strVar2 == strVar3");
		if(strVar2 == strVar3) {
			System.out.println("°°Àº String °´Ã¼¸¦ ÂüÁ¶");
		} else {		
			System.out.println("´Ù¸¥ String °´Ã¼¸¦ ÂüÁ¶");
		}

	}

}
