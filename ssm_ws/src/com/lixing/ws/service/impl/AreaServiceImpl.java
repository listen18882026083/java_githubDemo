package com.lixing.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lixing.ws.mapper.TbAreaMapper;
import com.lixing.ws.pojo.TbArea;
import com.lixing.ws.pojo.TbAreaExample;
import com.lixing.ws.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private TbAreaMapper areaMapper;
	public List<TbArea> queryArea(String code) {
		TbAreaExample t=new TbAreaExample();
		t.createCriteria().andCitycodeEqualTo(code);
		return areaMapper.selectByExample(t);
	}

}
