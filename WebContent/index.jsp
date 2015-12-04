<%@page import="com.freeplay.tta.func.FDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

   <h1>Login</h1>
   <form action=search>
      <input type="text" name="tdate"/>买票日期格式为20150207<br>
      <input type="submit" value="查询"/>
   </form>
   
	<%
	FDate.getBDate("20160201");
	%>



</body>
</html>