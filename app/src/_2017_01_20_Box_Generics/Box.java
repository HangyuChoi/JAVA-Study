package _2017_01_20_Box_Generics;

public class Box<T> {

	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
