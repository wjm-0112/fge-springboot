package com.neu.entity;

import java.sql.Date;

public class UserSeen {
    private int id;
    private String uname;
    private Movie mid = new Movie();
    private String mname;
    private Date time;

    public UserSeen(){}

    public UserSeen(int id, String uname, Movie mid, String mname, Date time) {
        this.id = id;
        this.uname = uname;
        this.mid = mid;
        this.mname = mname;
        this.time = time;
    }



    public UserSeen(String uname, Movie mid, String mname, Date time) {
        this.uname = uname;
        this.mid = mid;
        this.mname = mname;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Movie getMid() {
        return mid;
    }

    public void setMid(Movie mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
