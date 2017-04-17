<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="applicable-device" content="mobile" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>点多多注册</title>
<link href="../css/public.css" rel="stylesheet" type="text/css" />
<link href="../css/userLogin.css" rel="stylesheet" type="text/css">
<script src="../js/jquery-1.8.3.min.js"></script>
<script src="../layer/layer.js"></script>
</head>

<body>
	<div class="mobile">
		<header>
			<div class="header">
				<a class="new-a-back" href="javascript:history.back();"><span><img src="../images/iconfont-fanhui.png"></span></a>
				<h2>注册</h2>
			</div>
		</header>
		<div class="w main">
			<form id="frm_login" method="post">
				<div class="item item-username">
					<input id="username" class="txt-input txt-username" type="text" placeholder="请输入手机号" value="" name="username"> 
					<b class="input-close" style="display: none;"></b>
				</div>
				<div class="item item-password">
					<input id="password" class="txt-input txt-password ciphertext" type="password" placeholder="请设置密码" name="password" style="display: inline;"> 
						<input id="ptext" class="txt-input txt-password plaintext" type="text" placeholder="请输入密码" style="display: none;" name="ptext"> 
						<b class="tp-btn btn-off"></b>
				</div>
				<div class="item item-captcha">
					<div class="input-info">
						<input id="validateCode" name="validateCode" class="txt-input txt-captcha" type="text" placeholder="验证码" autocomplete="off" maxlength="6" size="11">
						<b id="validateCodeclose" class="input-close" style="display: block; margin-right: 15px;"></b> 
						<span class="getCode"><a id="getValidateCode" href="javascript:void(0)">获取验证码</a></span>
					</div>
				</div>
				
				<div class="ui-btn-wrap">
					<a id="doUserRegister"  class="ui-btn-lg ui-btn-primary" href="javacsript:void(0)">注册</a>
				</div>
				<div class="ui-btn-wrap">
					<a class="ui-btn-lg ui-btn-danger" href="../emp/toUserLogin">已有账号？立即登录</a>
				</div>
			</form>
		</div>
		<div class="copyright">Copyright © 2016-2017 点多多 www.bestcfm.com 版权所有</div>
	</div>
</body>
</html>
<script type="text/javascript">

/* 提交表单  */
$("#doUserRegister").click(function(){
	$.ajax({
        type: "POST",
        data:$('#frm_login').serialize(),
        url:"../user/doUserRegister",
        success: function(data) {
        	if('' == data){
        		window.location = "../"
        	}
        	else{
        		alert(data);
        	}
        },
        error: function(){
        	console.log("请求失败");
        }
    });
});
	/* 获取手机验证码  */
	$("#getValidateCode").click(function(){
		$.ajax({
            type: "POST",
            data:$('#frm_login').serialize(),
            url:"../user/ajaxGetVerifyCode",
            success: function(data) {	
            		if('' == data){
            			console.log("未被注册");
            			layer.alert('验证码发送成功');
            		}
            		else{
            			layer.msg(data);
            		}
            },
            error: function(){
            	console.log("请求失败");
            }
        });
	});

    $(function() {
		$(".input-close").hide();
		displayPwd();
		displayPwd_PwdTwo();
		displayClearBtn();
		setTimeout(displayClearBtn, 200 ); //延迟显示,应对浏览器记住密码
	});	

	//是否显示清除按钮
	function displayClearBtn(){
		if(document.getElementById("username").value != ''){
			$("#username").siblings(".input-close").show();
		}
		if(document.getElementById("password").value != ''){
			$(".ciphertext").siblings(".input-close").show();
		}
	}

	//清除input内容
    $('.input-close').click(function(e){  
		$(e.target).parent().find(":input").val("");
		$(e.target).hide();
		$($(e.target).parent().find(":input")).each(function(i){
			if(this.id=="ptext" || this.id=="password"){
				$("#password").val('');
				$("#ptext").val('');
			}
			if(this.id=="ptext_PwdTwo" || this.id=="password_PwdTwo"){
				$("#password_PwdTwo").val('');
				$("#ptext_PwdTwo").val('');
			}
         });
    });  
	
	//设置password字段的值	
	$('.txt-password').bind('input',function(){
		$('#password').val($(this).val());
	});
	$('.txt-password_PwdTwo').bind('input',function(){
		$('#password_PwdTwo').val($(this).val());
	});
	
	//显隐密码切换
	function displayPwd(){
    	$(".tp-btn").toggle(
          function(){
            $(this).addClass("btn-on");
			var textInput = $(this).siblings(".plaintext");
    		var pwdInput = $(this).siblings(".ciphertext");
			pwdInput.hide();
			textInput.val(pwdInput.val()).show().focusEnd();
          },
          function(){
		  	$(this).removeClass("btn-on");
		  	var textInput = $(this).siblings(".plaintext");
    		var pwdInput = $(this).siblings(".ciphertext");
            textInput.hide();
			pwdInput.val(textInput.val()).show().focusEnd();
          }
    	);
	}
	//显隐密码切换
	function displayPwd_PwdTwo(){
    	$(".tp-btn_PwdTwo").toggle(
          function(){
            $(this).addClass("btn-on_PwdTwo");
			var textInput = $(this).siblings(".plaintext_PwdTwo");
    		var pwdInput = $(this).siblings(".ciphertext_PwdTwo");
			pwdInput.hide();
			textInput.val(pwdInput.val()).show().focusEnd();
          },
          function(){
		  	$(this).removeClass("btn-on_PwdTwo");
		  	var textInput = $(this).siblings(".plaintext_PwdTwo");
    		var pwdInput = $(this).siblings(".ciphertext_PwdTwo");
            textInput.hide();
			pwdInput.val(textInput.val()).show().focusEnd();
          }
    	);
	}
	
	//监控用户输入
	$(":input").bind('input propertychange', function() {
		if($(this).val()!=""){
			$(this).siblings(".input-close").show();
		}else{
			$(this).siblings(".input-close").hide();
		}
    });
</script>
