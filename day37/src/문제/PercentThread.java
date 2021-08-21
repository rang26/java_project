package 문제;

public class PercentThread extends Thread{
	public void run() {
		super.run();
		for (int i = 0; i < 100; i++) {
			System.out.println("% " + i);
		}
	}
	
}
