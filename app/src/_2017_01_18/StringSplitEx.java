package _2017_01_18;

public class StringSplitEx {
	public static void main(String[] args) {
		String text = "boo:and:fooa";
		String[] names = text.split("o");

		for(String name : names) {
			System.out.println(name);
		}
	}
}
