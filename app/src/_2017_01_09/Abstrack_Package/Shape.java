package _2017_01_09.Abstrack_Package;

public abstract class Shape {
	protected int x, y;
	
	public abstract double area();
	public abstract double circumference();
	
	
	public static void main(String[] args) {
		Circle c = new Circle(5);
		// float f = (float) c.area();
		System.out.println("|  ���� ����  : " + c.area() + "  |");
		// float i = (float) c.circumference();
		System.out.println("|  ���� �ѷ�  : " + c.circumference() + "  |");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	}
}