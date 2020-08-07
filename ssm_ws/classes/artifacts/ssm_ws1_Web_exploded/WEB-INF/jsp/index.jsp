<%@page import="com.lixing.ws.pojo.TbUserinfo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>微商管理系统</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/images/font-awesome/css/font-awesome.min.css">
  <style type="text/css">
  .fa{
  	margin-right: 10px;
  }
  .layui-nav-child dd a{
  	margin-left:30px;
  }
  .layui-nav-tree li a{
  font-size:16px;
  }
  .user-nav dd a{
  	margin-left:0px;
  }
  .layui-footer{
  	text-align: center;
  }
  .layui-footer span{
  	margin-left:30px;
  	font-weight: bold;
  	color:#FF5722;
  	font-size:18px;
  }
  </style>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo" style="font-size:24px"><i class="fa fa-weixin" aria-hidden="true"></i>微商管理系统</div>

    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
        
                <c:choose>
        
       		<c:when test="${(!empty USER.pic)}">
          	 <img src="/ws/${USER.pic}" class="layui-nav-img">
          	</c:when>
          	<c:otherwise>
          		<img alt="/ws/auto.jpg" src="/ws/auto.jpg" class="layui-nav-img">
          	</c:otherwise>
       </c:choose>
       
         ${USER_NAME}
        </a>
        <dl class="layui-nav-child user-nav" >
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">修改密码</a></dd>
          <dd><a href="${pageContext.request.contextPath}/user/loginOut.action">退出系统</a></dd>
        </dl>
      </li>
     
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test" lay-shrink="all">
        <li class="layui-nav-item layui-nav-itemed">
          
          <a class="" href="javascript:;"> <i class="fa fa-cog" aria-hidden="true"></i>系统管理</a>
          <dl class="layui-nav-child">
            <dd><a href="${pageContext.request.contextPath}/user/returnUserList.action" target="iframe">管理员列表</a></dd>
            <dd><a href="${pageContext.request.contextPath}/user/returnAddUser.action" target="iframe">新增管理员</a></dd>
            
          
          
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;"><i class="fa fa-address-book" aria-hidden="true"></i>客户管理</a>
          <dl class="layui-nav-child">
            <dd><a href="${pageContext.request.contextPath}/customer/returnCutomerList.action" target="iframe">客户列表</a></dd>
             <dd><a href="${pageContext.request.contextPath}/customer/returnAddCutomer.action" target="iframe">新增客户</a></dd>
             <dd><a href="${pageContext.request.contextPath}/customer/returnStatis.action" target="iframe">统计信息</a></dd>
           
          </dl>
        </li>
       <li class="layui-nav-item">
          <a href="javascript:;"><i class="fa fa-database" aria-hidden="true"></i>产品管理</a>
          <dl class="layui-nav-child">
            <dd><a href="${pageContext.request.contextPath}/productType/returnProductTypeList.action" target="iframe">产品类别</a></dd>
            <dd><a href="${pageContext.request.contextPath}/productInfo/returnProductInfo.action" target="iframe">产品信息</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;"><i class="fa fa-shopping-cart" aria-hidden="true"></i>订单管理</a>
          <dl class="layui-nav-child">
            <dd><a href="${pageContext.request.contextPath}/order/returnAddOrder.action" target="iframe">新增订单</a></dd>
            <dd><a href="${pageContext.request.contextPath}/order/returnOrderIndex.action" target="iframe">订单管理</a></dd>
          </dl>
        </li>
      <li class="layui-nav-item">
          <a href="javascript:;"><i class="fa fa-pie-chart" aria-hidden="true"></i>统计管理</a>
          <dl class="layui-nav-child">
            <dd><a href="${pageContext.request.contextPath}/statistics/returnMultiple.action" target="iframe">综合统计</a></dd>
            <dd><a href="${pageContext.request.contextPath}/statistics/returnOrderIndex.action" target="iframe">年统计</a></dd>
            <dd><a href="${pageContext.request.contextPath}/statistics/retunQuarter.action" target="iframe">季度统计</a></dd>
            <dd><a href="${pageContext.request.contextPath}/statistics/returnMonth.action" target="iframe">月统计</a></dd>
          </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <iframe name="iframe" src="${pageContext.request.contextPath}/user/returnUserList.action" id="iframe" width="100%" height="100%"  frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="auto" ></iframe>
  </div>
  
</div>
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
});
</script>
</body>
</html>
		

