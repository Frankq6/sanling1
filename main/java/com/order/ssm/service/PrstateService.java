package com.order.ssm.service;

import com.order.ssm.bean.Prstate;
import com.order.ssm.dao.PrstateMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrstateService {
    @Autowired
    PrstateMapper prstateMapper;

    public List<Prstate> getAll() {
        return prstateMapper.selectByExample(null);
    }
}
