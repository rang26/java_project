<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function() { //document를 rem에 dom tree로 다 읽어들였으면! document.ready()
		$('#b1').click(function() {
			alert('버튼1을 클릭하셨군요.!!!')
		})
		$('#b2').click(function() {
			alert('버튼2을 클릭하셨군요.!!!')
		})
		$('#b3').click(function() {
			alert('버튼3을 클릭하셨군요.!!!')
		})
	})
</script>
</head>
<body>
	<button id=b1>push me1!!!</button>
	<button id=b2>push me2!!!</button>
	<button id=b3>push me3!!!</button>
</body>
</html>