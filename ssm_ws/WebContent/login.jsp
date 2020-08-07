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
        <form class="layui-form"  method="post" action="${pageContext.request.contextPath}/user/login3.action">
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
            
            <a class="layui-btn a-button"  href="javascript:void(0);" onclick="login();" >登陆</a>


        </form>
    </div>
</div>
<script src="layui/layui.js"></script>
<script src="images/jquery.js"></script>
<script>

	//用户登陆方法login();
	function login(){
		var username=$("#username").val();
		var password=$("#password").val();
		var code=$("#code").val();
		if(username==null || username==""){//判断用户名是否输入
			alert("用户名不能为空");
			return false;
		}
		if(password==null || password==""){//判断密码是否输入
			alert("密码不能为空");
			return false;
		}
		
		$.ajax({
			url:"${pageContext.request.contextPath}/login/login4.action",
			type:"POST",
			data:{"username":username,"password":password},
			dataType:"json",
			success:function(data){
				if(data=="2"){
					layui.use(['layer', 'form'], function(){
						  layer.open({
							  title: '提示信息'
							  ,content: '您输入的账号或者密码错误！'
							});     
						});
					updateVerify();
					return false;					
				}
				window.location.href="${pageContext.request.contextPath}/user/returnIndex.action";
			}
		})
	}
	

	
</script>
</body>
</html>



