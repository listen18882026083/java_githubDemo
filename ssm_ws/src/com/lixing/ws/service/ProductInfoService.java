package com.lixing.ws.service;



import com.lixing.ws.pojo.TbProductInfo;
import com.lixing.ws.tool.PageData;

public interface ProductInfoService {

	public PageData queryList(int page,int limit,TbProductInfo proInfo);
	public int saveProductInfo(TbProductInfo ti);
	public int delete(Integer[] ids);
	public TbProductInfo queryById(Integer id);
	
	public int updateProductInfo(TbProductInfo info);
}
