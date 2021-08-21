<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
    
    $('#b1').click(function() {
       
       
       reple = $('#in1').val();
       result = $('#result1');
       result.append(reple+'<br>')
       
       
    })
    
 })
</script>
</head>

<body>

	<div id='result1'></div>

	<hr color=red>

	댓글입력:
	<input id='in1'>
	<button id=b1>댓글달기</button>

</body>
</html>