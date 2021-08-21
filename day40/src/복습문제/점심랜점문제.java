package 복습문제;

import java.util.Random;

public class 점심랜점문제 {

	public static void main(String[] args) {

		Random r = new Random();
		String[] eat = new String[5];

		eat[0] = "고기";
		eat[1] = "간장새우";
		eat[2] = "야끼토리";
		eat[3] = "라볶이";
		eat[4] = "꽝";

		int eat1 = 0;
		for (int i = 0; i < eat.length; i++) {
			eat1 = r.nextInt(5);

		}
		System.out.println("오늘의 점심은 " + eat[eat1]);

	}

}
