<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>微商管理系统-商品信息编辑页面</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css"  media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/images/font-awesome/css/font-awesome.min.css">
  <style type="text/css">
  .layui-textarea{
	width: 590px;
}
.number{
	width:330px;
}
.layui-form-label{
	margin-left:30px;
}
.layui-form-label{
	margin-left:30px;
}
.upload-img{
	position: relative;
	display: inline-block;
}
.delete-div{
	position: absolute;
	top:0px;
	left:80px;
	width:20px;
	height:20px;
	background-color: #000;
	display: inline-block;
	cursor: pointer;
	text-align: center;
	opacity:0.5;

}
.delete-div i{
	color:#fff;
}
  </style>
</head>
<body>

<form  class="layui-form layui-form-pane"  method="post" enctype="multipart/form-data">
<input type="hidden" id="id" name="id" value="${productInfo.id}">
  <div class="layui-form-item" style="margin-top:15px;">
    <label class="layui-form-label">所属类别 </label>
    <div class="layui-input-inline">
     <select name="typeid" id="typeid" lay-filter="aihao">
       
      </select>
    </div>
  </div> 

  <div class="layui-form-item">
    <label class="layui-form-label">产品编号</label>
    <div class="layui-input-inline">
      <input type="type" name="infonumber" id="infonumber"   value="${productInfo.infonumber}"  lay-verify="required" disabled="disabled"   autocomplete="off" class="layui-input number">
    </div>
    </div>
    
    <div class="layui-form-item">
   		 <label class="layui-form-label">产品名称</label>
     	<div class="layui-input-inline">
	      	<input type="type" name="infoname" id="infoname" value="${productInfo.infoname}"   lay-verify="required"  autocomplete="off" class="layui-input number">
	    </div>
    </div>
   <div class="layui-form-item">
   <label class="layui-form-label">成本价</label>
     	<div class="layui-input-inline">
   		 	
	      	<input type="type" name="infocost" id="infocost" value="${productInfo.infocost}" lay-verify="required|number"  autocomplete="off" class="layui-input">
	    </div>
	     <label class="layui-form-label">折扣</label>
	     <div class="layui-input-inline">
	   		
	      	<input type="type" name="infodiscount" id="infodiscount"  value="${productInfo.infodiscount}" lay-verify="required|number"  autocomplete="off" class="layui-input">
	    </div>
    </div>
  
     <div class="layui-form-item">
     	<label class="layui-form-label">销售价</label>
     	<div class="layui-input-inline">
   		 
	      	<input type="type" name="infoprice" id="infoprice"  value="${productInfo.infoprice}" lay-verify="required|number"  autocomplete="off" class="layui-input">
	    </div>
	    <label class="layui-form-label">规格</label>
	     <div class="layui-input-inline">
	   		 
	      	<input type="type" name="infospec" id="infospec" value="${productInfo.infospec}"  lay-verify="required"  autocomplete="off" class="layui-input">
	    </div>
    </div>
    
    
     <div class="layui-form-item">
     <label class="layui-form-label">产地</label>
     	<div class="layui-input-inline">
   		 	
	      	<input type="type" name="infoorigin" id="infoorigin" value="${productInfo.infoorigin}" lay-verify="required"  autocomplete="off" class="layui-input">
	    </div>
	     <label class="layui-form-label">品牌名称</label>
	     <div class="layui-input-inline">
	   		
	      	<input type="type" name="infobrand" id="infobrand"  value="${productInfo.infobrand}" lay-verify="required"  autocomplete="off" class="layui-input">
	    </div>
    </div>
  
      <div class="layui-form-item">
      <label class="layui-form-label">热度</label>
     	<div class="layui-input-inline"> 	
		  <select name="infoheat" id="infoheat" >
	        <option value="0">一般</option>
	        <option value="1">流行款</option>
	        <option value="2">流行款</option>
	        <option value="3">爆单款</option>	        
	      </select>
	    </div>
	     <label class="layui-form-label">适用人群</label>
		     <div class="layui-input-inline">
			   <select name="intendedfor" id="intendedfor" >
		        <option value="所有">所有</option>
		        <option value="儿童">儿童</option>
		        <option value="男士">男士</option>
		        <option value="女士">女士</option>	        
		      </select>	    
		     </div>
    </div> 
          <div class="layui-form-item">
          <label class="layui-form-label">库存</label>
     	<div class="layui-input-inline">
   		 	
	      	<input type="type" name="infostock" id="infostock"  value="${productInfo.infostock}" lay-verify="required"  autocomplete="off" class="layui-input">
	    </div>
	     <label class="layui-form-label">快递费</label>
	     <div class="layui-input-inline">
	   		
	      	<input type="type" name="infopostage" id="infopostage"  value="${productInfo.infopostage}" lay-verify="required|number"  value="0" autocomplete="off" class="layui-input">
	    </div>
    </div> 
  <div class="layui-upload">
		<input type="hidden" id="infopic" name="infopic" value="${productInfo.infopic}">
	 	 <button type="button" class="layui-btn" id="image">产品图片上传</button> 
	    <input class="layui-btn layui-btn-warm" type="button" value="开始上传" id="upload-pic"/>
		  <blockquote class="layui-elem-quote layui-quote-nm" style="margin-top: 10px;">
		    预览图：
		    <div class="layui-upload-list" id="preview"></div>
	 </blockquote>
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
			  delete u.file;	
			  console.log(u)
			var productInfo=JSON.stringify(u);
			
			$.ajax({
				url:"${pageContext.request.contextPath}/productInfo/edit.action",
				type:"post",
				contentType : "application/json;charset=UTF-8",//发送数据的格式
				data:productInfo,
				dataType:"json",
				success:function(data){
					if(data>0){
						  return layer.msg('修改产品信息成功！');
						
					}else{
						 return layer.msg('修改产品信息失败，请联系管理员！');
					}
				}
			});
			
			return false;
		});
		//获取产品类别的编号，由系统自动生成
		var dataTypeId="${productInfo.typeid}";
		
		getTypeNumber();
		

		//自动生成产品编号，并且获取所有产品类别的编号	
		function getTypeNumber(){
			
			$.ajax({
				url:"${pageContext.request.contextPath}/productType/getProductType.action",
				type:"post",
				success:function(data){
					
					$.each(data, function(i, d) {
						$("select[name='typeid']").append(
								"<option value='"+d.id+"' >" + d.name
										+ "</option>");
					});
					$("#typeid").val(dataTypeId);
					 form.render('select');
				}
			});
		}

		$("#infoheat").val("${productInfo.infoheat}");
		$("#intendedfor").val("${productInfo.intendedfor}");
	 	
	});  
	
	 
	setPic();
	function setPic(){
		//加载图片信息
		var dataPic="${productInfo.infopic}";
		if(dataPic!=null && dataPic!=""){
			var arr=dataPic.split(";");
			for(var i=0;i<arr.length;i++){
				var picName=arr[i];
				 $('#preview').append('<div class="upload-img '+picName.split(".")[0]+'" id="'+picName.split(".")[0]+'"><img width="100px" height="100px" src="/ws/'+ picName +'" alt="'+picName +'" class="layui-upload-img"><div class="delete-div" imgname="'+picName+'" onClick="deleteImg(this)" ><i class="fa fa-trash" aria-hidden="true"></i></div></div>');
			}
		}
	}
	
	layui.use('upload', function() {
	    var $ = layui.jquery
	        , upload = layui.upload;
			var count=0;
		  upload.render({
			    elem: '#image'
			    ,url: '${pageContext.request.contextPath}/user/uploadPic.action'
			    ,multiple: true   //代表支持多图上传
			    ,auto:false  //代表不自动上传
			    ,bindAction:'#upload-pic' //与auto:false 配合使用
			    ,before: function(obj){
			      //预读本地文件示例，不支持ie8
			      obj.preview(function(index, file, result){
			       				       	
			      });
			    }
			    ,done: function(res){
			    	console.log(res);
			    	var str=$('#infopic').val();
			    	if(str!=""){
			    		str=str+";"
			    		str+=res.name;
			    		$('#infopic').val(str)
			    	}else{
			    		$('#infopic').val(res.name)
			    	}
			    		
			     	//上传图片成功，把图片名称保存在隐藏表单中
			     	 count++;;
			     	var imgName=res.name;
			     	var arr=imgName.split(".");
			     	 $('#preview').append('<div class="upload-img '+arr[0]+'" id="'+arr[0]+'"><img width="100px" height="100px" src="/ws/'+ res.name +'" alt="'+ res.name +'" class="layui-upload-img"><div class="delete-div" imgname="'+res.name+'" onClick="deleteImg(this)" ><i class="fa fa-trash" aria-hidden="true"></i></div></div>');

			    }
			  });
	});
	
	
	function deleteImg(obj){
		//获取图片名称
		var img=$(obj).attr("imgname");
		var img2=img+";";
		var img3=";"+img;
		
	     //删除图片
		$.ajax({
			url:"${pageContext.request.contextPath}/user/deleteImg.action?imgName="+img,
			type:"post",
			success:function(data){
				//删除成功
				if(data==='1'){
					var inputPic=$("#infopic").val();
					
					//判断后面是否有分号
					if(inputPic.indexOf(img2)!=-1){
						inputPic=inputPic.replace(img2,'');
						$("#infopic").val(inputPic);
						
						$('.'+(img.split("."))[0]).remove();
					}else{
						//继续判断前面有分号没
						if(inputPic.indexOf(img3)!=-1){
							inputPic=inputPic.replace(img3,'');
							$("#infopic").val(inputPic);
							$('.'+(img.split("."))[0]).remove();
						}else{
							inputPic=inputPic.replace(img,'');
							$("#infopic").val(inputPic);
							$('.'+(img.split("."))[0]).remove();
						}
						
					}
					
				}else{
					alert("删除图片失败，请联系管理员！");
				}
			}
		});
	 	
	 	
  }
	
	


</script>
</body>
</html>

