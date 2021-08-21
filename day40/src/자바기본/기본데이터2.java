package 자바기본;

public class 기본데이터2 {

	public static void main(String[] args) {
		byte b = 100;
		int i = b; // 큰 <---작, 자동타입변환(자동형 변환)
		
		int i2 = 100;
		byte b2 = (byte)i2; // 작 <--- 큰, 강제타입변환(강제형변환)
		
		// 형변환: cpu가 차입을 변환, 캐스팅(casting)
		// ram에 선언된 타입 변경 불가, 선언할 때 타입이 결정되기 때문에 재선언 불가!
		// 케스팅의 종류 1)자동, 2)강제
		
		//강제캐스팅인 경우, 값의 범위가 해당되는 경우만 가능!
		int i3 = 1000;
		byte b3 = (byte)i3; // byte의 범위 1000 포함되지 않아서 캐스팅하면X
		System.out.println(b3);
	}

}
