<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/out2.js"></script>
<script type="text/javascript">
	/* result = add(200,100); // 300
	alert(result) */
	
	function push() {
		// n1, n2 에서 가지고 온 데이터를 가지고
		n1Value = document.getElementById("n1").value
		n2Value = document.getElementById("n2").value
		
		// add(n1, n2)
		n1 = parseInt(n1Value)
		n2 = parseInt(n2Value)
		result = add(n1, n2)
		alert(result)
	}
	function push1() {
		// n1, n2 에서 가지고 온 데이터를 가지고
		n1Value = document.getElementById("n1").value
		n2Value = document.getElementById("n2").value
		
		// add(n1, n2)
		n1 = parseInt(n1Value)
		n2 = parseInt(n2Value)
		result = add1(n1, n2)
		alert(result)
	}
	function push2() {
		// n1, n2 에서 가지고 온 데이터를 가지고
		n1Value = document.getElementById("n1").value
		n2Value = document.getElementById("n2").value
		
		// add(n1, n2)
		n1 = parseInt(n1Value)
		n2 = parseInt(n2Value)
		result = add2(n1, n2)
		alert(result)
	}
	function push3() {
		// n1, n2 에서 가지고 온 데이터를 가지고
		n1Value = document.getElementById("n1").value
		n2Value = document.getElementById("n2").value
		
		// add(n1, n2)
		n1 = parseInt(n1Value)
		n2 = parseInt(n2Value)
		result = add3(n1, n2)
		alert(result)
	}
	function push4() {
		// n1, n2 에서 가지고 온 데이터를 가지고
		n1Value = document.getElementById("n1").value
		n2Value = document.getElementById("n2").value
		
		// add(n1, n2)
		n1 = parseInt(n1Value)
		n2 = parseInt(n2Value)
		result = add4(n1, n2)
		alert(result)
	}
	
	
</script>
</head>
<body>
숫자1 : <input id="n1"> <br>
숫자2 : <input id="n2"> <br>
<button onclick="push()">두 수를 더하자.</button>
<button onclick="push1()">두 수를 빼자.</button>
<button onclick="push2()">두 수를 곱하자.</button>
<button onclick="push3()">두 수를 나누자.나머지를 구하자.</button>
<button onclick="push4()">두 수의 나머지를 구하자.</button>


</body>
</html>