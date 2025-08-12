package com.neu.controller;

import com.neu.biz.UserSeenBiz;
import com.neu.entity.Movie;
import com.neu.entity.SeenMovieVo;
import com.neu.entity.UserCollection;
import com.neu.entity.UserSeen;
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
@RequestMapping("userSeen")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class UserSeenController {
    @Autowired
    private UserSeenBiz userSeenBiz;

    @RequestMapping(value = "/findUserSeen")
    @ResponseBody
    public Map<String,Object> findUserSeen(Integer index) {
        if (index == null) index = 1;
        int size = 5;
        List<UserSeen> list = userSeenBiz.findUserSeen(index, size);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
    	return map;
    }

    @RequestMapping(value = "/getAllUserCollectionByUname")
    @ResponseBody
    public List<UserSeen> getAllUserCollectionByUname(String uname) {
        List<UserSeen> list = userSeenBiz.getAllUserSeenByUname(uname);
        return list;
    }

    @RequestMapping(value = "/findUserSeenMo")
    @ResponseBody
    public Map<String,Object> findUserSeenMo(Integer index, int mid) {
        if (index == null) index = 1;
        int size = 5;
        List<UserSeen> list = userSeenBiz.findUserSeenMo(index, size, mid);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        map.put("mid", mid);
        return map;
    }

    @RequestMapping(value = "/findUserSeenMo1")
    @ResponseBody
    public Map<String,Object> findUserSeenMo1(Integer index, String mname) {
        if (index == null) index = 1;
        int size = 5;
        List<UserSeen> list = userSeenBiz.findUserSeenMo1(index, size, mname);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        map.put("mname", mname);
        return map;
    }

    @RequestMapping(value = "/delUserSeen")
    @ResponseBody
    public boolean delUserSeen(int id) {
        return userSeenBiz.delUserSeen(id);
    }

    @RequestMapping(value = "/addUserSeen")
    @ResponseBody
    public boolean addUserSeen(String uname, int mid, String mname, Date time) {
        Movie m1 = new Movie();
        m1.setMid(mid);
        UserSeen userSeen = new UserSeen(uname, m1, mname, time);
        return userSeenBiz.addUserSeen(userSeen);
    }

    @RequestMapping(value = "/selectUserSeenByUser")
    @ResponseBody
    public List<SeenMovieVo> selectUserSeenByUser(String uname) {
        return userSeenBiz.getUserSeens(uname);
    }
}
