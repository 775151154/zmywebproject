<%@page import="com.tl.eas.sp.utils.SpCheckoutUtils"%>
<%@page import="com.tl.sp.sgisc.SpSupportSgIscProvider"%>
<%@page import="com.tl.eas.sp.api.organization.vo.SpUser"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="com.tl.eas.sp.utils.SpCheckoutUtils" %>
<%
	String path = request.getContextPath();
	String basePath = request.getContextPath() + "/";
	String basedPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	String bPath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/";

	SpUser spuser = SpSupportSgIscProvider.getCurSpUser();
	String orgNo = "";
	String userName = "";
	String userId = "";
	String iframeId = SpCheckoutUtils.getStringResult(request, "iframeId",80);
	if (spuser != null) {
		orgNo = spuser.getCorpNo();
		userName = spuser.getUserRealName();
		userId = spuser.getUserId();
	}
	Date date =new Date();
    SimpleDateFormat formatterTime = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss"); 
    SimpleDateFormat formatterDate = new SimpleDateFormat ("yyyy-MM-dd"); 
    String curTime = formatterTime.format(date); 
	String curDate = formatterDate.format(date);
%>