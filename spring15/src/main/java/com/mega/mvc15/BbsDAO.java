package com.mega.mvc15;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	//기능별로 메서드로 정의한다.
	public void create(BbsDTO bbsDTO) {
		int result = my.insert("bbs.add", bbsDTO);
		System.out.println(result);
	}
	
	public List<BbsDTO> list() {
	      List<BbsDTO> list = my.selectList("bbs.all");
	      return list;
	   }
	
	public void read() {
			
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}

