package _2017_01_05.CreateClass;

public class FoodMethod {

	void a(int b){	// ������� üũ
		if (b > 5) {
			System.out.println("��������� �������.");
		} else {
			System.out.println("���� �� �־��");
		}
	}
	
	public static void main(String[] args) {
		Food food = new Food();
		Meat meat = new Meat();
		Cheese cheese = new Cheese();
		Bread bread = new Bread();
		Etc etc = new Etc();
		System.out.println(food.name + " �ӿ� ���빰 : " 
						+ meat.name + ", " 
						+ cheese.name + ", "
						+ bread.name + ", "
						+ etc.name);
		
		System.out.println(food.name + " ���� : " + food.price);
		
		FoodMethod me = new FoodMethod();
		System.out.println();
		me.a(3); // ������� ����
	}
}
