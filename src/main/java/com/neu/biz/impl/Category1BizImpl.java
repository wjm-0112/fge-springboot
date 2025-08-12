package com.neu.biz.impl;

import com.neu.biz.Category1Biz;
import com.neu.entity.Category1;
import com.neu.mapper.Category1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("category1Biz")
public class Category1BizImpl implements Category1Biz {
    @Autowired
    private Category1Mapper category1Mapper;

    @Override
    public List<Category1> findCategory1(int index, int size) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        List<Category1> list = category1Mapper.findAll(map);
        return list;
    }

    @Override
    public List<Category1> getAllCategory1() {
        return category1Mapper.findAll1();
    }

    @Override
    public boolean delCategory1(int cid) {
        return category1Mapper.delCategory1(cid);
    }

    @Override
    public Category1 findById(int cid) {
        return category1Mapper.findById(cid);
    }

    @Override
    public boolean updateCategory1(Category1 category1) {
        return category1Mapper.updateCategory1(category1);
    }

    @Override
    public boolean addCategory1(Category1 category1) {
        return category1Mapper.addCategory1(category1);
    }
}
