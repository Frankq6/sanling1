package com.order.ssm.dao;

import com.order.ssm.bean.Orrder;
import com.order.ssm.bean.OrrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrrderMapper {
    int countByExample(OrrderExample example);

    int deleteByExample(OrrderExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Orrder record);

    int insertSelective(Orrder record);

    List<Orrder> selectByExample(OrrderExample example);

    Orrder selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Orrder record, @Param("example") OrrderExample example);

    int updateByExample(@Param("record") Orrder record, @Param("example") OrrderExample example);

    int updateByPrimaryKeySelective(Orrder record);

    int updateByPrimaryKey(Orrder record);
}