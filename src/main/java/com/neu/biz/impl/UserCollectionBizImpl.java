package com.neu.biz.impl;

import com.neu.biz.UserCollectionBiz;
import com.neu.entity.CollectionMovieVo;
import com.neu.entity.Movie;
import com.neu.entity.User;
import com.neu.entity.UserCollection;
import com.neu.mapper.UserCollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userCollectionBiz")
public class UserCollectionBizImpl implements UserCollectionBiz {
    @Autowired
    private UserCollectionMapper userCollectionMapper;

    @Override
    public List<UserCollection> findUserCollection(int index, int size) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        List<UserCollection> list = userCollectionMapper.findUserCollection(map);
        return list;
    }

    @Override
    public List<UserCollection> findUserCollectionMo(int index, int size, int mid) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        map.put("mid", mid);
        List<UserCollection> list = userCollectionMapper.findUserCollectionMo(map);
        return list;
    }

    @Override
    public List<UserCollection> findUserCollectionMo1(int index, int size, String mname) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        map.put("mname", mname);
        List<UserCollection> list = userCollectionMapper.findUserCollectionMo1(map);
        return list;
    }

    @Override
    public boolean delUserCollection(int mid) {
        return userCollectionMapper.delUserCollection(mid);
    }

    @Override
    public UserCollection findById(int id) {
        return userCollectionMapper.findById(id);
    }

    @Override
    public boolean updateUserCollection(UserCollection userCollection) {
        return userCollectionMapper.updateUserCollection(userCollection);
    }

    @Override
    public List<UserCollection> getAllUserCollectionByUname(String uname) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("uname", uname);
        List<UserCollection> list = userCollectionMapper.getAllUserCollectionByUname(map);
        return list;
    }

    @Override
    public List<CollectionMovieVo> getUserCollections(String uname) {
        return userCollectionMapper.selectCollectionsByUser(uname);
    }

    @Override
    public boolean addUserCollection(UserCollection userCollection) {
        return userCollectionMapper.addUserCollection(userCollection);
    }
}
