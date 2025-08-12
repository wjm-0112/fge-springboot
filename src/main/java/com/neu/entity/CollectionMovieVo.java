package com.neu.entity;

import java.sql.Date;

public class CollectionMovieVo {
    private int mid;
    private String name;
    private Date year;
    private String area;
    private String type;
    private Double score;
    private String poster;
    private Date time;

    public CollectionMovieVo() {}

    public CollectionMovieVo(int mid,String name, Date year, String area, String type, Double score, String poster, Date time) {
    	this.mid = mid;
    	this.name = name;
    	this.year = year;
    	this.area = area;
    	this.type = type;
    	this.score = score;
    	this.poster = poster;
    	this.time = time;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
