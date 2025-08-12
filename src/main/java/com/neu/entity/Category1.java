package com.neu.entity;

public class Category1 {
    private int cid;
    private String area;

    public Category1(){}

    public Category1(int cid, String area) {
        this.cid = cid;
        this.area = area;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
