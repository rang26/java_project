package com.mega.mvc09;

import org.springframework.stereotype.Repository;

// dao는 무조건 싱클톤으로 만들어주어야한다.
@Repository //싱글톤으로 만들어준다.(싱글톤을 만들어줄 객체가 아니면 어노테이션 달지 않는다.)
public class MemberDAO {
	
	public boolean login(MemberDTO dto) {
		String dbId = "root";
		String dbPw = "1234";
		boolean result = false; 
		if (dto.getId().equals(dbId) || dto.getPw().equals(dbPw)) {
			result = true;
		}
		return result;
	}
	
	
	public void create() {
		
	}
	public void read() {
		
	}
	public void update() {
		
	}
	public void delete() {
		
	}
	
}
