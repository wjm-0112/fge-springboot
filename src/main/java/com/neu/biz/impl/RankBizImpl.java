package com.neu.biz.impl;

import com.neu.biz.RankBiz;
import com.neu.entity.Movie;
import com.neu.entity.Rank;
import com.neu.mapper.RankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("rankBiz")
public class RankBizImpl implements RankBiz {
    @Autowired
    private RankMapper rankMapper;
    @Override
    public List<Rank> findRank(int index, int size) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        List<Rank> list = rankMapper.findRank(map);
        return list;
    }

    @Override
    public List<Rank> findRankMo(int index, int size, String name) {
        Map<String,Object> map = new HashMap<String,Object>();
        int pageNo = (index - 1) * size;
        map.put("index", pageNo);
        map.put("size", size);
        map.put("name", name);
        List<Rank> list = rankMapper.findRankMo(map);
        return list;
    }

    @Override
    public boolean delRank(int rid) {
        return rankMapper.delRank(rid);
    }

    @Override
    public boolean addRank(Rank rank) {
        return rankMapper.addRank(rank);
    }

    @Override
    public Rank findById(int rid) {
        return rankMapper.findById(rid);
    }

    @Override
    public boolean updateRank(Rank rank) {
        return rankMapper.updateRank(rank);
    }
}
