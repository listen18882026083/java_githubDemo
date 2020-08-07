package com.lixing.ws.service;

import java.util.List;

import com.lixing.ws.pojo.TbProductType;
import com.lixing.ws.tool.PageData;

public interface ProductTypeService {

	public PageData queryList(int page,int limit,TbProductType proType);
	public int save(TbProductType tb);
	public int delete(Integer[] ids);
	public TbProductType queryById(Integer id);
	public int updateById(TbProductType tb);
	public List<TbProductType> queryProductType();
}
