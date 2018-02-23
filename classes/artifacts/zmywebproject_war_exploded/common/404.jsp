<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isErrorPage="true"%>

<html>
<head>
<title>404</title>
<style>
    body {
    	height:500px;
        margin: 0 auto;
        font-family: Tahoma, Verdana, Arial, sans-serif;
    }
	*{margin:0;padding:0;}
</style>
</head>
<body>
<div style="width:1024px;height:350px;text-align:center;margin:100px auto 0;background:url(<%=request.getContextPath()%>/common/images/error.png)">
	<div style="float:left;margin:130px 0 0 450px;">
		<h3 style="font-size:60px;color:#00706b;line-height:100px;">404</h3>
		<p style="color:#333;font-size:24px;color:#00706b;border-top:2px solid #00706b;line-height:60px;padding:0 25px;">您访问的页面没能找到……</p>
	</div>
</div>

<!--
<div style="width:470px;height:250px;text-align:center;margin:100px auto;"><img src="images/404.png" width="462" height="214" />
	<p style="font-size: 24px;color: #00706b;">您访问的页面没能找到……</p>
</div>-->
<script>
	if(parent && parent.changeFrameHeight) {
		parent.changeFrameHeight();
	}
</script>
</body>
</html>
