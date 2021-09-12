<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
$(function() {

	
	$('#b3').click(function() {
		userValue = $('#user').val()
		
		$.ajax({
			url : "check2.mega",
			data : {
				id : userValue	
			},
			success : function(result) {
				/* alert('test.jsp 호출 성공') */
				alert(result)
				$('#d1').append(result + "<br>")
			}, // success
			error : function() {
				alert('check2.mega 호출 실패')
			} // error
			
			
		}) // $.ajax({
	}) // $('#b3')
	
	
}) // $(function()
</script>
</head>
<body style="background:pink">
	<h3>비동기 통신</h3>

<hr>
	회원가입할 id입력 : <input id="user">
	<button id="b3">id중복 체크</button>
<hr>
<div id="d1"></div>	
</body>
</html>