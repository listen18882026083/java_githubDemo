package com.lixing.ws.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lixing.ws.service.OrderService;
import com.lixing.ws.vo.DataVo;

//统计类
@Controller
@RequestMapping("/statistics")
public class StatisticsController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("returnMultiple")
	public String returnMultiple(){
		return "statistics/multiple";
	}
	
	@RequestMapping("retunQuarter")
	public String retunQuarter(){
		return "statistics/quarter";
	}
	@RequestMapping("returnMonth")
	public String returnMonth(){
		return "statistics/month";
	}
	
	@RequestMapping("monthStatis")
	@ResponseBody
	public List<Map<String,Object>>  monthStatis(){
		
		return orderService.monthStatis();
	}
	
	@RequestMapping("quarterStatis")
	@ResponseBody
	public List<Map<String,Object>>  quarterStatis(){
		
		return orderService.quarterStatis();
	}
	
	@RequestMapping("multipleStatis")
	@ResponseBody
	public DataVo multipleStatis(){
		return orderService.queryMultipleStatis();
	}
	
	
	
	
	
}
