package com.lixing.ws.mapper;

import com.lixing.ws.pojo.TbCustomer;
import com.lixing.ws.pojo.TbCustomerExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TbCustomerMapper {
    int countByExample(TbCustomerExample example);

    int deleteByExample(TbCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCustomer record);

    int insertSelective(TbCustomer record);

    List<TbCustomer> selectByExample(TbCustomerExample example);

    TbCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCustomer record, @Param("example") TbCustomerExample example);

    int updateByExample(@Param("record") TbCustomer record, @Param("example") TbCustomerExample example);

    int updateByPrimaryKeySelective(TbCustomer record);

    int updateByPrimaryKey(TbCustomer record);
    
    //手动新增代码
    List<TbCustomer> queryList(TbCustomerExample example);
    
    List<Map<String,Object>> statisGrade();
}