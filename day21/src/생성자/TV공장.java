package 생성자;

public class TV공장 {

	public static void main(String[] args) {
		TV tv1 = new TV("black", 100);
		TV tv2 = new TV("white", 200);
//		TV tv3 = new TV(); // 기본 생성자 실행
		System.out.println("tv1: " + tv1);
		System.out.println("tv2: " + tv2);
//		System.out.println("tv3: " + tv3); // 기본 생성자: 초기화 상태의 멤버 변수들 출력
	}

}
