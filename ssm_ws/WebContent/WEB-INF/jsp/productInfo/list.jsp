<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>微商运营管理系统-产品详细信息</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css"  media="all">
  <style type="text/css">
  .layui-form{
  	margin-left:20px;
  	margin-top:20px;
  }
  .heat_div ul{
  		margin:0px;
  		padding:0px;
  		display: inline-block;
  		height: 28px;
  		font-size:12p;
  		line-height: 28px;
  }
  </style>
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
<form class="layui-form layui-form-pane" action="">
	<div class="layui-inline"">
	    <label class="layui-form-label">产品名称</label>
	    <div class="layui-input-inline">
	      <input  type="text" id="infoname" name="infoname" lay-verify="required" placeholder="请输入产品类别名称" autocomplete="off" class="layui-input">
	    </div>
  </div>
  <div class="layui-inline"">
	    <label class="layui-form-label">产品类别</label>
	    <div class="layui-input-inline">
	      <select name="typeid" id="typeid" lay-filter="aihao">
       		<option value=""></option>
      	</select>
	    </div>
  </div>
   <div class="layui-inline">
    <button class="layui-btn"  lay-filter="demo2" id="query" type="button">检索</button>
  </div>
</form>
<table class="layui-hide" id="test" lay-filter="test"></table>
<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">新增产品信息</button>
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


<!-- 序号添加的js -->
<script type="text/html" id="xuhao">
    {{d.LAY_TABLE_INDEX+1}}
</script>
<script>

layui.use(['table','util','rate'], function(){
  var table = layui.table,
  util = layui.util,
  form = layui.form,
  rate=layui.rate;
  
  var tableIns=table.render({
    elem: '#test'
    ,url:'${pageContext.request.contextPath}/productInfo/list.action'
    ,toolbar: '#toolbarDemo'
    ,title: '产品类别信息表'
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field:'id', title:'ID', width:80, fixed: 'left', unresize: true, sort: true,style:'display:none'}
      ,{field:'xuhao',type:'numbers', title:'序号', width:80, fixed: 'left', sort:true,templet:'#xuhao'}
      ,{field:'infoname', title:'商品名称', width:220}
      ,{field:'infocost', title:'成本价格', width:100}
      ,{field:'infoprice', title:'销售价格', width:100}
      ,{field:'infobrand', title:'品牌名称', width:100}
      ,{field:'intendedfor', title:'适用人群', width:100}
      ,{field:'infoorigin', title:'产地', width:100}
      ,{field:'infoheat', title:'热度', width:200, unresize: false,templet:function(d){
    	  return '<div class="heat_div" id="infoheat'+d.id+'"></div>'
      }}
      ,{field:'infostock', title:'库存', width:100}
      ,{field:'infopostage', title:'邮费', width:100}
      ,{field:'remark', title:'所属类别', width:120}
      ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
    ]]
    ,page: true
    ,done: function (res, curr, count) {
        $("[data-field='id']").css('display','none');
        
  	  var data = res.data;
	  for (var item in data) {
	    rate.render({
            elem: '#infoheat'+data[item].id         //绑定元素
            , length: 3            //星星个数
            , value: data[item].infoheat             //初始化值
            , theme: '#f30808'     //颜色
            , half: false           //支持半颗星
            , setText: function(value){
            	var arrs={
            		 '0': '一般款'	
            		,'1': '流行款'
            		,'2': '潮流款'
            		,'3': '爆单款'
            	};
            	this.span.text(arrs[value] || ( value + "星"));
            }
	    	,text:true
            , readonly: true      //只读
        });
	  }
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
	      title: '微商运营管理系统-新增产品信息',
	      maxmin: true,
	      shadeClose: true, //点击遮罩关闭层
	      area : ['900px' , '700px'],
	      content: '${pageContext.request.contextPath}/productInfo/returnAddproductInfo.action'
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
					url:"${pageContext.request.contextPath}/productInfo/deleteByIds.action",
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
  			url:"${pageContext.request.contextPath}/productInfo/deleteByIds.action",
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
  	      title: '微商运营管理系统-编辑产品信息',
  	      maxmin: true,
  	      shadeClose: true, //点击遮罩关闭层
  	      area : ['900px' , '720px'],
  	      content: '${pageContext.request.contextPath}/productInfo/queryById.action?id='+data.id
  	    });
    }
  });

  
  
  getTypeNumber();
  function getTypeNumber(){
		$.ajax({
			url:"${pageContext.request.contextPath}/productType/getProductType.action",
			type:"post",
			success:function(data){
				console.log(data);
				$.each(data, function(i, d) {
					$("select[name='typeid']").append(
							"<option value='"+d.id+"' >" + d.name
									+ "</option>");
				});
				 form.render('select');
			}
		});
	}
  
  
  //条件查询
  $("#query").on("click",function(){
	  tableIns.reload({
		  where: { //设定异步数据接口的额外参数，任意设
			name: $("#infoname").val()//这里获取input的值
			,typeId:$("#typeid").val()
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

