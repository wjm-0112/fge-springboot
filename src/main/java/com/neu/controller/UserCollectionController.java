package com.neu.controller;

import com.neu.biz.UserCollectionBiz;
import com.neu.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("userCollection")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class UserCollectionController {
    @Autowired
    private UserCollectionBiz userCollectionBiz;

    @RequestMapping(value = "/findUserCollection")
    @ResponseBody
    public Map<String,Object> findUserCollection(Integer index){
        if (index == null) index = 1;
        int size = 5;
        List<UserCollection> list = userCollectionBiz.findUserCollection(index, size);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        return map;
    }

    @RequestMapping(value = "/findUserCollectionMo")
    @ResponseBody
    public Map<String,Object> findUserCollectionMo(Integer index, int mid){
        if (index == null) index = 1;
        int size = 5;
        List<UserCollection> list = userCollectionBiz.findUserCollectionMo(index, size, mid);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        map.put("mid", mid);
        return map;
    }

    @RequestMapping(value = "/findUserCollectionMo1")
    @ResponseBody
    public Map<String,Object> findUserCollectionMo1(Integer index, String mname){
        if (index == null) index = 1;
        int size = 5;
        List<UserCollection> list = userCollectionBiz.findUserCollectionMo1(index, size, mname);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        map.put("mname", mname);
        return map;
    }

    @RequestMapping(value = "/delUserCollection")
    @ResponseBody
    public boolean delUserCollection(int mid){
        return userCollectionBiz.delUserCollection(mid);
    }

    @RequestMapping(value = "/findById")
    @ResponseBody
    public UserCollection findById(int id){
        return userCollectionBiz.findById(id);
    }

    @RequestMapping(value = "/updateUserCollection")
    @ResponseBody
    public boolean updateUserCollection(int id, String uname, int mid, String mname, Date time){
        Movie m1 = new Movie();
        m1.setMid(mid);
        UserCollection userCollection = new UserCollection(id, uname, m1, mname, time);
        boolean flag = userCollectionBiz.updateUserCollection(userCollection);
        return flag;
    }

    @RequestMapping(value = "/addUserCollection")
    @ResponseBody
    public boolean addUserCollection(String uname,int mid,String mname,Date time){
        Movie m2 = new Movie();
        m2.setMid(mid);
        UserCollection userCollection = new UserCollection(uname,m2,mname,time);
        boolean flag = userCollectionBiz.addUserCollection(userCollection);
        return flag;
    }

    @RequestMapping(value = "/getAllUserCollectionByUname")
    @ResponseBody
    public List<UserCollection> getAllUserCollectionByUname(String uname){
        List<UserCollection> list = userCollectionBiz.getAllUserCollectionByUname(uname);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("uname", uname);
        return list;
    }

    @RequestMapping(value = "/selectCollectionsByUser")
    @ResponseBody
    public List<CollectionMovieVo> selectCollectionsByUser(String uname){
        return userCollectionBiz.getUserCollections(uname);
    }
}
