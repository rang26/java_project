package 자바책예제;

public class 책106쪽6번 {

	public static void main(String[] args) {

		for (int i = 0; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
