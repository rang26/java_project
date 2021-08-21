package 복습문제;

import java.util.Scanner;

public class 입출력문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("당신이 가지고 있는 현금은? >> ");
			int pay = sc.nextInt();
			if (pay >= 5000) {
				System.out.println("1시간이상 노래 할 수있어요.");
			} else if (pay >= 3000) {
				System.out.println("10곡을 노래 할 수있어요.");
			} else {
				System.out.println("8곡 미만으로 노래 할 수 있어요.");
			} 
		}
		sc.close();
	}

}
