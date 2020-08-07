<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>微商管理系统-添加商品类别信息页面</title>
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
    <label class="layui-form-label">类别编号 </label>
    <div class="layui-input-inline">
      <input type="text" width="800px" name="number" id="number" lay-verify="required"  autocomplete="off" class="layui-input number" disabled="disabled"/>
    </div>
     <div class="layui-input-inline">
      
       </div>
  </div> 

  <div class="layui-form-item">
    <label class="layui-form-label">类别名称</label>
    <div class="layui-input-inline">
      <input type="type" name="name" id="name" lay-verify="required" placeholder="请输入类别名称" autocomplete="off" class="layui-input">
    </div>
    </div>
	 
  
  <div class="layui-form-item" style="text-align:center;">
 <button class="layui-btn"   lay-submit lay-filter="*"   style="width:100px">提交</button>
   <!--  <button type="reset" class="layui-btn layui-btn-primary">重置</button> -->
  </div> 
</form>

    
<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/images/jquery.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 <script type="text/javascript">

	layui.use('form', function(){
	  var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
	  form.render();
		form.on('submit(*)', function(datas){
			var u=datas.field;
			var productType=JSON.stringify(u);
			
			$.ajax({
				url:"${pageContext.request.contextPath}/productType/save.action",
				type:"post",
				contentType : "application/json;charset=UTF-8",//发送数据的格式
				data:productType,
				dataType:"json",
				success:function(data){
					if(data>0){
						  getTypeNumber();
						  $("#name").val(" ");
						  return layer.msg('添加类别信息成功！');
						
					}else{
						 return layer.msg('添加类别信息失败，请联系管理员！');
					}
				}
			});
			
			return false;
		});
	 	
	});  
	
	 //获取产品类别的编号，由系统自动生成
	getTypeNumber();
	function getTypeNumber(){
		$.ajax({
			url:"${pageContext.request.contextPath}/productType/getTypeNumber.action",
			type:"post",
			success:function(data){
				 $("#number").val(data);
			}
		});
	}


	
	
		
	
	


</script>
</body>
</html>

