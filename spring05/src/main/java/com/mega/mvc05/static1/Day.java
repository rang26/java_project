package com.mega.mvc05.static1;

public class Day {
	
	// 맴버변수, 전역변수, 자동초기화
	String doing; // null
	int time; // 0
	String location; // null
	static int count;
	static int sum;
	
	public Day(String doing, int time, String location) {
		// this는 클래스 밑에 있는
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum+= time;
	}
	
	// static메서드는 객체생성하지 않아도 아무때나 클래스이름으로 접근해서 기능을 처리
	// 자주쓰는 기능은 static메서드로 만들어놓으면 아무때나 쓸 수 있어서 편하다.
		// static메서드 안에는 static변수만 사용가능(instance변수 사용 불가능!!)
		// instance변수는 객체 생성후 접근 가능하기 때문
		// static메서드는 객체생성하지 않아도 접근해서 처리를 해야함.
		
	public static int getAvg() {
		return sum/count;
		
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
}
