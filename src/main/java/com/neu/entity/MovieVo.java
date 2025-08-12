package com.neu.entity;

import java.sql.Date;

public class MovieVo {
    private int mid;
    private String name;
    private int time;
    private String director;
    private String actor;
    private String area;
    private String type;
    private String description;
    private double score;
    private int collection;
    private int seen;
    private Date year;
    private String poster;

    public MovieVo() {
    }

    public MovieVo(int mid, String name, int time, String director, String actor, String area, String type, String description, double score, int collection, int seen, Date year, String poster) {
        this.mid = mid;
        this.name = name;
        this.time = time;
        this.director = director;
        this.actor = actor;
        this.area = area;
        this.type = type;
        this.description = description;
        this.score = score;
        this.collection = collection;
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getCollection() {
        return collection;
    }

    public void setCollection(int collection) {
        this.collection = collection;
    }

    public int getSeen() {
        return seen;
    }

    public void setSeen(int seen) {
        this.seen = seen;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
