package com.lixing.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lixing.ws.mapper.TbProductTypeMapper;
import com.lixing.ws.pojo.TbProductType;
import com.lixing.ws.pojo.TbProductTypeExample;
import com.lixing.ws.service.ProductTypeService;
import com.lixing.ws.tool.PageData;

@Service
public class ProductTypeServiceImpl implements ProductTypeService{

	@Autowired
	private TbProductTypeMapper proTypeMap;
	
	public PageData queryList(int page, int limit, TbProductType proType) {
		PageData pData=new PageData();
		
		TbProductTypeExample te=new TbProductTypeExample();
		page=(page-1)*10; //mysql分页第一页是0开始
		te.setPage(page);
		te.setLimit(limit);
		if(proType.getName()!=null && !proType.getName().equals("")){
		
			te.createCriteria().andNameLike("%"+proType.getName()+"%");
		}
		List<TbProductType> list=proTypeMap.queryList(te);
		pData.setData(list);
		pData.setCount(proTypeMap.countByExample(te)+"");
		return pData;
	}

	public int save(TbProductType tb) {
		
		return proTypeMap.insertSelective(tb);
	}

	public int delete(Integer[] ids) {
		int j=0;
		for(int i=0;i<ids.length;i++){
			proTypeMap.deleteByPrimaryKey(ids[i]);
			j++;
		}
		return j;
		
	}

	public TbProductType queryById(Integer id) {
		
		return proTypeMap.selectByPrimaryKey(id);
	}

	public int updateById(TbProductType tb) {
		// TODO Auto-generated method stub
		return proTypeMap.updateByPrimaryKeySelective(tb);
	}

	public List<TbProductType> queryProductType() {
		return proTypeMap.selectByExample(null);
	}

}
