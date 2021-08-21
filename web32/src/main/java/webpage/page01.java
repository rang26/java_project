package webpage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// JSP가 서버에서 실행될 때는 자바프로그램으로 자동 코드 변경되어 실행된다.
// 이렇게 자동생성되는 자바코드를 서블릿이라고 부른다.
// servlet : server + let(릿, 작은 프로그램)
// JSP -> Servlet: Tomcat내의 Jsp엔진(서블릿 엔진)
// JSP내에 작성한 모든 자바코드는 service()메서드안으로 들어가서 자동 생성
// JSP내에 선언된변수는 모두 지역변수이다. 초기화를 반드시 해주어야 한다.
public class page01 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		super.service(req, resp);
	}

}
