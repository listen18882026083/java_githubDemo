<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>微商管理系统-修改管理员信息页面</title>
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
    <label class="layui-form-label">用户名</label>
    <div class="layui-input-inline">
      <input type="text" name="username" id="username" lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input" value=" ${userInfo.username}" disabled="disabled" />
    </div>
  </div> 
     <div class="layui-form-item">
    <label class="layui-form-label">联系电话 </label>
    <div class="layui-input-inline">
      <input type="text" name="phone"  id="phone"  class="layui-input" value="${userInfo.phone}">
    </div>
  </div> 
   <div class="layui-form-item">
    <label class="layui-form-label">邮箱 </label>
     <div class="layui-input-inline">
        <input type="text" name="email"   id="email" class="layui-input" value="${userInfo.email}">
      </div>
  </div> 
   <div class="layui-form-item">
    <label class="layui-form-label">联系地址 </label>
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
 <textarea name="address"  id="address" class="layui-textarea">${userInfo.address }</textarea>
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
      <input id="state" type="checkbox" checked="" name="state" lay-skin="switch" lay-filter="switchTest" lay-text="启用|停用">
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">个人照片 </label>
	<div class="layui-upload">
	<input type="hidden" name="pic" id="pic" value="${userInfo.pic}">
	  <button type="button" class="layui-btn layui-btn-normal" id="imgage" name="imgage">选择文件</button>
	  <!-- <button type="button" class="layui-btn" id="test9">开始上传</button> -->
		<div class="layui-upload-list" style="margin-left:110px">
		
		 <c:choose>
        
       		<c:when test="${(!empty userInfo.pic)}">
          		<img class="layui-upload-img" id="demo1" width="100" height="100" src="/ws/${userInfo.pic}">
          	</c:when>
          	<c:otherwise>
          		<img class="layui-upload-img" id="demo1" width="100" height="100">
          	</c:otherwise>
          	</c:choose>       
         <p id="demoText"></p>
		</div>
	</div>
  </div> 
  <input type="hidden" id="userid" value="${userInfo.id}">
  <div class="layui-form-item" style="text-align:center;">
    <input class="layui-btn"  value="保存" onclick="save();" style="width:100px"></input>
  </div> 
</form>

    
<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/images/jquery.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 <script type="text/javascript">
 $(function(){
	 //根据后台的值，设置性别
	 var sex="${userInfo.sex}";
	 if(sex=="男"){
		 $("input[name=sex][value='男']").attr("checked", true);
	 }else{
		 $("input[name=sex][value='女']").attr("checked", true);
	 }
	 
	 //根据后台返回的值，设置开关
	 var state="${userInfo.state}";
	 if(state==1){
		 document.getElementById('state').checked  = true;
		// form.render();
	 }else{
		 document.getElementById('state').checked  = false;
		 //form.render(); 
	 }
	 
 });
 
	
	layui.use('form', function(){
		var $ = layui.$;
	  var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
	  form.render();
		
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
		
		
		window.setTimeout(function(){
			initAddress()},1000);
		//然后根据数据库的值，去填充地址
		function initAddress(){
			
			var dProvince="${userInfo.province}";
			var dCity="${userInfo.city}";
			var dArea="${userInfo.area}";
			if(dProvince!=null && dProvince!=""){
			
				// $("#province option[text='湖南省']").attr("selected",true); 
				// $("#province option[text='湖南省']").prop("selected",true);
				  $("#province").find("option:contains('"+dProvince+"')").attr("selected",true);
				  initCity($("#province").val());
				  
				  window.setTimeout(function(){
					  $("#city").find("option:contains('"+dCity+"')").attr("selected",true);
					  initArea($("#city").val())
				  },500);
				
				  
				  window.setTimeout(function(){
				    	$("#area").find("option:contains('"+dArea+"')").attr("selected",true);
				  	},800);
				  
				  window.setTimeout(function(){
					  form.render('select');
				  	},1000);
				
				
			}
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
	            	$("#pic_img").remove();
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
	//保存方法
	function save(){
		 var flg=document.getElementById('state').checked;
		var state=0;
		if(flg){
			state=1;
		}
		var id=$("#userid").val();
		var phone=$("#phone").val();
		var email=$("#email").val();
		var address=$("#address").val();
		var sex=$("input[name='sex']:checked").val();
		var pic=$("#pic").val();
		var province=$("#province").find("option:selected").text();
		var city=$("#city").find("option:selected").text();
		var area=$("#area").find("option:selected").text();
		var userData='{"id":'+id+',"phone":"'+phone+'","email":"'
					+email+'","address":"'+address+'","sex":"'+sex+'","pic":"'+pic+'","state":"'+
					state+'","province":"'+province+
					'","city":"'+city+'","area":"'+area+'"}';
		$.ajax({
			url:"${pageContext.request.contextPath}/user/edit.action",
			type:"post",
			contentType : "application/json;charset=UTF-8",//发送数据的格式
			data:userData,
			dataType:"json",
			success:function(data){
				if(data!="0"){
					layui.use(['layer', 'form'], function(){
						  layer.open({
							  title: '提示信息'
							  ,content: '保存成功！'
							});     
						});
				}else{
					layui.use(['layer', 'form'], function(){
						  layer.open({
							  title: '提示信息'
							  ,content: '保存失败，请联系管理员！'
							});     
						});
				}
			}
		});
		
		
	}

</script>
</body>
</html>

