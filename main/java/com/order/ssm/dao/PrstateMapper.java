package com.order.ssm.dao;

import com.order.ssm.bean.Prstate;
import com.order.ssm.bean.PrstateExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrstateMapper {
    int countByExample(PrstateExample example);

    int deleteByExample(PrstateExample example);

    int insert(Prstate record);

    int insertSelective(Prstate record);

    List<Prstate> selectByExample(PrstateExample example);

    int updateByExampleSelective(@Param("record") Prstate record, @Param("example") PrstateExample example);

    int updateByExample(@Param("record") Prstate record, @Param("example") PrstateExample example);
}