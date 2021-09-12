package com.mega.mvc08.box;


public class BoxingUnBoxing2 {

	public static void main(String[] args) {
		// 참조형 변수에 들어있는 주소를 기본형 변수에 넣을 수 없다.
		// => 자바는변수가 선언될 때 변수에 들어가는타입이 결정되기 때문
		// 기본형과 기본형에 대한 포당 클래스만 가능!
		Integer i1 = new Integer(0); // 참조형
		int i2 = 0; // 기본형 정수
		int i3 = 0;
		
		// 참조형변수에 기본형 값을 넣음.
		// 기본형변수에 참조형 값을 넣음.
		i1 = i2; // 참조형(객체) <--(오토박싱)-- 기본형
		i3 = i1; // 기본형 <-(오토언박싱)-- 참조형(객체)
		
	}

}
