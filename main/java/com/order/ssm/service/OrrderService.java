package com.order.ssm.service;

import com.order.ssm.bean.Orrder;
import com.order.ssm.dao.OrrderMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrrderService {

    @Autowired
    OrrderMapper orrderMapper;

    public List<Orrder> getAll(){
        return orrderMapper.selectByExample(null);
    }

    public Orrder getOrrder(Integer id) {
        Orrder orrder = orrderMapper.selectByPrimaryKey(id);
        return orrder;
    }

    public void updateOrrder(Orrder orrder) {
        orrderMapper.updateByPrimaryKeySelective(orrder);
    }

    public void deleteOrrder(Integer id) {
        orrderMapper.deleteByPrimaryKey(id);
    }
}
