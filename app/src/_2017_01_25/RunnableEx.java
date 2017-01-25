package _2017_01_25;

public class RunnableEx {
	public RunnableEx() {
		Runnable runnable = new Runnable() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(i);
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
	public static void main(String args[]) {
		new RunnableEx();
		
		// ¶÷´Ù½Ä
/*		
		Runnable runnable = () -> {
			for(int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
*/
	}
}
