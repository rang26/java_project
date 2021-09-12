package com.mega.mvc06;

import java.io.FileWriter;
import java.io.IOException;

public class Problem04 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트 될까요.");
		
		try {
			//System.out.println("2. 문제 발생 줄!!." + 10/0); // Error
			FileWriter file = new FileWriter("/test.txt");
			file.write("내가 첫 줄\n");
			file.write("내가 둘째 줄\n");
			file.close();
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일에 쓰는 중 에러 발생.");
		} catch (Exception e) {
			System.out.println("위에 명시된것 말고도 모든 에러 처리!");
		} finally {
			//에러의 발생 유무와는 상관없이 반드시 실행해주어야하는 부분은 여기에 넣음.
			System.out.println("휴 예외처리 끝~");
		}
		
		System.out.println("3. 나도 프린트 될까요.");
	}

}
