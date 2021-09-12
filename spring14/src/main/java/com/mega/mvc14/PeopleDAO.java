package com.mega.mvc14;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PeopleDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void create(PeopleDTO peopleDTO) {
		System.out.println(peopleDTO);
		int result = my.insert("people.create", peopleDTO); 
		System.out.println(result);

	
	}
}