package _2017_01_05;

import java.util.Scanner;


class Apple {
	String name;	
	String color;	
	int price;
	int number;	
	
	public Apple() {
		this.name = "사과";
		this.color = "빨간";
		this.price = 500;
		this.number = 15;
	}
	
	public Apple(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void sell(int num) {
		int sum = 0;
		this.number -= num;
		sum = this.price * num;
		System.out.println("\n" + num + "개는" + sum + "원 입니다.\n이용해 주셔서 감사합니다.\n");
	}
}

class Banana {
	String name;	
	String color;	
	int price;
	int number;	
	
	public Banana() {
		this.name = "바나나";
		this.color = "노란";
		this.price = 3000;
		this.number = 20;
	}
	
	public Banana(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void sell(int num) { 
		int sum = 0;
		this.number -= num;
		sum = this.price * num;
		System.out.println("\n" + num + "개는" + sum + "원 입니다.\n이용해 주셔서 감사합니다.\n");
	}
}


public class ClassEx {

	public static void main(String args[]){
		Apple a = new Apple();
		Banana b = new Banana();
		ClassEx me = new ClassEx();
		Scanner sc = new Scanner(System.in);
		
		boolean loop = true;
		
		while(loop) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("과일을 선택하세요.");
			System.out.println("1 : 사과, 2 : 바나나, 3 : 정산, 4 : 종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("> ");
			int input = sc.nextInt();
			
			boolean loopA = true;
			boolean loopB = true;
			
			if(loopA == false && loopB == false) {
				System.out.println("모든 과일이 팔렸어요. 다음에 이용해주세요.");
				loop = false;
			}
			switch(input) {
				case 1 :
					if (a.number == 0) {
						System.out.println("\n현재 "+ a.name + "의 수량은 " + a.number + "개 입니다.\n다른 과일을 구매하세요.\n");
						//loopA = false;
						break;
					}
					System.out.println("\n" + a.color + a.name + "를 선택하셨네요^_^");
					System.out.println("현재 "+ a.name + "의 수량은 " + a.number + "개 있으며, 개당 가격은 : " + a.price + "원입니다.\n");
					
					while(loopA) {
						System.out.print(a.name + "를 몇개 구매하시겠습니까? > ");
						int inputA = sc.nextInt();
						if(a.number < inputA) {
							System.out.println("\n현재 "+ a.name + "의 수량은 " + a.number + "개 입니다.\n수량에 맞게 다시 입력해주세요.\n");
							continue;
						} else {
							a.sell(inputA);
						}
						break;
					}
					break;
					
				case 2 :
					if (b.number == 0) {
						System.out.println("\n현재 "+ b.name + "의 수량은 " + b.number + "개 입니다.\n다른 과일을 구매하세요.\n");
						//loopB = false;
						break;
					}
					System.out.println("\n" + b.color + b.name + "를 선택하셨네요");
					System.out.println("현재 "+ b.name + "의 수량은 " + b.number + "개 있으며, 개당 가격은 : " + b.price + "원입니다.");
					
					while(loopB) {
						System.out.print(b.name + "를 몇개 구매하시겠습니까? > ");
						int inputB = sc.nextInt();
						if(b.number < inputB) {
							System.out.println("\n현재 "+ b.name + "의 수량은 " + b.number + "개 입니다.\n\n수량에 맞게 다시 입력해주세요.\n");
							continue;
						} else {
							a.sell(inputB);
						}
						break;
					}
					break;
				case 3 :
					
					break;
				case 4 :
					loop = false;
					break;
				default :
					System.out.println("잘못 누르셨어요. 다시 골라주세요.\n");
					break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
