package _2017_01_18;

public class SmartPhoneEx {
	public static void main(String args[]) {
		SmartPhone myPhone1 = new SmartPhone("삼성", "안드로이드");
		SmartPhone myPhone2 = new SmartPhone("엘지", "안드로이드");
		SmartPhone myPhone3 = new SmartPhone("애플", "IOS");
		String strObj1 = myPhone1.toString();
		String strObj2 = myPhone2.toString();
		String strObj3 = myPhone3.toString();
		
		System.out.println(strObj1);
		System.out.println(strObj2);
		System.out.println(strObj3);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(myPhone1);
		System.out.println(myPhone2);
		System.out.println(myPhone3);
	}
}
