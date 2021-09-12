<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String tel = request.getParameter("tel");
    
    String result = "";
    if(tel.equals("010")){
    	result = "111";
    }else if(tel.equals("011")){
    	result = "222";
    }else{
    	result = "333";
    }
    %><%= result%>