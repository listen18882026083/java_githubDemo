<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
<style type="text/css">
.layui-form-item{
margin-left:50px;
}
</style>
<title>添加管理员信息</title>
</head>
<body>
<form class="layui-form layui-form-pane" action="">
   
  
     <div class="layui-form-item">
	<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
  <legend>上传多张图片</legend>
</fieldset>
 
<div class="layui-upload">
  <button type="button" class="layui-btn layui-btn-normal" id="testList">选择多文件</button> 
  <div class="layui-upload-list">
    <table class="layui-table">
      <thead>
        <tr><th>文件名</th>
        <th>大小</th>
        <th>状态</th>
        <th>操作</th>
      </tr></thead>
      <tbody id="demoList"></tbody>
    </table>
  </div>
  <button type="button" class="layui-btn" id="testListAction">开始上传</button>
</div> 
  	<div class="layui-form-item" style="text-align:center;">
      <input class="layui-btn layui-btn-warm" lay-filter="*" type="button" value="提交" lay-submit />
      <input class="layui-btn layui-btn-warm" type="reset" value="重置"/>
     </div>
      
</form>
<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script src="${pageContext.request.contextPath}/images/jquery.js"></script>
<script type="text/javascript">
layui.use(['form','upload'], function(){
	  var $ = layui.jquery
	, form=layui.form,
	upload = layui.upload;

	//多文件列表示例
	  var demoListView = $('#demoList')
	  ,uploadListIns = upload.render({
	    elem: '#testList'
	    ,url: '${pageContext.request.contextPath}/user/uploadPic.action'
	    
	    ,multiple: true
	    ,auto: false
	    ,bindAction: '#testListAction'
	    ,choose: function(obj){   
	      var files = this.files = obj.pushFile(); //将每次选择的文件追加到文件队列
	      //读取本地文件
	      obj.preview(function(index, file, result){
	        var tr = $(['<tr id="upload-'+ index +'">'
	          ,'<td>'+ file.name +'</td>'
	          ,'<td>'+ (file.size/1014).toFixed(1) +'kb</td>'
	          ,'<td>等待上传</td>'
	          ,'<td>'
	            ,'<input class="layui-btn layui-btn-xs demo-reload layui-hide" type="button" value="重传"></input>'
	            ,'<input class="layui-btn layui-btn-xs layui-btn-danger demo-delete" type="button" value="删除"></input>'
	          ,'</td>'
	        ,'</tr>'].join(''));
	        
	        //单个重传
	        tr.find('.demo-reload').on('click', function(){
	          obj.upload(index, file);
	        });
	        
	        //删除
	        tr.find('.demo-delete').on('click', function(){
	          delete files[index]; //删除对应的文件
	          tr.remove();
	          uploadListIns.config.elem.next()[0].value = ''; //清空 input file 值，以免删除后出现同名文件不可选
	        });
	        
	        demoListView.append(tr);
	      });
	    }
	    ,done: function(res, index, upload){
	      if(res.code == 1){ //上传成功
	        var tr = demoListView.find('tr#upload-'+ index)
	        ,tds = tr.children();
	        tds.eq(2).html('<span style="color: #5FB878;">上传成功</span>');
	        tds.eq(3).html('<input class="layui-btn layui-btn-xs layui-btn-danger demo-delete" type="button" value="删除"></input>'); //清空操作
	        return delete this.files[index]; //删除文件队列已经上传成功的文件
	      }
	      this.error(index, upload);
	    }
	    ,error: function(index, upload){
	      var tr = demoListView.find('tr#upload-'+ index)
	      ,tds = tr.children();
	      tds.eq(2).html('<span style="color: #FF5722;">上传失败</span>');
	      tds.eq(3).find('.demo-reload').removeClass('layui-hide'); //显示重传
	    }
	  });s
	  
	  
});



</script>
</body>
</html>