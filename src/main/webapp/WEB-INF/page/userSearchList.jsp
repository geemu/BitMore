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
<title>用户搜索</title>
<link href="../css/owl.carousel.css" rel="stylesheet">
<link href="../css/public.css" rel="stylesheet" type="text/css" />
<link href="../css/index.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.8.3.min.js"></script>
<script src="../js/owl.carousel.min.js"></script>
<script src="../layer/layer.js"></script>

<script type="text/javascript">
/* 用户搜索 */
$(document).ready(function(){
	$("#userSearch").click(function(){
		window.location = "../food/userSearch?key="+$('#key').val();
	});
});
</script>
</head>

<body>
	<div class="mobile">
		<header>
			<div class="header">
				<a class="new-a-back" href="javascript:history.back();"> 
					<span><img src="../images/iconfont-fanhui.png"></span>
				</a>
				<h2>用户搜索</h2>
				<div class="header_right shaixuan">
					<a href="../"><img src="../images/iconfont-shouye.png"></a>
				</div>
			</div>
		</header>
		<!--搜索栏-->
		<div class="search w">
			<form method="post" id="userSearchForm">
				<input type="text" value='${key }' name= 'key' id='key' class="search_input" placeholder="请输入菜品名称">
				<input id="userSearch" type="button" class="search_submit" value="搜索">
			</form>
		</div>
		<div class="m_mall w">
			<div class="mall_list">
				<c:forEach var="userSearchFood" items="${userSearchFoodList }">
					<a href="#" class="mall"> 
					<span class="mall_logo"><img src="${userSearchFood.foodImage}" /></span><br /> 
					<span>${userSearchFood.foodName}</span><br />
					<span><i class="doAddShoppingCar" data-foodid ='${userSearchFood.id}' >加入购物车</i></span>
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
		if ('' == '${loginUser}' || '${loginUser}' == null) {
			var index = layer.open(
				{	type : 1,
					title : false,
					closeBtn : false,
					shadeClose : true,
					offset : '25%',
					content : "<div class='no_login_show'>"
					+ "<h1>亲！您还没登录点多多哦！</h1>"
					+ "<a href='../user/toUserLogin'>马上登录</a>"
					+ "<a href='../user/toRegister'>免费注册</a>"
					+ "<a href='javascript:layer.closeAll();'>取消</a>"
					+ "</div>"
					});
		} else {
			$.ajax({
	            type: "POST",
	            data:{foodId:$(this).data('foodid')},
	            url:"../foodOrderDetail/doAddShoppingCar?",
	            success: function(data) {	
	            	layer.msg(data);
	            },
	            error: function(){
	            	console.log("请求失败");
	            }
	        });
				}
	});
});
</script>
</html>
