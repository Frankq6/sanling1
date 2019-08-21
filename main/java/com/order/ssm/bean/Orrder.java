package com.order.ssm.bean;

public class Orrder {
    private Integer oid;

    private String username;

    private Integer phone;

    private String taste;

    private Integer amount;

    private Integer pay;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste == null ? null : taste.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Orrder(){
        super();
    }

    public Orrder(Integer oid, String username, Integer phone, String taste, Integer amount, Integer pay) {
        this.oid = oid;
        this.username = username;
        this.phone = phone;
        this.taste = taste;
        this.amount = amount;
        this.pay = pay;
    }
}