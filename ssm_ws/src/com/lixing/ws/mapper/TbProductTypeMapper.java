package com.lixing.ws.mapper;

import com.lixing.ws.pojo.TbProductType;
import com.lixing.ws.pojo.TbProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductTypeMapper {
    int countByExample(TbProductTypeExample example);

    int deleteByExample(TbProductTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbProductType record);

    int insertSelective(TbProductType record);

    List<TbProductType> selectByExample(TbProductTypeExample example);

    TbProductType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbProductType record, @Param("example") TbProductTypeExample example);

    int updateByExample(@Param("record") TbProductType record, @Param("example") TbProductTypeExample example);

    int updateByPrimaryKeySelective(TbProductType record);

    int updateByPrimaryKey(TbProductType record);
    
    
    //手动添加查询
    //分页查询
    List<TbProductType> queryList(TbProductTypeExample example);
}