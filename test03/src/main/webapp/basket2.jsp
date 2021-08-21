<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	String id = request.getParameter("id");
	String sid = request.getParameter("sid");
	String pay = request.getParameter("pay");
	String qu = request.getParameter("qu");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>장바구니 내용 확인</h3>
	<hr color="yellow">
	
	내 아이디:<%= id %><br>
	상품 아이디: <%= sid %> <br>
	상품 가격: <%= pay %> <br>
	상품 수량: <%= qu %> <br>
</body>
</html>