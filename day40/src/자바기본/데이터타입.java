package 자바기본;

public class 데이터타입 {

	public static void main(String[] args) {
		byte b = 100; //~128~127, 1바이트, 8비트의 모음
		// bit(비트): 신호 하나, 1/0
		// @ : 0, 1(2개)
		// @@:  00, 01, 10, 11 (4개)
		// @@@: 000, 001, ...(8개)
		// @@@@: (256개) -128~127
		short s  = 30000; // 2바이트 +-3
		int i = 100000000; // 4바이트 +-21억
		long l = 2200000000l;//8바이트,2200000000l
		
		double d = 4.5678912345; // 8바이트
		float f = 1.2334456F; // 4바이트,1.234456f
		
		char c = 'A'; // 2바이트
		System.out.println(c + 1);
		
		boolean bo = true; // false 1바이
	}

}
