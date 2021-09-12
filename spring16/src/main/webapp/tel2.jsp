<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
	String tel = request.getParameter("tel");
/* 	rule1)
	010이면 111
	011이면 222
	다른 것이면 333 */
	String result = "";
	//String no = tel.substring(3); //인덱스3~끝까지
	String no = tel.substring(0, 3); //0~2
	//char c = tel.charAt(3);
	
	if(no.equals("010")){
		result = "111";
	}else if(no.equals("011")){
		result = "222";
	}else{
		result = "333";
	}
	
	Random r = new Random();
/* 	int no2 = r.nextInt(100); //0~99
	int no2 = r.nextInt(100) + 100; //100~199 */
	int no2 = r.nextInt(900) + 100; //100~999
	
	result = result + no2;
	
	%><%= result %>