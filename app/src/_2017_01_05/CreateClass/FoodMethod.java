package _2017_01_05.CreateClass;

public class FoodMethod {

	void a(int b){	// 유통기한 체크
		if (b > 5) {
			System.out.println("유통기한이 지났어요.");
		} else {
			System.out.println("먹을 수 있어요");
		}
	}
	
	public static void main(String[] args) {
		Food food = new Food();
		Meat meat = new Meat();
		Cheese cheese = new Cheese();
		Bread bread = new Bread();
		Etc etc = new Etc();
		System.out.println(food.name + " 속에 내용물 : " 
						+ meat.name + ", " 
						+ cheese.name + ", "
						+ bread.name + ", "
						+ etc.name);
		
		System.out.println(food.name + " 가격 : " + food.price);
		
		FoodMethod me = new FoodMethod();
		System.out.println();
		me.a(3); // 유통기한 설정
	}
}
