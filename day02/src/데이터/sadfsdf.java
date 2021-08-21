package 데이터;
import java.util.Scanner;
public class sadfsdf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("로그인할 id를 입력>> ");
		String id = sc.next();
		sc.close();
		if (id.equals("root")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
}
