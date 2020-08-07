package com.lixing.ws.service;

import com.lixing.ws.pojo.TbOrderDetail;
import com.lixing.ws.pojo.TbOrderDetailExample;
import com.lixing.ws.tool.PageData;
import com.lixing.ws.vo.OrderDetailVo;

public interface OrderDetailService {

	public PageData queryOrderDetailList(Integer page,Integer limit,TbOrderDetail d);
	public int queryOrderDetailCount(TbOrderDetailExample te);
	
	public  PageData saveOrderDetail(OrderDetailVo vo);
	
	public PageData updateOrderDetailById(TbOrderDetail od);
	
	
}
