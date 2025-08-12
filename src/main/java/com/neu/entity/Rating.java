package com.neu.entity;

public class Rating {
    private int sid;
    private Movie mname = new Movie();
    private Movie score = new Movie();
    private String level;

    public Rating(){}

    public Rating(int sid, Movie mname, Movie score, String level) {
		this.sid = sid;
		this.mname = mname;
		this.score = score;
		this.level = level;
	}

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public Movie getMname() {
        return mname;
    }

    public void setMname(Movie mname) {
        this.mname = mname;
    }

    public Movie getScore() {
        return score;
    }

    public void setScore(Movie score) {
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
