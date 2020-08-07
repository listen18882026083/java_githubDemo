<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
  <style type="text/css">
  .username{
  	margin-top: 20px;
    margin-left: 20px;
    margin-bottom: 10px;
  }
  .query-btn{
  	margin-left:10px;
  }
  </style>
</head>
<body>
 <form class="layui-form layui-form-pane" action="">
	 <div class="layui-inline username" >
	    <label class="layui-form-label">客户姓名</label>
	    <div class="layui-input-inline">
	      <input type="text" id="cusmotername" name="cusmotername" lay-verify="required" placeholder="请输入客户姓名" autocomplete="off" class="layui-input">
	    </div>
	 </div>
	 <div class="layui-inline username" >
		  <label class="layui-form-label">快递单号</label>
		  <div class="layui-input-inline sex-select" style="width:200px;">
		        <input type="text" id="logisticsid" name="logisticsid" lay-verify="required" placeholder="请输入快递单号" autocomplete="off" class="layui-input">
		  </div>
	     
	</div>
	<div class="layui-inline username" >
		  <label class="layui-form-label">订单状态</label>
		  <div class="layui-input-inline sex-select">
		       <select name="orderstatus" id="orderstatus">
		       <option value=""></option>
		       	 <option value="未付款">未付款</option>
		       	 <option value="已付款">已付款</option>
		       	 <option value="已发货">已发货</option>
		       	 <option value="已签收">已签收</option>
		       	 <option value="退货申请">退货申请</option>
		       	 <option value="退货中">退货中</option>
		       	 <option value="已退货">已退货</option>
		       	 <option value="取消交易">取消交易</option>
		       	 <option value="交易成功">交易成功</option>
		       </select>
		  </div>
	      <input type="button" id="query" class="layui-btn layui-btn-warm query-btn"  value="检索" />  
	</div>
</form>
<table class="layui-hide" id="orderInfo" lay-filter="orderInfo"></table>
 
<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="addOrder">新增订单</button>
    <button class="layui-btn layui-btn-sm" lay-event="deleteOrder">批量删除</button>
    <!--<button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>-->
  </div>
</script>
 
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
   <a class="layui-btn layui-btn-xs" lay-event="look">查看物流</a>
