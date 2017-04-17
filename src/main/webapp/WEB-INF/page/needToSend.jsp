<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap.css" rel="stylesheet">
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap-reboot.css" rel="stylesheet">
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap-grid.css" rel="stylesheet">
<script src="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/js/bootstrap.js"></script>
<title>待派送</title>
<script type="text/javascript">
/* 触发用户登录 */
if('' == '${loginEmp}' || null == '${loginEmp}' || '${loginEmp.empRoot}' != 1){
	window.location = "../emp/toEmpLogin";
}
</script>
<script type="text/javascript">
function myrefresh(){
	window.location.reload();
}
setTimeout('myrefresh()',50000); //指定5分钟刷新一次

	/* 删除菜品 */
	$(document).ready(function(){
		$(".paisong").click(function(){
			$.ajax({
	            type: "POST",
	            data:{id:$(this).data('id')},
	            url:"paiSongFood",
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
	<div class="row-fluid">
		<div class="span12">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>编号</th>
						<th>菜品</th>
						<th>数量</th>
						<th>下单时间</th>
						<th>桌号</th>
						<th>派送</th>
					</tr>
				</thead>
				<tbody>
				
				<c:forEach var="needToSendFood" items="${needToSendFoodList }" varStatus="status">
					<tr>
						<td>${status.index+1 }</td>
						<td>${needToSendFood.foodName }</td>
						<td>${needToSendFood.orderCount }</td>
						<td>${needToSendFood.createTime }</td>
						<td>${needToSendFood.deskNo }</td>
						<td><button data-id='${needToSendFood.id }' type="button" style="cursor: pointer;" class="btn btn-info paisong">派送</button></td>
					</tr>
				</c:forEach>	
				</tbody>
			</table>
		</div>
	</div>
</div>

</body>

</html>