package _2017_01_09.Abstrack_Package;

public class Circle extends Shape {
	protected int r;
	
	public Circle() {
		r = 0;
	}
	public Circle(int r) {
		this.r = r;
	}
	
	public double area() {	 // 원의 면적
		return Math.PI * r * r;	 // Math.PI 를 통해 3.14..... 을 사용
	}
	
	public double circumference(){  // 원의 둘레
		return Math.PI * r * 2;
	}
	
	public int getRadius() {	// getter
		return this.r;
	}
	
	public void setRadius(int r) {	// setter
		this.r = r;
	}
}