</script>
            
 
 <script type="text/html" id="newDateTemplet">
	{{#	 return  layui.util.toDateString(d.newdate, 'yyyy-MM-dd')	}}
</script>  

 <script type="text/html" id="xuhao">
	{{d.LAY_TABLE_INDEX+1}}
</script>  


<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script src="${pageContext.request.contextPath}/images/jquery.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 
<script>
layui.use(['table','util','form'], function(){
  var table = layui.table,
  		util=layui.util,
  		form=layui.form;
  
 var tableIns= table.render({
    elem: '#orderInfo'
    ,url:'${pageContext.request.contextPath}/order/list.action'
    ,toolbar: '#toolbarDemo'
    ,title: '管理员信息列表'
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field:'xuhao', title:'序号', width:80, fixed: 'left', unresize: true, sort: true,templet:'#xuhao'}
      ,{field:'id', title:'ID', width:80, fixed: 'left', unresize: true, sort: true,style:'display:none'}
      ,{field:'ordernumber', title:'订单编号', width:300 }
      ,{field:'productcount', title:'产品数量', width:100 }
      ,{field:'orderamounttotal', title:'付款金额', width:100}
      ,{field:'orderlogisticsid', title:'快递单号', width:200,edit:"text"}
      ,{field:'phone', title:'电话号码',width:120}
      ,{field:'orderstatus', title:'订单状态',width:120}
      ,{field:'remark', title:'客户姓名', width:100} 
      ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:200}
    ]]
    ,page: true
    ,done:function(){
    	$("[data-field='id']").css("display","none");
    }
  });
  
  //头工具栏事件
  table.on('toolbar(orderInfo)', function(obj){
    var checkStatus = table.checkStatus(obj.config.id);
    switch(obj.event){
      case 'addOrder': //新增用户
        //var data = checkStatus.data;
       // layer.alert(JSON.stringify(data));
        layer.open({
        	  type: 2, 
        	  title: '新增订单',
        	  maxmin: true,
        	  area: ['900px', '800px'],
        	  content: '${pageContext.request.contextPath}/order/returnAddOrder.action' //这里content是一个普通的String
        	});
      break;
      case 'deleteOrder': //批量删除用户
        var data = checkStatus.data;
        if(data.length==0){
       	 layer.msg('未选中数据,请选择数据！');
       	 return false;
       }
        var ids=new Array(); 
        for(var i=0;i<data.length;i++){
        	ids.push(data[i].id);
        }
        //layer.msg('选中了：'+ data.length + ' 个');
  	  $.ajax({
          url: '${pageContext.request.contextPath}/order/delete.action?ids='+ids,
          type: 'POST',
          dataType: 'json',
          success: function (data) {
        	if(data!="0"){
        	    layer.msg("删除数据成功");
        	  	location.reload(true);
        	}else{
        		 layer.msg("删除数据失败，请联系管理员！");
        	}
        	 
          }
       });
      break;
      case 'isAll':
        layer.msg(checkStatus.isAll ? '全选': '未全选');
      break;
    };
  });
  
  //监听行工具事件
  table.on('tool(orderInfo)', function(obj){
    var data = obj.data;
    var ids=new Array(); 
    ids.push(data.id);
    if(obj.event === 'del'){
      layer.confirm('确定删除该数据？', function(index){
    	  $.ajax({
              url: '${pageContext.request.contextPath}/order/delete.action?ids='+ids,
              type: 'POST',
              dataType: 'json',
              success: function (data) {
            	if(data>0){
            	    layer.msg("删除数据成功");
            	    obj.del();
            	}else{
            		 layer.msg("删除数据失败，请联系管理员！");
            	}
            	 
              }
           });
        layer.close(index);
        
      });
    } else if(obj.event === 'edit'){
 
        layer.open({
      	  type: 2, 
      	  title: '编辑订单信息',
      	  maxmin: true,
      	  area: ['850px', '500px'],
      	  content: '${pageContext.request.contextPath}/order/queryOrderById.action?orderId='+data.id, //这里content是一个普通的String
      	});
      
    }else if(obj.event === 'look'){
 
        layer.open({
      	  type: 2, 
      	  title: '查询快递信息',
      	  maxmin: true,
      	  area: ['750px', '400px'],
      	  content: '${pageContext.request.contextPath}/order/returnQueryOrderlogisticsId.action?orderlogisticsId='+data.orderlogisticsid+"&phone="+data.phone, //这里content是一个普通的String
      	});

    }
    
    

  });
  
  
  //监听单元格编辑,监听修改商品的数量和尺码
  table.on('edit(orderInfo)', function(obj){
	  alert(1000);
    var value = obj.value //得到修改后的值
    ,datas = obj.data //得到所在行所有键值
    ,field = obj.field; //得到字段
     
	  var updateData={id:datas.id,orderlogisticsid:value};
	  
    updateData=JSON.stringify(updateData);
    console.log(updateData);
	    $.ajax({
  			url:"${pageContext.request.contextPath}/order/update.action",
  			data:updateData,
  			contentType : "application/json;charset=UTF-8",
  			type:"post",
  			dataType:"json",
  			success:function(res){
  				tableIns.reload({
				    page: {
				      curr: 1 //重新从第 1 页开始
				    }
				  });
  				
  				
  			}
    	});
  });
  
  $("#query").click(function(){
	  tableIns.reload({
		    where: { //设定异步数据接口的额外参数，任意设
		    cusmotername:$("#cusmotername").val(),
		    logisticsid:$("#logisticsid").val(),
		    orderstatus:$("#orderstatus").val()
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