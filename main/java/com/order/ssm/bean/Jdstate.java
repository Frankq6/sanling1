package com.order.ssm.bean;

public class Jdstate {
    private String xtaddr;

    private String shuizhi;

    private Double fishnum;

    public String getXtaddr() {
        return xtaddr;
    }

    public void setXtaddr(String xtaddr) {
        this.xtaddr = xtaddr == null ? null : xtaddr.trim();
    }

    public String getShuizhi() {
        return shuizhi;
    }

    public void setShuizhi(String shuizhi) {
        this.shuizhi = shuizhi == null ? null : shuizhi.trim();
    }

    public Double getFishnum() {
        return fishnum;
    }

    public void setFishnum(Double fishnum) {
        this.fishnum = fishnum;
    }
}