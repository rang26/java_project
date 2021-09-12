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
		word = $('#word').val()
		$('#result').append('- ' + word + '<br>')
	})
	
	$('#b2').click(function() {
		img = '<img src="resources/img/22.jpg" width="100" height="100">'
		$('#result').append(img + '<br>')
	})
	
	$('#b3').click(function() {
		word = $('#word').val()
		img = '<img src="resources/img/22.jpg" width="100" height="100">'
		$('#result').append(img + ' ' + word + '<br>')
	})
})// document.ready()

</script>
</head>
<body>
댓글 : <input id="word"><br>
 <button id = "b1">댓글추가</button>
 <button id = "b2">이미지 추가</button>
 <button id = "b3">댓글 + 이미지추가</button>
<hr>
<div id="result"></div>
</body>
</html>