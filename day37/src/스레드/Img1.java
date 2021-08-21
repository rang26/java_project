package 스레드;

public class Img1 extends Thread {
	public void run() {
		String[] list = {"1.png","2.png","3.png","4.png","5.png","6.png","7.png","8.png","9.png","10.png"};
		for (int i = 0; i < list.length; i = i - 2) {
			System.out.println(list[i]);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
