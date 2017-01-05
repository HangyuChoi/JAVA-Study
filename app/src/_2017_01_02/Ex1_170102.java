package _2017_01_02;
public class Ex1_170102 {
	public static void main(String[] args) {
		/* */
		for (int i = 0; i < 5; i++){
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		/* */
		for ( int i = 5; i > 0; i--) {
			for ( int j = 0; j < 5; j++) {
				if (j > i-2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		/* */
		for (int i = 5; i > 0; i--){
			for (int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		/* */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j < i){
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}	
		


/*		
		 	* 
		 	**
		 	***
		 	****
		 	*****
		
		for (int i = 0; i < 5; i++){
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	 		***** 
	 		****
	 		***
	 		**
	 		*
	 	
		for (int i = 5; i > 0; i--){
			for (int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
 			***** 
 			 ****
 			  ***
 			   **
 			    *
 		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j < i){
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
			    * 
			   **
			  ***
			 ****
			*****
		
		for ( int i = 5; i > 0; i--) {
			for ( int j = 0; j < 5; j++) {
				if (j > i-2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		/*
		 	    * 
		       ***
		      *****
		   	 *******
			*********
			 *******
			  *****
		       ***
                *			
		*/


//for(int i = 0; i < 5; i++){
//if (i == 0) {
//	System.out.println("*");
//} else if (i == 1) {
//	System.out.println("**");
//} else if (i == 2){
//	System.out.println("***");
//} else if (i == 3){
//	System.out.println("****");
//} else {
//	System.out.println("*****");
//}
//}
