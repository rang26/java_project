<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Mail</h3>
<hr>
<%if (session.getAttribute("id") != null) {%>
	<%=session.getAttribute("id") %>님이 로그인하셨습니다.
<%} else {%>
	로그인해주세요. <br>
	<a href="main.jsp"><button>로그인 화면으로</button></a>
<%} %>
</body>
</html>