package com.mega.mvc08.문제;

public class Ballpen extends Product {
	int size;
	
	public void write() {
		System.out.println("볼펜으로 글을 쓰다.");
	}

	@Override
	public String toString() {
		return "Ballpen [size=" + size + ", price=" + price + ", company=" + company + "]";
	}
	
}
