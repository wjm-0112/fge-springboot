package com.neu.entity;

public class Category2 {
    private int ccid;
    private String type;

    public Category2(){}

    public Category2(int ccid, String type) {
		this.ccid = ccid;
		this.type = type;
	}

    public int getCcid() {
        return ccid;
    }

    public void setCcid(int ccid) {
        this.ccid = ccid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
