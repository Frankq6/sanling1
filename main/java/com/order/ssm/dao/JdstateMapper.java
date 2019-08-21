package com.order.ssm.dao;

import com.order.ssm.bean.Jdstate;
import com.order.ssm.bean.JdstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JdstateMapper {
    int countByExample(JdstateExample example);

    int deleteByExample(JdstateExample example);

    int insert(Jdstate record);

    int insertSelective(Jdstate record);

    List<Jdstate> selectByExample(JdstateExample example);

    int updateByExampleSelective(@Param("record") Jdstate record, @Param("example") JdstateExample example);

    int updateByExample(@Param("record") Jdstate record, @Param("example") JdstateExample example);
}