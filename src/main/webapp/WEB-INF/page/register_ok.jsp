<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="applicable-device" content="mobile" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>注册成功 — 点多多</title>
<link href="../frozenui/css/frozen.css" rel="stylesheet" type="text/css">
<link href="../css/public.css" rel="stylesheet" type="text/css" />
<link href="../css/login.css" rel="stylesheet" type="text/css">
<script src="../js/jquery-1.8.3.min.js"></script>
<script>
$(window).load(function() {
	$("#status").fadeOut();
	$("#preloader").delay(350).fadeOut("slow");
})
</script>
</head>

<body>
<div class="mobile">

		<div id="preloader">
			<div id="status">
				<p class="center-text">
					<span>拼命加载中···</span>
				</p>
			</div>
		</div>

		<!--header -->
		<header>
			<div class="header">
				<a class="new-a-back" href="javascript:history.back();"> 
					<span><img src="../images/iconfont-fanhui.png"></span>
				</a>
				<h2>注册成功</h2>
			</div>
		</header>

		<div class="w main">
  	<div class="register_verify">
    	<div class="ok_iocn"><img src="../images/iconfont-iconxianluyudingchenggong.png" height="80"></div>
        <h1>恭喜您！已成功注册点多多！</h1>
        <h3><a href="#"><img src="../images/cxfsjhyj.png" height="40"></a></h3>
    </div>
  </div>
  <div class="footer w">
  	<a href="#"><div class="ico_img"><img src="../images/178hui-app.png"></div><span style="color:#00bb9c">客户端</span></a>
    <a href="index.html"><div class="ico_img"><img src="../images/178hui-shouji.png"></div><span style="color:#eb4f38">触摸版</span></a>
    <a href="#"><div class="ico_img"><img src="../images/178hui-diannao.png"></div><span>电脑版</span></a>
  </div>
  <div class="copyright">Copyright © 2012-2015 点多多 www.bestcfm.com 版权所有</div>
</div>
</body>
</html>