<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
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
<title>添加菜品</title>
<script type="text/javascript">
/* 触发用户登录 */
if('' == '${loginEmp}' || null == '${loginEmp}' || '${loginEmp.empRoot}' != 2){
	window.location = "../emp/toEmpLogin";
}
</script>
<style type="text/css">
#addFoodTable td{
	height:35px
}
</style>
<script type="text/javascript">
$(document).ready(function(){
	$("#doSubmit").click(function(){
		$("#addFoodForm").submit();
	})
})
</script>
</head>
<body>
<form id="addFoodForm" method="post" action="../food/addNewFood" enctype="multipart/form-data" style="margin: auto;width: 100%">
	<table id="addFoodTable" style="margin: auto;margin-top: 10px">
		<tr>
			<td style="width: 100px"><font color="#126185">菜品类别:</font></td>
			<td style="width: 200px">
				<select name="foodTypeId">
  					<c:forEach var="allFoodType" items="${allFoodTypeList }">
  						<option value="${allFoodType.id }">【${allFoodType.typeName }】</option>
  					</c:forEach>
  				</select>
			</td>
		</tr>
		<tr>
			<td><font color="#126185">菜品名称:</font></td>
			<td><input type="text" id="foodName" name="foodName" placeholder="请输入菜品名称"></td>
		</tr>
		<tr>
			<td><font color="#126185">单价:</font></td>
			<td><input type="text" name="price" placeholder="请输入菜品单价"></td>
		</tr>
		<tr>
			<td><font color="#126185">是否推荐:</font></td>
			<td>
				<input type="radio" name="recommend" value="1">是
				<input type="radio" name="recommend"  checked value="0">否
			</td>
		</tr>
		<tr>
			<td><font color="#126185">是否招牌菜:</font></td>
			<td>
				<input type="radio" name="signiture" value="1">是
				<input type="radio" name="signiture"  checked value="0">否
			</td>
		</tr>
		<tr>
			<td><font color="#126185">图片:</font></td>
			<td><input type="file" name="pic"></td>
		</tr>
		<tr>
			<td colspan="2"><button id="doSubmit" type="button" style="cursor: pointer;" class="btn btn-info btn-block">立即发布</button></td>
		</tr>
	</table>
</form>
</body>
</html>