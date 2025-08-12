package com.neu.biz.impl;

import com.neu.biz.Category2Biz;
import com.neu.entity.Category2;
import com.neu.mapper.Category2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("category2Biz")
public class Category2BizImpl implements Category2Biz {
    @Autowired
    private Category2Mapper category2Mapper;
    @Override
    public List<Category2> findAll(int index, int size) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        List<Category2> list = category2Mapper.findAll(map);
        return list;
    }

    @Override
    public List<Category2> findAll1() {
        return category2Mapper.findAll1();
    }

    @Override
    public List<Category2> findCategory2Mo(int index, int size, String type) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        map.put("type", type);
        List<Category2> list = category2Mapper.findCategory2Mo(map);
        return list;
    }

    @Override
    public boolean delCategory2(int ccid) {
        return category2Mapper.delCategory2(ccid);
    }

    @Override
    public Category2 findById(int ccid) {
        return category2Mapper.findById(ccid);
    }

    @Override
    public boolean updateCategory2(Category2 category2) {
        return category2Mapper.updateCategory2(category2);
    }

    @Override
    public boolean addCategory2(Category2 category2) {
        return category2Mapper.addCategory2(category2);
    }
}
