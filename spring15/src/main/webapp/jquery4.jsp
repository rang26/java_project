<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
//BODY부분을 먼저 ram에 읽어들여라.!!!
$(function() {
	$('#b1').click(function() {
		user = $("#user").val()
		
		if (user.length > 4) {
			// text는 글자만 인식한다.
			$('#result').text('통과') //html은 코드도 쓸 수 있다.
		} else {
			$('#result').text('5자이상 입력해주세요')
			$("#user").val('')
		}
	})
	
	$('#b2').click(function() {
		pw1 = $("#pw1").val()
		pw2 = $("#pw2").val()
		
		if (pw1 == pw2) {
			$('#result').text('동일합니다.')
		} else {
			$('#result').text('동일하지 않습니다.')
			$("#pw2").val('')
		}
	})
})// document.ready()

</script>
</head>
<body>
아이디 입력 : <input id="user"> <button id = "b1">아이디 유효성 검사</button><br>
<!-- id글자수가 5글자 이상이면 유효한 id 아니면 유효하지 않은 id 유효하지 않은 경우 user의 값을 clear -->
<hr>
비밀번호1 : <input id="pw1"> <br>
비밀번호1 : <input id="pw2"> <button id = "b2">암호 유효성 검사</button><br>
<!-- result에 프린트: pw1, pw2의 값이 동일하면 동일한 pw 아니면 동일하지 않은 pw,
	 동일하지 않은 경우 pw1, pw2의 값을 clear
 -->
<hr>

<div id="result"></div>
</body>
</html>