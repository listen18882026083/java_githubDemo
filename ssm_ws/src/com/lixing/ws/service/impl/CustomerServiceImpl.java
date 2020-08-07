package com.lixing.ws.service.impl;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lixing.ws.mapper.TbCustomerMapper;
import com.lixing.ws.pojo.TbCustomer;
import com.lixing.ws.pojo.TbCustomerExample;
import com.lixing.ws.pojo.TbCustomerExample.Criteria;
import com.lixing.ws.service.CustomerService;
import com.lixing.ws.tool.FileTool;
import com.lixing.ws.tool.PageData;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private TbCustomerMapper customerMapper;

	/**
	 * 根据分页条件来查询数据，返回一个PageData对象
	 * 
	 * 
	 * */
	public PageData queryTbCustomer(Integer page, Integer limit, TbCustomer customer) {
		PageData pageData=new PageData(); //创建封装数据对象
		page=(page-1)*10; //mysql分页第一页是0开始
		TbCustomerExample t=new TbCustomerExample();
		Criteria c1=t.createCriteria();
		
		if(customer.getName()!=null && !customer.getName().equals("")){
			c1.andNameLike("%"+customer.getName()+"%");
		}
		if(customer.getWechat()!=null && !customer.getWechat().equals("")){
			c1.andWechatLike("%"+customer.getWechat()+"%");
		}
		if(customer.getWechatNetname()!=null && !customer.getWechatNetname().equals("")){
			c1.andWechatNetnameLike("%"+customer.getWechatNetname()+"%");	
		}
		
		
		
		t.setPage(page);
		t.setLimit(limit);
		List<TbCustomer> customerList=(List<TbCustomer>)customerMapper.queryList(t);
		pageData.setData(customerList);
		pageData.setCount(customerMapper.countByExample(t)+"");
		return pageData;
	}

	
	/*
	 * 删除方法，单个删除，和多个删除
	 * 业务逻辑：删除数据的同时需要删除图片
	 * **/
	public int deleteById(Integer[] ids) {
		int j=0;
		TbCustomer customer;
		for(int i=0;i<ids.length;i++){
			//删除数据的时，判断是否存在图片，存在就删除图片
			customer=customerMapper.selectByPrimaryKey(ids[i]);
			 if(customer.getPic()!=null  && !customer.getPic().equals("")){
				 FileTool.deleteFile(customer.getPic());
			 }
			customerMapper.deleteByPrimaryKey(ids[i]);
			j++;
		}
		return j;
	}


	public int saveTbCustomer(TbCustomer customer) {
		
		return customerMapper.insertSelective(customer);
	}


	public TbCustomer queryById(Integer id) {
		
		return customerMapper.selectByPrimaryKey(id);
	}


	public List<Map<String,Object>> statisGrade() {
		// TODO Auto-generated method stub
		return customerMapper.statisGrade();
	}


	public int updateTbCustomer(TbCustomer customer) {
		int i=customerMapper.updateByPrimaryKeySelective(customer);
		TbCustomer c=customerMapper.selectByPrimaryKey(customer.getId());
		if(i>0 && c.getPic()!=null && !c.getPic().equals("") && !(c.getPic().equals(customer.getPic()))){
			 FileTool.deleteFile(c.getPic());
		}
		return i;
	}


	public List<TbCustomer> queryCustomerList(String name) {
		// TODO Auto-generated method stub
		TbCustomerExample tx=new TbCustomerExample();
		if(name!=null && !name.equals("")){
			tx.createCriteria().andNameLike("%"+name+"%");
		}
		
		return customerMapper.selectByExample(tx);
	}
	
	
}
