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
	// 자바에서 키: 값의 자료구조는 map이라고 한다..
	// 자바스크립트: JavaScript Object Notation
	//           (자바스크립트에서 "대상"을 "표기"하는 방법)
	//           JSON(제이슨)
	// $.ajax({url:"...", data: ..., success: ..., error: ...})
	// $.ajax(JSON타입의 입력값)
	$('#b1').click(function() {
	
		$.ajax({
			url : "ios.jsp",
			/* data : {}, */
			success : function(doc) { // 호출한 결과를 받아 오고 싶으면 변수를 넣어 주어라!
				alert('성공')
				alert(doc)
				$('#result').append(doc + '<br>')
			},
			error : function() {
				alert('실패')
			}
		})
		
		})
	$('#b2').click(function() {
	
		$.ajax({
			url : "a.jsp",
			/* data : {}, */
			success : function(doc) { // 호출한 결과를 받아 오고 싶으면 변수를 넣어 주어라!
				alert('성공')
				alert(doc)
				$('#result').append(doc + '<br>')
			},
			error : function() {
				alert('실패')
			}
		})
	})
	$('#b3').click(function() {
	
		$.ajax({
			url : "b.jsp",
			/* data : {}, */
			success : function(doc) { // 호출한 결과를 받아 오고 싶으면 변수를 넣어 주어라!
				alert('성공')
				alert(doc)
				$('#result').append(doc + '<br>')
			},
			error : function() {
				alert('실패')
			}
		})
	})
})
			
</script>
</head>
<body>
<button id = "b1">Ajax Test</button>
<button id = "b2">문제1</button>
<button id = "b3">문제2</button>
ajax실행 결과는 <div id="result"></div>
</body>
</html>