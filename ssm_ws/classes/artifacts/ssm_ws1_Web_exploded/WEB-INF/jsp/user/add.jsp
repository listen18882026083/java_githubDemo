<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>微商管理系统-添加管理员信息页面</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css"  media="all">
  <style type="text/css">
  .layui-textarea{
	width: 590px;
}
  </style>
</head>
<body>

<form  class="layui-form"  method="post" enctype="multipart/form-data">
  <div class="layui-form-item" style="margin-top:15px;">
    <label class="layui-form-label">用户名 </label>
    <div class="layui-input-inline">
      <input type="text" name="username" id="username" lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input" />
    </div>
        <a class="layui-btn layui-btn-normal"  onclick="checkUserName();">验证用户名</a>
  </div> 

  <div class="layui-form-item">
    <label class="layui-form-label">密码</label>
    <div class="layui-input-inline">
      <input type="password" name="password" id="password" lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
    </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">确认密码</label>
	    <div class="layui-input-inline">
	      <input type="password" name="password2" id="password2"  lay-verify="required" placeholder="请确认密码"  autocomplete="off" class="layui-input">
	    </div>
	    <div class="layui-form-mid layui-word-aux">两次输入密码必须一致</div>
	  </div>
  </div>
     <div class="layui-form-item">
    <label class="layui-form-label">联系电话 </label>
    <div class="layui-input-inline">
      <input type="text" name="phone"  id="phone"  class="layui-input">
    </div>
  </div> 
   <div class="layui-form-item">
    <label class="layui-form-label">邮箱 </label>
     <div class="layui-input-inline">
        <input type="text" name="email"   id="email" class="layui-input">
      </div>
  </div> 
   <div class="layui-form-item">
    <label class="layui-form-label">联系地址</label>
    <div class="layui-input-inline">
      <select name="province" id="province" lay-filter="province">
        <option value="">请选择省</option>
      </select>
    </div>
    <div class="layui-input-inline">
      <select name="city" id="city" lay-filter="city">
        <option value="">请选择市</option>
        
      </select>
    </div>
    <div class="layui-input-inline">
      <select name="area" id="area" lay-filter="area">
        <option value="">请选择县/区</option>
      </select>
    </div>
  </div> 
    	<div class="layui-input-block address">
      <textarea name="address" id="address" rows="5" cols="10" placeholder="详细地址" class="layui-textarea"></textarea>
    </div>
  <div class="layui-form-item">
    <label class="layui-form-label">性别 </label>
    <div class="layui-input-block">
      <input type="radio" name="sex" value="男" title="男" checked="">
      <input type="radio" name="sex" value="女" title="女">
    </div>
  </div>
  </div> 
    <div class="layui-form-item">
    <label class="layui-form-label">是否开通</label>
    <div class="layui-input-block">
      <input type="checkbox" checked="" name="state" lay-skin="switch" lay-filter="switchTest" lay-text="启用|停用">
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">个人照片 </label>
	<div class="layui-upload">
	<input type="hidden" name="pic" id="pic">
	  <button type="button" class="layui-btn layui-btn-normal" id="imgage" name="imgage">选择文件</button>
	  <!-- <button type="button" class="layui-btn" id="test9">开始上传</button> -->
		<div class="layui-upload-list" style="margin-left:110px">
	            <img class="layui-upload-img" id="demo1" width="100" height="100">
	            <p id="demoText"></p>
		</div>
	</div>
  </div> 
  
  <div class="layui-form-item" style="text-align:center;">
       <input class="layui-btn layui-btn-warm" lay-filter="*" type="button" value="提交" lay-submit />
    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
  </div> 
