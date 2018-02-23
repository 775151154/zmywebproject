<%@page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%--@ taglib prefix='sec' uri='http://www.springframework.org/security/tags' --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>
<%-- 说明 :ie文档模式设置有变化的话，请注明 --%>
<%-- 1、文档模块需要设置为IE8，否则布局会乱。shuihonghu，20150106 
<META http-equiv="X-UA-Compatible" content="IE=8"/>--%>

<script language="javascript" type="text/javascript" src="<c:url value='/resources/js/jquery-2.2.4.min.js'/>"></script>
<script language="javascript" type="text/javascript" src="<c:url value='/resources/js/common.js'/>"></script>
<%-- 添加公共弹出窗的js --%>
<%--<script language="javascript" type="text/javascript" src="<c:url value='/resources/opaljs/publicWindows.js'/>"></script>--%>
<script language="javascript" type="text/javascript">
var webRootPath = '<%=request.getContextPath()%>';
<%
String pageUrlPrefix=request.getContextPath();
if(request.getAttribute("pageUrlPrefix")!=null){
	pageUrlPrefix=pageUrlPrefix+request.getAttribute("pageUrlPrefix").toString();
}
%>
var pageUrlPrefix='<%=pageUrlPrefix%>'
</script>
<title>统一任务调度服务</title>
<%-- HTTP 1.1 --%>
<meta http-equiv="Cache-Control" content="no-store" />
<%-- HTTP 1.0 --%>
<meta http-equiv="Pragma" content="no-cache" />
<%-- Prevents caching at the Proxy Server --%>
<meta http-equiv="Expires" content="0" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


