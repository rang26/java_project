package com.mega.mvc04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("create.do")
	public void insert(BbsDTO dto) {
		System.out.println("컨트롤러 메서드 호출됨....");
		System.out.println("컨트롤러에서 받은 on " + dto.getOn());
		System.out.println("컨트롤러에서 받은 title " + dto.getTitle());
		System.out.println("컨트롤러에서 받은 content " + dto.getContent());
		System.out.println("컨트롤러에서 받은 writer " + dto.getWriter());
	}
	
}
