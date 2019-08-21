package com.order.ssm.bean;

public class Prstate {
    private Integer ptotal;

    private Double xiaohao;

    private String khname;

    private String khstate;

    public Integer getPtotal() {
        return ptotal;
    }

    public void setPtotal(Integer ptotal) {
        this.ptotal = ptotal;
    }

    public Double getXiaohao() {
        return xiaohao;
    }

    public void setXiaohao(Double xiaohao) {
        this.xiaohao = xiaohao;
    }

    public String getKhname() {
        return khname;
    }

    public void setKhname(String khname) {
        this.khname = khname == null ? null : khname.trim();
    }

    public String getKhstate() {
        return khstate;
    }

    public void setKhstate(String khstate) {
        this.khstate = khstate == null ? null : khstate.trim();
    }
}