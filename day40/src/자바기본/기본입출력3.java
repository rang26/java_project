package 자바기본;


public class 기본입출력3 {

	  public static void main(String[] args) {
	      //시작은 100부터 값 500이 되기 전까지 전체를 더해보세요!
	      
	      int sum = 0;
	      int i2 = 100;//초기값
	      while (i2<500) {//반복할 조건
	         sum += i2;
	         i2++;
	         System.out.println(sum);
	      }
	   }

	}