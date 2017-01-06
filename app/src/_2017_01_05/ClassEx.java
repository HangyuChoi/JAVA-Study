package _2017_01_05;

import java.util.Scanner;


class Apple {
	String name;	
	String color;	
	int price;
	int number;	
	
	public Apple() {
		this.name = "���";
		this.color = "����";
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
		System.out.println("\n" + num + "����" + sum + "�� �Դϴ�.\n�̿��� �ּż� �����մϴ�.\n");
	}
}

class Banana {
	String name;	
	String color;	
	int price;
	int number;	
	
	public Banana() {
		this.name = "�ٳ���";
		this.color = "���";
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
		System.out.println("\n" + num + "����" + sum + "�� �Դϴ�.\n�̿��� �ּż� �����մϴ�.\n");
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
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("������ �����ϼ���.");
			System.out.println("1 : ���, 2 : �ٳ���, 3 : ����, 4 : ����");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("> ");
			int input = sc.nextInt();
			
			boolean loopA = true;
			boolean loopB = true;
			
			if(loopA == false && loopB == false) {
				System.out.println("��� ������ �ȷȾ��. ������ �̿����ּ���.");
				loop = false;
			}
			switch(input) {
				case 1 :
					if (a.number == 0) {
						System.out.println("\n���� "+ a.name + "�� ������ " + a.number + "�� �Դϴ�.\n�ٸ� ������ �����ϼ���.\n");
						//loopA = false;
						break;
					}
					System.out.println("\n" + a.color + a.name + "�� �����ϼ̳׿�^_^");
					System.out.println("���� "+ a.name + "�� ������ " + a.number + "�� ������, ���� ������ : " + a.price + "���Դϴ�.\n");
					
					while(loopA) {
						System.out.print(a.name + "�� � �����Ͻðڽ��ϱ�? > ");
						int inputA = sc.nextInt();
						if(a.number < inputA) {
							System.out.println("\n���� "+ a.name + "�� ������ " + a.number + "�� �Դϴ�.\n������ �°� �ٽ� �Է����ּ���.\n");
							continue;
						} else {
							a.sell(inputA);
						}
						break;
					}
					break;
					
				case 2 :
					if (b.number == 0) {
						System.out.println("\n���� "+ b.name + "�� ������ " + b.number + "�� �Դϴ�.\n�ٸ� ������ �����ϼ���.\n");
						//loopB = false;
						break;
					}
					System.out.println("\n" + b.color + b.name + "�� �����ϼ̳׿�");
					System.out.println("���� "+ b.name + "�� ������ " + b.number + "�� ������, ���� ������ : " + b.price + "���Դϴ�.");
					
					while(loopB) {
						System.out.print(b.name + "�� � �����Ͻðڽ��ϱ�? > ");
						int inputB = sc.nextInt();
						if(b.number < inputB) {
							System.out.println("\n���� "+ b.name + "�� ������ " + b.number + "�� �Դϴ�.\n\n������ �°� �ٽ� �Է����ּ���.\n");
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
					System.out.println("�߸� �����̾��. �ٽ� ����ּ���.\n");
					break;
			}
		}
		System.out.println("���α׷� ����");
	}
}
