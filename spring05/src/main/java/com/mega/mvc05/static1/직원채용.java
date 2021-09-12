package com.mega.mvc05.static1;

public class 직원채용 {

	public static void main(String[] args) {
		직원 new1 = new 직원("홍길동", "남", 25);
		직원 new2 = new 직원("김길동", "여", 26);
		직원 new3 = new 직원("송길동", "남", 27);
		
		System.out.println(new1);
		System.out.println(new2);
		System.out.println(new3);
		System.out.println(직원.count + "명");
		System.out.println((직원.sum / 직원.count) + "세");
	}

}
