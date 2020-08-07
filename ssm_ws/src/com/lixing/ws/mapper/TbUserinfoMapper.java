package com.lixing.ws.mapper;

import com.lixing.ws.pojo.TbUserinfo;
import com.lixing.ws.pojo.TbUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserinfoMapper {
    int countByExample(TbUserinfoExample example);

    int deleteByExample(TbUserinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserinfo record);

    int insertSelective(TbUserinfo record);

    List<TbUserinfo> selectByExample(TbUserinfoExample example);

    TbUserinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserinfo record, @Param("example") TbUserinfoExample example);

    int updateByExample(@Param("record") TbUserinfo record, @Param("example") TbUserinfoExample example);

    int updateByPrimaryKeySelective(TbUserinfo record);

    int updateByPrimaryKey(TbUserinfo record);
    
    List<TbUserinfo> queryList(TbUserinfoExample example);
    
    TbUserinfo queryByUserName(String username);
}