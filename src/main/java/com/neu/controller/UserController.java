package com.neu.controller;

import com.neu.biz.UserBiz;
import com.neu.biz.UserCollectionBiz;
import com.neu.biz.UserSeenBiz;
import com.neu.entity.User;
import com.neu.entity.UserCollection;
import com.neu.entity.UserSeen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class UserController {
    @Autowired
    private UserBiz userBiz;

    @RequestMapping(value = "/login")
    @ResponseBody
    public User login(String uname, String upwd,  int role) {
        User user = userBiz.login(uname, upwd,  role);
        return user;
    }

    @RequestMapping(value = "/regUser")
    @ResponseBody
    public boolean regUser(int id, String uname, String upwd, int role, String email, int collection, int seen) {
        User user = new User(id, uname, upwd, role, email, collection, seen);
        boolean flag = userBiz.regUser(user);
        return flag;
    }

    @RequestMapping(value = "/findUser")
    @ResponseBody
    public Map<String,Object> findUser(Integer index) {
        if (index == null) index = 1;
        int size = 5;
        List<User> list = userBiz.findUser(index, size);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        return map;
    }

    @RequestMapping(value = "/findUserMo")
    @ResponseBody
    public Map<String,Object> findUserMo(Integer index,String uname) {
        if (index == null) index = 1;
        int size = 5;
        List<User> list = userBiz.findUserMo(index, size, uname);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("list", list);
        map.put("index", index);
        map.put("uname", uname);
        return map;
    }

    @RequestMapping(value = "/delUser")
    @ResponseBody
    public boolean delUser(int id) {
        boolean flag = userBiz.delUser(id);
        return flag;
    }

    @RequestMapping(value = "/findById")
    @ResponseBody
    public User findById(int id) {
        User user = userBiz.findById(id);
        return user;
    }

    @RequestMapping(value = "/updateUser")
    @ResponseBody
    public boolean updateUser(int id, String uname, String upwd, int role, String email, int collection, int seen) {
        User user = new User(id, uname, upwd, role, email, collection, seen);
        boolean flag = userBiz.updateUser(user);
        return flag;
    }

    @RequestMapping(value = "/addUser")
    @ResponseBody
    public boolean addUser(int id, String uname, String upwd, int role, String email, int collection, int seen) {
        User user = new User(id, uname, upwd, role, email, collection, seen);
        boolean flag = userBiz.addUser(user);
        return flag;
    }

    @RequestMapping(value = "/getAllUser")
    @ResponseBody
    public List<User> getAllUser() {
        return userBiz.getAllUser();
    }

    @RequestMapping(value = "/getAllUserCollection")
    @ResponseBody
    public List<UserCollection> getAllUserCollection() {
        return userBiz.getAllUserCollection();
    }

    @RequestMapping(value = "/getAllUserSeen")
    @ResponseBody
    public List<UserSeen> getAllUserSeen() {
        return userBiz.getAllUserSeen();
    }

    @RequestMapping(value = "/updateInformation")
    @ResponseBody
    public boolean updateInformation(int id, String uname, String upwd, String email) {
        User user = new User(id, uname, upwd,email);
        return userBiz.updateInformation(user);
    }
}
