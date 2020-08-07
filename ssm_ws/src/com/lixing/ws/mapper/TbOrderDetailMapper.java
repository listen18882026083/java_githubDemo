package com.lixing.ws.mapper;

import com.lixing.ws.pojo.TbOrderDetail;
import com.lixing.ws.pojo.TbOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderDetailMapper {
    int countByExample(TbOrderDetailExample example);

    int deleteByExample(TbOrderDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbOrderDetail record);

    int insertSelective(TbOrderDetail record);

    List<TbOrderDetail> selectByExample(TbOrderDetailExample example);

    TbOrderDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbOrderDetail record, @Param("example") TbOrderDetailExample example);

    int updateByExample(@Param("record") TbOrderDetail record, @Param("example") TbOrderDetailExample example);

    int updateByPrimaryKeySelective(TbOrderDetail record);

    int updateByPrimaryKey(TbOrderDetail record);
    
    
    
    List<TbOrderDetail> queryOrderDetailList(TbOrderDetailExample example);
}