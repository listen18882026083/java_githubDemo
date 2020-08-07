package com.lixing.ws.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.lixing.ws.pojo.TbOrder;
import com.lixing.ws.service.OrderService;
import com.lixing.ws.tool.OrderCoderUtil;
import com.lixing.ws.tool.PageData;
import com.lixing.ws.tool.QueryLogistics;

import sun.java2d.pipe.Region;


@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	
	
	@RequestMapping("/list")
	@ResponseBody
	public PageData queryUserInfoList(Integer page,Integer limit,String cusmotername,
			String logisticsid,String orderstatus){
		
		PageData pageData=new PageData();
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("page", (page-1)*limit);
		map.put("limit", limit);
		map.put("cusmotername", cusmotername);
		map.put("logisticsid", logisticsid);
		map.put("orderstatus", orderstatus);
		
		int count=orderService.queryOrderCount(map);
		
	
		pageData.setCount(count+"");
		pageData.setData(orderService.queryOrderList(map));
		return pageData;
		
	}
	
	//跳转编辑页面
	@RequestMapping("/queryOrderById")
	public ModelAndView queryOrderById(Integer orderId){
		ModelAndView mv=new ModelAndView();
		TbOrder order=orderService.queryOrderById(orderId);
		mv.setViewName("order/edit");
		mv.addObject("order", order);
		return mv;
	}
	
	@RequestMapping("update")
	@ResponseBody
	public int update(@RequestBody TbOrder o){
		return orderService.updateById(o);
	}

	@RequestMapping("/getOrderNumber")
	@ResponseBody
	public String getOrderNumber(){
		return OrderCoderUtil.getOrderCode(null);
	}
	
	@RequestMapping("/returnOrderIndex")
	public String returnOrderIndex(){
		return "order/list";
	}
	
	@RequestMapping("/returnAddOrder")
	public String returnAddOrder(){
		return "order/add";
	}
	
	@RequestMapping("delete")
	@ResponseBody
	public int delete(Integer[] ids){
		
		return orderService.deleteByIds(ids);
	}
	
	@RequestMapping("returnQueryOrderlogisticsId")
	public ModelAndView returnQueryOrderlogisticsId(String orderlogisticsId,String phone){
		ModelAndView m=new ModelAndView();
		m.setViewName("order/queryLogistics");
		TbOrder o=new TbOrder();
		o.setOrderlogisticsid(orderlogisticsId);
		o.setPhone(phone);
		m.addObject("o", o);
		return  m;
	}
	@RequestMapping("queryOrderlogisticsId")
	@ResponseBody
	public String queryOrderlogisticsId(String logisticsName,String orderlogisticsId,String phone){
		System.out.println(phone+"=============");
		return  QueryLogistics.getLogisticsContent(logisticsName, orderlogisticsId,phone);
	}
}
