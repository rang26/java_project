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
		n1Valuse = $('#n1').val()
		n2Valuse = $('#n2').val()
		n1 = parseInt(n1Valuse)
		n2 = parseInt(n2Valuse)
		alert(n1 + n2)
	})
	
	$('#b2').click(function() {
		n1Valuse = $('#n1').val()
		n2Valuse = $('#n2').val()
		n1 = parseInt(n1Valuse)
		n2 = parseInt(n2Valuse)
		alert(n1 - n2)
	})
	
	$('#b3').click(function() {
		n1Valuse = $('#n1').val()
		n2Valuse = $('#n2').val()
		n1 = parseInt(n1Valuse)
		n2 = parseInt(n2Valuse)
		alert(n1 * n2)
	})
	$('#b4').click(function() {
		n1Valuse = $('#n1').val()
		n2Valuse = $('#n2').val()
		n1 = parseInt(n1Valuse)
		n2 = parseInt(n2Valuse)
		alert(n1 / n2)
	})
})// document.ready()

</script>
</head>
<body>
숫자1 : <input id="n1"> <br>
숫자2 : <input id="n2"> <br>
<button id = "b1">더하기</button>
<button id = "b2">빼기</button>
<button id = "b3">곱하기</button>
<button id = "b4">나누기</button>
</body>
</html>