<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<script src="//cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap.css" rel="stylesheet">
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap-reboot.css" rel="stylesheet">
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap-grid.css" rel="stylesheet">
<script src="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/js/bootstrap.js"></script>
<script src="../layer/layer.js"></script>
<script src="../layer/extend/layer.ext.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加菜品类别</title>
<script type="text/javascript">
/* 触发用户登录 */
if('' == '${loginEmp}' || null == '${loginEmp}' || '${loginEmp.empRoot}' != 2){
	window.location = "/BitMore/emp/toEmpLogin";
}
</script>
<script type="text/javascript">
layer.config({
	extend: [
	'extend/layer.ext.js', 'skin/layer.ext.css'
	]
	});
$(document).ready(function(){
	$("#addNewFoodType").click(function(){
		layer.prompt({title: '请设置菜品类别名称', formType: 0}, function(value, index){
			 $.ajax({
		            type: "POST",
		            data:{typeName:value},
		            url:"addNewFoodType",
		            success: function(data) {	
		            	layer.msg(data);
		            },
		            error: function(){
		            	console.log("请求失败");
		            }
		        });
			});
	});
});
</script>
</head>
<body>
<div class="container-fluid">
<!-- 控制台 -->
<div style="margin-top: 20px;">
	<button type="button" id="addNewFoodType" class="btn btn-info"style="cursor: pointer" >添加类别</button>
</div>
	<div class="row-fluid" style="margin-top: 20px">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>序号</th>
						<th>类别编号</th>
						<th>类别名称</th>
					</tr>
				</thead>
				<tbody>
				
				<c:forEach var="addAllFoodType" varStatus="status" items="${addAllFoodTypeList }">
					<tr>
						<td>${status.index+1 }</td>
						<td>${addAllFoodType.id }</td>
						<td>${addAllFoodType.typeName }</td>
					</tr>
				</c:forEach>	
				</tbody>
			</table>
	</div>
</div>
</body>
</html>