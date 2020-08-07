<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>微商管理系统-管理员列表信息页面</title>
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
	    <label class="layui-form-label">用户名</label>
	    <div class="layui-input-inline">
	      <input  type="text" id="username" name="username" lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
	    </div>
  </div>
   <div class="layui-inline">
    <button class="layui-btn"  lay-filter="demo2" id="query" type="button">检索</button>
  </div>
</form>
<table class="layui-hide" id="test" lay-filter="test"></table>
<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">新增管理员</button>
    <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">批量删除</button>
  	<button class="layui-btn layui-btn-sm" lay-event="getResetPassword">批量重置密码</button>
    <!--<button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>-->
  </div>
</script>
 
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
  <a class="layui-btn layui-btn-xs" lay-event="resetPassword">重置密码</a>
</script>
              
          
<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/images/jquery.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 <script type="text/html" id="switchTpl">
  <!-- 这里设置table表格里面的状态度是否开通还是停用判断。 -->
  <input disabled="disabled" type="checkbox" name="state" value="{{d.id}}" lay-skin="switch" lay-text="启用|停用" lay-filter="stateDemo" {{ d.state == 1 ? 'checked' : '' }}>
</script>
<!-- 格式化地址信息。 -->
<script type="text/html" id="address">
    {{#
     	return d.province + d.city + d.area + d.address
    }}
</script>
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
    ,url:'${pageContext.request.contextPath}/user/list.action'
    ,toolbar: '#toolbarDemo'
    ,title: '用户数据表'
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field:'id', title:'ID', width:80, fixed: 'left', unresize: true, sort: true,style:'display:none'}
      ,{field:'xuhao',type:'numbers', title:'序号', width:80, fixed: 'left', sort:true,templet:'#xuhao'}
      ,{field:'username', title:'用户名', width:120, }
      ,{field:'email', title:'邮箱', width:200,  templet: function(res){
        return '<em>'+ res.email +'</em>'
      }}
      ,{field:'sex', title:'性别', width:80,  sort: true}
      ,{field:'phone', title:'联系电话', width:150,  }
      ,{field:'state', title:'状态', width:120, templet: '#switchTpl', unresize: false}
      ,{field:'newdate', title:'创建时间', width:200, templet:'#feedbackTime'  }
      ,{field:'address', title:'联系地址', width:200, templet:'#address'  }
      ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:200}
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
    //批量重置密码
    case 'getResetPassword':
    	var data = checkStatus.data;
        if(data.length==0){
        	 layer.msg('未选中数据,请选择数据！');
        	 return false;
        }
       
      var ids=new Array();
      for(var i=0;i<data.length;i++){
    	  ids.push(data[i].id);
      }
        layer.confirm('确定重置这'+data.length+'记录的密码？', function(index){
		  	  $.ajax({
					url:"${pageContext.request.contextPath}/user/resetPwdByIds.action",
					data:{"ids":ids},
					type:"post",
					dataType:"json",
					success:function(data){
						if(data>0){
							 layer.msg("重置密码成功，重置后密码为【123456】!");
							 
						}
					}
		  	});
		  	 layer.close(index);
        });
        
      break;
      
    //新增事件
      case 'getCheckData':
       	// var data = checkStatus.data;
        //layer.alert(JSON.stringify(data));
        layer.open({
    	  type: 2,
	      title: '新增管理员',
	      maxmin: true,
	      shadeClose: true, //点击遮罩关闭层
	      area : ['900px' , '720px'],
	      content: '${pageContext.request.contextPath}/user/returnAddUser.action'
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
					url:"${pageContext.request.contextPath}/user/deleteByIds.action",
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
  			url:"${pageContext.request.contextPath}/user/deleteByIds.action",
  			data:{"ids":ids},
  			type:"post",
  			dataType:"json",
  			success:function(data){
  				if(data>0){
  					 layer.msg("删除成功!");
  				}
  			}
    	});
    	  //location.reload(true);
        obj.del();
        layer.close(index);
      });
    } else if(obj.event === 'edit'){
    	layer.open({
      	  type: 2,
  	      title: '编辑管理员',
  	      maxmin: true,
  	      shadeClose: true, //点击遮罩关闭层
  	      area : ['900px' , '720px'],
  	      content: '${pageContext.request.contextPath}/user/editUserInfo.action?id='+data.id
  	    });
    }else if (obj.event ==='resetPassword'){
    	 var ids=new Array();
   	  	 ids.push(data.id);
	     layer.confirm('您确定重置密码？', function(index){
		   	  $.ajax({
		 			url:"${pageContext.request.contextPath}/user/resetPwdByIds.action",
		 			data:{"ids":ids},
		 			type:"post",
		 			dataType:"json",
		 			success:function(data){
		 				if(data>0){
		 					 layer.msg("重置密码成功，重置密码为【123456】!");
		 				}
		 			}
		   		});
	   	 	layer.close(index);
	     }); 
    }
  });
  //监听停用启用的开关
  form.on('switch(stateDemo)', function(obj){
 	console.log(this);
    layer.tips(this.value + ' ' + this.name + '：'+ obj.elem.checked, obj.othis);
  });
  
  $("#query").on("click",function(){
	  tableIns.reload({
		  where: { //设定异步数据接口的额外参数，任意设
		  	username: $("#username").val()//这里获取input的值
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

