package _2017_01_18;

public class StringTrimEx {
	public static void main(String[] args) {
		String tel1 = "   02";
		String tel2 = "123    ";
		String tel3 = "    1234   ";
		String tel4 = "    12   34   ";
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		
		System.out.println(tel);
		System.out.println(tel4.trim());
	}
}
