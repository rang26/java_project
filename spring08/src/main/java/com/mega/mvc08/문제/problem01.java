package com.mega.mvc08.문제;

import java.util.ArrayList;

public class problem01 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		
		me.add(1000);
		me.add(189.1);
		me.add(false);
		me.add('남');
		// 전체 목록 프린트
		System.out.println(me);
		
		// 돈 1000을 꺼내서 2000을 더해서 프린트
		// int <-(오토언박싱)-- Integer <-(다운캐스팅)-- Object
		int money = (Integer)me.get(0); 
		System.out.println(money + 2000);
		
		// 키 189.1을 꺼내서 10을 더해서 프린트
		// double <-(오토언박싱)-- double <-(다운캐스팅)-- Object
		double stature =(double)me.get(1);
		System.out.println(stature + 10);
		
		// 아침여부 false를 꺼내서 아침을 먹었으면 배불러요. 아니면 배고파요.
		boolean meal = (boolean)me.get(2);
		if (meal) {
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
		}
		
		// 성별 남꺼내서 남이면 주민번호는 1,3 이예요. 아니면 주민번호는 2,4예요
		char gender = (Character)me.get(3);
		if (gender == '남') {
			System.out.println("주민번호는 1,3 입니다.");
		} else {
			System.out.println("주민번호는 2,4 입니다.");
		}
		
		
	}

}
