package 스레드;

public class 동시2 extends Thread{
	
	public void run() {
		// run메ㅓ드를 오버라이트해서 구현해주면, run메서드 내의 구현 부분이 동시에처리.	
		super.run();
			for (int i = 0; i < 100; i++) {
				System.out.println("동시2>> " + i);
			}
	}
}
