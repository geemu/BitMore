<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="//cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap-reboot.css" rel="stylesheet">
<link href="//cdn.bootcss.com/bootstrap/4.0.0-alpha.6/css/bootstrap-grid.css" rel="stylesheet">
<link href="../echarts/bootstrap-datetimepicker.min.css" rel="stylesheet">
<script src="../echarts/bootstrap-datetimepicker.js"></script>
<script src="../echarts/bootstrap-datetimepicker.fr.js"></script>
<script src="../echarts/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="../echarts/echarts.min.js"></script>



<title>绩效统计</title>
</head>
<body>
<div class="container-fluid">
<!-- 时间选择 -->
	<div class="row">
		<div class='col-sm-6'>
			<div class="form-group">
				<label>开始时间：</label>
				<input type='text' style="cursor: pointer;" class="form-control" id='datetimepicker1'  readonly/>
			</div>
			</div>
		<div class='col-sm-6'>
			<div class="form-group">
				<label>结束时间：</label>
				<input type='text' class="form-control" style="cursor: pointer;" id='datetimepicker2' readonly/> 
			</div>
		</div>
	</div>
	<button type="button" id="aggregation" class="btn btn-info btn-block"style="cursor: pointer" >搜索</button>
	<div class="panel panel-success" style="margin-top: 20px">
		<div class="panel-heading" >
      		<h3 class="panel-title">统计结果</h3>
   		</div>
   		<div class="panel-body" id="main" style="width: 100%;height: 400px">
      		This is a Basic panel
   		</div>
	</div>

</div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	$("#aggregation").click(function(){
		$.ajax({
            type: "POST",
            url:"/BitMore/foodOrderDetail/doEcharts",
            success: function(data) {	
            	alert(data);
            },
            error: function(){
            	console.log("请求失败");
            }
        });
	});
});
var myChart = echarts.init(document.getElementById('main'));
var option = {
        title: {
            text: 'ECharts 入门示例'
        },
        tooltip: {},
        legend: {
            data:['销量']
        },
        xAxis: {
            data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
        },
        yAxis: {},
        series: [{
            name: '销量',
            type: 'bar',
            data: [5, 20, 36, 10, 10, 20]
        }]
    };
myChart.setOption(option);
/* 时间选择 */
$(function () {  
    $('#datetimepicker1').datetimepicker({  
    	format: 'yyyy-mm-dd hh:ii:ss',  
        weekStart: 1,  
        autoclose: true,  
        minView: 'day',  
        forceParse: false, 
        endDate : new Date(),
        language: 'zh-CN' ,
        todayBtn:  1,
        todayHighlight:true,
        keyboardNavigation:true
    });  
    $('#datetimepicker2').datetimepicker({  
    	format: 'yyyy-mm-dd hh:ii:ss',  
    	initialDate:new Date(),
        weekStart: 1,  
        autoclose: true,  
        minView: 'month',  
        forceParse: false, 
        todayHighlight:true,
        endDate : new Date(),
        language: 'zh-CN' ,
        todayBtn:  1 ,
        keyboardNavigation:true
    });
});  
</script>
</html>