package com.lixing.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lixing.ws.mapper.TbCityMapper;
import com.lixing.ws.pojo.TbCity;
import com.lixing.ws.pojo.TbCityExample;
import com.lixing.ws.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private TbCityMapper cityMapper;
	
	public List<TbCity> queryCity(String code) {
		TbCityExample t=new TbCityExample();
		t.createCriteria().andProvincecodeEqualTo(code+"");
		return cityMapper.selectByExample(t);
	}

}
