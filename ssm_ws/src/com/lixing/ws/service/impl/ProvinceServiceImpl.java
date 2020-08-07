package com.lixing.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lixing.ws.mapper.TbProvinceMapper;
import com.lixing.ws.pojo.TbProvince;
import com.lixing.ws.service.ProvinceService;


@Service
public class ProvinceServiceImpl implements ProvinceService {

	@Autowired
	private TbProvinceMapper provinceMapper;
	public List<TbProvince> queryTbProvince() {
		
		return provinceMapper.selectByExample(null);
	}

}
