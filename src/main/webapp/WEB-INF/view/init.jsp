<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap-grid.css" rel="stylesheet">
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap-reboot.css" rel="stylesheet">
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap.css" rel="stylesheet">

<style type="text/css">
.container-liquid {
	  padding-left: 0px;
	  padding-right: 0px;
	  margin-left: auto;
	  margin-right: auto;
	}
</style>
<title>初始化界面</title>

</head>
<body>
<div class="container-liquid">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<a href="skip/toEmpLogin" class="btn btn-default btn-primary btn-block">员工登陆</a>
		</div>
	</div>
</div>
</body>

</html>