package com.lixing.ws.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lixing.ws.pojo.TbOrder;
import com.lixing.ws.pojo.TbOrderDetail;
import com.lixing.ws.pojo.TbOrderExample;
import com.lixing.ws.service.OrderDetailService;
import com.lixing.ws.service.OrderService;
import com.lixing.ws.tool.PageData;
import com.lixing.ws.vo.OrderDetailVo;

@Controller
@RequestMapping("/orderDetail")
public class OrderDetailController {
	
	@Autowired
	private OrderDetailService detailService;
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("list")
	@ResponseBody
	public PageData queryList(Integer page,Integer limit,String orderCode){
		//先根据OrderCode查询出订单ID，在再根据订单ID查询出订单详细信息
		System.out.println(orderCode);
		
			TbOrderExample tx=new TbOrderExample();
			tx.createCriteria().andOrdernumberEqualTo(orderCode);
			TbOrder o=orderService.queryOrderByCode(orderCode);
			TbOrderDetail od=new TbOrderDetail();
			if(o!=null){
				od.setOrderid(o.getId());
			}
			return detailService.queryOrderDetailList(page, limit,od);
		
	
		
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public PageData update(@RequestBody TbOrderDetail od){
		System.out.println(od.getId());
		return detailService.updateOrderDetailById(od);
	}
	
	
	
	@RequestMapping("add")
	@ResponseBody
	public PageData addOrderDetail(@RequestBody OrderDetailVo vo){
		//先根据商品的ID查询信息
		
		return detailService.saveOrderDetail(vo);
	}
	
	

	
}
