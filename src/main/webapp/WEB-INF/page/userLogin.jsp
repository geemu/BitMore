<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="applicable-device" content="mobile" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>用户登录</title>

<link href="../css/public.css" rel="stylesheet" type="text/css" />
<link href="../css/userLogin.css" rel="stylesheet" type="text/css">
<script src="../js/jquery-1.8.3.min.js"></script>
<script src="../layer/layer.js"></script>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		$("form").submit(function(e) {
			var username = $.trim($("#username").val());
			var password = $.trim($("#password").val());
			if (username == '') {
				layer.tips('请输入手机号码', '#username', {
					tips : 1
				});
				return false;
			} else if (password == '') {
				layer.tips('请输入登录密码', '#password', {
					tips : 1
				});
				return false;
			}
		});
	});
</script>
<body>
	<div class="mobile">
		<header>
			<div class="header">
				<a class="new-a-back" href="javascript:history.back();"><span><img src="../images/iconfont-fanhui.png"></span></a>
				<h2>登录</h2>
			</div>
		</header>

		<div class="w main">
			<form id="frm_login" method="post">
				<div class="item item-username">
					<input name="phone" id="username" class="txt-input txt-username" type="text"placeholder="请输入手机号" value="" > 
					<b class="input-close" style="display: none;"></b>
				</div>
				<div class="item item-password">
					<input name="userPassword" id="password" class="txt-input txt-password ciphertext" type="password" placeholder="请输入密码"  style="display: inline;"> 
					<input id="ptext" class="txt-input txt-password plaintext" type="text" placeholder="请输入密码" style="display: none;" name="ptext"> 
					<b class="tp-btn btn-off"></b>
				</div>
				<div class="item item-login-option">
					<div class="aoutlogin">
						<label class="ui-checkbox ui-checkbox-s"> 
						<input type="checkbox" name="checkbox" checked />一个月内免登录
						</label>
					</div>
					<span class="retrieve-password"> 
					<a href="#">找回密码</a>    
					</span>
				</div>
				<div class="ui-btn-wrap">
					<input type="submit" value="用户登录" class="ui-btn-lg ui-btn-primary" onclick="doUserLogin()" />
				</div>
				<div class="ui-btn-wrap">
					<a class="ui-btn-lg ui-btn-danger" href="../skip/toRegister">没有账号？立即注册</a>
				</div>
				<div class="item item-login-other">
					<dl>
						<dt>其它登录方式</dt>
						<dd>
							<a class="qq" href="javascript:void(0)"> <span><img alt="" src="../images/login_qq.png" width="40" height="40"></span></a>
						</dd>
					</dl>
				</div>
			</form>
		</div>
		<div class="copyright">Copyright © 2012-2015 点多多 www.bestcfm.com版权所有</div>
	</div>
</body>
</html>
<script type="text/javascript">
/* 提交表单  */
function doUserLogin(){
	$.ajax({
        type: "POST",
        data:$('#frm_login').serialize(),
        url:"../user/doUserLogin",
        success: function(data) {  
    		if("toUserLogin" == data){
    			alert('用户名或密码错误');
    			window.location = "/toUserLogin";
    		}
    		else{
    			window.location = "../";
    		}
        },
        error: function(data){
        	console.log("请求失败");
        }
    });
}
	$(function() {
		$(".input-close").hide();
		displayPwd();
		displayClearBtn();
		setTimeout(displayClearBtn, 200); //延迟显示,应对浏览器记住密码
	});

	//是否显示清除按钮
	function displayClearBtn() {
		if (document.getElementById("username").value != '') {
			$("#username").siblings(".input-close").show();
		}
		if (document.getElementById("password").value != '') {
			$(".ciphertext").siblings(".input-close").show();
		}
		if ($("#codeLevel").val() != "" && $("#codeLevel").val() != '0') {
			if ($("#validateCode").val() != "") {
				$("#validateCode").siblings(".input-close").show();
			}
		}
	}

	//清除input内容
	$('.input-close').click(function(e) {
		$(e.target).parent().find(":input").val("");
		$(e.target).hide();
		$($(e.target).parent().find(":input")).each(function(i) {
			if (this.id == "ptext" || this.id == "password") {
				$("#password").val('');
				$("#ptext").val('');
			}
		});
	});

	//设置password字段的值	
	$('.txt-password').bind('input', function() {
		$('#password').val($(this).val());
	});

	//显隐密码切换
	function displayPwd() {
		$(".tp-btn").toggle(function() {
			$(this).addClass("btn-on");
			var textInput = $(this).siblings(".plaintext");
			var pwdInput = $(this).siblings(".ciphertext");
			pwdInput.hide();
			textInput.val(pwdInput.val()).show().focusEnd();
		}, function() {
			$(this).removeClass("btn-on");
			var textInput = $(this).siblings(".plaintext ");
			var pwdInput = $(this).siblings(".ciphertext");
			textInput.hide();
			pwdInput.val(textInput.val()).show().focusEnd();
		});
	}

	//监控用户输入
	$(":input").bind('input propertychange', function() {
		if ($(this).val() != "") {
			$(this).siblings(".input-close").show();
		} else {
			$(this).siblings(".input-close").hide();
		}
	});
</script>
