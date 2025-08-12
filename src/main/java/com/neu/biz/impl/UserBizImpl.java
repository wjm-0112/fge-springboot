package com.neu.biz.impl;

import com.neu.biz.UserBiz;
import com.neu.entity.User;
import com.neu.entity.UserCollection;
import com.neu.entity.UserSeen;
import com.neu.mapper.UserCollectionMapper;
import com.neu.mapper.UserMapper;
import com.neu.mapper.UserSeenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userBiz")
public class UserBizImpl implements UserBiz {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserCollectionMapper userCollectionMapper;
    @Autowired
    private UserSeenMapper userSeenMapper;

    @Override
    public User login(String uname, String upwd,  int role) {
        return userMapper.login(uname, upwd,  role);
    }

    @Override
    public boolean regUser(User user) {
        return userMapper.regUser(user);
    }

    @Override
    public List<User> findUser(int index, int size) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        List<User> list = userMapper.findUser(map);
        return list;
    }

    @Override
    public List<User> findUserMo(int index, int size, String uname) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        map.put("uname", uname);
        List<User> list = userMapper.findUserMo(map);
        return list;
    }

    @Override
    public boolean delUser(int id) {
        return userMapper.delUser(id);
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public List<UserCollection> getAllUserCollection() {
        return userCollectionMapper.getAllUserCollection();
    }

    @Override
    public List<UserSeen> getAllUserSeen() {
        return userSeenMapper.getAllUserSeen();
    }

    @Override
    public boolean updateInformation(User user) {
        return userMapper.updateInformation(user);
    }
}
