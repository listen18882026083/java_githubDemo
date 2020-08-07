package com.lixing.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lixing.ws.pojo.TbProductType;
import com.lixing.ws.service.ProductTypeService;
import com.lixing.ws.tool.OrderCoderUtil;
import com.lixing.ws.tool.PageData;


@Controller
@RequestMapping("productType")
public class ProductTypeController {

	@Autowired
	private ProductTypeService pTypeService;
	
	@RequestMapping("list")
	@ResponseBody
	public PageData getProductTypeList(Integer page,Integer limit,String name){
		TbProductType proType=new TbProductType();
		
		if(name!=null && !name.equals("")){
			proType.setName(name);
		}
		return pTypeService.queryList(page, limit, proType);
		 
	}
	@RequestMapping("/save")
	@ResponseBody
	public String save(@RequestBody TbProductType productType){
		return pTypeService.save(productType)+"";
	}
	
	@RequestMapping("/queryById")
	public ModelAndView queryById(Integer id){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("productType/edit");
		mv.addObject("productType", pTypeService.queryById(id));
		return mv;
	}
	
	@RequestMapping("/edit")
	@ResponseBody
	public String edit(@RequestBody TbProductType tb){
		return pTypeService.updateById(tb)+"";
	}
	
	@RequestMapping("/deleteByIds")
	@ResponseBody
	public String deleteByIds(@RequestParam(value = "ids[]") Integer[] ids){
		
		return pTypeService.delete(ids)+"";
	}
	
	//获取类别的编号
	@RequestMapping("/getTypeNumber")
	@ResponseBody
	public String getTypeNumber(){
		String codeNumber=OrderCoderUtil.getProductTypeCode(null);
		return codeNumber;
	}
	
	@RequestMapping("/getProductType")
	@ResponseBody
	public List<TbProductType> getProductType(){
			return pTypeService.queryProductType();
	}
	
	@RequestMapping("/returnProductTypeList")
	public String  returnProductTypeList(){
		return "productType/list";
	}
	@RequestMapping("/returnAddProductType")
	public String  returnAddProductType(){
		return "productType/add";
	}
	
}
