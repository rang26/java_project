package 자바책예제;

public class 책104쪽2번 {

	public static void main(String[] args) {

//		1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하시오

		int evenSum = 0;
		int oddSum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		
		System.out.println("짝수의 합계는 " + evenSum); // 2550
		System.out.println("홀수의 합계는 " + oddSum); // 2500

	}

}
