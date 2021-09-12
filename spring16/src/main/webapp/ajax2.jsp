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
		
		$('#b1').click(function() {
			food1Value = $('#food1').val()
			food2Value = $('#food2').val()
			
			$.ajax({
				url : "b1.jsp",
				data : {
					food1 : food1Value,	
					food2 : food2Value	
				},
				success : function(result) {
					
					alert(result)
					$('#d1').append(result + "<br>")
				}, // success
				error : function() {
					alert('b1.jsp 호출 실패')
				} // error
				
				
			}) // $.ajax({
		}) // $('#b1')
			
		$('#b2').click(function() {
			tempValue = $('#temp').val()
			dayValue = $('#day').val()
			
			$.ajax({
				url : "b2.jsp",
				data : {
					temp : tempValue,	
					day : dayValue	
				},
				success : function(result) {
					
					alert(result)
					$('#d2').append(result + "<br>")
				}, // success
				error : function() {
					alert('b2.jsp 호출 실패')
				} // error
				
				
			}) // $.ajax({
		}) // $('#b1')	
		
	}) //$(function()


</script>
</head>
<body>
	먹고 싶은 음식 : <input id="food1"> <br>
	먹기 싫은 음식 : <input id="food2"> <br>
	<button id="b1">눌러줘~~</button> <br>
	<div id="d1"></div>
<hr>	
	오늘의 온도는 : <input id="temp"> <br>
	오늘은 무슨요일인가 : <input id="day"> <br>
	<button id="b2">눌러볼래?</button> <br>
	<div id="d2"></div>
</body>
</html>