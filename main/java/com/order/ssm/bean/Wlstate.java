package com.order.ssm.bean;

public class Wlstate {
    private String ssmoni;

    private Integer zdnum;

    public String getSsmoni() {
        return ssmoni;
    }

    public void setSsmoni(String ssmoni) {
        this.ssmoni = ssmoni == null ? null : ssmoni.trim();
    }

    public Integer getZdnum() {
        return zdnum;
    }

    public void setZdnum(Integer zdnum) {
        this.zdnum = zdnum;
    }
}