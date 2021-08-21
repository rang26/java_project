package 스레드;

public class 동시처리Main2 {

	public static void main(String[] args) {
		// thread객체 생
		Count1 thread1 = new Count1();
		Img1 thread2 = new Img1();
		Timer1 thread3 = new Timer1();
		
		//cpu에 스레드를 등록해주어야함.
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("스레드 종료");
		
	}

}
