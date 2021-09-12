package com.mega.mvc09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@Autowired
	MovieDAO dao;
	
	@RequestMapping("movie")
	public String movie (String title, int ticket) { 
		System.out.println(title + "," + ticket);
		if (ticket > 10000) {
			return "pay"; 
		} else {
			return "redirect:movie.jsp";
		}
		
	}
	@RequestMapping("pay.do")
	public void moviePay() {
		dao.pay();
	}

}
