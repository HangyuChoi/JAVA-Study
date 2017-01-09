package _2017_01_09.Abstrack_Package;

public class ShapeUser {
	public static void main(String args[]) {
		Shape[] shape = new Shape[3];
		shape[0] = new Circle(5);
		shape[1] = new Circle(7);
		shape[2] = new Rect(9, 5);
		
		System.out.println("shape[0]'s area = " + shape[0].area());
		System.out.println("shape[1]'s area = " + shape[1].area());
		System.out.println("shape[2]'s area = " + shape[2].area());
		System.out.println("shape[0]'s area = " + shape[0].circumference());
		System.out.println("shape[1]'s area = " + shape[1].circumference());
		System.out.println("shape[2]'s area = " + shape[2].circumference());
		
		Rect shape_rect = (Rect)shape[2]; // Çü º¯È¯
		System.out.println("Rect Size : " + shape_rect.getSize());
	}
}