</form>

    
<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/images/jquery.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 <script type="text/javascript">
	var state=1;
	layui.use('form', function(){
	  var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
	  form.render();
	  
		
	  //判断用户是否选择开通此用户
	  form.on('switch(switchTest)', function(data){
	  		if(this.checked){
	  			state=1;
	  		}else{
	  			state=0;
	  		}
		   
	   });
	  
	  var statue="1";
	  form.on('switch(status)', function(data){
		 
		  if(data.elem.checked){
			  statue="1";  
		  }else{
			  statue="0";  
		  }//开关是否开启，true或者false
		  
		});  
	 //监听表单提交事件
	  form.on('submit(*)', function(data){
		  
		  var pwd1=$("#password").val();
		  var pwd2=$("#password2").val();
		  if(pwd1!=pwd2){
			  layer.msg("您输入的两次密码不一致！");
			   return false;
		  }
		  console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
		  var user=data.field;
		  delete user.file;
		  delete user.password2;
		  user.province=$("#province").find("option:selected").text();
		  user.city=$("#city").find("option:selected").text();
		  user.area=$("#area").find("option:selected").text();
		  user.state=statue;
		 
		  var userInfo=JSON.stringify(user);
			  $.ajax({
		          url: '${pageContext.request.contextPath}/user/save.action',
		      	  contentType : "application/json;charset=UTF-8",//发送数据的格式
		          data:userInfo,
		          type: 'POST',
		          dataType: 'json',
		          success: function (data) {
		        	if(data=="1"){
		        		layer.msg("添加用户成功！");
		        	}else{
		        		layer.msg("添加用户失败！");
		        	}
		          }
		       });
		 
		  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
		});
	

		
	  /**获取省级数据*/
		$.ajax({
			url:"${pageContext.request.contextPath}/area/provinceList.action",
			type:"POST",
			success:function(data){
				$.each(data, function(i, d) {
					$("select[name='province']").append(
							"<option value='"+d.code+"' >" + d.name
									+ "</option>");
				});
				 form.render('select');
			}
		});
	  //监听下拉框时间
		form.on('select(province)', function(data){ //省份信息改变的时候
			var code=data.value; //得到被选中的值
			initCity(code);
			
			//执行数据太快，加一个延时
			window.setTimeout(function(){
				var cityCode=$('#city option:first').val();
				initArea(cityCode)},1000);
		});
	 	function initCity(code){
	 		$.ajax({
				url:"${pageContext.request.contextPath}/area/cityList.action",
				type:"POST",
				data:{"code":code},
				success:function(data){
					$("select[name='city']").empty();
					$.each(data, function(i, d) {
						$("select[name='city']").append(
								"<option value='"+d.code+"' >" + d.name
										+ "</option>");
					});
					 form.render('select');
				}
			});
	 	}
		form.on('select(city)', function(data){
			var code=data.value; //得到被选中的值
			initArea(code);
			
		});
		
		function initArea(code){
			$.ajax({
				url:"${pageContext.request.contextPath}/area/areaList.action",
				type:"POST",
				data:{"code":code},
				success:function(data){
					$("select[name='area']").empty();
					$.each(data, function(i, d) {
						$("select[name='area']").append(
								"<option value='"+d.code+"' >" + d.name
										+ "</option>");
					});
					 form.render('select');
				}
			});
		}
		
		
	});    
	
	layui.use('upload', function() {
	    var $ = layui.jquery
	        , upload = layui.upload;

	    //普通图片上传
	    var uploadInst = upload.render({
	        elem: '#imgage'
	        , url: '${pageContext.request.contextPath}/user/uploadPic.action'
	        , before: function (obj) {
	            //预读本地文件示例，不支持ie8
	            obj.preview(function (index, file, result) {
	                $('#demo1').attr('src', result); //图片链接（base64）
	            });
	        }
	        , done: function (res) {
	            //如果上传失败
	            if (res.code== "1"){
	            	$("#pic").val(res.name);
	               return layer.msg('文件上传成功!');
	            }else{
	               return layer.msg('文件上传异常');
	            }
	            //上传成功
	        }
	        , error: function () {
	            //演示失败状态，并实现重传
	             return layer.msg('文件上传异常');
	            //var demoText = $('#demoText');
	            //demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
	            //demoText.find('.demo-reload').on('click', function () {
	              //  uploadInst.upload();
	            //});
	        }
	    });
	});
	
	
	
	//验证用户名是否被占用
	function checkUserName(){
		var name=$("#username").val();
		if(name==null || name==""){
			layui.use(['layer', 'form'], function(){
				  layer.open({
					  title: '提示信息'
					  ,content: '用户名不能为空。'
					});     
				});
			return false;
		}
		$.ajax({
			url:"${pageContext.request.contextPath}/user/checkUserName.action",
			type:"POST",
			data:{"username":name},
			dataType:"json",
			success:function(data){
				if(data=="1"){
					layui.use(['layer', 'form'], function(){
						  layer.open({
							  title: '提示信息'
							  ,content: '您输入的用户名已被占用，请重新输入！'
							});     
						});
				}else{
					layui.use(['layer', 'form'], function(){
						  layer.open({
							  title: '提示信息'
							  ,content: '用户名可以使用！'
							});     
						});
				}
				
			}
			
		});
	}

</script>
</body>
</html>

