package _2017_01_24_Thread;

import java.awt.Toolkit;
// Lambda ½Ä
public class BeepPrintEx3_Lambda {
	public static void main(String args[]) {
//		//Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(new Runnable() {
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try { Thread.sleep(500); } catch (Exception e) {}
//				}
//			}
//		});
		
		
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i = 0; i < 5; i++) {
				toolkit.beep();
				try { Thread.sleep(500); } catch (Exception e) {}
			}
		});
		
		thread.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
