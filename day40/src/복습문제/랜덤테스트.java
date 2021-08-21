package 복습문제;

import java.util.Random;

public class 랜덤테스트 {

	public static void main(String[] args) {
		Random r = new Random(100);// seed값, 씨앗
		int start = r.nextInt(100);// 0~99, 시작
		int end = r.nextInt(10) + 1000; // 1000~1009, 종료값
		int sum = 0;
		for (int i = start; i < end; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
			
		}
		System.out.println("첫번째 숫자: " + start);
		System.out.println("두번째 숫자: " + end);
		System.out.println("3의 배수만 더한 : " + sum);
	}

}
