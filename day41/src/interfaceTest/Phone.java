package interfaceTest;

public class Phone implements PhoneInterface {
	
	// 3개 기능 정의! => 추상메서드 정의
	
	@Override
	public void internet(int time) {
		System.out.println("폰으로 인터넷하다.");
	}
	
	@Override
	public void call(String name) {
		System.out.println("폰으로 전화하다.");
	}
	
	@Override
	public void text(String myno, String tel) {
		System.out.println("폰으로 문자를 하다.");
	}
	
}
