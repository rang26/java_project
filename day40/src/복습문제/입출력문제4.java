package 복습문제;

import java.util.Scanner;

public class 입출력문제4 {

   public static void main(String[] args) {
       // 시작할 값 입력, 종료할 값 입력, 1020, 3333
	   // 5의 배수만 더해서 출력
	   // 5의 배수의 개수
	   // 5의 배수의 목록
	   // 5의 배수의 평균값
	  Scanner sc = new Scanner(System.in);
	  System.out.print("시작할 값>> ");
	  int st = sc.nextInt();
	  System.out.print("종료할 값>> ");
	  int end = sc.nextInt();
	  int sum = 0;
	  int num = 0;
	  String list = "";
	  for (int i = st; i < end; i++) {
		if (i % 5 == 0) {
			sum+= i;
			num++;
			list += i + " \n";
		}
	  }
	  
		System.out.print("5의 배수 더한 합계: " + sum);
		System.out.println("5의 배수의 개수: " + num);
		System.out.println("5의 배수의 목록: " + list);
		int avg = sum /num;
		System.out.println("5의 배수 평균: " + avg);
		sc.close();
	  
	  
	   
   }
}
