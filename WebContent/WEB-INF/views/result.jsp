<%@page import="com.iu.s1.Test"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		Test t = new Test();
		int result = t.getRandom();
	%>
	<h1 id="d1"><%= result %></h1>
</body>
</html>