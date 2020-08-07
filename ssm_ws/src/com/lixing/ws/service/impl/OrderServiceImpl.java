package com.lixing.ws.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lixing.ws.mapper.TbOrderDetailMapper;
import com.lixing.ws.mapper.TbOrderMapper;
import com.lixing.ws.pojo.TbOrder;
import com.lixing.ws.pojo.TbOrderDetailExample;
import com.lixing.ws.pojo.TbOrderExample;
import com.lixing.ws.service.OrderService;
import com.lixing.ws.vo.DataVo;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private TbOrderMapper orderMapper;
	
	@Autowired	
	private TbOrderDetailMapper orderDetailMapper;

	public List<TbOrder> queryOrderList(TbOrderExample tx) {
		
		return orderMapper.queryOrderList(tx);
	}

	public int queryOrderCount(TbOrderExample tx) {
		 
		return orderMapper.countByExample(tx);
	}

	public List<TbOrder> queryOrderList(Map<String, Object> obj) {
		// TODO Auto-generated method stub
		return orderMapper.queryOrderListByMap(obj);
	}

	public int queryOrderCount(Map<String, Object> obj) {
		// TODO Auto-generated method stub
		return orderMapper.queryOrderCountByMap(obj);
	}

	public TbOrder queryOrderById(Integer id) {
		
		return orderMapper.selectByPrimaryKey(id);
	}

	public TbOrder queryOrderByCode(String code) {
	
		return orderMapper.queryOrderByCode(code);
	}

	public int deleteByIds(Integer[] ids) {
		int count=0;
		for(int i=0;i<ids.length;i++){
			TbOrderDetailExample od=new TbOrderDetailExample();
			od.createCriteria().andOrderidEqualTo(ids[i]);
			orderDetailMapper.deleteByExample(od);
			orderMapper.deleteByPrimaryKey(ids[i]);
			count++;
		}
		return count;
	}

	public int updateById(TbOrder od) {
		// TODO Auto-generated method stub
		return orderMapper.updateByPrimaryKeySelective(od);
	}

	public List<Map<String, Object>> monthStatis() {
		
		return orderMapper.monthStatis();
	}

	public List<Map<String, Object>> quarterStatis() {
		// TODO Auto-generated method stub
		return orderMapper.quarterStatis();
	}

	public DataVo queryMultipleStatis() {
		DataVo vo=new DataVo();
		//当天销售额
		BigDecimal dayMoney=orderMapper.queryDayMoney();
		BigDecimal weekMoney=orderMapper.queryWeekMoney();
		BigDecimal monthMoney=orderMapper.queryMonthMoney();
		BigDecimal quarterMoney=orderMapper.queryQuarterMoney();
		vo.setDayMoney(dayMoney);
		vo.setMonthMoney(monthMoney);
		vo.setWeekMoney(weekMoney);
		vo.setQuarterMoney(quarterMoney);
		
		//查询月、季度、年的消费之星，前三明
		vo.setMonthCustomerStar(orderMapper.queryMonthConsume3());
		vo.setQuarterCustomerStar(orderMapper.queryQuarterConsume3());
		vo.setYearCustomerStar(orderMapper.queryYearConsume3());
		
		vo.setMonthProductStar(orderMapper.queryMonthProductStar());
		vo.setQuarterProductStar(orderMapper.queryQuarterProductStar());
		vo.setYearProductStar(orderMapper.queryYearProductStar());
		
		return vo;
	}
	
}
