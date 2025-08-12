package com.neu.biz.impl;

import com.neu.biz.RateBiz;
import com.neu.entity.Rating;
import com.neu.mapper.RateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("rateBiz")
public class RateBizImpl implements RateBiz {
    @Autowired
    private RateMapper rateMapper;
    @Override
    public List<Rating> findRate(int index, int size) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        List<Rating> list = rateMapper.findRate(map);
        return list;
    }
}
