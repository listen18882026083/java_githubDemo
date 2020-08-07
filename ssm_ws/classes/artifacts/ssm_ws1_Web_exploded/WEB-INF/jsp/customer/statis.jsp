<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微商管理系统-客户信息统计页面</title>
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

<script src="${pageContext.request.contextPath}/images/jquery.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/images/echarts/build/dist/echarts.js"></script>
<script type="text/javascript">
	var arr = new Array();
	var gradeName=new Array();
	gradeName[0]="青铜";
	gradeName[1]="白银";
	gradeName[2]="黄金";
	gradeName[3]="铂金";
	gradeName[4]="钻石";
	gradeName[5]="超级VIP";
	$.ajax({
		url:"${pageContext.request.contextPath}/customer/statisGrade.action",
		type:"post",
		dataType:"json",
		success:function(data){
			for(var i=0;i<data.length;i++){
				arr[i]={name:gradeName[i],value:data[i].grade};
			}
		}
	});	
	
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
                	    title : {
                	        text: '客户信息统计图表',
                	        subtext: '',
                	        x:'center'
                	    },
                	    tooltip : {
                	        trigger: 'item',
                	        formatter: "{a} <br/>{b} : {c} ({d}%)"
                	    },
                	    legend: {
                	        orient : 'vertical',
                	        x : 'left',
                	        data:["青铜","白银","黄金","铂金","钻石","超级VIP"]
                	    },
                	    toolbox: {
                	        show : true,
                	        feature : {
                	            mark : {show: true},
                	            dataView : {show: true, readOnly: false},
                	            magicType : {
                	                show: true, 
                	                type: ['pie', 'funnel'],
                	                option: {
                	                    funnel: {
                	                        x: '25%',
                	                        width: '50%',
                	                        funnelAlign: 'left',
                	                        max: 1548
                	                    }
                	                }
                	            },
                	            restore : {show: true},
                	            saveAsImage : {show: true}
                	        }
                	    },
                	    calculable : true,
                	    series : [
                	        {
                	            name:'统计数据',
                	            type:'pie',
                	            radius : '55%',
                	            center: ['50%', '60%'],
                	            data:arr  //填充数据库
                	        }
                	    ]
                	};
        
               
                // 为echarts对象加载数据 
              
                myChart.setOption(option); 
                
            }
            
        );
        
   

        
    </script>
    
</body>
</html>