<%@ page import="java.io.OutputStream" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="last-modified" content="Mon, 03 Jan 2018 17:45:57 GMT">
<meta http-equiv="ETag" content="5816f349-19">
<title></title>
</head>
<body>
	<script type="text/javascript">
	<% 
		String str = "的撒旦/n 的撒的事实/n  的撒旦/n";
		OutputStream out = response.getOutputStream();
		out.write(str.getBytes());
		out.flush();
		out.close();
	%>	
	</script>
</body>
</html>