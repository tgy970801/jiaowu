<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    <meta charset="utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/main.css">
	<link rel="shortcut icon"   href="<%=basePath%>images/logo.png">
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap.css">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
         <main class="bg">
    <s:form action="user/user_reg" method="post" cssClass="login">
    <h3>请注册</h3>
    <div class="form-group">
    <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-ul fa-user"></i></span>
    <input type="text" class="form-control" name="user.userid" placeholder="请输入用户名" required>
    </div>
    
    <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-ul fa-user"></i></span>
    <input type="password" class="form-control" name="user.password" placeholder="请输入密码" required>
    </div>
    <s:fielderror fieldName="user.password" cssClass="fielderror"/>
    <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-ul fa-user"></i></span>
    <input type="text" class="form-control" name="user.name" placeholder="请输入姓名" required>
    </div>
    
     <div class="input-group">
    <span class="input-group-addon"><i class="fa fa-ul fa-user"></i></span>
    <input type="text" class="form-control" name="user.shenfeng" placeholder="请输入身份" required>
    </div>
    </div>
      <button type="submit" class="btn btn-success btn-login"> 注册 </button>
    </s:form>
    <br>
  </body>
</html>
