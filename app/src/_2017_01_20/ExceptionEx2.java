package _2017_01_20;

	import java.io.IOException;

	public class ExceptionEx2 {
	   public void method1() throws Exception{
	      throw new Exception();
	   }
	   public void methosd2() throws Exception{
	      method1();   
	   }
	   public static void main(String[] args) throws Exception{
	       new ExceptionEx2().methosd2();

	   }

}
