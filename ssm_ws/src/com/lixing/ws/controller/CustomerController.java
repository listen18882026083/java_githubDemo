package com.lixing.ws.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.lixing.ws.pojo.TbCustomer;
import com.lixing.ws.service.CustomerService;
import com.lixing.ws.tool.PageData;

@RequestMapping("/customer")
@Controller
public class CustomerController {

	@Autowired
	private CustomerService cutomerService;
	
	//客户显示列表
	@RequestMapping("/list")
	public @ResponseBody PageData cutomerList(Integer page,
			Integer limit,
			String name,
			String wechat,
			String  wechatNetname){
		TbCustomer customer=new TbCustomer();
		customer.setName(name);
		customer.setWechat(wechat);
		customer.setWechatNetname(wechatNetname);
		return cutomerService.queryTbCustomer(page, limit, customer);
	}
	
	//删除方法，根据ID删除，单个ID和多个ID删除都是此方法
	//注意ajax传的是数组，必须要定义@RequestParam值是数组才能回去到参数
	@RequestMapping("/deleteByIds.action")
	@ResponseBody
	public int deleteByIds(@RequestParam(value = "ids[]") Integer[] ids){
		System.out.println("删除方法....");
		System.out.println(ids.length);
		int i=cutomerService.deleteById(ids);
		return i;
	}
	
	
	/**
	 * 方法名：saveUserInfo 添加客户信息方法
	 * 时间：2019-02-23
	 * 作者：xingzi
	 * 返回值：int   0代表添加失败，1代表添加成功
	 * 传入参数：客户信息对象
	 * */
	
	@RequestMapping("/save")
	public @ResponseBody int  saveTbCustomer(@RequestBody TbCustomer customer) {
		
		return cutomerService.saveTbCustomer(customer);
	}
	
	@RequestMapping("/update")
	public @ResponseBody int  updateTbCustomer(@RequestBody TbCustomer customer) {
		System.out.println("=================");
		return cutomerService.updateTbCustomer(customer);
		
	}
	
	
	/**
	 * 方法名：queryById 根据ID查询客户信息
	 * 时间：2019-02-25
	 * 作者：xingzi
	 * 返回值：对象   0代表添加失败，1代表添加成功
	 * 传入参数：客户信息对象
	 * */
	
	@RequestMapping("/queryById")
	public ModelAndView queryById(Integer id){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("customer/edit");
		mv.addObject("customer", cutomerService.queryById(id));
		return mv;
	}
	
	/**
	 * 方法名：statisGrade 统计客户信息中，各种会员的个数
	 * 时间：2019-03-06
	 * 作者：xingzi
	 * 返回值：ModelAndViewm
	 * 传入参数：无
	 * */
	@RequestMapping("/statisGrade")
	@ResponseBody
	public List<Map<String,Object>> statisGrade(){
		
		return cutomerService.statisGrade();
	}
	
	@RequestMapping("/getCustomerNameList")
	@ResponseBody
	public List<TbCustomer> getCustomerNameList(String customerName){
		return cutomerService.queryCustomerList(customerName);
	}
	
	@RequestMapping("/returnCutomerList")
	public  String returnCutomerList(String username){
		return "customer/list";
		
	}
	
	//跳转客户添加也面
	@RequestMapping("/returnAddCutomer.action")
	public String returnAddCutomer(){
		return "customer/add";
	}
	
	//跳转到统计页面
		@RequestMapping("/returnStatis.action")
		public String returnStatis(){
			return "customer/statis";
		}
}
