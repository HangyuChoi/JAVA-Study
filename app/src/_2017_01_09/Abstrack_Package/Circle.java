package _2017_01_09.Abstrack_Package;

public class Circle extends Shape {
	protected int r;
	
	public Circle() {
		r = 0;
	}
	public Circle(int r) {
		this.r = r;
	}
	
	public double area() {	 // ���� ����
		return Math.PI * r * r;	 // Math.PI �� ���� 3.14..... �� ���
	}
	
	public double circumference(){  // ���� �ѷ�
		return Math.PI * r * 2;
	}
	
	public int getRadius() {	// getter
		return this.r;
	}
	
	public void setRadius(int r) {	// setter
		this.r = r;
	}
}
