<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页</title>
</head>
<body>
	<!--SpringMVC的form表单 -->
<!-- 	注：访问jsp报错。后续研究spring表单 -->
	<form:form action="login/doformlogin" method="post" modelAttribute="User">
	        First name: <form:input path="fname"/><form:errors path="id"/><br>
	        Last name: <form:input path="lname"/><form:errors path="name"/><br>
	        birthDay:<form:input path="birthDay"/><form:errors path="birthDay"/>
        <input type="submit" value="form&nbsp登&nbsp录&nbsp">
    </form:form> 
</body>
</html>