<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微商运维管理系统-综合统计页面</title>
<style>
	body{
	 background-color: #e0dbdb;
	}
	ul,li{
		margin:0px;
		padding:0px;
		list-style: none;
	}
	
	 .statis{
		width: 280px;
		height: 150px;
		border-radius:5px;
		margin-top: 10px;
		margin-left: 10px;
		text-align: center;
		float: left;
		
	}
	 .statis .font{
	 	font-size:20px;
	 	font-family:"Microsoft Yahei";
	 	color:#fff;
	 }
	 .money{
	 	color:#ea0725;
	 	font-size:40px;
	 	padding-top:30px;
	 }
	 ul li{
	 	width: 100%;
	 	height: 40px;
	 	text-align: center;
	 	line-height: 40px;
	 	font-size:14px;
	 }
</style>
</head>
<body>        
	<div class="sale">
		<div class="statis day" style="background-color:#FF7F50">
			<div class="font">当天销售额（元）</div>
			<div class="money" id="dayMoney"></div>
			
		</div>
		<div class="statis week" style="background-color:#87CEFA">
			<div  class="font">本周销售额（元）</div>
			<div class="money" id="weekMoney"></div>
		</div>
		<div class="statis month" style="background-color:#DA70D6">
			<div class="font">本月销售额（元）</div>
			<div class="money" id="monthMoney"></div>
		</div>
		<div class="statis quarter" style="background-color:#32CD32">
			<div class="font">本季度销售额（元）</div>
			<div class="money" id="quarterMoney"></div>
		</div>
	</div>
	<div class="consume">
		<div class="statis month" style="background-color:#FF69B4">
			<div  class="font">本月消费之星</div>
			<ul  id="month-customer-ul" class="month-customer-ul">
				
				
			</ul>
		</div>
		<div class="statis quarter" style="background-color:#32CD32">
			<div class="font">本季度消费之星</div>
			<ul id="quarter-customer-ul" class="month-quarter-ul">
			
				
			</ul>
		</div>
		<div class="statis year" style="background-color:#6495ED">
			<div class="font">本年度消费之星</div>
			<ul id=year-customer-ul class="month-year-ul">
				
				
			</ul>
		</div>
	</div>
	<div class="product">
		<div class="statis month" style="background-color:#6495ED">
			<div  class="font">本月畅销产品</div>
		</div>
		<div class="statis quarter" style="background-color:#DA70D6">
			<div class="font">本季度畅销产品</div>
		</div>
		<div class="statis year" style="background-color:#87CEFA">
			<div class="font">本年度畅销产品</div>
		</div>
	</div>
</body>
<script src="${pageContext.request.contextPath}/images/jquery.js" charset="utf-8"></script>
<script type="text/javascript">
	$.ajax({
		url:"${pageContext.request.contextPath}/statistics/multipleStatis.action",
		type:"post",
		dataType:"json",
		success:function(data){
			console.log(data);
			 $("#dayMoney").html(data.dayMoney);
			 $("#weekMoney").html(data.weekMoney);
			 $("#monthMoney").html(data.monthMoney);
			 $("#quarterMoney").html(data.quarterMoney);
			
			 for(var i=0;i<data.monthCustomerStar.length;i++){
				 $("#month-customer-ul").append("<li>第"+(i+1)+"名:姓名["+data.monthCustomerStar[i].name+"],消费["+data.monthCustomerStar[i].price+"]</li>");
			 }
			 for(var i=0;i<data.quarterCustomerStar.length;i++){
				 $("#quarter-customer-ul").append("<li>第"+(i+1)+"名:姓名["+data.quarterCustomerStar[i].name+"],消费["+data.quarterCustomerStar[i].price+"]</li>");
			 }
			 for(var i=0;i<data.yearCustomerStar.length;i++){
				 $("#year-customer-ul").append("<li>第"+(i+1)+"名:姓名["+data.yearCustomerStar[i].name+"],消费["+data.yearCustomerStar[i].price+"]</li>");
			 }

		}
	});	

</script>
</html>