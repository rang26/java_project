package 복습문제;

import java.util.Scanner;

public class 입출력문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] jumsu = {0,0,0,0,0,};
		
		for (int i = 0; i < 5; i++) {
			System.out.print("당신의 점수를 입력해주세요>> ");
			int pay = sc.nextInt();
			if (pay >= 100) {
				System.out.println("A");
			} else if (pay >= 80) {
				System.out.println("B");
			} else if (pay >= 60){
				System.out.println("c");
			} else if (pay >= 40){
				System.out.println("D");
			} else {
				System.out.println("F");
			}
			jumsu[i] = pay;
			sum = sum + pay;
		}
		double avg = sum / 5.0;
      	System.out.println("평균 점수는 " + avg);
    	System.out.println("----------------");
    	for (int i = 0; i < jumsu.length; i++) {
    		System.out.print(jumsu[i] + " ");
		}
		sc.close();
	}

}
