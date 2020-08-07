<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>微商管理系统-添加订单信息页面</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css"  media="all">
  <style type="text/css">

.number{
	width:330px;
}
.address{
width:800px;
}
ul,li{
	margin: 0;
	padding:0;
}
.customername-div{
	position: relative;
}
.customername-div .namelist-ul{
	position: absolute;
	top:40px;
	left:0;
	z-index: 100;
	border: 1px solid #dee9ec; 
	background-color: #fff;
	display: none;
}
.namelist-ul li{
	width:300px;
	height:30px;
	line-height: 30px;
	cursor: pointer;
}
.namelist-ul li:hover{
	background-color: #dee9ec;
}
.layui-field-title{
	font-weight: bold;
}
.heat_div ul{
  		margin:0px;
  		padding:0px;
  		display: inline-block;
  		height: 28px;
  		font-size:12p;
  		line-height: 28px;
  }
.layui-textarea{
	width: 590px;
}
.zhuyi{
	color:red;
	font-weight: bold;
	margin-left: 15px;
	font-size: 16px;
}
  </style>
</head>
<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>订单信息</legend>
</fieldset>
<div class="zhuyi">注意：如果在添加产品之后，修改订单信息中的选项（一个或者多个），必须要点击[确认修改]案例，来保存您修改的信息</div>
<form  class="layui-form layui-form-pane"  method="post" enctype="multipart/form-data">
  <div class="layui-form-item" style="margin-top:15px;margin-left:15px;">
    <label class="layui-form-label">订单编号 </label>
    <div class="layui-input-inline">
      <input type="text" width="800px" name="ordernumber" id="ordernumber" lay-verify="required"  autocomplete="off" class="layui-input number" disabled="disabled"/>
    </div>
  </div> 
  <div class="layui-form-item" style="margin-top:15px;margin-left:15px;">
    <label class="layui-form-label">客户姓名 </label>
    <div class="layui-input-inline customername-div">
        <input type="text"  name="customername" id="customername" lay-verify="required"  autocomplete="off" class="layui-input " />
    	<ul class="namelist-ul">
    		
    	</ul>
    </div>
     <label class="layui-form-label">收货人姓名 </label>
     <input type="hidden" id="customerid">
    <div class="layui-input-inline">
        <input type="text"  name="orderconsignee" id="orderconsignee" lay-verify="required"  autocomplete="off" class="layui-input " />
    </div>
      <label class="layui-form-label">联系电话 </label>
    <div class="layui-input-inline">
        <input type="text"  name="phone" id="consigneePhone" lay-verify="required"  autocomplete="off" class="layui-input " />
    </div>
  </div>

	 <div class="layui-form-item" style="margin-top:15px;margin-left:15px;">
	    <label class="layui-form-label">收货人地址 </label>
	    <div class="layui-input-inline">
	        <input type="text"  name="address" id="address" lay-verify="required"  autocomplete="off" class="layui-input address" />
	    </div>
	    
	  </div>
	  <div class="layui-form-item" style="margin-top:15px;margin-left:15px;">
	     <label class="layui-form-label" >小计 </label>
	    <div class="layui-input-inline">
	        <input style="color:red" type="text"  name="productamounttotal" id="productMoney"   disabled="disabled"   autocomplete="off" class="layui-input " />
	    </div>
	    <label class="layui-form-label" >实际付款 </label>
	    <div class="layui-input-inline">
	        <input style="color:red" type="text"  name="orderamounttotal" id="orderMoney"   autocomplete="off" class="layui-input " />
	    </div>
	  </div>
	 <div class="layui-form-item" style="margin-top:15px;margin-left:15px;">
	     <label class="layui-form-label" >快递单号</label>
	    <div class="layui-input-inline">
	        <input  type="text"  name="orderlogisticsid" id="orderlogisticsId"   autocomplete="off" class="layui-input " />
	    </div>
	    <label class="layui-form-label" >发货时间 </label>
	    <div class="layui-input-inline">
	       
	     <input type="text" class="layui-input" name="deliverytime" id="deliveryTime" readonly="" placeholder="yyyy-MM-dd">
	    </div>
	  </div>
	<div class="layui-form-item" style="margin-top:15px;margin-left:15px;">
	     <label class="layui-form-label" >付款方式</label>
	    <div class="layui-input-inline">
	        
	   	<select name="paymentmethod" id="paymentMethod">
	   		<option value="微信">微信</option>
	   		<option value="支付宝">支付宝</option>
	   		<option value="现金">现金</option>
	   		<option value="其他">其他</option>
	   	</select>
	    </div>
	    <label class="layui-form-label" >付款时间 </label>
	    <div class="layui-input-inline">
	      <input type="text" class="layui-input" name="paymenttime" id="paymentTime" readonly="" placeholder="yyyy-MM-dd">
	    </div>
	  </div>
	<div class="layui-form-item" style="margin-top:15px;margin-left:15px;">
	     <label class="layui-form-label" >订单备注</label>
	    <div class="layui-input-inline">
	     <textarea name="orderremark" id="orderRemark" rows="5" cols="10" placeholder="订单备注信息" class="layui-textarea"></textarea>
	    </div>
	  </div>
 		<!-- 添加成功后，把订单的ID保存在此 -->
 		<input type="hidden" id="id" name="id">
 
 <div class="layui-form-item" style="text-align:center;">
 	<input class="layui-btn"  type="button" value="确认修改" lay-submit lay-filter="*"   style="width:100px" />
  </div>
