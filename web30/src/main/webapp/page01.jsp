<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //1. 쿠키객체를 만든다. 2개를 만든다.
    Cookie c1 = new Cookie("category", "운동");
    Cookie c2 = new Cookie("type", "축구");
    //2. 쿠키를 심어 놓는다.
    response.addCookie(c1);
    response.addCookie(c2);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
saved in browser!!
</body>
</html>