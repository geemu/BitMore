<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap.css" rel="stylesheet">
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap-reboot.css" rel="stylesheet">
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap-grid.css" rel="stylesheet">
<script src="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/js/bootstrap.js"></script>
<script src="../layer/layer.js"></script>
<script type="text/javascript">
/* 触发用户登录 */
if('' == '${loginEmp}' || null == '${loginEmp}' || '${loginEmp.empRoot}' != 2){
	window.location = "../emp/toEmpLogin";
}
</script>
<title>菜品管理</title>
<script type="text/javascript">
/* 添加菜品 */
$(document).ready(function(){
	$("#addNewFood").click(function(){
		layer.open({
			  type: 2,
			  title:'添加菜品',
			  skin: 'layui-layer-rim', //加上边框
			  area: ['500px', '320px'], //宽高
			  content: '/BitMore/foodType/allFoodType'
			});
	});
});

/* 添加类别 */
$(document).ready(function(){
	$("#addNewFoodType").click(function(){
		layer.open({
			  type: 2,
			  title:'添加菜品类别',
			  skin: 'layui-layer-rim', //加上边框
			  area: ['500px', '320px'], //宽高
			  content: '/BitMore/foodType/addFoodType'
			});
	});
});
/* 删除菜品 */
$(document).ready(function(){
	$(".doDelete").click(function(){
		$.ajax({
            type: "POST",
            data:{foodId:$(this).data('foodid')},
            url:"deleteFood",
            success: function(data) {	
            	alert(data);
            	window.location.reload();
            },
            error: function(){
            	console.log("请求失败");
            }
        });
	});
});
</script>
</head>
<body>
<div class="container-fluid">
<!-- 控制台 -->
<div style="margin-top: 20px;">
	<button type="button" id="addNewFood" class="btn btn-info"style="cursor: pointer" >添加菜品</button>
	<button type="button" id="addNewFoodType" class="btn btn-info" style="cursor: pointer">类别管理</button>
</div>
	<div class="row-fluid" style="margin-top: 20px">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>序号</th>
						<th>菜品名称</th>
						<th>价格</th>
						<th>销量</th>
						<th>菜品类别</th>
						<th>删除</th>
					</tr>
				</thead>
				<tbody>
				
				<c:forEach var="allFood" items="${allFoodList }" varStatus="status">
					<tr>
						<td>${status.index+1 }</td>
						<td>${allFood.foodName }</td>
						<td>${allFood.price }</td>
						<td>${allFood.sales }</td>
						<td>${allFood.typeName }</td>
						<td><input data-foodid='${allFood.id }' type="button" class="btn btn-default btn-info doDelete" style="cursor: pointer;" value="删除"/></td>
					</tr>
				</c:forEach>	
				</tbody>
			</table>
	</div>
</div>
</body>
</html>