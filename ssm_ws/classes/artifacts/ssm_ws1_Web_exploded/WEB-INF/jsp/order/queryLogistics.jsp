<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>微商管理系统-查询快递信息</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css"  media="all">
  <style type="text/css">
  .layui-textarea{
	width: 590px;
}
.number{
	width:330px;
}

  </style>
</head>
<body>

<form  class="layui-form"  method="post" enctype="multipart/form-data">

  <div class="layui-form-item" style="margin-top:15px;">
    <label class="layui-form-label">快递类型 </label>
    <div class="layui-input-inline">
      	<select name="logisticsName" id="logisticsName">
      		<option value=""></option>
      		<option value="圆通">圆通</option>
      		<option value="申通">申通</option>
      		<option value="中通">中通</option>
      		<option value="韵达">韵达</option>
      		<option value="顺丰">顺丰</option>
      		<option value="EMS">EMS</option>
      		<option value="百世汇通">百世汇通</option>
      		<option value="京东">京东</option>
      	</select>
    </div>
    
  </div> 

  <div class="layui-form-item">
    <label class="layui-form-label">快递单号</label>
    <div class="layui-input-inline">
      <input type="type" name="orderlogisticsId" id="orderlogisticsId" value="${o.orderlogisticsid}"  lay-verify="required" placeholder="请输入类别名称" autocomplete="off" class="layui-input">
    </div>
  </div>
<input type="hidden" id="phone" value="${o.phone}"> 
  
  <div class="layui-form-item" style="text-align:center;">
 <input class="layui-btn"   type="button"  onclick="queryLogistics()" value="查询"  style="width:100px" />
   
  </div> 
</form>

<ul class="layui-timeline"  style="margin-left:30px;" id="content">

</ul>

    
<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/images/jquery.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 <script type="text/javascript">

	layui.use('form', function(){
	  var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
	  form.render();
		
		 
	  
	 	
	});  
	
	 
	 function queryLogistics(){
		  var orderlogisticsId=$("#orderlogisticsId").val();
		  var logisticsName=$("#logisticsName").val();
		  var phone=$("#phone").val();
		  if(!logisticsName){
			   alert('快递名称不能为空，请选择！');
			  return false;
		  }
		  $.ajax({
				url:"${pageContext.request.contextPath}/order/queryOrderlogisticsId.action?logisticsName="+logisticsName+"&orderlogisticsId="+orderlogisticsId+"&phone="+phone,
				type:"post",
				contentType : "application/json;charset=UTF-8",//发送数据的格式
				dataType:"json",
				success:function(res){
					$("#content").html("");
					if(res.message=="ok"){
						
						for(var i=0;res.data.length;i++){
							
							var text='<li class="layui-timeline-item">'
						    +'<i class="layui-icon layui-timeline-axis"></i>'
						    +'<div class="layui-timeline-content layui-text">'
						      +'<h3 class="layui-timeline-title">'+res.data[i].ftime+'</h3>'
						      +'<p>'
						       +res.data[i].context 
						      +'</p>'
						    +'</div>'
						  +'</li>'
							
							
							//var text="<p>开始时间："+res.data[i].time +"  结束时间："+res.data[i].ftime+"  "+res.data[i].context+"</p>";
							$("#content").append(text);
						}
					}else{
						$("#content").html("");
						var text='<li class="layui-timeline-item">'
						    +'<i class="layui-icon layui-timeline-axis"></i>'
						    +'<div class="layui-timeline-content layui-text">'
						      +'<h3 class="layui-timeline-title">提示信息</h3>'
						      +'<p>'
						       +res.message
						      +'</p>'
						    +'</div>'
						  +'</li>'
							$("#content").append(text);
						
					}
				}
			});
	  }


	
	
		
	
	


</script>
</body>
</html>

