<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    int temp = Integer.parseInt(request.getParameter("temp"));
    String day = request.getParameter("day");
    String result1 = "";
    if(temp > 30){
    	result1 = "덥군!";
    }else{
    	result1 = "시원하군!";
    }
    String result = "오늘은 " + day + "인데, 엄청" + result1 ;
    %><%= result%>
