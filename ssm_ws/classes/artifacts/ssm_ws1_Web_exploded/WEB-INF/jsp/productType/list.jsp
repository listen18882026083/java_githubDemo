<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>微商运营管理系统-产品类别信息</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css"  media="all">
  <style type="text/css">
  .layui-form{
  	margin-left:20px;
  	margin-top:20px;
  }
  </style>
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<form class="layui-form layui-form-pane" action="">
	<div class="layui-inline"">
	    <label class="layui-form-label">类别名称</label>
	    <div class="layui-input-inline">
	      <input  type="text" id="name" name="name" lay-verify="required" placeholder="请输入产品类别名称" autocomplete="off" class="layui-input">
	    </div>
  </div>
   <div class="layui-inline">
    <button class="layui-btn"  lay-filter="demo2" id="query" type="button">检索</button>
  </div>
</form>
<table class="layui-hide" id="test" lay-filter="test"></table>
<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">新增产品类别</button>
    <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">批量删除</button>
    <!--<button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>-->
  </div>
</script>
 
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
              
          
<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/images/jquery.js" charset="utf-8"></script>

<!-- 日期时间转换的功能 -->
<script type="text/html" id="feedbackTime">
    {{#
     return layui.util.toDateString(d.newdate, 'yyyy-MM-dd HH:mm:ss')
    }}
</script>
<!-- 序号添加的js -->
<script type="text/html" id="xuhao">
    {{d.LAY_TABLE_INDEX+1}}
</script>
<script>

layui.use(['table','util'], function(){
  var table = layui.table,
  util = layui.util,
  form = layui.form;
  
  var tableIns=table.render({
    elem: '#test'
    ,url:'${pageContext.request.contextPath}/productType/list.action'
    ,toolbar: '#toolbarDemo'
    ,title: '产品类别信息表'
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field:'id', title:'ID', width:80, fixed: 'left', unresize: true, sort: true,style:'display:none'}
      ,{field:'xuhao',type:'numbers', title:'序号', width:80, fixed: 'left', sort:true,templet:'#xuhao'}
      ,{field:'number', title:'类别编号', width:320, }
      ,{field:'name', title:'类别名称', width:200}
      
      ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
    ]]
    ,page: true
    ,done: function () {
        $("[data-field='id']").css('display','none');
    }
  });
  
  //头工具栏事件
  table.on('toolbar(test)', function(obj){
    var checkStatus = table.checkStatus(obj.config.id);
    switch(obj.event){
    //新增事件
      case 'getCheckData':
       	// var data = checkStatus.data;
        //layer.alert(JSON.stringify(data));
        layer.open({
    	  type: 2,
	      title: '微商运营管理系统-新增产品类别',
	      maxmin: true,
	      shadeClose: true, //点击遮罩关闭层
	      area : ['900px' , '420px'],
	      content: '${pageContext.request.contextPath}/productType/returnAddProductType.action'
	    });
      break;
      //批量删除
      case 'getCheckLength':
        var data = checkStatus.data;
        if(data.length==0){
        	 layer.msg('未选中数据,请选择数据！');
        	 return false;
        }
       
      var ids=new Array();
      for(var i=0;i<data.length;i++){
    	  ids.push(data[i].id);
      }
        layer.confirm('确定删除这'+data.length+'记录？', function(index){
		  	  $.ajax({
					url:"${pageContext.request.contextPath}/productType/deleteByIds.action",
					data:{"ids":ids},
					type:"post",
					dataType:"json",
					success:function(data){
						if(data>0){
							 layer.msg("删除成功!");
							 location.reload(true);//刷新页面
						}
					}
		  	});
		  	 layer.close(index);
        });
        
      break;
      case 'isAll':
        layer.msg(checkStatus.isAll ? '全选': '未全选');
      break;
    };
  });
  
  //监听行工具事件
  table.on('tool(test)', function(obj){
    var data = obj.data;
    if(obj.event === 'del'){
    	//后台接收的书数组，所以需要转换
    	  var ids=new Array();
    	  ids.push(data.id);
      layer.confirm('确定删除该记录？', function(index){
    	  $.ajax({
  			url:"${pageContext.request.contextPath}/productType/deleteByIds.action",
  			data:{"ids":ids},
  			type:"post",
  			dataType:"json",
  			success:function(data){
  				if(data>0){
  					 layer.msg("删除成功!");
  					 obj.del();
  				}
  			}
    	});
    	  //location.reload(true);
       
        layer.close(index);
      });
    } else if(obj.event === 'edit'){
    	layer.open({
      	  type: 2,
  	      title: '微商运营管理系统-编辑产品类别',
  	      maxmin: true,
  	      shadeClose: true, //点击遮罩关闭层
  	      area : ['900px' , '720px'],
  	      content: '${pageContext.request.contextPath}/productType/queryById.action?id='+data.id
  	    });
    }
  });

  //条件查询
  $("#query").on("click",function(){
	  tableIns.reload({
		  where: { //设定异步数据接口的额外参数，任意设
			name: $("#name").val()//这里获取input的值
		  }
		  ,page: {
		 	 curr: 1 //重新从第 1 页开始
		  }
		  });  
	});


});

</script>

</body>
</html>

