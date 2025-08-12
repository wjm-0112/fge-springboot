package com.neu.entity;

public class User {
    private int id;
    private String uname;
    private String upwd;
    private int role;
    private String email;
    private int collection;
    private int seen;

    public User() {}
    public User(int id, String uname, String upwd, int role, String email, int collection, int seen){
        this.id = id;
        this.uname = uname;
        this.upwd = upwd;
        this.role = role;
        this.email = email;
        this.collection = collection;
        this.seen = seen;
    }

    public User(int id,String uname, String upwd,  String email){
        this.id = id;
        this.uname = uname;
        this.upwd = upwd;
        this.email = email;
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

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
