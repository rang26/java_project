<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="one.do">
		id : <input name="id"><br>
		<button>회원 정보 검색 요청</button>
	</form>
<hr>
	<a href="list.mega">회원 정보 전체 목록 가지고 오기</a>	
	
	<form action="del.do">
		pw : <input name="pw"><br>
		<button>삭제</button>
	</form>
	
</body>
</html>