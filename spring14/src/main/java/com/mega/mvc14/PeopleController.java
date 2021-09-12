package com.mega.mvc14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PeopleController {
	
	@Autowired
	PeopleDAO dao;
	
	@RequestMapping("success.dahaeng")
	public void join(PeopleDTO peopleDTO) {
		dao.create(peopleDTO);
	}
}
