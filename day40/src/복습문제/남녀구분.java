package 복습문제;

public class 남녀구분 {

	public static void main(String[] args) {
		Ssn ssn = new Ssn();
		
		int[][] gender = ssn.ssn1(100);
		
		System.out.println("서울지역 " + (gender[0][0] + gender[0][1]) + "명 중 남자는 " + gender[0][0] + "명, 여자 " + gender[0][1] + "명");
		System.out.println("부산지역 " + (gender[1][0] + gender[1][1]) + "명 중 남자는 " + gender[1][0] + "명, 여자 " + gender[1][1] + "명");
		System.out.println("제주지역 " + (gender[2][0] + gender[2][1]) + "명 중 남자는 " + gender[2][0] + "명, 여자 " + gender[2][1] + "명");
		System.out.println("기타지역 " + (gender[3][0] + gender[3][1]) + "명 중 남자는 " + gender[3][0] + "명, 여자 " + gender[3][1] + "명");
	}

}
