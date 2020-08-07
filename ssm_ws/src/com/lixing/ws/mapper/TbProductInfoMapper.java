package com.lixing.ws.mapper;

import com.lixing.ws.pojo.TbProductInfo;
import com.lixing.ws.pojo.TbProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductInfoMapper {
    int countByExample(TbProductInfoExample example);

    int deleteByExample(TbProductInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbProductInfo record);

    int insertSelective(TbProductInfo record);

    List<TbProductInfo> selectByExample(TbProductInfoExample example);

    TbProductInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbProductInfo record, @Param("example") TbProductInfoExample example);

    int updateByExample(@Param("record") TbProductInfo record, @Param("example") TbProductInfoExample example);

    int updateByPrimaryKeySelective(TbProductInfo record);

    int updateByPrimaryKey(TbProductInfo record);
    
    //添加代码
    List<TbProductInfo> queryList(TbProductInfoExample example);
}