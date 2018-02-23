<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%
/*
//设置状态码
response.setStatus(HttpServletResponse.SC_OK);
 String v=request.getRequestURL().toString();
 String m=(String)request.getAttribute("javax.servlet.error.message");
 Exception objException=(Exception)request.getAttribute("_exception");
 if(objException!=null){
		m=objException.getMessage();
 }
 */
%>

<html>
<head>
<title>error</title>
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
		<h3 style="font-size:60px;color:#00706b;line-height:100px;">ERROR</h3>
		<p style="color:#333;font-size:24px;color:#00706b;border-top:2px solid #00706b;line-height:60px;padding:0 25px;">未知错误，请联系系统管理员!</p>
	</div>
</div>
<%--
<div style="width:470px;height:250px;text-align:center;margin:100px auto;">
	<img src="images/error.png" width="462" height="214" />
	<p style="font-size: 24px;color: #00706b;">未知错误，请联系系统管理员!</p>
</div>
 <table width="100%" height="100%" bgcolor="#FFFFFF">
	<tr height="80%">
		<td width="100%" height="80%" align="center" style="padding-top:-60px">
		<table border="0" width="575px" height="111px"
			style="background:url(<%=request.getContextPath() %>/common/skins/skin0/images/basic/warn.jpg)">
			<tr height="25px" >
				<td width="80px" style="padding-left:10px;font:12px"><b:message key="eos_ricweb_error_prompt"/></td>
				<td ></td>
				<td></td>
			</tr>
		    <tr >
				<td></td>
				<td id="msg" style="font:16px;word-break:break-all"><%=m%></td> 
				<td id="msg" style="font:16px;word-break:break-all">未知错误，请联系管理员！</td>
				<td></td>
			</tr>
		</table>
		
		</td>
	</tr>
	<tr height="20%">
	<td>
	
	</td>
	</tr>
</table> --%>
<script>
if(parent && parent.changeFrameHeight) {
		parent.changeFrameHeight();
	}
<%
/*
if(isFF){
msg.innerHTML="<div id='msg1' style='overflow-X:auto;width:450px;white-space:nowrap>"+msg.innerHTML+"</div>";
wordbreak(msg1);
}
function wordbreak(x)
{
 var oldStr=x.innerHTML
 var width=x.offsetWidth
 x.innerHTML="";
 for(var i=0;i<oldStr.length;i++)
 {
  var str=x.innerHTML;
  s=oldStr.charAt(i)
  x.innerHTML=str+s;
  if(x.scrollWidth>width) {x.innerHTML=str+"<br/>"+s;}
 }
}
*/
 %>
</script>
</body>
</html>
