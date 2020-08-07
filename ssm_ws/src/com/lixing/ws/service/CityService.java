package com.lixing.ws.service;

import java.util.List;

import com.lixing.ws.pojo.TbCity;

public interface CityService {

	public List<TbCity> queryCity(String code);
}
