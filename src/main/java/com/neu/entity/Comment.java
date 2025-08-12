package com.neu.entity;

import java.sql.Date;

public class Comment {
    private int cid;
    private String uname;
    private Movie mid = new Movie();
    private String mname ;
    private String content;
    private Date ctime;

    public Comment(){}

    public Comment(int cid, String uname, Movie mid, String mname, String content, Date ctime) {
        this.cid = cid;
        this.uname = uname;
        this.mid = mid;
        this.mname = mname;
        this.content = content;
        this.ctime = ctime;
	}

    public Comment( String uname, Movie mid, String mname, String content, Date ctime) {
        this.uname = uname;
        this.mid = mid;
        this.mname = mname;
        this.content = content;
        this.ctime = ctime;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
