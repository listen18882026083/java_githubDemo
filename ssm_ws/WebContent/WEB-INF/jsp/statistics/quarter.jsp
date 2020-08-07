<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微商管理系统-每月销售额统计页面</title>
<style type="text/css">
	html,body{
		margin:0;
		padding:0;
		width:100%;
		height:100%;
	}
	#main{
		height:400px;
		
	}
</style>
</head>
<body>
	<div id="main" style="height:400px;margin-top:20px;"></div>
</body>
<script src="${pageContext.request.contextPath}/images/jquery.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/images/echarts/build/dist/echarts.js"></script>
<script type="text/javascript">
var quarter = new Array();
var dataMonth=new Array();

	$.ajax({
		url:"${pageContext.request.contextPath}/statistics/quarterStatis.action",
		type:"post",
		dataType:"json",
		success:function(res){
			console.log(res);
			for(var i=0;i<res.length;i++){
				quarter[i]=res[i].quarter+"季度";
				// dataMonth[i]={name:quarter[i],value:res[i].price};
				dataMonth[i]=res[i].price;
			}
			// 路径配置,
			require.config({
			    paths: {
			        echarts: '${pageContext.request.contextPath}/images/echarts/build/dist'
			    }
			});
			 // 使用
		    require(
		        [
		            'echarts',
		            'echarts/chart/bar', // 使用柱状图就加载bar模块，按需加载
		            'echarts/chart/pie' ,
		            'echarts/chart/funnel',
		        ],
		        function (ec) {
		        	   // 基于准备好的dom，初始化echarts图表
		            var myChart = ec.init(document.getElementById('main')); 
		           
		            var option = {
		            		 title: {
		                         text: '季度销售额统计信息'
		                    },
		                    tooltip: {},
		                    legend: {
		                         data: ['销售额(元)']
		                    },
		                    xAxis: {
		                         data: quarter
		                    },
		                    yAxis: {},
		                    series: [{
		                         name: '销售额(元)',
		                         type: 'bar',
		                         data: dataMonth
		                    }]
		            	}; 
		            myChart.setOption(option); 
		            
		        }
		        
		    );
		}
	});	
</script>

</html>