</form>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>订单详细产品信息</legend>
</fieldset>
<table class="layui-hide" id="orderDetail" lay-filter="orderDetail"></table> 
<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <!-- <button class="layui-btn layui-btn-sm" lay-event="addOrderDetail">新增订单产品</button>-->
    <button class="layui-btn layui-btn-sm" lay-event="deleteOrderDetail">批量删除</button>
    <!--<button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>-->
  </div>
</script>
 
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
 <a class="layui-btn layui-btn-xs" lay-event="exit">退货</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="update">换货</a>

</script>
         
 <script type="text/html" id="xuhao">
	{{d.LAY_TABLE_INDEX+1}}
</script>  


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>产品信息</legend>
</fieldset>
<table class="layui-hide" id="productInfo" lay-filter="productInfo"></table> 

<script type="text/html" id="productBarDemo">
  <a class="layui-btn layui-btn-xs" lay-event="add">加入订单</a>
</script>
         
 <script type="text/html" id="productXuhao">
	{{d.LAY_TABLE_INDEX+1}}
</script>  

   
<script src="${pageContext.request.contextPath}/layui/layui.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/images/jquery.js" charset="utf-8"></script>
<script type="text/javascript">
$.ajax({
	url:"${pageContext.request.contextPath}/order/getOrderNumber.action",
	type:"post",
	success:function(data){
		 $("#ordernumber").val(data);
	}
});
</script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 <script type="text/javascript">

	layui.use(['table','util','form','rate','laydate'], function(){
	  var form = layui.form,
	  util=layui.util,
	  table = layui.table,
	  rate=layui.rate
	   laydate = layui.laydate;
	  //只有执行了这一步，部分表单元素才会自动修饰成功
	  form.render();
	  
	  //日期只读
	  laydate.render({
	    elem: '#deliveryTime'
	    ,trigger: 'click'
	  });
	
	  laydate.render({
		    elem: '#paymentTime'
		    ,trigger: 'click'
		  });
		
		//显示该订单的详细商品信息
		
		 var tableIns= table.render({
			    elem: '#orderDetail'
			    ,url:'${pageContext.request.contextPath}/orderDetail/list.action?orderCode='+$("#ordernumber").val()
			    ,toolbar: '#toolbarDemo'
			    ,title: '订单详细列表'
			    ,cols: [[
			      {type: 'checkbox', fixed: 'left'}
			      ,{field:'xuhao', title:'序号', width:80, fixed: 'left', unresize: true, sort: true,templet:'#xuhao'}
			      ,{field:'id', title:'ID', width:80, fixed: 'left', unresize: true, sort: true,style:'display:none'}
			      ,{field:'producname', title:'产品名称', width:240}
			      ,{field:'productprice', title:'商品价格', width:100}
			      ,{field:'discountrate', title:'折扣', width:100}
			      ,{field:'orderdetailnumber', title:'数量', width:80,edit: 'text'}
			      ,{field:'subtotal', title:'小计金额',width:120,}
			      ,{field:'productmarque', title:'商品型号',width:120,edit: 'text'}
			      ,{field:'detailstatus', title:'商品状态', width:100}
			      ,{field:'number:', title:'订单编号', width:300,templet:function(){
			    	  var numbers=$("#ordernumber").val();
			    	  return numbers;
			      }}
			      ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:230}
			    ]]
			    ,page: true
			    ,done:function(){
			    	$("[data-field='id']").css("display","none");
			    }
			  });
			  
			  //头工具栏事件
			  table.on('toolbar(orderDetail)', function(obj){
			    var checkStatus = table.checkStatus(obj.config.id);
			    switch(obj.event){
			      case 'addOrderDetail': //新增用户
			        //var data = checkStatus.data;
			       // layer.alert(JSON.stringify(data));
			        layer.open({
			        	  type: 2, 
			        	  title: '新增订单详细产品',
			        	  maxmin: true,
			        	  area: ['900px', '800px'],
			        	  content: '${pageContext.request.contextPath}/order/returnAddOrder.action' //这里content是一个普通的String
			        	});
			      break;
			      case 'deleteOrderDetail': //批量删除用户
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
			          url: '${pageContext.request.contextPath}/user/delete.action?ids='+ids,
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
			  table.on('tool(userInfo)', function(obj){
			    var data = obj.data;
			    //console.log(obj)
			    if(obj.event === 'del'){
			      layer.confirm('真的删除行么', function(index){
			    	  $.ajax({
			              url: '${pageContext.request.contextPath}/user/delete.action?ids='+data.id,
			              type: 'POST',
			              dataType: 'json',
			              success: function (data) {
			            	if(data!="0"){
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
			      	  title: '编辑管理员',
			      	  maxmin: true,
			      	  area: ['850px', '500px'],
			      	  content: '${pageContext.request.contextPath}/user/queryUserInfoById.action?userId='+data.id, //这里content是一个普通的String
			      	});
			     
			    }
			  });
			  
			  
			  
			  //加载商品信息
			  table.render({
			    elem: '#productInfo'
			    ,url:'${pageContext.request.contextPath}/productInfo/list.action'
			    ,toolbar: false
			    ,title: '产品信息表'
			    ,cols: [[
			      {field:'id', title:'ID', width:80, fixed: 'left', unresize: true, sort: true,style:'display:none'}
			      ,{field:'xuhao',type:'numbers', title:'序号', width:80, fixed: 'left', sort:true,templet:'#productXuhao'}
			      ,{field:'infoname', title:'商品名称', width:220}
			      ,{field:'infocost', title:'成本价格', width:100}
			      ,{field:'infodiscount', title:'折扣', width:100}
			      ,{field:'infoprice', title:'销售价格', width:100}
			      ,{field:'infobrand', title:'品牌名称', width:100}
			      ,{field:'intendedfor', title:'适用人群', width:100}
			      ,{field:'infoheat', title:'热度', width:200, unresize: false,templet:function(d){
			    	  return '<div class="heat_div" id="infoheat'+d.id+'"></div>'
			      }}
			      ,{field:'infostock', title:'库存', width:100}
			      ,{field:'infopostage', title:'邮费', width:100}
			      ,{field:'remark', title:'所属类别', width:120}
			      ,{fixed: 'right', title:'操作', toolbar: '#productBarDemo', width:150}
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
  

			  
			 //监听确认修改按钮事件
		form.on('submit(*)', function(datas){
			 var orderData=datas.field;
			 console.log(orderData);
		
			 //当前容器的全部表单字段，名值对形式：{name: value}
			if(!orderData.id){
				alert("当前订单ID不存在，请先添加商品再修改其他信息");
				return false;
			}
			 orderData=JSON.stringify(orderData); //把对象转换成json格式
			  $.ajax({
					url:"${pageContext.request.contextPath}/order/update.action",
					type:"post",
					contentType : "application/json;charset=UTF-8",//发送数据的格式
					data:orderData,
					dataType:"json",
					success:function(data){
						if(data>0){
							alert("修改订单消息成功！");
						}else{
							alert("修改订单消息失败！");
						}
					}
				});
			  return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
			});
			  
  
  			//加入订单中
		  table.on('tool(productInfo)', function(obj){
		    var data = obj.data;
		    if(obj.event === 'add'){
		    	console.log(data)
		    	//后台接收的书数组，所以需要转换
				 var code=$("#ordernumber").val();
		    	 var name=$("#orderconsignee").val();
		    	 var address=$("#address").val();
		    	 var consigneePhone=$("#consigneePhone").val();
		    	 var customerid=$("#customerid").val();
		    	 var orderlogisticsId=$("#orderlogisticsId").val(); //单号
		    	 var deliveryTime=$("#deliveryTime").val();//发货时间
		    	 var paymentMethod=$("#paymentMethod").val();//付款方式
		    	 var paymentTime=$("#paymentTime").val();//付款时间
		    	 var orderRemark=$("#orderRemark").val();//订单备注
		    	 if(name==""){
		    		 alert("收货人不能为空...");
		    		 return false;
		    	 }
		    	 if(address==""){
		    		 alert("收货人地址不能为空");
		    		 return false;
		    	 }
		    	 if(address==""){
		    		 alert("联系电话不能为空");
		    		 return false;
		    	 }
		    	 var orderData={"productId":data.id,"orderCode":code,"orderName":name,"orderAddress":address
		    			 		,"orderPhone":consigneePhone
		    			 		,"producname":data.infoname
		    					,"productprice":data.infoprice
		    					,"infodiscount":data.infodiscount
		    					,"customerid":customerid
		    					,"orderlogisticsId":orderlogisticsId
		    					,"deliveryTime":deliveryTime
		    					,"paymentMethod":paymentMethod
		    					,"paymentTime":paymentTime
		    					,"orderRemark":orderRemark
		    	 				};
		    	 			
				    	 orderData=JSON.stringify(orderData);
				    	  $.ajax({
				  			url:"${pageContext.request.contextPath}/orderDetail/add.action",
				  			data:orderData,
				  			contentType : "application/json;charset=UTF-8",
				  			type:"post",
				  			dataType:"json",
				  			success:function(res){
				  				if(res.count=="2"){
				  					//添加就会刷新我们的详细订单表格
				  					 tableIns.reload({
				  					    page: {
				  					      curr: 1 //重新从第 1 页开始
				  					    }
				  					  });
				  					//刷新后，我们必须要修改我们订单的金额显示方式
				  					$("#productMoney").val(res.data.productamounttotal);
				  					$("#orderMoney").val(res.data.orderamounttotal);
				  					$("#id").val(res.data.id);
				  				}
				  				
				  			}
				    	});
		    	
		     
		    } 
					  
		  }); 
  			
  			
  			
		  //监听单元格编辑,监听修改商品的数量和尺码
		  table.on('edit(orderDetail)', function(obj){
		    var value = obj.value //得到修改后的值
		    ,datas = obj.data //得到所在行所有键值
		    ,field = obj.field; //得到字段
		     
			    var updateData={
			    		id:datas.id,
			    		productmarque:obj.value,
			    		productprice:datas.productprice,
			    		subtotal:datas.subtotal,
			    		orderid:$("#id").val()
			    		
			    }
			   if(field=="orderdetailnumber"){
				   updateData={
				    	id:datas.id,
				    	orderdetailnumber:obj.value,
				    	productprice:datas.productprice,
				    	subtotal:datas.subtotal,
				    	orderid:$("#id").val()
				    }
			   }
		    
		    updateData=JSON.stringify(updateData);
		    console.log(updateData);
			    $.ajax({
		  			url:"${pageContext.request.contextPath}/orderDetail/update.action",
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
		  				if(res.code=="2"){
		  					 
		  					$("#productMoney").val(res.data.productamounttotal);
		  					$("#orderMoney").val(res.data.orderamounttotal);
		  				}
		  				
		  			}
		    	});
		  });
			  
	});  
	
	//当我们客户名输入框值修改的时候，就去数据库模糊查询
	$("#customername").keyup(function(){
	    var name = $("#customername").val();
	    if(name){
	    	 $.ajax({
	 	        url: '${pageContext.request.contextPath}/customer/getCustomerNameList.action?customerName='+name,
	 	        type: 'POST',
	 	        success: function (data) {
	 	        	
	 	        	$(".namelist-ul").css("display","block");
	 	        	$(".namelist-ul").empty();
	 	        	if(data.length>0){
	 	        		for(var i=0;i<data.length;i++){
	 	        			var address=data[i].province+data[i].city+data[i].area+data[i].address;
	 	        			$(".namelist-ul").append("<li customerid='"+data[i].id+"' consigneePhone='"+data[i].phone+"' address='"+address+"' onclick='addCustomerName(this);'>"+data[i].name+"</li>");
	 	 	        	}
	 	        	}
	 	        	
	 	      		console.log(data);
	 	        }
	 	     });	
	    }
		   
	});


	function addCustomerName(obj){
		var name=$(obj).text();
		var address=$(obj).attr("address");
		var consigneePhone=$(obj).attr("consigneePhone");
		var customerid=$(obj).attr("customerid");
		$("#customername").val(name);
		$(".namelist-ul").css("display","none");
		$("#orderconsignee").val(name);
		$("#address").val(address);
		$("#consigneePhone").val(consigneePhone);
		$("#customerid").val(customerid);
		
	}	
	
	


</script>
</body>
</html>

