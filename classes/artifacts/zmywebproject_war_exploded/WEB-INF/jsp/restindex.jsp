<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rest Index</title>
</head>
<body>
	<form action="method/1" method="post">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="put">
    </form>
    
    <form action="method/2" method="post">
        <input type="submit" value="post">
    </form>
    
    <form action="method/3" method="get">
        <input type="submit" value="get">
    </form>
    
    <form action="method/4" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="delete">
    </form>
</body>
</html>