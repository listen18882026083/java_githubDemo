<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理-登陆</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <link rel="stylesheet" href="images/login.css">
    <style>
    	.admin-header{
    		text-align: center;
    		font-size: 28px;
    		font-family: '微软雅黑';
    		font-weight: 100;
    		color:#fff;
    	}
    	.show{
    		text-align: center;
    		line-height: 25px;
    		height: 25px;
    		color:#fff;
    		padding-top:10px;
    	}
    	.a-button{
    		width:300px;
    		margin-top:10px;
    	}
    	body{
    		background-image: url(images/bj.jpg);
    		background-repeat: no-repeat;
    		background-size:100% 100%;
			background-attachment:fixed;
    	}
    </style>
</head>
<body>
<div id="container">
    <div></div>
    <div class="admin-login-background">
        <div class="admin-header">
       
       	微商管理系统
         
        </div>
        <form class="layui-form"  method="post" action="${pageContext.request.contextPath}/user/login.action">
            <div>
                <i class="layui-icon layui-icon-username admin-icon admin-icon-username"></i>
                <input type="text" name="username" placeholder="请输入用户名"
                		id="username"
                       autocomplete="off"
                       class="layui-input admin-input admin-input-username">
            </div>
            <div>
                <i class="layui-icon layui-icon-password admin-icon admin-icon-password"></i>
                <input type="password" name="password" id="password"
                       placeholder="请输入密码"
                       autocomplete="off"
                       class="layui-input admin-input">
            </div> 
			 <div>
			        <div id="captcha2">
			            <p id="wait2" class="show">正在加载验证码......</p>
			        </div>
			    </div>
            <a class="layui-btn a-button"  href="javascript:void(0);"  id="submit">登陆</a>


        </form>
    </div>
</div>
<script src="layui/layui.js"></script>
<script src="images/jquery.js"></script>
<script src="images/gt.js"></script>
<script>
	var i=0;
    var handler2 = function (captchaObj) {
        $("#submit").click(function (e) {
        	
        	var username=$("#username").val();
    		var password=$("#password").val();
    		
    		if(username==null || username==""){//判断用户名是否输入
    			layui.use(['layer', 'form'], function(){
					  layer.open({
						  title: '提示信息'
						  ,content: '用户名不能为空'
						});     
					});
    			
    			return false;
    		}
    		if(password==null || password==""){//判断密码是否输入
    			layui.use(['layer', 'form'], function(){
					  layer.open({
						  title: '提示信息'
						  ,content: '密码不能为空'
						});     
					});
    			
    			return false;
    		}
    		
            var result = captchaObj.getValidate();
            if (!result) {
            	layui.use(['layer', 'form'], function(){
					  layer.open({
						  title: '提示信息'
						  ,content: '请完成验证'
						});     
					});
            	return false;
            } 
            if(i==0){
            	//代表着用户是第一次进来这个方法
            	i++;
            	   $.ajax({
                       url: '${pageContext.request.contextPath}/login/login.action',
                       type: 'POST',
                       dataType: 'json',
                       data: {
                           "username": username,
                           "password": password,
                           "geetest_challenge": result.geetest_challenge,
                           "geetest_validate": result.geetest_validate,
                           "geetest_seccode": result.geetest_seccode
                       },
                       success: function (data) {
                           if (data == "1") {
                           	window.location.href="${pageContext.request.contextPath}/user/returnIndex.action";
                           } else if (data == "2") {
                           	layui.use(['layer', 'form'], function(){
         						  layer.open({
         							  title: '提示信息'
         							  ,content: '您输入的账号或者密码错误！'
         							});     
         						});
                           }else{
                           	layui.use(['layer', 'form'], function(){
           						  layer.open({
           							  title: '提示信息'
           							  ,content: '验证失败'
           							});     
           						});
                           }
                       }
                   });
            }else{
            	 $.ajax({
                     url: '${pageContext.request.contextPath}/login/login2.action',
                     type: 'POST',
                     dataType: 'json',
                     data: {
                         "username": username,
                         "password": password
                     },
                     success: function (data) {
                         if (data == "1") {
                         	window.location.href="${pageContext.request.contextPath}/user/returnIndex.action";
                         } else if (data == "2") {
                         	layui.use(['layer', 'form'], function(){
       						  layer.open({
       							  title: '提示信息'
       							  ,content: '您输入的账号或者密码错误！'
       							});     
       						});
                         }
                     }
                 });
            }
            
            e.preventDefault();
        });
        // 将验证码加到id为captcha的元素里，同时会有三个input的值用于表单提交
        captchaObj.appendTo("#captcha2");
        captchaObj.onReady(function () {
            $("#wait2").hide();
        });
     
    };
    $.ajax({
        url: "${pageContext.request.contextPath}/login/startCaptcha.action?t=" + (new Date()).getTime(), // 加随机数防止缓存
        type: "get",
        dataType: "json",
        success: function (data) {
            // 调用 initGeetest 初始化参数
            // 参数1：配置参数
            // 参数2：回调，回调的第一个参数验证码对象，之后可以使用它调用相应的接口
            initGeetest({
                gt: data.gt,
                challenge: data.challenge,
                new_captcha: data.new_captcha, // 用于宕机时表示是新验证码的宕机
                offline: !data.success, // 表示用户后台检测极验服务器是否宕机，一般不需要关注
                product: "popup", // 产品形式，包括：float，popup
                width: "100%"
            }, handler2);
        }
    });
</script>

</body>
</html>



