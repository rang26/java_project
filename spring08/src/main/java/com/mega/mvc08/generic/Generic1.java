package com.mega.mvc08.generic;

import java.util.ArrayList;

public class Generic1 {

	public static void main(String[] args) {
		// 가변적인 데이터 모음, 변화가 많음.
		// 하나의 데이터 타입만 넣으려고 하는 경우.
		
		ArrayList<Integer> list = new ArrayList<>();
		//제너릭 프로그램을 사용하면 캐스팅 안해도 된다.
		list.add(100);
		list.add(200);
		list.add(300);
		int i1 = list.get(0);
		System.out.println(i1 + 100);
		
		ArrayList<Double> list2 = new ArrayList<>();
		//제너릭 프로그램을 사용하면 캐스팅 안해도 된다.
		list2.add(11.1);
		list2.add(11.2);
		list2.add(11.3);
		
	}

}
