package 스레드;

import java.util.Date;

public class Timer1 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i = i - 2) {
			Date date = new Date();
			System.out.println(date);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
