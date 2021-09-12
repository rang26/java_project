package com.mega.mvc08.문제;

public class BallPenMain {

	public static void main(String[] args) {
		Ballpen p1 = new Ballpen();
		p1.company = "mega";
		p1.price = 1000;
		p1.size = 10;
		
		p1.bay();
		p1.write();
		System.out.println(p1);
		
	}

}
