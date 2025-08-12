package com.neu.entity;

import java.sql.Date;

public class Movie {
    private int mid;
    private String name;
    private int time; // 时长
    private String director;
    private String actor;
    private Category1 category1 = new Category1();
    private Category2 category2 = new Category2();
    private String description;
    private double score;
    private int collection;
    private int seen;
    private Date year;
    private String poster;

    public Movie() {}

    public Movie(int mid, String name, int time, String director, String actor, Category1 category1, Category2 category2, String description, double score, int collection, int seen, Date year, String poster) {
        this.mid = mid;
        this.name = name;
        this.time = time;
        this.director = director;
        this.actor = actor;
        this.category1 = category1;
        this.category2 = category2;
        this.description = description;
        this.score = score;
        this.collection = collection;
        this.seen = seen;
        this.year = year;
        this.poster = poster;
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

    public Category1 getCategory1() {
        return category1;
    }

    public void setCategory1(Category1 category1) {
        this.category1 = category1;
    }

    public Category2 getCategory2() {
        return category2;
    }

    public void setCategory2(Category2 category2) {
        this.category2 = category2;
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
