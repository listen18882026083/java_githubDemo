package com.lixing.ws.mapper;

import com.lixing.ws.pojo.TbOrder;
import com.lixing.ws.pojo.TbOrderExample;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TbOrderMapper {
    int countByExample(TbOrderExample example);

    int deleteByExample(TbOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    List<TbOrder> selectByExample(TbOrderExample example);

    TbOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);
    
    List<TbOrder> queryOrderList(TbOrderExample example);
    List<TbOrder> queryOrderListByMap(@Param("params") Map<String,Object> map);
    int queryOrderCountByMap(@Param("params") Map<String,Object> map);
    TbOrder queryOrderByCode(String ordernumber);
    List<Map<String,Object>> monthStatis();
    
    List<Map<String,Object>> quarterStatis();
    
    //查询当天的销售额
    BigDecimal queryDayMoney();
    BigDecimal queryMonthMoney();
    BigDecimal queryWeekMoney();
    BigDecimal queryQuarterMoney();
    List<Map<String,Object>> queryMonthConsume3();
    List<Map<String,Object>> queryQuarterConsume3();
    List<Map<String,Object>> queryYearConsume3();
    
    List<Map<String,Object>> queryMonthProductStar();
    List<Map<String,Object>> queryQuarterProductStar();
    List<Map<String,Object>> queryYearProductStar();
    
    
}