package com.order.ssm.dao;

import com.order.ssm.bean.Wlstate;
import com.order.ssm.bean.WlstateExample;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WlstateMapper {
    int countByExample(WlstateExample example);

    int deleteByExample(WlstateExample example);

    int insert(Wlstate record);

    int insertSelective(Wlstate record);

    List<Wlstate> selectByExample(WlstateExample example);

    int updateByExampleSelective(@Param("record") Wlstate record, @Param("example") WlstateExample example);

    int updateByExample(@Param("record") Wlstate record, @Param("example") WlstateExample example);
}