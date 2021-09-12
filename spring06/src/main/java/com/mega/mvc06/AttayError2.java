package com.mega.mvc06;

public class AttayError2 {

	public void array() {
		// 1. 배열의 IndexOutOfBoundsException이면 "인덱스 에러!!"라고 출력
		// 2. 다른 에러이면 "다른 에러 발생@@@" 이라고 출력
		// 3. 에러가 발생하든 안하든 상관없이.."배열에 문제가 사라지게 해결했어요" 를 출력
		try {
			int[] num = { 1, 2, 3 };
			num[3] = 4;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 에러!!");
		} catch (Exception e) {
			System.out.println("다른 에러 발생@@@");
		} finally {
			System.out.println("배열에 문제가 사라지게 해결했어요");

		}

	}

}
