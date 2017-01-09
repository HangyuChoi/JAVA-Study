package _2017_01_09.Abstrack_Package;

public class Rect extends Shape {
	protected int width, height;
	
	public Rect() {
		this(0,0);
	}
	
	public Rect(int w, int h) {
		width = w;
		height = h;
		x = getWidth();
		y = getHeight();
	}
	
	public double area() {	 // �簢���� ����
		return width * height;	 // Math.PI �� ���� 3.14..... �� ���
	}
	
	public double circumference(){  // �簢���� �ѷ�
		return 2 * (width + height);
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setSize(int w, int h){
		width = w;
		height = h;
	}
	
	public int getSize() {
		return x * y;
	}
}
