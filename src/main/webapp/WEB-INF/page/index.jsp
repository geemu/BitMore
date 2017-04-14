<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<meta name="format-detection" content="telephone=no">
<title>点多多</title>
<link href="css/owl.carousel.css" rel="stylesheet">
<link href="css/public.css" rel="stylesheet" type="text/css" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.8.3.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="layer/layer.js"></script>

<script type="text/javascript">


/* 个人中心触发用户登录 */
$(document).ready(function() {$("#customerCenter").click(function() {
	if ('' == '${loginUser}' || '${loginUser}' == null) {
		var index = layer.open(
			{	type : 1,
				title : false,
				closeBtn : false,
				shadeClose : true,
				offset : '25%',
				content : "<div class='no_login_show'>"
				+ "<h1>亲！您还没登录点多多哦！</h1>"
				+ "<a href='skip/toUserLogin'>马上登录</a>"
				+ "<a href='skip/toRegister'>免费注册</a>"
				+ "<a href='javascript:layer.closeAll();'>取消</a>"
				+ "</div>"
				});
	} else {
			window.location = "skip/toCustomerCenter";
			}
		});
});

/* 购物车触发用户登录 */
$(document).ready(function() {$("#myShoppingCar").click(function() {
	if ('' == '${loginUser}' || '${loginUser}' == null) {
		var index = layer.open(
			{	type : 1,
				title : false,
				closeBtn : false,
				shadeClose : true,
				offset : '25%',
				content : "<div class='no_login_show'>"
				+ "<h1>亲！您还没登录点多多哦！</h1>"
				+ "<a href='skip/toUserLogin'>马上登录</a>"
				+ "<a href='skip/toRegister'>免费注册</a>"
				+ "<a href='javascript:layer.closeAll();'>取消</a>"
				+ "</div>"
				});
	} else {
		window.location = "foodOrderDetail/shoppingCar";
			}
		});
});

</script>
</head>

<body>
	<div class="mobile">
		<!--搜索栏-->
		<div class="search w">
			<form action="" method="post">
				<input type="text" class="search_input" placeholder="请输入菜品名称">
				<input type="button" class="search_submit" value="搜索">
			</form>
		</div>

		<div class="top w">
			<!-- 轮幅广告 -->
			<div class="m_banner" id="owl">
				<a href="#" class="item"><img src="images/10250290397.png"></a>
				<a href="#" class="item"><img src="images/10225357963.jpg"></a>
			</div>
			<!-- 类目栏 -->
			<div class="m_nav">
				<a href="javascript:void(0)" id="customerCenter"><img src="images/m-index_27.png"><span>会员中心</span></a> 
				<a id ="myShoppingCar" href="javascript:void(0)"><img src="images/m-index_26.png"><span>购物车</span></a>
				<a href="skip/toFoodAssortment"><img src="images/m-index_26.png"><span>菜品分类</span></a>
				<a href="skip/toNotice"><img src="images/m-index_26.png"><span>店铺公告</span></a>
			</div>
		</div>

		<!-- 食客最爱栏目 -->
		<div class="m_mall w">
			<div class="mall_title">
				<span>食客最爱${loginUser.id }</span><em><a href="#">更多</a></em>
			</div>
			<div class="mall_list">
				<c:forEach var="favouriteFood" items="${favouriteFoodList }">
					<a href="#" class="mall"> 
					<span class="mall_logo"><img src="images/foodImages/www.jd.com.png" /></span><br /> 
					<span>${favouriteFood.foodName}</span><br />
					<span><i class="doAddShoppingCar" data-foodid ='${favouriteFood.id}' >加入购物车</i></span>
				</a>
				</c:forEach>
			</div>
		</div>

		<!-- 小二推荐栏目 -->
		<div class="m_mall w">
			<div class="mall_title">
				<span>小二推荐</span>
			</div>
			<div class="mall_list">
				<c:forEach var="recomendFood" items="${recomendFoodList }">
					<a href="#" class="mall"><span class="mall_logo"><img src="images/foodImages/www.jd.com.png" /></span><br /> <span>${recomendFood.foodName}</span><br />
					<span><i class="doAddShoppingCar" data-foodid ='${recomendFood.id}'>加入购物车</i></span>
				</a>
				</c:forEach>

			</div>
		</div>
		<div class="copyright">Copyright © 2016-2017 点多多 www.bestcfm.com 版权所有</div>
	</div>

</body>
<script type="text/javascript">
/* 加入购物车 */
$(document).ready(function(){
	$(".doAddShoppingCar").click(function(){
		$.ajax({
            type: "POST",
            data:{foodId:$(this).data('foodid')},
            url:"foodOrderDetail/doAddShoppingCar?",
            success: function(data) {	
            	alert(data)
            },
            error: function(){
            	console.log("请求失败");
            }
        });
	});
});
</script>
</html>
