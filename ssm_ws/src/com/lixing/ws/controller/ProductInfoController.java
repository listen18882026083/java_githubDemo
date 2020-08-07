package com.lixing.ws.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.lixing.ws.pojo.TbProductInfo;
import com.lixing.ws.service.ProductInfoService;
import com.lixing.ws.tool.OrderCoderUtil;
import com.lixing.ws.tool.PageData;


@Controller
@RequestMapping("productInfo")
public class ProductInfoController {

	@Autowired
	private ProductInfoService pInfoService;
	
	@RequestMapping("list")
	@ResponseBody
	public PageData getProductTypeList(Integer page,Integer limit,String name,String typeId){
		TbProductInfo proInfo=new TbProductInfo();
		System.out.println(name);
		System.out.println(typeId);
		
		if(name!=null && !name.equals("")){
			proInfo.setInfoname(name);
		}
		if(typeId!=null && !typeId.equals("")){
			proInfo.setTypeid(Integer.parseInt(typeId));
		}
		return pInfoService.queryList(page, limit, proInfo);
		 
	}
	@RequestMapping("/save")
	@ResponseBody
	public int saveProductInfo(@RequestBody TbProductInfo productInfo){
		return pInfoService.saveProductInfo(productInfo);
	}
	
	@RequestMapping("/deleteByIds")
	@ResponseBody
	public String deleteByIds(@RequestParam(value = "ids[]") Integer[] ids){
		
		return pInfoService.delete(ids)+"";
	}
	
	
	@RequestMapping("/getProductInfoCode")
	@ResponseBody
	public String getProductCode(){
		return OrderCoderUtil.getProductInfoCode(null);
	}
	
	@RequestMapping("/queryById")
	public ModelAndView queryById(Integer id){
		ModelAndView  md=new ModelAndView();
		md.setViewName("productInfo/edit");
		md.addObject("productInfo", pInfoService.queryById(id));
		return md;
	}
	
	
	@RequestMapping("/edit")
	@ResponseBody
	public int edit(@RequestBody TbProductInfo info){
		return pInfoService.updateProductInfo(info);
	}
	
	@RequestMapping("/returnProductInfo")
	public String returnProductInfo(){
		return "productInfo/list";
	}
	@RequestMapping("/returnAddproductInfo")
	public String returnAddproductInfo(){
		return "productInfo/add";
	}
	
	
	
}
