package com.mega.mvc08.casting;


import com.mega.mvc08.문제.Ballpen;
import com.mega.mvc08.문제.Product;

public class CastingDerive {

	public static void main(String[] args) {
		// 파생된 데이터, 참조형 변수
		// 형변환(casting, 캐스팅)
		// 참조형 형변환은 "상속관계에 있는 클래스"간 가능.
		Product p = new Product();
		Ballpen b = new Ballpen();
		// 클래스간의 크기는 개념을 가지고 큰지/ 작은지를 판별
		
		p = b; // 큰 <- (자동형변환)-- 작
		b = (Ballpen)p; // 작 <- (강제형변환)-- 큰
	}

}
