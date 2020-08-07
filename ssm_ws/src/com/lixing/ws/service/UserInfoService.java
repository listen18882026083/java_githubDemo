package com.lixing.ws.service;



import com.lixing.ws.pojo.TbUserinfo;
import com.lixing.ws.tool.PageData;

public interface UserInfoService {

	public TbUserinfo queryLogin(String name,String pwd); 
	public PageData queryList(int page,int limit,TbUserinfo userInfo);
	public int queryCount();
	public String queryCheckUserName(String  username);
	public int insertTbUserinfo(TbUserinfo userInfo);
	public TbUserinfo queryById(Integer id);
	public int update(TbUserinfo userInfo);
	public int deleteById(Integer[] ids);
	public int updateResetPwd(Integer[] ids); 
	
}
