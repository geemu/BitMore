<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../static/css/bootstrap.css" rel="stylesheet">
<link href="../static/css/login.css" rel="stylesheet">
<link href="../static/css/login-box-new.css" rel="stylesheet">
<link href="../static/css/empLogin.css" rel="stylesheet">

<style type="text/css">

</style>

<title>员工登陆</title>
</head>

<body>
	<!-- 容器 -->
	<div class="">
		<div class="table-wrapper">
			<p>
				<span class="authority-login selected">统一权限账号登录</span> 
				<span class="dynamic-login">动态密码登陆</span>
			</p>
			<div class="login-wrapper">
				<form action="" id="" method="post">
					<ul>
						<li class="fill-line">
							<label class="fa fa-user"></label> 
							<input name="username" id="username" placeholder="请填写手机号">
						</li>
						<li class="fill-line">
							<label class="fa fa-lock"></label> 
							<input name="password" id="password" type="password" placeholder="请输入密码">
						</li>
					</ul>
					<div class="remember-line">
						<label>
							<input name="autoLogin" id="autoLogin" type="checkbox"><span>一周内免登录</span>
						</label>
						<a href="http://authority.17usoft.com/Help" target="_blank">无法访问账户？</a>
					</div>
					<div class="login-line">
						<button type="button" id="authorityLoginBtn"
							onclick="authorityLogin()" data-spmtype="btn"
							data-spmcontrolid="authority_login" data-spmvalue="1"
							data-spminitialized="true">登录</button>
					</div>
					<br> <span style="color: red;" id="login_error"></span> <input
						type="hidden" name="loginIp" id="loginIp" value="10.101.44.14">
				</form>
			</div>

			<div class="login-wrapper none">
				<form action="http://tccommon.17usoft.com/oauth/dynamic-password-login" id="dynamicLoginForm" method="post">
					<ul>
						<li class="fill-line">
							<label class="fa fa-user"></label> 
							<input name="username" id="dynamicUsername" placeholder="请填写手机号">
						</li>
						<li class="fill-line">
							<label class="fa fa-lock"></label> 
							<input name="dynamicPassword" id="dynamicPassword" placeholder="请输入动态密码" >
						</li>
						<li class="remember-line"><a id="dynamicGuide">如何获取动态口令？</a>
						</li>
					</ul>
					<div class="login-line wechat-submit">
						<button type="button" id="dynamicLoginBtn" onclick="dynamicLogin()" data-spmtype="btn" data-spmcontrolid="dynamic_login" data-spmvalue="2" data-spminitialized="true">登录</button>
					</div>
					<br> <span style="color: red;" id="dynamic_login_error"></span>
				</form>
			</div>
		</div>
	</div>
</body>
</html>