package com.lixing.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lixing.ws.pojo.TbArea;
import com.lixing.ws.pojo.TbCity;
import com.lixing.ws.pojo.TbProvince;
import com.lixing.ws.service.AreaService;
import com.lixing.ws.service.CityService;
import com.lixing.ws.service.ProvinceService;

@Controller
@RequestMapping("/area")
public class AreaController {

	@Autowired
	private AreaService areaService;
	
	@Autowired
	private ProvinceService provinceService;
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping("/provinceList")
	@ResponseBody
	public List<TbProvince> queryProvinceList(){
		return provinceService.queryTbProvince();
	}
	
	@RequestMapping("/cityList")
	@ResponseBody
	public List<TbCity> queryCityList(String code){
		return cityService.queryCity(code);
	}
	
	@RequestMapping("/areaList")
	@ResponseBody
	public List<TbArea> queryAreaList(String code){
		return areaService.queryArea(code);
	}
}
