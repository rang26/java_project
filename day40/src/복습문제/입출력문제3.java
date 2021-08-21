package 복습문제;

import java.util.Scanner;

public class 입출력문제3 {

   public static void main(String[] args) {
      // 시작할 값 입력, 종료할 값 입력, 1020, 3333
	  // 5의 배수만 더해서 출력
	  Scanner sc = new Scanner(System.in);
	  System.out.print("시작할 값>> ");
	  int st = sc.nextInt();
	  System.out.print("종료할 값>> ");
	  int end = sc.nextInt();
	  int sum = 0;
	  for (int i = st; i < end; i++) {
		if (i % 5 == 0) {
			sum+= i;
		}
	  }
		System.out.print("5의 배수 더한 합계: " + sum);
		sc.close();
	  
	  
	   
   }
}
