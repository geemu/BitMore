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

<link href="../css/public.css" rel="stylesheet" type="text/css" />
<link href="../css/user.css" rel="stylesheet" type="text/css">
<script src="../js/jquery-1.8.3.min.js"></script>
<script src="../layer/layer.js"></script>

<script type="text/javascript">
/* 退出时的确认弹框 */
$(document).ready(function(){
	$(".login_out").click(function(){
		layer.confirm('您确定要退出吗？',  function(index){
			layer.close(index);
			layer.msg('拜拜！欢迎下次光临！', {shift: 6, time: 1500},function(){
				window.location='/BitMore/user/zhuxiao';
			});
		});
	});
});
</script>

<title>顾客个人中心</title>
</head>
<body>
	<div class="mobile">
		<!--header 开始-->
		<header>
			<div class="header">
				<a class="new-a-back" href="javascript:history.back();"> 
					<span><img src="../images/iconfont-fanhui.png"></span>
				</a>
				<h2>会员中心</h2>
				<div class="header_right shaixuan">
					<a href="../"><img src="../images/iconfont-shouye.png"></a>
				</div>
			</div>
		</header>
		<!--header 结束-->

		<div class="user_top w">
			<div class="user_logo">
				<div class="img">
					<img src="../images/user_logo.jpg">
				</div>
			</div>
			<div class="user_info">
				<div class="user_name">忆乡人</div>
				<div class="user_dengji">会员等级：黄金会员</div>
			</div>
		</div>
		<div class="user_nav_list w">
			<ul>

				<li>
					<a href="#"> 
						<span class="u_nav_icon money"></span>
						<span class="u_nav_name">待付款</span> 
						<span class="nt_icon"></span>
						<span class="u_money"><i>0</i></span>
					</a>
				</li>

				<li>
					<a href="#"> 
						<span class="u_nav_icon tixian"></span>
						<span class="u_nav_name">已支付</span> 
						<span class="nt_icon"></span>
						<span class="u_money"><i>0</i></span>
					</a>
				</li>

				<li>
					<a href="#"> 
						<span class="u_nav_icon dingdan"></span>
						<span class="u_nav_name">已完成</span> 
						<span class="nt_icon"></span>
					</a>
				</li>

				<li>
					<a href="#">
						<span class="u_nav_icon qiandao"></span> 
				 		<span class="u_nav_name">待评价</span>
						<span class="nt_icon"></span> 
						<span class="u_money"><i>0</i></span>
					</a>
				</li>
				
				<li>
					<a href="#"> 
						<span class="u_nav_icon anquan"></span> 
						<span class="u_nav_name">安全中心</span>
						<span class="nt_icon"></span>
					</a>
				</li>
				
			</ul>
		</div>
		<div class="login_out">
			<a href="javascript:void(0);"><span><img src="../images/iconfont-tuichu.png"></span><i>安全退出</i></a>
		</div>
		<div class="copyright">Copyright © 2012-2015 点多多 www.bestcfm.com 版权所有</div>
	</div>
</body>

</html>