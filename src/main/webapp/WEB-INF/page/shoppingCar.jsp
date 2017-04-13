<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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
$(document).ready(function(){
	$(".reduceCar").click(function(){
		$.ajax({
            type: "POST",
            data:{foodId:$(this).data('foodid'),userId:'${loginUser.id}'},
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

<title>购物车</title>
</head>
<body>
	<div class="mobile">
		<!--header 开始-->
		<header>
			<div class="header">
				<a class="new-a-back" href="javascript:history.back();"> 
					<span><img src="../images/iconfont-fanhui.png"></span>
				</a>
				<h2>购物车</h2>
				<div class="header_right shaixuan">
					<a href="../"><img src="../images/iconfont-shouye.png"></a>
				</div>
			</div>
		</header>

		<table style="width: 96%;margin: auto;border: 0px">
			<thead>
				<tr>
				<td style="width: 60%;height: 50px;padding-left: 40px">菜名</td>
				<td style="width: 6%;text-align: center;">减少</td>
				<td style="width: 6%;text-align: center;">数量</td>
				<td style="width: 6%;text-align: center;">增加</td>
				<td style="width: 10%;text-align: center;">价格</td>
			</tr>
			</thead>
			<c:forEach var="myShoppingCarFood" items="${myShoppingCarFoodList }">
				<tr>
					<td style="padding-left: 40px">${myShoppingCarFood.foodName }</td>
					<td style="text-align: center;"><a class="reduceCar" style="text-decoration: none" href="javascript:void(0)">-</a></td>
					<td style="text-align: center;">${myShoppingCarFood.orderCount }</td>
					<td style="text-align: center;"><a style="text-decoration: none" href="javascript:void(0)">+</a></td>
					<td style="text-align: center;">${myShoppingCarFood.total } ￥</td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5"><hr></td>
			</tr>
			<tr>
				<td style="text-align: center;">总价</td>
				<td></td>
				<td></td>
				<td></td>
				<td style="text-align: center;">150 ￥</td>	
			</tr>
			<tr>
				<td colspan="5"><hr></td>
			</tr>
		</table>

		<div class="login_out">
			<a href="javascript:void(0);"><i>立即支付</i></a>
		</div>
		<div class="copyright">Copyright © 2016-2017 点多多 www.bestcfm.com 版权所有</div>
	</div>
</body>

</html>