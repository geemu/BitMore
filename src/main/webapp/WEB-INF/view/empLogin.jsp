<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../static/css/bootstrap.css" rel="stylesheet">

<style type="text/css">
.container-myContainer {
	  padding-left: 0px;
	  padding-right: 0px;
	  margin-left: auto;
	  margin-right: auto;
	}
</style>

<title>员工登陆</title>
</head>

<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>登录</title>
		<!-- CSS -->
		<link rel="stylesheet" href="<c:url value='/css/bootstrap.css'/>"/>
		<link rel="stylesheet" href="<c:url value='/css/login_register.css'/>"/>
		<link rel="shortcut icon"  href="<c:url value='/img/favicon.png'/>"/>
	</head>

<body>
		<div class="container" style="margin-top: 30px;">
			<div class="row">
				<div class="col-sm-6 form-box">
					<form role="form" action="login" method="post" class="registration-form">
						<fieldset>
							<div class="form-top">
								<div class="form-top-left">
									<h3>用户登录</h3>
								</div>
								<div class="form-top-right">
									<i class="glyphicon glyphicon-user"></i>
								</div>
							</div>
							<div class="form-bottom">
								<div class="form-group">
									<label class="mlabel"></label>
									<input type="text" name="userName" placeholder="输入用户名" class="form-control" id="login_username">
								</div>
								<div class="form-group" style="margin-bottom: 15px;">
									<label class="mlabel"></label>
									<input type="password" name="password" placeholder="输入密码" class="form-control" id="login_password">
								</div>
								<button type="submit" class="btn btn-block" id="popup-submit">登&nbsp;录</button>
								<div id="popup-captcha"></div>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
		<!-- Javascript -->
		<script src="<c:url value='/js/jquery.js'/>"></script>
		<script src="<c:url value='/js/bootstrap.js'/>"></script>
		<script src="<c:url value='/js/jquery.backstretch.min.js'/>"></script>
		<script src="<c:url value='/js/login_register.js'/>"></script>
		<script src="<c:url value='/js/login_validate.js'/>"></script>
		<script src="http://static.geetest.com/static/tools/gt.js"></script>
	</body>
</html>