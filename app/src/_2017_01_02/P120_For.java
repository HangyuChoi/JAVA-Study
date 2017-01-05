package _2017_01_02;
public class P120_For {
	public static void main(String args[]) {
		int sum = 0;
		int j = 0;
		int a = 0;
		for(int i = 1; i <=100; i++){
			sum += i; // ÃÑ ÇÕ°è
			if(i % 2 == 0 ){
				j = j+1; // Â¦¼ö °¹¼ö
				System.out.println("Â¦¼ö : " + i);
				a += i; // Â¦¼ö ÇÕ
			}
		}
		System.out.println("-------------");
		System.out.println("Â¦¼ö °¹¼ö : " + j);
		System.out.println("Â¦¼ö ÇÕ°è : " + a);
		System.out.println("ÃÑ ÇÕ°è : " + sum);
	}
}



//class ´Â Ç×»ó Ã¹±ÛÀÚ´Â ´ë¹®ÀÚ·Î ÀÌ°ÍÀÌ °ü·Ê´Ù.
//int sum =0;
//for(int i = 0; i <=100; i++){
//	sum = sum + i;
//}
//System.out.println("ÇÕ°è : "+sum);	// 5050

/**********************************************************/	
	
	// For¹® Ex_2
			/*public static void main(String args[]) {
				for(int i = 1; i <=10; i++){
					System.out.println(i);
				}
			}*/
	
/**********************************************************/
	
	// For¹® Ex_3
			/*public static void main(String args[]) {
				int sum = 0;
				for(int i = 1; i <=100; i++){
					sum += i; 
				}
				System.out.println(sum);
			}*/
	
/**********************************************************/
	
	// For¹® Ex_4
			/*public static void main(String args[]) {
				for(int i = 0; i < 3; i++){
					System.out.println("i : " + i); 
				}
			}*/
/**********************************************************/
	// For¹® Ex_4
//			public static void main(String args[]) {
//				int sum = 0;
//				for(int i = 1; i <=100; i++){
//					sum += i;
//					System.out.println("Sum +" + i + " = " +sum); // + : °áÇÕ ¿¬»êÀÚ (¹®ÀÚ·Î ÀÎ½Ä) µû¶ó¼­  °á°ú´Â 11ÀÌ µÈ´Ù. 
//				}
//				System.out.println("Sum : " + sum);
//			}
	
	// ¹®Á¦ : 1~100±îÁöÀÇ ÇÕ °ú ¹üÀ§ ³»¿¡¼­ Â¦¼ö¸¦ ±¸ÇÏ½Ã¿À. 
//	public static void main(String args[]) {
//		int sum = 0;
//		int j = 0;
//		int a = 0;
//		for(int i = 1; i <=100; i++){
//			sum += i; // ÃÑ ÇÕ°è
//			if(i % 2 == 0 ){
//				j = j+1; // Â¦¼ö °¹¼ö
//				System.out.println("Â¦¼ö : " + i);
//				a += i; // Â¦¼ö ÇÕ
//			}
//		}
//		System.out.println("-------------");
//		System.out.println("Â¦¼ö °¹¼ö : " + j);
//		System.out.println("Â¦¼ö ÇÕ°è : " + a);
//		System.out.println("ÃÑ ÇÕ°è : " + sum);
//	}
//}
