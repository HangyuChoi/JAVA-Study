package _2017_01_26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IOEx10 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(3.14));
		oos.writeObject(new int[] {1, 2, 3});
		oos.writeObject(new String("홍길동"));
		
		oos.flush(); oos.close(); fos.close();
		
		FileInputStream fis = new FileInputStream("D:/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();
		
		ois.close(); fis.close();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3[0] + ", " + obj3[1] + ", " + obj3[2]);
		System.out.println(obj4);
	}
}

class A implements Serializable {	// 객체 직렬화가 가능한 객체만 다른 클래스로 전달할 수 있다.
	int field1;
	void method() { }
}
		
