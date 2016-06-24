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
    
    <title>显示所有Food</title>
    <meta charset="utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/main.css">
	
	<script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-fileupload.js"></script>
	
	<link rel="shortcut icon" href="<%=basePath%>images/logo.png">
	
  </head>
  
  <body>
    <header>
       <div class="logo"><i class="fa fa-ul fa-cutlery"></i> 教务平台</div>
       <div class="account">
         <c:choose>
	       <c:when test="${user.userid ==null}">
	         <a href="reg.jsp">注册</a>
	         <a href="login.jsp">登录</a>
	       </c:when>
	       <c:otherwise>
	         <c:out value="${user.userid}"></c:out>, 欢迎您!
	       </c:otherwise>
	     </c:choose>
		    
       </div>
       
		    
    </header>

     <main class="container-fluid">
	    <div class="row">
		   <div class="col-md-10">
		      <s:form action="score/score_addScore" cssClass="form-horizontal">
		       <div class="panel panel-success">
			       <div class="panel-heading">
		               <h4 class="panel-title"> <i class="fa fa-cutlery"></i> 添 加 成绩 </h4>
		           </div>
		           
	 <div class="panel-body">
				       <!--  <div class="form-group">
			                <label class="control-label col-md-3">科目ID</label>
			                <div class="col-md-4">
                              <input type="text" name="subject.subjectID" class="form-control input-sm" required>
                           </div>
			           </div>    -->
			           <div class="form-group">
			                <label class="control-label col-md-3">学号</label>
			                <div class="col-md-2">
                              <input type="text" name="score.user.userid" class="form-control input-sm"  required>
                            </div>
			           </div>
			           <div class="form-group">
			                <label class="control-label col-md-3">科目</label>
			                <div class="col-md-2">
                              <input type="text" name="score.subject.subjectid" class="form-control input-sm" required>
                            </div>
			           </div>
			           
			            <div class="form-group">
			                <label class="control-label col-md-3">分数</label>
			                <div class="col-md-2">
                              <input type="text" name="score.fenshu" class="form-control input-sm" required>
                            </div>
			           </div>



			           <div class="form-group col-md-3">
				          <button type="submit" class="btn btn-success pull-right">提  交 </button>
				       </div>
				   </div>
				</div>
		    </s:form>
		  </div>
	   </div>
	</main>
	<script src="<%=basePath%>js/jquery.min.js"></script>
    <script src="<%=basePath%>js/bootstrap.min.js"></script>
	<script src="<%=basePath%>js/bootstrap-fileupload.js"></script>
  </body>
</html>
