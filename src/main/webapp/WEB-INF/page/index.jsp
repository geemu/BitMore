<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<meta name="format-detection" content="telephone=no">
<title>点多多</title>
<link href="../css/owl.carousel.css" rel="stylesheet">
<link href="../css/public.css" rel="stylesheet" type="text/css" />
<link href="../css/index.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.8.3.min.js"></script>
<script src="../js/owl.carousel.min.js"></script>
<script src="../layer/layer.js"></script>

<script type="text/javascript">
$(document).ready(function(){
	$("#customerCenter").click(function(){
		var index = layer.open({
			type: 1,
			title: false,
			closeBtn: false,
			shadeClose: false,
			offset: '25%',
			content: "<div class='no_login_show'><h1>亲！您还没登录点多多哦！</h1><a href='../skip/toUserLogin'>马上登录</a><a href='../skip/toRegister'>免费注册</a><a href='javascript:layer.closeAll();'>取消</a></div>"
		});
	});
	$("#msg_bijia").click(function(){
		layer.tips('请耐心等待一下，我们正在拼命开发中···','#msg_bijia');
	});
});
</script>
</head>

<body>
	<div class="mobile">
	
		<header>
			<div class="header">
				<h2>点多多</h2>
			</div>
		</header>
		
		
		<!--搜索栏-->
		<div class="search w">
			<form action="" method="post">
				<input name="" type="text" class="search_input" placeholder="请输入菜品名称">
				<input name="" type="button" class="search_submit" value="搜索">
			</form>
		</div>

		<div class="top w">
			<!-- 轮幅广告 -->
			<div class="m_banner" id="owl">
				<a href="#" class="item"><img src="../images/10250290397.png"></a>
				<a href="#" class="item"><img src="../images/10225357963.jpg"></a>
			</div>
			<!-- 类目栏 -->
			<div class="m_nav">
				<a href="#"><img src="../images/m-index_26.png"><span>购物车</span></a>
				<a href="#"><img src="../images/m-index_10.png"><span>水果</span></a>
				<a href="#"><img src="../images/m-index_12.png"><span>冷菜</span></a> 
				<a href="#"><img src="../images/m-index_14.png"><span>刨冰沙类</span></a> 
				<a href="#"><img src="../images/m-index_16.png"><span>招牌菜</span></a> 
				<a href="javascript:void(0);" id="msg_bijia"><img src="../images/m-index_22.png"><span>热菜</span></a>
				<a href="#"><img src="../images/m-index_24.png"><span>酒水饮料</span></a> 
				<a href="#" id="customerCenter"><img src="../images/m-index_27.png"><span>会员中心</span></a>
			</div>
		</div>
		
		<!-- 食客最爱栏目 -->
		<div class="m_mall w">
			<div class="mall_title">
				<span>食客最爱</span><em><a href="#">更多</a></em>
			</div>
			<div class="mall_list">
				<a href="#" class="mall">
					<span class="mall_logo"> 
					<img src="../images/foodImages/www.jd.com.png" />
					</span>
					<br/>
					<span>菜名</span><br/>
					<span><i>加入购物车</i></span>
				</a> 
				
				<a href="#" class="mall">
					<span class="mall_logo"> 
					<img src="../images/foodImages/www.jd.com.png" />
					</span>
					<br/>
					<span>菜名</span><br/>
					<span><i>加入购物车</i></span>
				</a> 
				
				<a href="#" class="mall">
					<span class="mall_logo"> 
					<img src="../images/foodImages/www.jd.com.png" />
					</span>
					<br/>
					<span>菜名</span><br/>
					<span><i>加入购物车</i></span>
				</a> 
				
				<a href="#" class="mall">
					<span class="mall_logo"> 
					<img src="../images/foodImages/www.jd.com.png" />
					</span>
					<br/>
					<span>菜名</span><br/>
					<span><i>加入购物车</i></span>
				</a> 
				
			</div>
		</div>
		
		<!-- 小二推荐栏目 -->
		<div class="m_mall w">
			<div class="mall_title">
				<span>小二推荐</span><em><a href="#">更多</a></em>
			</div>
			<div class="mall_list">
				<a href="#" class="mall">
					<span class="mall_logo"> 
					<img src="../images/foodImages/www.jd.com.png" />
					</span>
					<br/>
					<span>菜名</span><br/>
					<span>价格</span><br/>
					<span><i>加入购物车</i></span>
				</a>  
				
				<a href="#" class="mall">
					<span class="mall_logo"> 
					<img src="../images/foodImages/www.jd.com.png" />
					</span>
					<br/>
					<span>菜名</span><br/>
					<span>价格</span><br/>
					<span><i>加入购物车</i></span>
				</a>  
				
				<a href="#" class="mall">
					<span class="mall_logo"> 
					<img src="../images/foodImages/www.jd.com.png" />
					</span>
					<br/>
					<span>菜名</span><br/>
					<span>价格</span><br/>
					<span><i>加入购物车</i></span>
				</a> 
				
				<a href="#" class="mall">
					<span class="mall_logo"> 
					<img src="../images/foodImages/www.jd.com.png" />
					</span>
					<br/>
					<span>菜名</span><br/>
					<span>价格</span><br/>
					<span><i>加入购物车</i></span>
				</a> 
				
			</div>
		</div>
		
		<div class="m_user w">
			<!--<a href="user.html">忆乡人***</a><a href="#">退出</a>-->
			<a href="#">登录</a> 
			<a href="register.html">注册</a> 
			<a href="javascript:void(0);" class="backtop">返回顶部</a>
		</div>
		<div class="copyright">Copyright © 2012-2015 点多多 www.bestcfm.com 版权所有</div>
	</div>
	<div class="gotop backtop" style="display: none;"></div>

</body>
</html>
<script type="text/javascript">
//返回顶部
$(document).ready(function(){
	$(window).scroll(function () {
		var scrollHeight = $(document).height();
		var scrollTop = $(window).scrollTop();
		var $windowHeight = $(window).innerHeight();
		scrollTop > 75 ? $(".gotop").fadeIn(200).css("display","block") : $(".gotop").fadeOut(200).css({"background-image":"url(images/iconfont-fanhuidingbu.png)"});
	});
	$('.backtop').click(function (e) {
		$(".gotop").css({"background-image":"url(images/iconfont-fanhuidingbu_up.png)"});
		e.preventDefault();
		$('html,body').animate({ scrollTop:0});
	});
});
</script> 