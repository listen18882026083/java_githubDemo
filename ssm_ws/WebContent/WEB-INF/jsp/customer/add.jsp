<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>微商管理系统-添加客户信息页面</title>
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
	<div class="layui-inline">
	    <label class="layui-form-label">姓名 </label>
	    <div class="layui-input-inline">
	      <input type="text" name="name" id="name"  lay-verify="required" autocomplete="off" class="layui-input" />
	    </div>
	</div>
	<div class="layui-inline">
		  <div class="layui-form-item">
		    <label class="layui-form-label">性别 </label>
		    <div class="layui-input-block">
		      <input type="radio" name="sex" value="男" title="男" checked="">
		      <input type="radio" name="sex" value="女" title="女">
		    </div>
		  </div>
	</div>
  </div> 

  <div class="layui-form-item" style="margin-top:15px;">
	<div class="layui-inline">
	    <label class="layui-form-label">联系电话</label>
	    <div class="layui-input-inline">
	      <input type="text" name="phone" id="phone" lay-verify="required" autocomplete="off" class="layui-input" />
	    </div>
	</div>
	<div class="layui-inline">
	    <label class="layui-form-label">邮箱</label>
	    <div class="layui-input-inline">
	      <input type="text" name="email" id="email"   autocomplete="off" class="layui-input" />
	    </div>
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
   <div class="layui-form-item" style="margin-top:15px;">
		<div class="layui-inline">
		    <label class="layui-form-label">微信账号</label>
		    <div class="layui-input-inline">
		      <input type="text" name="wechat" id="wechat" lay-verify="required" autocomplete="off" class="layui-input" />
		    </div>
		</div>
		<div class="layui-inline">
		    <label class="layui-form-label">微信昵称</label>
		    <div class="layui-input-inline">
		      <input type="text" name="wechatNetname" id="wechatNetname" lay-verify="required"  autocomplete="off" class="layui-input" />
		    </div>
		</div>
  </div>
  
     <div class="layui-form-item" style="margin-top:15px;">
		<div class="layui-inline">
		    <label class="layui-form-label">QQ号码</label>
		    <div class="layui-input-inline">
		      <input type="text" name="qq" id="qq"  autocomplete="off" class="layui-input" />
		    </div>
		</div>
		<div class="layui-inline">
		    <label class="layui-form-label">QQ昵称</label>
		    <div class="layui-input-inline">
		      <input type="text" name="qqNetname" id="qqNetname"   autocomplete="off" class="layui-input" />
		    </div>
		</div>
  </div>
  

  <div class="layui-form-item" style="margin-top:15px;">
	<div class="layui-inline">
	    <label class="layui-form-label">身高</label>
	    <div class="layui-input-inline">
	      <input style="width:100px;" placeholder="单位：CM" type="text" name="height" id="height" autocomplete="off" class="layui-input" />
	    
	    </div>
	</div>
	<div class="layui-inline">
	    <label class="layui-form-label">体重</label>
	    <div class="layui-input-inline">
	      <input type="text" style="width:100px;" placeholder="单位：KG" name="weight" id="weight"  autocomplete="off" class="layui-input" />
	    </div>
	</div>
  </div>

  <div class="layui-form-item" style="margin-top:15px;">
	<div class="layui-inline">
	    <label class="layui-form-label">爱好</label>
	    <div class="layui-input-inline">
	      <input type="text" name="hobby" id="hobby"  autocomplete="off" class="layui-input" />
	    </div>
	</div>
	<div class="layui-inline">
	    <label class="layui-form-label">用户等级</label>
	    <div class="layui-input-inline">
	      <select name="grade" id="grade">
	        <option value="0">青铜</option>
	        <option value="1">白银</option>
	        <option value="2">黄金</option>
	        <option value="3">铂金</option>
	        <option value="4">钻石</option>
	        <option value="5">超级VIP</option>
	      </select>
	    </div>
	</div>
  </div>
  
    <div class="layui-form-item" style="margin-top:15px;">
	<div class="layui-inline">
	    <label class="layui-form-label">学历</label>
	    <div class="layui-input-inline">
	     <select name="type">
	        <option value="0">初中</option>
	        <option value="1">高中</option>
	        <option value="2">大专</option>
	         <option value="3">本科</option>
	        <option value="4">研究生</option>
	        <option value="5">博士生</option>
	        <option value="6">无业人员</option>
	        <option value="7">社会工作者</option>
	         <option value="8">其他</option>
	      </select>
	    </div>
	</div>
	<div class="layui-inline">
	    <label class="layui-form-label">身份证号码</label>
	    <div class="layui-input-inline">
	      <input type="text" name="cardId" id="cardId"   autocomplete="off" class="layui-input" />
	    </div>
	</div>
  </div>
	 <div class="layui-form-item" style="margin-top:15px;">
		 	<div class="layui-inline">
			    <label class="layui-form-label">推荐人</label>
			    <div class="layui-input-inline">
			      <input type="text" name="recommender" id="recommender"   autocomplete="off" class="layui-input" />
			    </div>
			</div>
			<div class="layui-inline">
			    <label class="layui-form-label">信仰</label>
			    <div class="layui-input-inline">
			      <input type="text" name="believer" id="believer"   autocomplete="off" class="layui-input" />
			    </div>
			</div>
	 </div>
 
	  <div class="layui-form-item" style="margin-top:15px;">
	  		<div class="layui-inline">
			    <label class="layui-form-label">紧急联系人</label>
			    <div class="layui-input-inline">
			      <input type="text" name="urgentName" id="urgentName"   autocomplete="off" class="layui-input" />
			    </div>
			</div>
			<div class="layui-inline">
			    <label class="layui-form-label">紧急电话</label>
			    <div class="layui-input-inline">
			      <input type="text" name="urgentPhone" id="urgentPhone"   autocomplete="off" class="layui-input" />
			    </div>
			</div>
			<div class="layui-inline">
			    <label class="layui-form-label">关系</label>
			    <div class="layui-input-inline">
			     <select name="relation" id="relation">
			        <option value="0">夫妻</option>
			        <option value="1">父亲</option>
			         <option value="2">母亲</option>
			         <option value="3">儿子</option>
			         <option value="4">女儿</option>
			         <option value="5">哥哥</option>
			         <option value="6">弟弟</option>
			         <option value="7">姐姐</option>
			         <option value="8">妹妹</option>
			         <option value="9">亲友</option>
			         <option value="10">朋友</option>
			         <option value="11">其他</option>
			      </select>
			    </div>
			</div>
	  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">客户照片 </label>
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
    <button class="layui-btn"   lay-submit lay-filter="*"   style="width:100px">提交</button>
    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
  </div> 
</form>

    
<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/images/jquery.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 <script type="text/javascript">
	var state=1;
	layui.use(['form','layer'], function(){
	  var form = layui.form,
	  layer = layui.layer; //只有执行了这一步，部分表单元素才会自动修饰成功
	  form.render();
	  
	  
		form.on('submit(*)', function(datas){
			 var customer=datas.field;
			 customer.province=$("#province").find("option:selected").text();
			 customer.city=$("#city").find("option:selected").text();
			 customer.area=$("#area").find("option:selected").text();
			 delete customer.file;
			 console.log(customer);
			 customer=JSON.stringify(customer); //把对象转换成json格式
			 //当前容器的全部表单字段，名值对形式：{name: value}
			
			  $.ajax({
					url:"${pageContext.request.contextPath}/customer/save.action",
					type:"post",
					contentType : "application/json;charset=UTF-8",//发送数据的格式
					data:customer,
					dataType:"json",
					success:function(data){
						if(data==1){
							  return layer.msg('添加客户信息成功！');
						}else{
							 return layer.msg('添加客户信息失败，请联系管理员！');
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
	  //监听下拉框事件
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
	

</script>
</body>
</html>

