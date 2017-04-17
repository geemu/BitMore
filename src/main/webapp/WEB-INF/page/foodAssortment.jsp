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
<meta name="applicable-device" content="mobile" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>分类</title>
<link href="../css/public.css" rel="stylesheet" type="text/css" />
<link href="../frozenui/css/frozen.css" rel="stylesheet" type="text/css" />
<link href="../css/news.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.8.3.min.js"></script>

</head>

<body>
<div class="mobile">
	<header>
		<div class="header">
			<a class="new-a-back" href="javascript:history.back();"> 
				<span><img src="../images/iconfont-fanhui.png"></span>
			</a>
			<h2>分类</h2>
			<div class="header_right shaixuan">
				<a href="../"><img src="../images/iconfont-shouye.png"></a>
			</div>
		</div>
	</header>
	<table style="width: 98%;margin-top: 10px;margin-left: 1%">
		<c:forEach var="myAllType" items="${myAllTypeList }" varStatus="status">
			<tr>
				<td class="myTd" data-id='${myAllType.id }' style="cursor:pointer;text-align: center;border-bottom:1px solid #999999;height: 40px;background-color: #F7F7F7">${myAllType.typeName }</td>
			</tr>
		</c:forEach>
	</table>
	<div class="copyright">Copyright © 2016-2017 点多多 www.bestcfm.com 版权所有</div>
</div>
</body>
<script type="text/javascript">
$(".myTd").click(function(){
	window.location = "../food/leibiesousuo?id="+$(this).data("id");
})
</script>
</html>