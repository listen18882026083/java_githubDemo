package com.lixing.ws.service.impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lixing.ws.mapper.TbUserinfoMapper;
import com.lixing.ws.pojo.TbUserinfo;
import com.lixing.ws.pojo.TbUserinfoExample;
import com.lixing.ws.service.UserInfoService;
import com.lixing.ws.tool.FileTool;
import com.lixing.ws.tool.PageData;


@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private TbUserinfoMapper user;

	
	/**
	 * 用户登陆方法，
	 * 用户名和密码、状态（1代表开通，0代表未开通）
	 * */
	public TbUserinfo queryLogin(String name, String pwd) {
		TbUserinfoExample example=new TbUserinfoExample();
		example.createCriteria().andUsernameEqualTo(name)
		.andPasswordEqualTo(pwd).andStateEqualTo(1);
		List<TbUserinfo> userlist=user.selectByExample(example);
		if(userlist.size()>0){
			return userlist.get(0);
		}
		return null;
	}
	

	/**
	 * 分页查询：
	 * page 是第几页开始
	 * limit 每页显示几条
	 * */
	public PageData queryList(int page,int limit,TbUserinfo userInfo) {
		PageData pageData=new PageData(); //创建封装数据对象
		
		page=(page-1)*10; //mysql分页第一页是0开始

		TbUserinfoExample t=new TbUserinfoExample();
		t.setPage(page);
		t.setLimit(limit);
		if(userInfo.getUsername()!=null && !userInfo.getUsername().equals("")){
			t.createCriteria().andUsernameLike("%"+userInfo.getUsername()+"%");
		}
		List<TbUserinfo> list=user.queryList(t);
		pageData.setCount(user.countByExample(t)+"");
		pageData.setData(list);
		return pageData;
	}
	public int queryCount() {
	
		return 0;
	}


	public String queryCheckUserName(String username) {
		TbUserinfo userInfo=user.queryByUserName(username);
		if(userInfo!=null){
			return "1"; //已经被占用
		}
		return "2";  //未被占用
	}


	public int insertTbUserinfo(TbUserinfo userInfo) {
		
		return user.insertSelective(userInfo);
	}


	public TbUserinfo queryById(Integer id) {
		// TODO Auto-generated method stub
		return user.selectByPrimaryKey(id);
	}


	public int update(TbUserinfo userInfo) {
		TbUserinfo u=user.selectByPrimaryKey(userInfo.getId());
		int i=user.updateByPrimaryKeySelective(userInfo);
		if(i>0 && u.getPic()!=null && !u.getPic().equals("") && !(u.getPic().equals(userInfo.getPic()))){
			FileTool.deleteFile(u.getPic());
		}
		return i;	 
	}


	/*
	 * 删除方法，单个删除，和多个删除
	 * 业务逻辑：删除数据的同时需要删除图片
	 * **/
	
	public int deleteById(Integer[] ids) {
		int j=0;
		TbUserinfo userInfo;
		for(int i=0;i<ids.length;i++){
			//删除数据的时，判断是否存在图片，存在就删除图片
			 userInfo=user.selectByPrimaryKey(ids[i]);
			 if(userInfo.getPic()!=null  && !userInfo.getPic().equals("")){
				 FileTool.deleteFile(userInfo.getPic());
			 }
			user.deleteByPrimaryKey(ids[i]);
			j++;
		}
		return j;
	}


	public int updateResetPwd(Integer[] ids) {
		int j=0;
		TbUserinfo userInfo=new TbUserinfo();
		userInfo.setPassword("123456");
		for(int i=0;i<ids.length;i++){
			userInfo.setId(ids[i]);
			user.updateByPrimaryKeySelective(userInfo);
			j++;
		}
		return j;
	}
	
	

	


}
