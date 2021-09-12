<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 전체 css 입히는 코드 -->
<!-- <link rel="stylesheet" href="resources/css/out.css"> css전체 -->
</head>
<body bgColor="pink">
	<h2>Welcome!! bbs page</h2>
		<!-- 이미지 넣는 코드 이미지 이름은 바뀌어야 한다. -->
		<!-- <img src="resources/img/1.jpg" width="150" height="150"> -->
		<form action="bbs.mega">
		번호 : <input type="text" name="id"><br>
		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="content"><br>
		작성자 : <input type="text" name="writer"><br>
		<button type="submit">게시판 신청 완료</button>
	</form>
<hr>
	<a href="list2.mega">bbs 전체 목록 가지고 오기</a>	
</body>
</html>