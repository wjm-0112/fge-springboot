package com.neu.biz.impl;

import com.neu.biz.UserSeenBiz;
import com.neu.entity.SeenMovieVo;
import com.neu.entity.UserCollection;
import com.neu.entity.UserSeen;
import com.neu.mapper.UserSeenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userSeenBiz")
public class UserSeenBizImpl implements UserSeenBiz {
    @Autowired
    private UserSeenMapper userSeenMapper;
    @Override
    public List<UserSeen> findUserSeen(int index, int size) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        List<UserSeen> list = userSeenMapper.findUserSeen(map);
        return list;
    }

    @Override
    public List<UserSeen> getAllUserSeenByUname(String uname) {
        return userSeenMapper.getAllUserSeenByUname(uname);
    }

    @Override
    public List<UserSeen> findUserSeenMo(int index, int size, int mid) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        map.put("mid", mid);
        List<UserSeen> list = userSeenMapper.findUserSeenMo(map);
        return list;
    }

    @Override
    public List<UserSeen> findUserSeenMo1(int index, int size, String mname) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        map.put("mname", mname);
        List<UserSeen> list = userSeenMapper.findUserSeenMo1(map);
        return list;
    }

    @Override
    public boolean delUserSeen(int id) {
        return userSeenMapper.delUserSeen(id);
    }

    @Override
    public boolean addUserSeen(UserSeen userSeen) {
        return userSeenMapper.addUserSeen(userSeen);
    }

    @Override
    public List<SeenMovieVo> getUserSeens(String uname) {
        return userSeenMapper.selectSeensByUser(uname);
    }
}
