package com.mega.mvc08.casting;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Casting1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hong"); // Object(큰) <- (자동형변환)-- String(작)
		list.add(new Date()); // Object(큰) <- (자동형변환)-- Date(작)
		list.add(new Random()); // Object(큰) <- (자동형변환)-- Random(작)
		// Object(큰) <- (자동형변환)UpCasting-- Integer(작) <- (auto-boxing)-- int(기본형)
		list.add(100); 
		// Object(큰) <- (자동형변환)-- Double(작) <- (auto-boxing)-- double(기본형)
		list.add(11.11);
		System.out.println(list);
		
		Object name = list.get(0); // Object
		System.out.println(name.equals("hong"));
		
		// 100을 꺼내서 1을 더해보세요.(다운캐스팅)
		int age = (Integer)list.get(4);
		System.out.println(age + 1);
		
		// 11.11을 꺼내서 100을 더해보세요(다운캐스팅)
		double temp = (double)list.get(5);
		System.out.println(temp + 100);
		

	}

}
