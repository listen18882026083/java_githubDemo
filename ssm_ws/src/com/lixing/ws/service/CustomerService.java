package com.lixing.ws.service;

import java.util.List;
import java.util.Map;

import com.lixing.ws.pojo.TbCustomer;
import com.lixing.ws.tool.PageData;


public interface CustomerService {
	
	public PageData queryTbCustomer(Integer page,Integer limit,TbCustomer customer);
	public int deleteById(Integer[] ids);
	public int saveTbCustomer(TbCustomer customer);
	public TbCustomer queryById(Integer id);
	public  List<Map<String,Object>> statisGrade();
	public int updateTbCustomer(TbCustomer customer);
	public List<TbCustomer> queryCustomerList(String name);

	
}
