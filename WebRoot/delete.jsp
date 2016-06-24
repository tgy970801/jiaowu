<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>显示Score详情</title>
    <meta charset="utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/main.css">
	<link rel="shortcut icon"   href="<%=basePath%>images/logo.png">
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap.css"></head>
  <body>
     <s:form action="score/score_deleteScore">
       <h1>删除成绩</h1>
       <s:hidden name="score.scoreid"></s:hidden>
       <s:textfield name="user.userid" label="学号"></s:textfield>
       <s:submit value="删除"></s:submit>
     </s:form>
  </body>
</html>