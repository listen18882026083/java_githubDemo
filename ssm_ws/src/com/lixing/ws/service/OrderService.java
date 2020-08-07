package com.lixing.ws.service;

import java.util.List;
import java.util.Map;

import com.lixing.ws.pojo.TbOrder;
import com.lixing.ws.pojo.TbOrderDetail;
import com.lixing.ws.pojo.TbOrderExample;
import com.lixing.ws.tool.PageData;
import com.lixing.ws.vo.DataVo;


public interface OrderService {

	public List<TbOrder> queryOrderList(TbOrderExample tx) ;
	public int queryOrderCount(TbOrderExample tx);
	
	public List<TbOrder> queryOrderList(Map<String,Object> obj) ;
	public int queryOrderCount(Map<String,Object> obj);
	
	public TbOrder queryOrderById(Integer id);
	public TbOrder queryOrderByCode(String code);
	
	public int deleteByIds(Integer[] ids);
	
	public  int updateById(TbOrder od);
	
	public  List<Map<String,Object>>  monthStatis();
	public  List<Map<String,Object>>  quarterStatis();
	
	
	public DataVo queryMultipleStatis();
	
}
