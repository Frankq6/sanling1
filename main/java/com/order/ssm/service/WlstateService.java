package com.order.ssm.service;

import com.order.ssm.bean.Wlstate;
import com.order.ssm.dao.WlstateMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WlstateService {
    @Autowired
    WlstateMapper wlstateMapper;

    public List<Wlstate> getAll(){
        return wlstateMapper.selectByExample(null);
    }
}
