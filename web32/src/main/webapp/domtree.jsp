<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

h3 {
   
      background: pink;
      width: 600px;
      height: 100px;
      font-family: "궁서";
      font-size: 70px;
      font-style: italic;
      font-weight: bold;
      text-align: center;
      
}


#result1 {

      background: gray;
      width: 600px;
      height: 100px;
      font-family: "궁서";
      font-size: 50px;
      font-style: italic;
      font-weight: bold;
      text-align: center;

}

 .c1{

      background: lime;



} 

body ul { /* body아래의 자손중에서 ul을 찾아라 */

   color: red;
   
}

body > ul { /* body "바로" 아래의 자식중에서 ul을 찾아라 */

   list-style: square;
   


}

body > #result1 > ul {

   list-style: decimal;

}


</style>
</head>
<body>
<h3>나는 제목</h3>
   <ul>
      <li class="c1">컴퓨터</li>
      <li class="c1">영어</li>
      <li class="c1">마케팅</li>
   </ul>

   <div id = 'result1' >결과 1이 보여지는 부분</div>
   <div id= 'result2'>
      <span>나는 결과야1</span>
      
      <ul>
         <li>오늘은 목요일</li>
         <li>내일은 금요일</li>
      
      </ul>

   </div>
</body>
</html>