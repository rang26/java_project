<%@page import="shop.db.회원DAO2"%>
<%@ page import="shop.dto.회원Bag" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
		String id = request.getParameter("id");
		회원Bag bag = new 회원Bag();
		bag.setId(id);
		회원DAO2 dao = new 회원DAO2();
		int result = dao.delete(bag);
		String text = "회원 탈퇴 실패. 다시 시도해보세요.";
		if (result == 1) {
			text = "회원 탈퇴 성공. 축하합니다.";
		}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= text %>
</body>
</html>