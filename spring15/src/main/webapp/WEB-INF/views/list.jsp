<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!-- prefix에 c로 지정해 놓고 uri를 지정해주면 자바 기본문법을 사용 할 수 있다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
전체 프린트 : ${list}
<hr color="red">
	<table border=1>
		<tr bgcolor="yellow">
			<td width="100">아이디</td>
			<td width="100">이름</td>
			<td width="100">전화번호</td>	
			<td width="100">상세페이지</td>	
		</tr>
	<c:forEach items="${list}" var="dto">
		${dto} <br>
		<tr bgcolor="yellow">
			<td width="100">${dto.id}</td>
			<td width="100">${dto.name}</td>
			<td width="100">${dto.tel}</td>	
			<td width="100">
				<a href="one.do?id=${dto.id}">
				<!-- http://localhost:8080/mvc14/one.do?id=1 -->
					<button style="background: pink;">상세페이지로</button>
				</a>
			</td>
			
			<td width="100">
				<a href="del.do?pw=${dto.pw}">
					<button style="background: blue;">삭제</button>
				</a>
			</td>		
		</tr>
	</c:forEach>
	</table>
</body>
</html>