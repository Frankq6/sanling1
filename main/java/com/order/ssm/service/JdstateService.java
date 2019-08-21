package com.order.ssm.service;

import com.order.ssm.bean.Jdstate;
import com.order.ssm.dao.JdstateMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JdstateService {
    @Autowired
    JdstateMapper jdstateMapper;

    public List<Jdstate> getAll() {
        return jdstateMapper.selectByExample(null);
    }
}
