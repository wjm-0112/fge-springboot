package com.neu.entity;

public class Rank {
    private int rid;
    private String name;
    private double score;
    private int collection;

    public Rank(){}

    public Rank(int rid, String name, double score, int collection) {
		this.rid = rid;
		this.name = name;
		this.score = score;
		this.collection = collection;
	}

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
