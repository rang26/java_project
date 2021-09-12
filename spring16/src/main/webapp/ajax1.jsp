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
		wordValue = $('#word').val()
		
		$.ajax({
			url : "test.jsp",
			data : {
				word : wordValue	
			},
			success : function(result) {
				/* alert('test.jsp 호출 성공') */
				alert(result)
				$('#d1').append(result + "<br>")
			}, // success
			error : function() {
				alert('test.jsp 호출 실패')
			} // error
			
			
		}) // $.ajax({
	}) // $('#b1')
	
	$('#b2').click(function() {
		moneyValue = $('#money').val()
		payValue = $('#pay').val()
		
		$.ajax({
			url : "money.jsp",
			data : {
				money : moneyValue,	
				pay : payValue	
			},
			success : function(result) {
				/* alert('test.jsp 호출 성공') */
				alert(result)
				$('#d1').append('당신이 결제할 금액: ' + result + "<br>")
			}, // success
			error : function() {
				alert('money.jsp 호출 실패')
			} // error
			
			
		}) // $.ajax({
	}) // $('#b2')
	
	$('#b3').click(function() {
		userValue = $('#user').val()
		
		$.ajax({
			url : "user.jsp",
			data : {
				user : userValue	
			},
			success : function(result) {
				/* alert('test.jsp 호출 성공') */
				alert(result)
				$('#d1').append(result + "<br>")
			}, // success
			error : function() {
				alert('user.jsp 호출 실패')
			} // error
			
			
		}) // $.ajax({
	}) // $('#b3')
	
	$('#b4').click(function() {
		telValue = $('#tel').val()
		
		$.ajax({
			url : "tel2.jsp",
			data : {
				tel : telValue	
			},
			success : function(result) {
				/* alert('tel.jsp 호출 성공') */
				alert(result)
				$('#d1').append(result + "<br>")
			}, // success
			error : function() {
				alert('tel2.jsp 호출 실패')
			} // error
			
			
		}) // $.ajax({
	}) // $('#b1')
	
}) // $(function()
</script>
</head>
<body style="background:pink">
	<h3>비동기 통신</h3>
	<hr>
		ajax 테스트 : <input id="word">
		<button id="b1">ajax 테스트(test.jsp)</button> <br>
		
		결제금액 : <input id="money"> <br>
		1)계좌이체 2)신용카드 3)휴대폰결제 <br>
		결제수단 : <input id="pay">
		<button id="b2">결제하기</button>
	<hr>
		회원가입할 id입력 : <input id="user">
		<button id="b3">id중복 체크</button>
	<hr>
		인증받을 전화번호 입력 : <input id="tel">
		<button id="b4">인증번호 받기</button>	
	<div id="d1"></div>	
</body>
</html>